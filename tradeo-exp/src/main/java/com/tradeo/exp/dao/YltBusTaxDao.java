package com.tradeo.exp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusTax;

@Component
@Mapper
public interface YltBusTaxDao {
    /**
     * For table: ylt_bus_tax
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int deleteByPrimaryKey(Long taxid);

    /**
     * For table: ylt_bus_tax
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int insert(YltBusTax record);

    /**
     * For table: ylt_bus_tax
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int insertSelective(YltBusTax record);

    /**
     * For table: ylt_bus_tax
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    YltBusTax selectByPrimaryKey(Long taxid);

    /**
     * For table: ylt_bus_tax
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int updateByPrimaryKeySelective(YltBusTax record);

    /**
     * For table: ylt_bus_tax
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 15:58:25
     *
     */
    int updateByPrimaryKey(YltBusTax record);
}