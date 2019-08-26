package com.example.dome.controller;


import com.example.dome.dao.BondBasicInfoMapper;
import com.example.dome.dao.EmployeeRepository;
import com.example.dome.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

/**
 * @author Tangshengbo
 * @date 2019/8/20
 */

@RestController
@RequestMapping("/es")
public class EmployeeController {


    @Autowired
    private BondBasicInfoMapper bondBasicInfoMapper;

//    @GetMapping("/query")
//    public String query() {
//
//        try {
//            BondBasicInfo byId = bondBasicInfoMapper.findById(1L);
//
//            SearchRequest searchRequest = new SearchRequest();
//            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
//            searchSourceBuilder.query(QueryBuilders.matchAllQuery());
//            searchRequest.source(searchSourceBuilder);
//            List<BondBasicInfo> bond = esUtil.search("bond", searchSourceBuilder, BondBasicInfo.class);
//            System.out.println(bond);
//
//            EsEntity<BondBasicInfo> esEntity = new EsEntity<>();
//            esEntity.setData(byId);
//            esEntity.setId(String.valueOf(1));
//
////            esUtil.insertOrUpdateOne("bond", esEntity);
////            esUtil.insertOrUpdateOne("");
//
////            System.out.println(esUtil.search(".kibana_1", searchSourceBuilder, Map.class));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "ok";
//
//    }

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * 添加
     *
     * @return
     */
    @RequestMapping("/add")
    public String add() {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setFirstName("xuxu");
        employee.setLastName("zh");
        employee.setAge(26);
        employee.setAbout("i am in peking");
        employee.setDate(new Date());
        employeeRepository.save(employee);
        Optional<Employee> byId = employeeRepository.findById("1");
        System.out.println(byId.get());

        return "success";
    }
//
//    /**
//     * 删除
//     *
//     * @return
//     */
//    @RequestMapping("/delete")
//    public String delete() {
//        Employee employee = employeeRepository.queryEmployeeById("1");
//        employeeRepository.delete(employee);
//        return "success";
//    }
//
//    /**
//     * 局部更新
//     *
//     * @return
//     */
//    @RequestMapping("/update")
//    public String update() {
//        Employee employee = employeeRepository.queryEmployeeById("1");
//        employee.setFirstName("哈哈");
//        employeeRepository.save(employee);
//        System.err.println("update a obj");
//        return "success";
//    }
//
//    /**
//     * 查询
//     *
//     * @return
//     */
//    @RequestMapping("/query")
//    public Employee query() {
//        Employee accountInfo = employeeRepository.queryEmployeeById("1");
//        return accountInfo;
//
//    }
}
