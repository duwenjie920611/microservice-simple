package com.tradeo.exp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusShipbill;

@Component
@Mapper
public interface YltBusShipbillDao {
    /**
     * For table: ylt_bus_shipbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 17:38:06
     *
     */
    int deleteByPrimaryKey(Integer billid);

    /**
     * For table: ylt_bus_shipbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 17:38:06
     *
     */
    int insert(YltBusShipbill record);

    /**
     * For table: ylt_bus_shipbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 17:38:06
     *
     */
    int insertSelective(YltBusShipbill record);

    /**
     * For table: ylt_bus_shipbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 17:38:06
     *
     */
    YltBusShipbill selectByPrimaryKey(Integer billid);

    /**
     * For table: ylt_bus_shipbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 17:38:06
     *
     */
    int updateByPrimaryKeySelective(YltBusShipbill record);

    /**
     * For table: ylt_bus_shipbill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 17:38:06
     *
     */
    int updateByPrimaryKey(YltBusShipbill record);
    
    /**
   * 根据条件查询数据
   * @param yltBusShipbill
   * @return
   */
	List<YltBusShipbill> selectByExampleSelective(YltBusShipbill yltBusShipbill);
}