package com.tradeo.exp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusVoucher;
@Component
@Mapper
public interface YltBusVoucherDao {
    /**
     * For table: ylt_bus_voucher
     *
     * @author Mybatis Map Generator
     * @since 2019-03-28 21:17:48
     *
     */
    int deleteByPrimaryKey(Long attachid);

    /**
     * For table: ylt_bus_voucher
     *
     * @author Mybatis Map Generator
     * @since 2019-03-28 21:17:48
     *
     */
    int insert(YltBusVoucher record);

    /**
     * For table: ylt_bus_voucher
     *
     * @author Mybatis Map Generator
     * @since 2019-03-28 21:17:48
     *
     */
    int insertSelective(YltBusVoucher record);

    /**
     * For table: ylt_bus_voucher
     *
     * @author Mybatis Map Generator
     * @since 2019-03-28 21:17:48
     *
     */
    YltBusVoucher selectByPrimaryKey(Long attachid);

    /**
     * For table: ylt_bus_voucher
     *
     * @author Mybatis Map Generator
     * @since 2019-03-28 21:17:48
     *
     */
    int updateByPrimaryKeySelective(YltBusVoucher record);

    /**
     * For table: ylt_bus_voucher
     *
     * @author Mybatis Map Generator
     * @since 2019-03-28 21:17:48
     *
     */
    int updateByPrimaryKey(YltBusVoucher record);

	List<YltBusVoucher> selectByExampleSelective(YltBusVoucher declaredocExample);

	int updateByExampleSelective(@Param("value")YltBusVoucher yltBusVoucher, @Param("example")YltBusVoucher voucherExample);
}