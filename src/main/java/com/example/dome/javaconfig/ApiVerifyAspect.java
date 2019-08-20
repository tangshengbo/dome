package com.example.dome.javaconfig;

import com.example.dome.util.MD5Utils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

/**
 * @author Tangshengbo
 * @date 2019/8/19
 */
@Component
@Aspect
public class ApiVerifyAspect {


    @Autowired
    private HttpServletRequest request;


    //两个..代表所有子目录，最后括号里的两个..代表所有参数
    @Pointcut("execution(public * com.example.dome.controller.DomeController.verify(..))")

    public void logPointCut() {
    }


    @Around("logPointCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

        String sign = request.getParameter("sign");
        String timestamp = request.getParameter("timestamp");
        Enumeration<?> pNames =  request.getParameterNames();
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isBlank(sign) || StringUtils.isBlank(timestamp))

        while (pNames.hasMoreElements()) {
            String pName = (String) pNames.nextElement();
            if("sign".equals(pName)) {
                continue;
            }
            Object pValue = request.getParameter(pName);
            params.put(pName, pValue);
        }

        String localSign = createSign(params, false);
        if (!localSign.equals(sign)) {
            return "签名错误";
        }

        System.out.println(System.currentTimeMillis() + "\t" + timestamp);
        long minute = (System.currentTimeMillis() - Long.valueOf(timestamp)) / (1000 * 60);
        System.out.println(minute);
        if (minute > 10) {
            return "请求已失效";
        }

        Object ob = pjp.proceed();
        return ob;
    }

    private String createSign(Map<String, Object> params) throws UnsupportedEncodingException {
       return createSign(params, true);
    }


    private String createSign(Map<String, Object> params, boolean encode)
            throws UnsupportedEncodingException {
        Set<String> keysSet = params.keySet();
        Object[] keys = keysSet.toArray();
        Arrays.sort(keys);
        StringBuilder temp = new StringBuilder();
        boolean first = true;
        for (Object key : keys) {
            if (first) {
                first = false;
            } else {
                temp.append("&");
            }
            temp.append(key).append("=");
            Object value = params.get(key);
            String valueString = "";
            if (null != value) {
                valueString = String.valueOf(value);
            }
            if (encode) {
                temp.append(URLEncoder.encode(valueString, "UTF-8"));
            } else {
                temp.append(valueString);
            }
        }
        String md5UpperString = MD5Utils.getMD5UpperString(temp.toString());
        System.out.println(md5UpperString);

        return md5UpperString;
    }


}
