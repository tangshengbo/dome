package com.example.dome.model;

public class BondBasicInfoWithBLOBs extends BondBasicInfo {
    /**
     * 每年付息期限(文字描述)
     */
    private String yearPayMatu;

    /**
     * 利率简述
     */
    private String rateDes;

    /**
     * 募集资金用途
     */
    private String collCapPurp;

    /**
     * 主承销商
     */
    private String undeName;

    /**
     * 
     */
    private String issCls;

    /**
     * 发行方式简述(dm新增)
     */
    private String issClsDes;

    /**
     * 发行对象
     */
    private String issObj;

    /**
     * 跨市场说明
     */
    private String crosMarDes;

    /**
     * 计息说明
     */
    private String inteDes;

    /**
     * 利息支付方式说明
     */
    private String intePayMeth;

    /**
     * 兑付期限
     */
    private String payMatu;

    /**
     * 兑付方式说明
     */
    private String payClsDes;

    /**
     * 含权说明
     */
    private String optDes;

    /**
     * 担保人：二级债使用，一级债使用
     */
    private String guraName;

    /**
     * 再担保人:二级债使用
     */
    private String guraName1;

    /**
     * 原始权益人,3号子表过来的数据
     */
    private String spomName;

    /**
     * 每年付息期限(文字描述)
     * @return year_pay_matu 每年付息期限(文字描述)
     */
    public String getYearPayMatu() {
        return yearPayMatu;
    }

    /**
     * 每年付息期限(文字描述)
     * @param yearPayMatu 每年付息期限(文字描述)
     */
    public void setYearPayMatu(String yearPayMatu) {
        this.yearPayMatu = yearPayMatu == null ? null : yearPayMatu.trim();
    }

    /**
     * 利率简述
     * @return rate_des 利率简述
     */
    public String getRateDes() {
        return rateDes;
    }

    /**
     * 利率简述
     * @param rateDes 利率简述
     */
    public void setRateDes(String rateDes) {
        this.rateDes = rateDes == null ? null : rateDes.trim();
    }

    /**
     * 募集资金用途
     * @return coll_cap_purp 募集资金用途
     */
    public String getCollCapPurp() {
        return collCapPurp;
    }

    /**
     * 募集资金用途
     * @param collCapPurp 募集资金用途
     */
    public void setCollCapPurp(String collCapPurp) {
        this.collCapPurp = collCapPurp == null ? null : collCapPurp.trim();
    }

    /**
     * 主承销商
     * @return unde_name 主承销商
     */
    public String getUndeName() {
        return undeName;
    }

    /**
     * 主承销商
     * @param undeName 主承销商
     */
    public void setUndeName(String undeName) {
        this.undeName = undeName == null ? null : undeName.trim();
    }

    /**
     * 
     * @return iss_cls 
     */
    public String getIssCls() {
        return issCls;
    }

    /**
     * 
     * @param issCls 
     */
    public void setIssCls(String issCls) {
        this.issCls = issCls == null ? null : issCls.trim();
    }

    /**
     * 发行方式简述(dm新增)
     * @return iss_cls_des 发行方式简述(dm新增)
     */
    public String getIssClsDes() {
        return issClsDes;
    }

    /**
     * 发行方式简述(dm新增)
     * @param issClsDes 发行方式简述(dm新增)
     */
    public void setIssClsDes(String issClsDes) {
        this.issClsDes = issClsDes == null ? null : issClsDes.trim();
    }

    /**
     * 发行对象
     * @return iss_obj 发行对象
     */
    public String getIssObj() {
        return issObj;
    }

    /**
     * 发行对象
     * @param issObj 发行对象
     */
    public void setIssObj(String issObj) {
        this.issObj = issObj == null ? null : issObj.trim();
    }

    /**
     * 跨市场说明
     * @return cros_mar_des 跨市场说明
     */
    public String getCrosMarDes() {
        return crosMarDes;
    }

    /**
     * 跨市场说明
     * @param crosMarDes 跨市场说明
     */
    public void setCrosMarDes(String crosMarDes) {
        this.crosMarDes = crosMarDes == null ? null : crosMarDes.trim();
    }

    /**
     * 计息说明
     * @return inte_des 计息说明
     */
    public String getInteDes() {
        return inteDes;
    }

    /**
     * 计息说明
     * @param inteDes 计息说明
     */
    public void setInteDes(String inteDes) {
        this.inteDes = inteDes == null ? null : inteDes.trim();
    }

    /**
     * 利息支付方式说明
     * @return inte_pay_meth 利息支付方式说明
     */
    public String getIntePayMeth() {
        return intePayMeth;
    }

    /**
     * 利息支付方式说明
     * @param intePayMeth 利息支付方式说明
     */
    public void setIntePayMeth(String intePayMeth) {
        this.intePayMeth = intePayMeth == null ? null : intePayMeth.trim();
    }

    /**
     * 兑付期限
     * @return pay_matu 兑付期限
     */
    public String getPayMatu() {
        return payMatu;
    }

    /**
     * 兑付期限
     * @param payMatu 兑付期限
     */
    public void setPayMatu(String payMatu) {
        this.payMatu = payMatu == null ? null : payMatu.trim();
    }

    /**
     * 兑付方式说明
     * @return pay_cls_des 兑付方式说明
     */
    public String getPayClsDes() {
        return payClsDes;
    }

    /**
     * 兑付方式说明
     * @param payClsDes 兑付方式说明
     */
    public void setPayClsDes(String payClsDes) {
        this.payClsDes = payClsDes == null ? null : payClsDes.trim();
    }

    /**
     * 含权说明
     * @return opt_des 含权说明
     */
    public String getOptDes() {
        return optDes;
    }

    /**
     * 含权说明
     * @param optDes 含权说明
     */
    public void setOptDes(String optDes) {
        this.optDes = optDes == null ? null : optDes.trim();
    }

    /**
     * 担保人：二级债使用，一级债使用
     * @return gura_name 担保人：二级债使用，一级债使用
     */
    public String getGuraName() {
        return guraName;
    }

    /**
     * 担保人：二级债使用，一级债使用
     * @param guraName 担保人：二级债使用，一级债使用
     */
    public void setGuraName(String guraName) {
        this.guraName = guraName == null ? null : guraName.trim();
    }

    /**
     * 再担保人:二级债使用
     * @return gura_name1 再担保人:二级债使用
     */
    public String getGuraName1() {
        return guraName1;
    }

    /**
     * 再担保人:二级债使用
     * @param guraName1 再担保人:二级债使用
     */
    public void setGuraName1(String guraName1) {
        this.guraName1 = guraName1 == null ? null : guraName1.trim();
    }

    /**
     * 原始权益人,3号子表过来的数据
     * @return spom_name 原始权益人,3号子表过来的数据
     */
    public String getSpomName() {
        return spomName;
    }

    /**
     * 原始权益人,3号子表过来的数据
     * @param spomName 原始权益人,3号子表过来的数据
     */
    public void setSpomName(String spomName) {
        this.spomName = spomName == null ? null : spomName.trim();
    }
}