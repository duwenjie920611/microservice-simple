package com.tradeo.exp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusDeclarebill;


@Component
@Mapper
public interface YltBusDeclarebillDao {
    /**
     * For table: ylt_bus_declarebill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:20:56
     *
     */
    int deleteByPrimaryKey(Integer declareid);

    /**
     * For table: ylt_bus_declarebill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:20:56
     *
     */
    int insert(YltBusDeclarebill record);

    /**
     * For table: ylt_bus_declarebill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:20:56
     *
     */
    int insertSelective(YltBusDeclarebill record);

    /**
     * For table: ylt_bus_declarebill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:20:56
     *
     */
    YltBusDeclarebill selectByPrimaryKey(Integer declareid);

    /**
     * For table: ylt_bus_declarebill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:20:56
     *
     */
    int updateByPrimaryKeySelective(YltBusDeclarebill record);

    /**
     * For table: ylt_bus_declarebill
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 18:20:56
     *
     */
    int updateByPrimaryKey(YltBusDeclarebill record);
    
    /**
     * 
     * @param declareBillExample
     * @return
     */
	List<YltBusDeclarebill> selectByExampleSelective(YltBusDeclarebill declareBillExample);

	/**
	 * 更新报关单表 数据值
	 * @param example
	 * @param value
	 * @return
	 */
	int updateByExampleSelectiveCompare(@Param("value")YltBusDeclarebill value,@Param("example")YltBusDeclarebill example);
	
}