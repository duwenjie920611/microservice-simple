package com.tradeo.exp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusDutyEntry;

@Component
@Mapper
public interface YltBusDutyEntryDao {
    /**
     * For table: ylt_bus_duty_entry
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int deleteByPrimaryKey(Long dutyformentryid);

    /**
     * For table: ylt_bus_duty_entry
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int insert(YltBusDutyEntry record);

    /**
     * For table: ylt_bus_duty_entry
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int insertSelective(YltBusDutyEntry record);

    /**
     * For table: ylt_bus_duty_entry
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    YltBusDutyEntry selectByPrimaryKey(Long dutyformentryid);

    /**
     * For table: ylt_bus_duty_entry
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int updateByPrimaryKeySelective(YltBusDutyEntry record);

    /**
     * For table: ylt_bus_duty_entry
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int updateByPrimaryKey(YltBusDutyEntry record);
}