package com.example.dome.dao;


import com.example.dome.model.BondBasicInfo;
import com.example.dome.model.BondBasicInfoWithBLOBs;

public interface BondBasicInfoMapper {
    /**
     *
     * @mbggenerated 2019-08-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-08-24
     */
    int insert(BondBasicInfoWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-24
     */
    int insertSelective(BondBasicInfoWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-24
     */
    BondBasicInfoWithBLOBs selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-08-24
     */
    int updateByPrimaryKeySelective(BondBasicInfoWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-24
     */
    int updateByPrimaryKeyWithBLOBs(BondBasicInfoWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-08-24
     */
    int updateByPrimaryKey(BondBasicInfo record);

    BondBasicInfo findById(Long id);

}