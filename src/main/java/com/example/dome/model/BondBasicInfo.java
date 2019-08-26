package com.example.dome.model;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.Date;

public class BondBasicInfo {
    /**
     * 主键id（自增长）
     */
    private Long id;

    /**
     * 债券统一编码
     */
    private Long bondUniCode;

    /**
     * 债券代码
     */
    private String bondCode;

    /**
     * 债券简称
     */
    private String bondShortName;

    /**
     * 债券全称
     */
    private String bondFullName;

    /**
     * 发行人统一编码
     */
    private Long comUniCode;

    /**
     * 发行人名称
     */
    private String issName;

    /**
     * 发行起始日
     */
    private Date issStartDate;

    /**
     * 发行截止日
     */
    private Date issEndDate;

    /**
     * 每年付息日
     */
    private String yearPayDate;

    /**
     * 起息日
     */
    private Date inteStartDate;

    /**
     * 理论到期日
     */
    private Date theoEndDate;

    /**
     * 付息频率
     */
    private Integer intePayFreq;

    /**
     * 付息方式
     */
    private Integer intePayClsPar;

    /**
     * 行权兑付日
     */
    private String exerPayDate;

    /**
     * 计划发行总额(含增发)
     */
    private BigDecimal planIssAmut;

    /**
     * 实际发行总额(含增发)
     */
    private BigDecimal actuIssAmut;

    /**
     * 债券期限
     */
    private BigDecimal bondMatu;

    /**
     * 债券类型
     */
    private Integer bondTypePar;

    /**
     * 评级机构
     */
    private Long credUniCode;

    /**
     * 利率类型
     */
    private Integer rateTypePar;

    /**
     * 票面利率
     */
    private BigDecimal issCoupRate;

    /**
     * 浮息基准
     */
    private String baseRatePar;

    /**
     * 上市日期
     */
    private Date listDate;

    /**
     * 上市公告日期
     */
    private Date listDeclDate;

    /**
     * 流通市场
     */
    private String secMarPar;

    /**
     * 承销方式
     */
    private Integer undeClsPar;

    /**
     * 发行价格
     */
    private BigDecimal issPri;

    /**
     * 发行状态:0-发行中 1-已上市 2-延迟发行 3-取消发行
     */
    private String issStatus;

    /**
     * 是否是新债：0-否 1-是
     */
    private String isNew;

    /**
     * 债券发行年度
     */
    private String bondIssYear;

    /**
     * 发行公告日期
     */
    private Date issDeclDate;

    /**
     * 是否公开发行:0-否 1-是
     */
    private String isPublicIss;

    /**
     * 发行手续费率
     */
    private BigDecimal issFeeRate;

    /**
     * 簿记建档日
     */
    private Date bokepDate;

    /**
     * 债权债务登记日
     */
    private Date debtRegDate;

    /**
     * 当前债券规模
     */
    private BigDecimal newSize;

    /**
     * 认购单位(元)
     */
    private BigDecimal subsUnit;

    /**
     * 最小认购数量
     */
    private BigDecimal leastSubsUnit;

    /**
     * 货币类型
     */
    private Integer curyTypePar;

    /**
     * 是否流通
     */
    private Integer isListPar;

    /**
     * 交易单位
     */
    private String tradeUnit;

    /**
     * 流通总额
     */
    private BigDecimal circuAmut;

    /**
     * 是否跨市场交易:0-否 1-是
     */
    private String isCrosMarPar;

    /**
     * 上市板块
     */
    private Integer listSectPar;

    /**
     * 上市状态
     */
    private Integer listStaPar;

    /**
     * 理论退市日期
     */
    private Date theoDelistDate;

    /**
     * 最后交易日
     */
    private Date lastTradeDate;

    /**
     * 摘牌日
     */
    private Date actuDelistDate;

    /**
     * 拼音简称
     */
    private String speShortName;

    /**
     * 英文全称
     */
    private String engFullName;

    /**
     * 英文简称
     */
    private String engShortName;

    /**
     * ISIN代码
     */
    private String isinCode;

    /**
     * 当前存续状态
     */
    private Integer currStatus;

    /**
     * 债券面值
     */
    private BigDecimal bondParVal;

    /**
     * 特殊债券类型
     */
    private Integer isTypePar;

    /**
     * 债券形态
     */
    private Integer bondFormPar;

    /**
     * 实际到期日
     */
    private Date actuEndDate;

    /**
     * 最新票面利率
     */
    private BigDecimal newCoupRate;

    /**
     * 贴现债参考收益率
     */
    private BigDecimal refYield;

    /**
     * 首期利率基准日期
     */
    private Date initBaseRateDate;

    /**
     * 首期基准利率
     */
    private BigDecimal baseRate;

    /**
     * 含权额外利差
     */
    private BigDecimal optExtraSpr;

    /**
     * 额外利差启用期次
     */
    private Integer extraSprSeqNum;

    /**
     * 利率浮动上限
     */
    private BigDecimal rateCeil;

    /**
     * 利率浮动下限
     */
    private BigDecimal rateFloor;

    /**
     * 利息计算方式
     */
    private Integer inteCalcuClsPar;

    /**
     * 是否分段计息
     */
    private Integer isSegmPar;

    /**
     * 单利或复利
     */
    private Integer simpCompIntePar;

    /**
     * 偿还方式
     */
    private Integer repayClsPayPar;

    /**
     * 兑付日
     */
    private Date matuPayDate;

    /**
     * 兑付手续费率
     */
    private BigDecimal payFeeRate;

    /**
     * 是否有担保
     */
    private Integer isGuarPar;

    /**
     * 是否可回购
     */
    private Integer isRepuPar;

    /**
     * 质押券代码
     */
    private String pledgeCode;

    /**
     * 质押券简称
     */
    private String pledgeName;

    /**
     * 是否可赎回
     */
    private Integer isRedemPar;

    /**
     * 是否可回售
     */
    private Integer isResaPar;

    /**
     * 是否保值
     */
    private Integer isHedgePar;

    /**
     * 是否免税
     */
    private Integer isTaxFreePar;

    /**
     * 债券期限-单位
     */
    private Integer matuUnitPar;

    /**
     * 发行状态
     */
    private Integer issStaPar;

    /**
     * 债券标识(同个债跨市场bond_id相同)
     */
    private Long bondId;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 最后编辑人
     */
    private Long lastUpdateUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后编辑时间
     */
    private Date lastUpdateTime;

    /**
     * 删除状态:0-未删除 1-已删除
     */
    private Byte delStatus;

    /**
     * 数据来源 1-中诚信 2-wind
     */
    private Integer dataSource;

    /**
     * ccxe子表名
     */
    private Integer bondType;

    /**
     * 债券审核状态（1：通过，2：待审核，3：不通过）
     */
    private Integer infoState;

    /**
     * 保存状态：1.正常保存，2.暂保存
     */
    private Byte saveStatus;

    /**
     * 主体信用级别参数
     */
    private Integer issCredLevelPar;

    /**
     * 主体信用级别
     */
    private String issCredLevel;

    /**
     * 债券信用级别参数
     */
    private Integer bondCredLevelPar;

    /**
     * 债券信用级别
     */
    private String bondCredLevel;

    /**
     * DM量化评分
     */
    private String pd;

    /**
     * 主体量化风险等级变化： >0上升 0持平 <0下降
     */
    private Integer pdDiff;

    /**
     * DM量化评分级别
     */
    private Integer pdNum;

    /**
     * 该债所属机构：只适用于用户自增加的债
     */
    private Integer orgId;

    /**
     * 0:手动新增状态
     */
    private Integer entryStatus;

    /**
     * 主键id（自增长）
     * @return id 主键id（自增长）
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id（自增长）
     * @param id 主键id（自增长）
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 债券统一编码
     * @return bond_uni_code 债券统一编码
     */
    public Long getBondUniCode() {
        return bondUniCode;
    }

    /**
     * 债券统一编码
     * @param bondUniCode 债券统一编码
     */
    public void setBondUniCode(Long bondUniCode) {
        this.bondUniCode = bondUniCode;
    }

    /**
     * 债券代码
     * @return bond_code 债券代码
     */
    public String getBondCode() {
        return bondCode;
    }

    /**
     * 债券代码
     * @param bondCode 债券代码
     */
    public void setBondCode(String bondCode) {
        this.bondCode = bondCode == null ? null : bondCode.trim();
    }

    /**
     * 债券简称
     * @return bond_short_name 债券简称
     */
    public String getBondShortName() {
        return bondShortName;
    }

    /**
     * 债券简称
     * @param bondShortName 债券简称
     */
    public void setBondShortName(String bondShortName) {
        this.bondShortName = bondShortName == null ? null : bondShortName.trim();
    }

    /**
     * 债券全称
     * @return bond_full_name 债券全称
     */
    public String getBondFullName() {
        return bondFullName;
    }

    /**
     * 债券全称
     * @param bondFullName 债券全称
     */
    public void setBondFullName(String bondFullName) {
        this.bondFullName = bondFullName == null ? null : bondFullName.trim();
    }

    /**
     * 发行人统一编码
     * @return com_uni_code 发行人统一编码
     */
    public Long getComUniCode() {
        return comUniCode;
    }

    /**
     * 发行人统一编码
     * @param comUniCode 发行人统一编码
     */
    public void setComUniCode(Long comUniCode) {
        this.comUniCode = comUniCode;
    }

    /**
     * 发行人名称
     * @return iss_name 发行人名称
     */
    public String getIssName() {
        return issName;
    }

    /**
     * 发行人名称
     * @param issName 发行人名称
     */
    public void setIssName(String issName) {
        this.issName = issName == null ? null : issName.trim();
    }

    /**
     * 发行起始日
     * @return iss_start_date 发行起始日
     */
    public Date getIssStartDate() {
        return issStartDate;
    }

    /**
     * 发行起始日
     * @param issStartDate 发行起始日
     */
    public void setIssStartDate(Date issStartDate) {
        this.issStartDate = issStartDate;
    }

    /**
     * 发行截止日
     * @return iss_end_date 发行截止日
     */
    public Date getIssEndDate() {
        return issEndDate;
    }

    /**
     * 发行截止日
     * @param issEndDate 发行截止日
     */
    public void setIssEndDate(Date issEndDate) {
        this.issEndDate = issEndDate;
    }

    /**
     * 每年付息日
     * @return year_pay_date 每年付息日
     */
    public String getYearPayDate() {
        return yearPayDate;
    }

    /**
     * 每年付息日
     * @param yearPayDate 每年付息日
     */
    public void setYearPayDate(String yearPayDate) {
        this.yearPayDate = yearPayDate == null ? null : yearPayDate.trim();
    }

    /**
     * 起息日
     * @return inte_start_date 起息日
     */
    public Date getInteStartDate() {
        return inteStartDate;
    }

    /**
     * 起息日
     * @param inteStartDate 起息日
     */
    public void setInteStartDate(Date inteStartDate) {
        this.inteStartDate = inteStartDate;
    }

    /**
     * 理论到期日
     * @return theo_end_date 理论到期日
     */
    public Date getTheoEndDate() {
        return theoEndDate;
    }

    /**
     * 理论到期日
     * @param theoEndDate 理论到期日
     */
    public void setTheoEndDate(Date theoEndDate) {
        this.theoEndDate = theoEndDate;
    }

    /**
     * 付息频率
     * @return inte_pay_freq 付息频率
     */
    public Integer getIntePayFreq() {
        return intePayFreq;
    }

    /**
     * 付息频率
     * @param intePayFreq 付息频率
     */
    public void setIntePayFreq(Integer intePayFreq) {
        this.intePayFreq = intePayFreq;
    }

    /**
     * 付息方式
     * @return inte_pay_cls_par 付息方式
     */
    public Integer getIntePayClsPar() {
        return intePayClsPar;
    }

    /**
     * 付息方式
     * @param intePayClsPar 付息方式
     */
    public void setIntePayClsPar(Integer intePayClsPar) {
        this.intePayClsPar = intePayClsPar;
    }

    /**
     * 行权兑付日
     * @return exer_pay_date 行权兑付日
     */
    public String getExerPayDate() {
        return exerPayDate;
    }

    /**
     * 行权兑付日
     * @param exerPayDate 行权兑付日
     */
    public void setExerPayDate(String exerPayDate) {
        this.exerPayDate = exerPayDate == null ? null : exerPayDate.trim();
    }

    /**
     * 计划发行总额(含增发)
     * @return plan_iss_amut 计划发行总额(含增发)
     */
    public BigDecimal getPlanIssAmut() {
        return planIssAmut;
    }

    /**
     * 计划发行总额(含增发)
     * @param planIssAmut 计划发行总额(含增发)
     */
    public void setPlanIssAmut(BigDecimal planIssAmut) {
        this.planIssAmut = planIssAmut;
    }

    /**
     * 实际发行总额(含增发)
     * @return actu_iss_amut 实际发行总额(含增发)
     */
    public BigDecimal getActuIssAmut() {
        return actuIssAmut;
    }

    /**
     * 实际发行总额(含增发)
     * @param actuIssAmut 实际发行总额(含增发)
     */
    public void setActuIssAmut(BigDecimal actuIssAmut) {
        this.actuIssAmut = actuIssAmut;
    }

    /**
     * 债券期限
     * @return bond_matu 债券期限
     */
    public BigDecimal getBondMatu() {
        return bondMatu;
    }

    /**
     * 债券期限
     * @param bondMatu 债券期限
     */
    public void setBondMatu(BigDecimal bondMatu) {
        this.bondMatu = bondMatu;
    }

    /**
     * 债券类型
     * @return bond_type_par 债券类型
     */
    public Integer getBondTypePar() {
        return bondTypePar;
    }

    /**
     * 债券类型
     * @param bondTypePar 债券类型
     */
    public void setBondTypePar(Integer bondTypePar) {
        this.bondTypePar = bondTypePar;
    }

    /**
     * 评级机构
     * @return cred_uni_code 评级机构
     */
    public Long getCredUniCode() {
        return credUniCode;
    }

    /**
     * 评级机构
     * @param credUniCode 评级机构
     */
    public void setCredUniCode(Long credUniCode) {
        this.credUniCode = credUniCode;
    }

    /**
     * 利率类型
     * @return rate_type_par 利率类型
     */
    public Integer getRateTypePar() {
        return rateTypePar;
    }

    /**
     * 利率类型
     * @param rateTypePar 利率类型
     */
    public void setRateTypePar(Integer rateTypePar) {
        this.rateTypePar = rateTypePar;
    }

    /**
     * 票面利率
     * @return iss_coup_rate 票面利率
     */
    public BigDecimal getIssCoupRate() {
        return issCoupRate;
    }

    /**
     * 票面利率
     * @param issCoupRate 票面利率
     */
    public void setIssCoupRate(BigDecimal issCoupRate) {
        this.issCoupRate = issCoupRate;
    }

    /**
     * 浮息基准
     * @return base_rate_par 浮息基准
     */
    public String getBaseRatePar() {
        return baseRatePar;
    }

    /**
     * 浮息基准
     * @param baseRatePar 浮息基准
     */
    public void setBaseRatePar(String baseRatePar) {
        this.baseRatePar = baseRatePar == null ? null : baseRatePar.trim();
    }

    /**
     * 上市日期
     * @return list_date 上市日期
     */
    public Date getListDate() {
        return listDate;
    }

    /**
     * 上市日期
     * @param listDate 上市日期
     */
    public void setListDate(Date listDate) {
        this.listDate = listDate;
    }

    /**
     * 上市公告日期
     * @return list_decl_date 上市公告日期
     */
    public Date getListDeclDate() {
        return listDeclDate;
    }

    /**
     * 上市公告日期
     * @param listDeclDate 上市公告日期
     */
    public void setListDeclDate(Date listDeclDate) {
        this.listDeclDate = listDeclDate;
    }

    /**
     * 流通市场
     * @return sec_mar_par 流通市场
     */
    public String getSecMarPar() {
        return secMarPar;
    }

    /**
     * 流通市场
     * @param secMarPar 流通市场
     */
    public void setSecMarPar(String secMarPar) {
        this.secMarPar = secMarPar == null ? null : secMarPar.trim();
    }

    /**
     * 承销方式
     * @return unde_cls_par 承销方式
     */
    public Integer getUndeClsPar() {
        return undeClsPar;
    }

    /**
     * 承销方式
     * @param undeClsPar 承销方式
     */
    public void setUndeClsPar(Integer undeClsPar) {
        this.undeClsPar = undeClsPar;
    }

    /**
     * 发行价格
     * @return iss_pri 发行价格
     */
    public BigDecimal getIssPri() {
        return issPri;
    }

    /**
     * 发行价格
     * @param issPri 发行价格
     */
    public void setIssPri(BigDecimal issPri) {
        this.issPri = issPri;
    }

    /**
     * 发行状态:0-发行中 1-已上市 2-延迟发行 3-取消发行
     * @return iss_status 发行状态:0-发行中 1-已上市 2-延迟发行 3-取消发行
     */
    public String getIssStatus() {
        return issStatus;
    }

    /**
     * 发行状态:0-发行中 1-已上市 2-延迟发行 3-取消发行
     * @param issStatus 发行状态:0-发行中 1-已上市 2-延迟发行 3-取消发行
     */
    public void setIssStatus(String issStatus) {
        this.issStatus = issStatus == null ? null : issStatus.trim();
    }

    /**
     * 是否是新债：0-否 1-是
     * @return is_new 是否是新债：0-否 1-是
     */
    public String getIsNew() {
        return isNew;
    }

    /**
     * 是否是新债：0-否 1-是
     * @param isNew 是否是新债：0-否 1-是
     */
    public void setIsNew(String isNew) {
        this.isNew = isNew == null ? null : isNew.trim();
    }

    /**
     * 债券发行年度
     * @return bond_iss_year 债券发行年度
     */
    public String getBondIssYear() {
        return bondIssYear;
    }

    /**
     * 债券发行年度
     * @param bondIssYear 债券发行年度
     */
    public void setBondIssYear(String bondIssYear) {
        this.bondIssYear = bondIssYear == null ? null : bondIssYear.trim();
    }

    /**
     * 发行公告日期
     * @return iss_decl_date 发行公告日期
     */
    public Date getIssDeclDate() {
        return issDeclDate;
    }

    /**
     * 发行公告日期
     * @param issDeclDate 发行公告日期
     */
    public void setIssDeclDate(Date issDeclDate) {
        this.issDeclDate = issDeclDate;
    }

    /**
     * 是否公开发行:0-否 1-是
     * @return is_public_iss 是否公开发行:0-否 1-是
     */
    public String getIsPublicIss() {
        return isPublicIss;
    }

    /**
     * 是否公开发行:0-否 1-是
     * @param isPublicIss 是否公开发行:0-否 1-是
     */
    public void setIsPublicIss(String isPublicIss) {
        this.isPublicIss = isPublicIss == null ? null : isPublicIss.trim();
    }

    /**
     * 发行手续费率
     * @return iss_fee_rate 发行手续费率
     */
    public BigDecimal getIssFeeRate() {
        return issFeeRate;
    }

    /**
     * 发行手续费率
     * @param issFeeRate 发行手续费率
     */
    public void setIssFeeRate(BigDecimal issFeeRate) {
        this.issFeeRate = issFeeRate;
    }

    /**
     * 簿记建档日
     * @return bokep_date 簿记建档日
     */
    public Date getBokepDate() {
        return bokepDate;
    }

    /**
     * 簿记建档日
     * @param bokepDate 簿记建档日
     */
    public void setBokepDate(Date bokepDate) {
        this.bokepDate = bokepDate;
    }

    /**
     * 债权债务登记日
     * @return debt_reg_date 债权债务登记日
     */
    public Date getDebtRegDate() {
        return debtRegDate;
    }

    /**
     * 债权债务登记日
     * @param debtRegDate 债权债务登记日
     */
    public void setDebtRegDate(Date debtRegDate) {
        this.debtRegDate = debtRegDate;
    }

    /**
     * 当前债券规模
     * @return new_size 当前债券规模
     */
    public BigDecimal getNewSize() {
        return newSize;
    }

    /**
     * 当前债券规模
     * @param newSize 当前债券规模
     */
    public void setNewSize(BigDecimal newSize) {
        this.newSize = newSize;
    }

    /**
     * 认购单位(元)
     * @return subs_unit 认购单位(元)
     */
    public BigDecimal getSubsUnit() {
        return subsUnit;
    }

    /**
     * 认购单位(元)
     * @param subsUnit 认购单位(元)
     */
    public void setSubsUnit(BigDecimal subsUnit) {
        this.subsUnit = subsUnit;
    }

    /**
     * 最小认购数量
     * @return least_subs_unit 最小认购数量
     */
    public BigDecimal getLeastSubsUnit() {
        return leastSubsUnit;
    }

    /**
     * 最小认购数量
     * @param leastSubsUnit 最小认购数量
     */
    public void setLeastSubsUnit(BigDecimal leastSubsUnit) {
        this.leastSubsUnit = leastSubsUnit;
    }

    /**
     * 货币类型
     * @return cury_type_par 货币类型
     */
    public Integer getCuryTypePar() {
        return curyTypePar;
    }

    /**
     * 货币类型
     * @param curyTypePar 货币类型
     */
    public void setCuryTypePar(Integer curyTypePar) {
        this.curyTypePar = curyTypePar;
    }

    /**
     * 是否流通
     * @return is_list_par 是否流通
     */
    public Integer getIsListPar() {
        return isListPar;
    }

    /**
     * 是否流通
     * @param isListPar 是否流通
     */
    public void setIsListPar(Integer isListPar) {
        this.isListPar = isListPar;
    }

    /**
     * 交易单位
     * @return trade_unit 交易单位
     */
    public String getTradeUnit() {
        return tradeUnit;
    }

    /**
     * 交易单位
     * @param tradeUnit 交易单位
     */
    public void setTradeUnit(String tradeUnit) {
        this.tradeUnit = tradeUnit == null ? null : tradeUnit.trim();
    }

    /**
     * 流通总额
     * @return circu_amut 流通总额
     */
    public BigDecimal getCircuAmut() {
        return circuAmut;
    }

    /**
     * 流通总额
     * @param circuAmut 流通总额
     */
    public void setCircuAmut(BigDecimal circuAmut) {
        this.circuAmut = circuAmut;
    }

    /**
     * 是否跨市场交易:0-否 1-是
     * @return is_cros_mar_par 是否跨市场交易:0-否 1-是
     */
    public String getIsCrosMarPar() {
        return isCrosMarPar;
    }

    /**
     * 是否跨市场交易:0-否 1-是
     * @param isCrosMarPar 是否跨市场交易:0-否 1-是
     */
    public void setIsCrosMarPar(String isCrosMarPar) {
        this.isCrosMarPar = isCrosMarPar == null ? null : isCrosMarPar.trim();
    }

    /**
     * 上市板块
     * @return list_sect_par 上市板块
     */
    public Integer getListSectPar() {
        return listSectPar;
    }

    /**
     * 上市板块
     * @param listSectPar 上市板块
     */
    public void setListSectPar(Integer listSectPar) {
        this.listSectPar = listSectPar;
    }

    /**
     * 上市状态
     * @return list_sta_par 上市状态
     */
    public Integer getListStaPar() {
        return listStaPar;
    }

    /**
     * 上市状态
     * @param listStaPar 上市状态
     */
    public void setListStaPar(Integer listStaPar) {
        this.listStaPar = listStaPar;
    }

    /**
     * 理论退市日期
     * @return theo_delist_date 理论退市日期
     */
    public Date getTheoDelistDate() {
        return theoDelistDate;
    }

    /**
     * 理论退市日期
     * @param theoDelistDate 理论退市日期
     */
    public void setTheoDelistDate(Date theoDelistDate) {
        this.theoDelistDate = theoDelistDate;
    }

    /**
     * 最后交易日
     * @return last_trade_date 最后交易日
     */
    public Date getLastTradeDate() {
        return lastTradeDate;
    }

    /**
     * 最后交易日
     * @param lastTradeDate 最后交易日
     */
    public void setLastTradeDate(Date lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }

    /**
     * 摘牌日
     * @return actu_delist_date 摘牌日
     */
    public Date getActuDelistDate() {
        return actuDelistDate;
    }

    /**
     * 摘牌日
     * @param actuDelistDate 摘牌日
     */
    public void setActuDelistDate(Date actuDelistDate) {
        this.actuDelistDate = actuDelistDate;
    }

    /**
     * 拼音简称
     * @return spe_short_name 拼音简称
     */
    public String getSpeShortName() {
        return speShortName;
    }

    /**
     * 拼音简称
     * @param speShortName 拼音简称
     */
    public void setSpeShortName(String speShortName) {
        this.speShortName = speShortName == null ? null : speShortName.trim();
    }

    /**
     * 英文全称
     * @return eng_full_name 英文全称
     */
    public String getEngFullName() {
        return engFullName;
    }

    /**
     * 英文全称
     * @param engFullName 英文全称
     */
    public void setEngFullName(String engFullName) {
        this.engFullName = engFullName == null ? null : engFullName.trim();
    }

    /**
     * 英文简称
     * @return eng_short_name 英文简称
     */
    public String getEngShortName() {
        return engShortName;
    }

    /**
     * 英文简称
     * @param engShortName 英文简称
     */
    public void setEngShortName(String engShortName) {
        this.engShortName = engShortName == null ? null : engShortName.trim();
    }

    /**
     * ISIN代码
     * @return isin_code ISIN代码
     */
    public String getIsinCode() {
        return isinCode;
    }

    /**
     * ISIN代码
     * @param isinCode ISIN代码
     */
    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode == null ? null : isinCode.trim();
    }

    /**
     * 当前存续状态
     * @return curr_status 当前存续状态
     */
    public Integer getCurrStatus() {
        return currStatus;
    }

    /**
     * 当前存续状态
     * @param currStatus 当前存续状态
     */
    public void setCurrStatus(Integer currStatus) {
        this.currStatus = currStatus;
    }

    /**
     * 债券面值
     * @return bond_par_val 债券面值
     */
    public BigDecimal getBondParVal() {
        return bondParVal;
    }

    /**
     * 债券面值
     * @param bondParVal 债券面值
     */
    public void setBondParVal(BigDecimal bondParVal) {
        this.bondParVal = bondParVal;
    }

    /**
     * 特殊债券类型
     * @return is_type_par 特殊债券类型
     */
    public Integer getIsTypePar() {
        return isTypePar;
    }

    /**
     * 特殊债券类型
     * @param isTypePar 特殊债券类型
     */
    public void setIsTypePar(Integer isTypePar) {
        this.isTypePar = isTypePar;
    }

    /**
     * 债券形态
     * @return bond_form_par 债券形态
     */
    public Integer getBondFormPar() {
        return bondFormPar;
    }

    /**
     * 债券形态
     * @param bondFormPar 债券形态
     */
    public void setBondFormPar(Integer bondFormPar) {
        this.bondFormPar = bondFormPar;
    }

    /**
     * 实际到期日
     * @return actu_end_date 实际到期日
     */
    public Date getActuEndDate() {
        return actuEndDate;
    }

    /**
     * 实际到期日
     * @param actuEndDate 实际到期日
     */
    public void setActuEndDate(Date actuEndDate) {
        this.actuEndDate = actuEndDate;
    }

    /**
     * 最新票面利率
     * @return new_coup_rate 最新票面利率
     */
    public BigDecimal getNewCoupRate() {
        return newCoupRate;
    }

    /**
     * 最新票面利率
     * @param newCoupRate 最新票面利率
     */
    public void setNewCoupRate(BigDecimal newCoupRate) {
        this.newCoupRate = newCoupRate;
    }

    /**
     * 贴现债参考收益率
     * @return ref_yield 贴现债参考收益率
     */
    public BigDecimal getRefYield() {
        return refYield;
    }

    /**
     * 贴现债参考收益率
     * @param refYield 贴现债参考收益率
     */
    public void setRefYield(BigDecimal refYield) {
        this.refYield = refYield;
    }

    /**
     * 首期利率基准日期
     * @return init_base_rate_date 首期利率基准日期
     */
    public Date getInitBaseRateDate() {
        return initBaseRateDate;
    }

    /**
     * 首期利率基准日期
     * @param initBaseRateDate 首期利率基准日期
     */
    public void setInitBaseRateDate(Date initBaseRateDate) {
        this.initBaseRateDate = initBaseRateDate;
    }

    /**
     * 首期基准利率
     * @return base_rate 首期基准利率
     */
    public BigDecimal getBaseRate() {
        return baseRate;
    }

    /**
     * 首期基准利率
     * @param baseRate 首期基准利率
     */
    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    /**
     * 含权额外利差
     * @return opt_extra_spr 含权额外利差
     */
    public BigDecimal getOptExtraSpr() {
        return optExtraSpr;
    }

    /**
     * 含权额外利差
     * @param optExtraSpr 含权额外利差
     */
    public void setOptExtraSpr(BigDecimal optExtraSpr) {
        this.optExtraSpr = optExtraSpr;
    }

    /**
     * 额外利差启用期次
     * @return extra_spr_seq_num 额外利差启用期次
     */
    public Integer getExtraSprSeqNum() {
        return extraSprSeqNum;
    }

    /**
     * 额外利差启用期次
     * @param extraSprSeqNum 额外利差启用期次
     */
    public void setExtraSprSeqNum(Integer extraSprSeqNum) {
        this.extraSprSeqNum = extraSprSeqNum;
    }

    /**
     * 利率浮动上限
     * @return rate_ceil 利率浮动上限
     */
    public BigDecimal getRateCeil() {
        return rateCeil;
    }

    /**
     * 利率浮动上限
     * @param rateCeil 利率浮动上限
     */
    public void setRateCeil(BigDecimal rateCeil) {
        this.rateCeil = rateCeil;
    }

    /**
     * 利率浮动下限
     * @return rate_floor 利率浮动下限
     */
    public BigDecimal getRateFloor() {
        return rateFloor;
    }

    /**
     * 利率浮动下限
     * @param rateFloor 利率浮动下限
     */
    public void setRateFloor(BigDecimal rateFloor) {
        this.rateFloor = rateFloor;
    }

    /**
     * 利息计算方式
     * @return inte_calcu_cls_par 利息计算方式
     */
    public Integer getInteCalcuClsPar() {
        return inteCalcuClsPar;
    }

    /**
     * 利息计算方式
     * @param inteCalcuClsPar 利息计算方式
     */
    public void setInteCalcuClsPar(Integer inteCalcuClsPar) {
        this.inteCalcuClsPar = inteCalcuClsPar;
    }

    /**
     * 是否分段计息
     * @return is_segm_par 是否分段计息
     */
    public Integer getIsSegmPar() {
        return isSegmPar;
    }

    /**
     * 是否分段计息
     * @param isSegmPar 是否分段计息
     */
    public void setIsSegmPar(Integer isSegmPar) {
        this.isSegmPar = isSegmPar;
    }

    /**
     * 单利或复利
     * @return simp_comp_inte_par 单利或复利
     */
    public Integer getSimpCompIntePar() {
        return simpCompIntePar;
    }

    /**
     * 单利或复利
     * @param simpCompIntePar 单利或复利
     */
    public void setSimpCompIntePar(Integer simpCompIntePar) {
        this.simpCompIntePar = simpCompIntePar;
    }

    /**
     * 偿还方式
     * @return repay_cls_pay_par 偿还方式
     */
    public Integer getRepayClsPayPar() {
        return repayClsPayPar;
    }

    /**
     * 偿还方式
     * @param repayClsPayPar 偿还方式
     */
    public void setRepayClsPayPar(Integer repayClsPayPar) {
        this.repayClsPayPar = repayClsPayPar;
    }

    /**
     * 兑付日
     * @return matu_pay_date 兑付日
     */
    public Date getMatuPayDate() {
        return matuPayDate;
    }

    /**
     * 兑付日
     * @param matuPayDate 兑付日
     */
    public void setMatuPayDate(Date matuPayDate) {
        this.matuPayDate = matuPayDate;
    }

    /**
     * 兑付手续费率
     * @return pay_fee_rate 兑付手续费率
     */
    public BigDecimal getPayFeeRate() {
        return payFeeRate;
    }

    /**
     * 兑付手续费率
     * @param payFeeRate 兑付手续费率
     */
    public void setPayFeeRate(BigDecimal payFeeRate) {
        this.payFeeRate = payFeeRate;
    }

    /**
     * 是否有担保
     * @return is_guar_par 是否有担保
     */
    public Integer getIsGuarPar() {
        return isGuarPar;
    }

    /**
     * 是否有担保
     * @param isGuarPar 是否有担保
     */
    public void setIsGuarPar(Integer isGuarPar) {
        this.isGuarPar = isGuarPar;
    }

    /**
     * 是否可回购
     * @return is_repu_par 是否可回购
     */
    public Integer getIsRepuPar() {
        return isRepuPar;
    }

    /**
     * 是否可回购
     * @param isRepuPar 是否可回购
     */
    public void setIsRepuPar(Integer isRepuPar) {
        this.isRepuPar = isRepuPar;
    }

    /**
     * 质押券代码
     * @return pledge_code 质押券代码
     */
    public String getPledgeCode() {
        return pledgeCode;
    }

    /**
     * 质押券代码
     * @param pledgeCode 质押券代码
     */
    public void setPledgeCode(String pledgeCode) {
        this.pledgeCode = pledgeCode == null ? null : pledgeCode.trim();
    }

    /**
     * 质押券简称
     * @return pledge_name 质押券简称
     */
    public String getPledgeName() {
        return pledgeName;
    }

    /**
     * 质押券简称
     * @param pledgeName 质押券简称
     */
    public void setPledgeName(String pledgeName) {
        this.pledgeName = pledgeName == null ? null : pledgeName.trim();
    }

    /**
     * 是否可赎回
     * @return is_redem_par 是否可赎回
     */
    public Integer getIsRedemPar() {
        return isRedemPar;
    }

    /**
     * 是否可赎回
     * @param isRedemPar 是否可赎回
     */
    public void setIsRedemPar(Integer isRedemPar) {
        this.isRedemPar = isRedemPar;
    }

    /**
     * 是否可回售
     * @return is_resa_par 是否可回售
     */
    public Integer getIsResaPar() {
        return isResaPar;
    }

    /**
     * 是否可回售
     * @param isResaPar 是否可回售
     */
    public void setIsResaPar(Integer isResaPar) {
        this.isResaPar = isResaPar;
    }

    /**
     * 是否保值
     * @return is_hedge_par 是否保值
     */
    public Integer getIsHedgePar() {
        return isHedgePar;
    }

    /**
     * 是否保值
     * @param isHedgePar 是否保值
     */
    public void setIsHedgePar(Integer isHedgePar) {
        this.isHedgePar = isHedgePar;
    }

    /**
     * 是否免税
     * @return is_tax_free_par 是否免税
     */
    public Integer getIsTaxFreePar() {
        return isTaxFreePar;
    }

    /**
     * 是否免税
     * @param isTaxFreePar 是否免税
     */
    public void setIsTaxFreePar(Integer isTaxFreePar) {
        this.isTaxFreePar = isTaxFreePar;
    }

    /**
     * 债券期限-单位
     * @return matu_unit_par 债券期限-单位
     */
    public Integer getMatuUnitPar() {
        return matuUnitPar;
    }

    /**
     * 债券期限-单位
     * @param matuUnitPar 债券期限-单位
     */
    public void setMatuUnitPar(Integer matuUnitPar) {
        this.matuUnitPar = matuUnitPar;
    }

    /**
     * 发行状态
     * @return iss_sta_par 发行状态
     */
    public Integer getIssStaPar() {
        return issStaPar;
    }

    /**
     * 发行状态
     * @param issStaPar 发行状态
     */
    public void setIssStaPar(Integer issStaPar) {
        this.issStaPar = issStaPar;
    }

    /**
     * 债券标识(同个债跨市场bond_id相同)
     * @return bond_id 债券标识(同个债跨市场bond_id相同)
     */
    public Long getBondId() {
        return bondId;
    }

    /**
     * 债券标识(同个债跨市场bond_id相同)
     * @param bondId 债券标识(同个债跨市场bond_id相同)
     */
    public void setBondId(Long bondId) {
        this.bondId = bondId;
    }

    /**
     * 创建人
     * @return create_user 创建人
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     * @param createUser 创建人
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 最后编辑人
     * @return last_update_user 最后编辑人
     */
    public Long getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * 最后编辑人
     * @param lastUpdateUser 最后编辑人
     */
    public void setLastUpdateUser(Long lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后编辑时间
     * @return last_update_time 最后编辑时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后编辑时间
     * @param lastUpdateTime 最后编辑时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 删除状态:0-未删除 1-已删除
     * @return del_status 删除状态:0-未删除 1-已删除
     */
    public Byte getDelStatus() {
        return delStatus;
    }

    /**
     * 删除状态:0-未删除 1-已删除
     * @param delStatus 删除状态:0-未删除 1-已删除
     */
    public void setDelStatus(Byte delStatus) {
        this.delStatus = delStatus;
    }

    /**
     * 数据来源 1-中诚信 2-wind
     * @return data_source 数据来源 1-中诚信 2-wind
     */
    public Integer getDataSource() {
        return dataSource;
    }

    /**
     * 数据来源 1-中诚信 2-wind
     * @param dataSource 数据来源 1-中诚信 2-wind
     */
    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * ccxe子表名
     * @return bond_type ccxe子表名
     */
    public Integer getBondType() {
        return bondType;
    }

    /**
     * ccxe子表名
     * @param bondType ccxe子表名
     */
    public void setBondType(Integer bondType) {
        this.bondType = bondType;
    }

    /**
     * 债券审核状态（1：通过，2：待审核，3：不通过）
     * @return info_state 债券审核状态（1：通过，2：待审核，3：不通过）
     */
    public Integer getInfoState() {
        return infoState;
    }

    /**
     * 债券审核状态（1：通过，2：待审核，3：不通过）
     * @param infoState 债券审核状态（1：通过，2：待审核，3：不通过）
     */
    public void setInfoState(Integer infoState) {
        this.infoState = infoState;
    }

    /**
     * 保存状态：1.正常保存，2.暂保存
     * @return save_status 保存状态：1.正常保存，2.暂保存
     */
    public Byte getSaveStatus() {
        return saveStatus;
    }

    /**
     * 保存状态：1.正常保存，2.暂保存
     * @param saveStatus 保存状态：1.正常保存，2.暂保存
     */
    public void setSaveStatus(Byte saveStatus) {
        this.saveStatus = saveStatus;
    }

    /**
     * 主体信用级别参数
     * @return iss_cred_level_par 主体信用级别参数
     */
    public Integer getIssCredLevelPar() {
        return issCredLevelPar;
    }

    /**
     * 主体信用级别参数
     * @param issCredLevelPar 主体信用级别参数
     */
    public void setIssCredLevelPar(Integer issCredLevelPar) {
        this.issCredLevelPar = issCredLevelPar;
    }

    /**
     * 主体信用级别
     * @return iss_cred_level 主体信用级别
     */
    public String getIssCredLevel() {
        return issCredLevel;
    }

    /**
     * 主体信用级别
     * @param issCredLevel 主体信用级别
     */
    public void setIssCredLevel(String issCredLevel) {
        this.issCredLevel = issCredLevel == null ? null : issCredLevel.trim();
    }

    /**
     * 债券信用级别参数
     * @return bond_cred_level_par 债券信用级别参数
     */
    public Integer getBondCredLevelPar() {
        return bondCredLevelPar;
    }

    /**
     * 债券信用级别参数
     * @param bondCredLevelPar 债券信用级别参数
     */
    public void setBondCredLevelPar(Integer bondCredLevelPar) {
        this.bondCredLevelPar = bondCredLevelPar;
    }

    /**
     * 债券信用级别
     * @return bond_cred_level 债券信用级别
     */
    public String getBondCredLevel() {
        return bondCredLevel;
    }

    /**
     * 债券信用级别
     * @param bondCredLevel 债券信用级别
     */
    public void setBondCredLevel(String bondCredLevel) {
        this.bondCredLevel = bondCredLevel == null ? null : bondCredLevel.trim();
    }

    /**
     * DM量化评分
     * @return pd DM量化评分
     */
    public String getPd() {
        return pd;
    }

    /**
     * DM量化评分
     * @param pd DM量化评分
     */
    public void setPd(String pd) {
        this.pd = pd == null ? null : pd.trim();
    }

    /**
     * 主体量化风险等级变化： >0上升 0持平 <0下降
     * @return pd_diff 主体量化风险等级变化： >0上升 0持平 <0下降
     */
    public Integer getPdDiff() {
        return pdDiff;
    }

    /**
     * 主体量化风险等级变化： >0上升 0持平 <0下降
     * @param pdDiff 主体量化风险等级变化： >0上升 0持平 <0下降
     */
    public void setPdDiff(Integer pdDiff) {
        this.pdDiff = pdDiff;
    }

    /**
     * DM量化评分级别
     * @return pd_num DM量化评分级别
     */
    public Integer getPdNum() {
        return pdNum;
    }

    /**
     * DM量化评分级别
     * @param pdNum DM量化评分级别
     */
    public void setPdNum(Integer pdNum) {
        this.pdNum = pdNum;
    }

    /**
     * 该债所属机构：只适用于用户自增加的债
     * @return org_id 该债所属机构：只适用于用户自增加的债
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 该债所属机构：只适用于用户自增加的债
     * @param orgId 该债所属机构：只适用于用户自增加的债
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 0:手动新增状态
     * @return entry_status 0:手动新增状态
     */
    public Integer getEntryStatus() {
        return entryStatus;
    }

    /**
     * 0:手动新增状态
     * @param entryStatus 0:手动新增状态
     */
    public void setEntryStatus(Integer entryStatus) {
        this.entryStatus = entryStatus;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}