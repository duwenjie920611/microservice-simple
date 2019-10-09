package com.tradeo.exp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusShipsubbill;

@Component
@Mapper
public interface YltBusShipsubbillDao {
    /**
     * For table: ylt_bus_shipsubbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    int deleteByPrimaryKey(Integer subbillid);

    /**
     * For table: ylt_bus_shipsubbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    int insert(YltBusShipsubbill record);

    /**
     * For table: ylt_bus_shipsubbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    int insertSelective(YltBusShipsubbill record);

    /**
     * For table: ylt_bus_shipsubbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    YltBusShipsubbill selectByPrimaryKey(Integer subbillid);

    /**
     * For table: ylt_bus_shipsubbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    int updateByPrimaryKeySelective(YltBusShipsubbill record);

    /**
     * For table: ylt_bus_shipsubbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    int updateByPrimaryKey(YltBusShipsubbill record);
    
    
    /**
    * 查询分运单数据
    * @param shipSubBillExample
    * @return
    */
	List<YltBusShipsubbill> selectByExampleSelective(YltBusShipsubbill shipSubBillExample);

	int updateByExampleSelective(@Param("example")YltBusShipsubbill example, @Param("value")YltBusShipsubbill value);
    
}