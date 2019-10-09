package com.tradeo.exp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusDeclareResponse;
import com.tradeo.exp.bo.YltBusDeclareResponseWithBLOBs;

@Component
@Mapper
public interface YltBusDeclareResponseDao {
    /**
     * For table: ylt_bus_declare_response
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    int deleteByPrimaryKey(Long flownum);

    /**
     * For table: ylt_bus_declare_response
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    int insert(YltBusDeclareResponseWithBLOBs record);

    /**
     * For table: ylt_bus_declare_response
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    int insertSelective(YltBusDeclareResponseWithBLOBs record);

    /**
     * For table: ylt_bus_declare_response
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    YltBusDeclareResponseWithBLOBs selectByPrimaryKey(Long flownum);

    /**
     * For table: ylt_bus_declare_response
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    int updateByPrimaryKeySelective(YltBusDeclareResponseWithBLOBs record);

    /**
     * For table: ylt_bus_declare_response
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    int updateByPrimaryKeyWithBLOBs(YltBusDeclareResponseWithBLOBs record);

    /**
     * For table: ylt_bus_declare_response
     *
     * @author Mybatis Map Generator
     * @since 2019-06-14 17:24:46
     *
     */
    int updateByPrimaryKey(YltBusDeclareResponse record);
}