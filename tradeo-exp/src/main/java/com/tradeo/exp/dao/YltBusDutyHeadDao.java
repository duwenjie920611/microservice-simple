package com.tradeo.exp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusDutyHead;

@Component
@Mapper
public interface YltBusDutyHeadDao {
    /**
     * For table: ylt_bus_duty_head
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int deleteByPrimaryKey(Long dutyformheadid);

    /**
     * For table: ylt_bus_duty_head
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int insert(YltBusDutyHead record);

    /**
     * For table: ylt_bus_duty_head
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int insertSelective(YltBusDutyHead record);

    /**
     * For table: ylt_bus_duty_head
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    YltBusDutyHead selectByPrimaryKey(Long dutyformheadid);

    /**
     * For table: ylt_bus_duty_head
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int updateByPrimaryKeySelective(YltBusDutyHead record);

    /**
     * For table: ylt_bus_duty_head
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int updateByPrimaryKey(YltBusDutyHead record);
}