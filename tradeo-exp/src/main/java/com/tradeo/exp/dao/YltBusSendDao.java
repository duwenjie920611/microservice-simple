package com.tradeo.exp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusSend;
@Component
@Mapper
public interface YltBusSendDao {
    /**
     * For table: ylt_bus_send
     *
     * @author Mybatis Map Generator
     * @since 2019-03-29 10:19:36
     *
     */
    int deleteByPrimaryKey(Long flowno);

    /**
     * For table: ylt_bus_send
     *
     * @author Mybatis Map Generator
     * @since 2019-03-29 10:19:36
     *
     */
    int insert(YltBusSend record);

    /**
     * For table: ylt_bus_send
     *
     * @author Mybatis Map Generator
     * @since 2019-03-29 10:19:36
     *
     */
    int insertSelective(YltBusSend record);

    /**
     * For table: ylt_bus_send
     *
     * @author Mybatis Map Generator
     * @since 2019-03-29 10:19:36
     *
     */
    YltBusSend selectByPrimaryKey(Long flowno);

    /**
     * For table: ylt_bus_send
     *
     * @author Mybatis Map Generator
     * @since 2019-03-29 10:19:36
     *
     */
    int updateByPrimaryKeySelective(YltBusSend record);

    /**
     * For table: ylt_bus_send
     *
     * @author Mybatis Map Generator
     * @since 2019-03-29 10:19:36
     *
     */
    int updateByPrimaryKeyWithBLOBs(YltBusSend record);

    /**
     * For table: ylt_bus_send
     *
     * @author Mybatis Map Generator
     * @since 2019-03-29 10:19:36
     *
     */
    int updateByPrimaryKey(YltBusSend record);
    
    /**
     * 读取待下发的数据
     * @param index
     * @param total
     * @param count
     * @param sendId
     * @return
     */
    List<YltBusSend> selectYltUnpushList(@Param("index")int index, @Param("total")int total, @Param("count")int count, @Param("sendId")String sendId);
    
    int insertHisSelective(YltBusSend record);
    
}