package com.tradeo.exp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.tradeo.exp.bo.YltBusAgreement;

@Component
@Mapper
public interface YltBusAgreementDao {
    /**
     * For table: ylt_bus_agreement
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 16:30:56
     *
     */
    int deleteByPrimaryKey(Long agreementid);

    /**
     * For table: ylt_bus_agreement
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 16:30:56
     *
     */
    int insert(YltBusAgreement record);

    /**
     * For table: ylt_bus_agreement
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 16:30:56
     *
     */
    int insertSelective(YltBusAgreement record);

    /**
     * For table: ylt_bus_agreement
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 16:30:56
     *
     */
    YltBusAgreement selectByPrimaryKey(Long agreementid);

    /**
     * For table: ylt_bus_agreement
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 16:30:56
     *
     */
    int updateByPrimaryKeySelective(YltBusAgreement record);

    /**
     * For table: ylt_bus_agreement
     *
     * @author Mybatis Map Generator
     * @since 2019-03-30 16:30:56
     *
     */
    int updateByPrimaryKey(YltBusAgreement record);

    /**
     * 根据条件 更新委托协议 数据
     * @param agreementValue
     * @param agreementExample
     * @return
     */
	int updateByExampleSelective(@Param("value")YltBusAgreement agreementValue, @Param("example")YltBusAgreement agreementExample);

	List<YltBusAgreement> selectByExampleSelective(YltBusAgreement yltBusAgreementSelect);
}