package com.tradeo.exp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusDuty;

@Component
@Mapper
public interface YltBusDutyDao {
    /**
     * For table: ylt_bus_duty
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int deleteByPrimaryKey(Long dutyformid);

    /**
     * For table: ylt_bus_duty
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int insert(YltBusDuty record);

    /**
     * For table: ylt_bus_duty
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int insertSelective(YltBusDuty record);

    /**
     * For table: ylt_bus_duty
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    YltBusDuty selectByPrimaryKey(Long dutyformid);

    /**
     * For table: ylt_bus_duty
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int updateByPrimaryKeySelective(YltBusDuty record);

    /**
     * For table: ylt_bus_duty
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int updateByPrimaryKey(YltBusDuty record);
}