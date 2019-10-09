package com.tradeo.exp.bo;

import java.math.BigDecimal;
import java.util.Date;

public class YltBusShipsubbill {
    /**
     * Column name: subBillId
     * Comment: 
     */
    private Integer subbillid;

    /**
     * Column name: billId
     * Comment: 
     */
    private Integer billid;

    /**
     * Column name: lecenseNo
     * Comment: 
     */
    private Long lecenseno;

    /**
     * Column name: billNo
     * Comment: 
     */
    private String billno;

    /**
     * Column name: subBillNo
     * Comment: 
     */
    private String subbillno;

    /**
     * Column name: mainGoodsName
     * Comment: 
     */
    private String maingoodsname;

    /**
     * Column name: totalWeight
     * Comment: 
     */
    private BigDecimal totalweight;

    /**
     * Column name: totalCount
     * Comment: 
     */
    private Integer totalcount;

    /**
     * Column name: totalValume
     * Comment: 
     */
    private BigDecimal totalvalume;

    /**
     * Column name: Currency
     * Comment: 
     */
    private String currency;

    /**
     * Column name: OpType
     * Comment: 
     */
    private String optype;

    /**
     * Column name: userName
     * Comment: 
     */
    private String username;

    /**
     * Column name: branchCode
     * Comment: 
     */
    private Integer branchcode;

    /**
     * Column name: createTime
     * Comment: 
     */
    private Date createtime;

    /**
     * Column name: lastUpdateTime
     * Comment: 
     */
    private Date lastupdatetime;

    /**
     * Column name: isComplete
     * Comment: 物流信息是否获取完成
     */
    private Integer iscomplete;

    /**
     * Column name: lastUpdateUser
     * Comment: 
     */
    private String lastupdateuser;

    /**
     * Column name: lastGetTime
     * Comment: 物流最后获取时间
     */
    private Date lastgettime;

    /**
     * Column name: lastLogisTime
     * Comment: 
     */
    private Date lastlogistime;

    /**
     * Column name: logisStatus
     * Comment: 
     */
    private String logisstatus;

    /**
     * Column name: subBillStatus
     * Comment: 
     */
    private String subbillstatus;

    /**
     * Column name: flight_no
     * Comment: 
     */
    private String flightNo;

    /**
     * @return subBillId Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Integer getSubbillid() {
        return subbillid;
    }

    /**
     * @param Integer subbillid
     *  Column name: subBillId
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setSubbillid(Integer subbillid) {
        this.subbillid = subbillid;
    }

    /**
     * @return billId Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Integer getBillid() {
        return billid;
    }

    /**
     * @param Integer billid
     *  Column name: billId
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    /**
     * @return lecenseNo Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Long getLecenseno() {
        return lecenseno;
    }

    /**
     * @param Long lecenseno
     *  Column name: lecenseNo
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setLecenseno(Long lecenseno) {
        this.lecenseno = lecenseno;
    }

    /**
     * @return billNo Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getBillno() {
        return billno;
    }

    /**
     * @param String billno
     *  Column name: billNo
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setBillno(String billno) {
        this.billno = billno;
    }

    /**
     * @return subBillNo Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getSubbillno() {
        return subbillno;
    }

    /**
     * @param String subbillno
     *  Column name: subBillNo
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setSubbillno(String subbillno) {
        this.subbillno = subbillno;
    }

    /**
     * @return mainGoodsName Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getMaingoodsname() {
        return maingoodsname;
    }

    /**
     * @param String maingoodsname
     *  Column name: mainGoodsName
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setMaingoodsname(String maingoodsname) {
        this.maingoodsname = maingoodsname;
    }

    /**
     * @return totalWeight Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public BigDecimal getTotalweight() {
        return totalweight;
    }

    /**
     * @param BigDecimal totalweight
     *  Column name: totalWeight
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setTotalweight(BigDecimal totalweight) {
        this.totalweight = totalweight;
    }

    /**
     * @return totalCount Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Integer getTotalcount() {
        return totalcount;
    }

    /**
     * @param Integer totalcount
     *  Column name: totalCount
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    /**
     * @return totalValume Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public BigDecimal getTotalvalume() {
        return totalvalume;
    }

    /**
     * @param BigDecimal totalvalume
     *  Column name: totalValume
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setTotalvalume(BigDecimal totalvalume) {
        this.totalvalume = totalvalume;
    }

    /**
     * @return Currency Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param String currency
     *  Column name: Currency
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return OpType Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getOptype() {
        return optype;
    }

    /**
     * @param String optype
     *  Column name: OpType
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setOptype(String optype) {
        this.optype = optype;
    }

    /**
     * @return userName Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param String username
     *  Column name: userName
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return branchCode Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Integer getBranchcode() {
        return branchcode;
    }

    /**
     * @param Integer branchcode
     *  Column name: branchCode
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setBranchcode(Integer branchcode) {
        this.branchcode = branchcode;
    }

    /**
     * @return createTime Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param Date createtime
     *  Column name: createTime
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return lastUpdateTime Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    /**
     * @param Date lastupdatetime
     *  Column name: lastUpdateTime
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    /**
     * @return isComplete Comment: 物流信息是否获取完成
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Integer getIscomplete() {
        return iscomplete;
    }

    /**
     * @param Integer iscomplete
     *  Column name: isComplete
     *  Comment: 物流信息是否获取完成
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setIscomplete(Integer iscomplete) {
        this.iscomplete = iscomplete;
    }

    /**
     * @return lastUpdateUser Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getLastupdateuser() {
        return lastupdateuser;
    }

    /**
     * @param String lastupdateuser
     *  Column name: lastUpdateUser
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setLastupdateuser(String lastupdateuser) {
        this.lastupdateuser = lastupdateuser;
    }

    /**
     * @return lastGetTime Comment: 物流最后获取时间
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Date getLastgettime() {
        return lastgettime;
    }

    /**
     * @param Date lastgettime
     *  Column name: lastGetTime
     *  Comment: 物流最后获取时间
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setLastgettime(Date lastgettime) {
        this.lastgettime = lastgettime;
    }

    /**
     * @return lastLogisTime Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public Date getLastlogistime() {
        return lastlogistime;
    }

    /**
     * @param Date lastlogistime
     *  Column name: lastLogisTime
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setLastlogistime(Date lastlogistime) {
        this.lastlogistime = lastlogistime;
    }

    /**
     * @return logisStatus Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getLogisstatus() {
        return logisstatus;
    }

    /**
     * @param String logisstatus
     *  Column name: logisStatus
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setLogisstatus(String logisstatus) {
        this.logisstatus = logisstatus;
    }

    /**
     * @return subBillStatus Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getSubbillstatus() {
        return subbillstatus;
    }

    /**
     * @param String subbillstatus
     *  Column name: subBillStatus
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setSubbillstatus(String subbillstatus) {
        this.subbillstatus = subbillstatus;
    }

    /**
     * @return flight_no Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * @param String flightNo
     *  Column name: flight_no
     *  Comment: 
     *
     * @author Mybatis Map Generator
     * @since 2019-04-08 19:06:57
     *
     */
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }
}