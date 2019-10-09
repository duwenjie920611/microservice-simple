package com.tradeo.exp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusDeclaregoods;

@Component
@Mapper
public interface YltBusDeclaregoodsDao {
    /**
     * For table: ylt_bus_declaregoods
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:33:26
     *
     */
    int deleteByPrimaryKey(Integer flowno);

    /**
     * For table: ylt_bus_declaregoods
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:33:26
     *
     */
    int insert(YltBusDeclaregoods record);

    /**
     * For table: ylt_bus_declaregoods
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:33:26
     *
     */
    int insertSelective(YltBusDeclaregoods record);

    /**
     * For table: ylt_bus_declaregoods
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:33:26
     *
     */
    YltBusDeclaregoods selectByPrimaryKey(Integer flowno);

    /**
     * For table: ylt_bus_declaregoods
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:33:26
     *
     */
    int updateByPrimaryKeySelective(YltBusDeclaregoods record);

    /**
     * For table: ylt_bus_declaregoods
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:33:26
     *
     */
    int updateByPrimaryKey(YltBusDeclaregoods record);
    
    /**
     * 查询 报关单数据
     * @param declateGoodExample
     * @return
     */
	List<YltBusDeclaregoods> selectByExampleSelective(YltBusDeclaregoods declateGoodExample);

	/**
	 * 更新业务数据
	 * @param yltBusDeclaregoods
	 * @param yltBusDeclaregoodsExampe
	 * @return
	 */
	int updateByExampleSelective(@Param("value")YltBusDeclaregoods yltBusDeclaregoods, @Param("example")YltBusDeclaregoods yltBusDeclaregoodsExampe);
  
  
}