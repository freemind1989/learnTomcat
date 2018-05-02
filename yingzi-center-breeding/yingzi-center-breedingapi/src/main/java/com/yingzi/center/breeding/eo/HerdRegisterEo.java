package com.yingzi.center.breeding.eo;

import com.dtyunxi.eo.BaseEo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @ClassName: HerdRegisterDto
 * @Description: (猪只档案)
 * @Author zxma
 * @Date 2018-04-24
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Table(name = "bc_herd_register")

public class HerdRegisterEo extends BaseEo {



    /**主组织ID*/
    @Column(name = "master_org_id")

    private Long masterOrgId;

    /**猪只编号*/
    @Column(name = "herd_id")
    private Long herdId;

    /**事件编号*/
    @Column(name = "event_id")
    private  Long eventId;

    /**事件日期*/
    @Column(name = "evdate")
    private Date evDate;

    /**性别*/
    @Column(name = "sex")
    private String sex;

    /**品种*/
    @Column(name = "breeding")
    private String breeding;

    /**出生日期*/
    @Column(name = "birthdate")
    private Date birthDate;

    /**窝号*/
    @Column(name = "litterid")
    private Long litterId;

    /**来源种类*/
    @Column(name = "sourcetype")
    private String sourceType;

    /**来源*/
    @Column(name = "source")
    private String source;

    /**初始胎龄*/
    @Column(name = "iniparity")
    private int iniparity;

    /**初始位置*/
    @Column(name = "inillocation")
    private String inilLocation;

    /**父系*/
    @Column(name = "fatherid")
    private Long fatherId;

    /**母系*/
    @Column(name = "motherid")
    private Long motherId;

    /**体重*/
    @Column(name = "weight")
    private BigDecimal weight;

    /**价格*/
    @Column(name = "price")
    private BigDecimal price;

    /**备注*/
    @Column(name = "fcomment")
    private String fcomment;

    public Long getMasterOrgId() {
        return masterOrgId;
    }

    public void setMasterOrgId(Long masterOrgId) {
        this.masterOrgId = masterOrgId;
    }

    public Long getHerdId() {
        return herdId;
    }

    public void setHerdId(Long herdId) {
        this.herdId = herdId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Date getEvDate() {
        return evDate;
    }

    public void setEvDate(Date evDate) {
        this.evDate = evDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBreeding() {
        return breeding;
    }

    public void setBreeding(String breeding) {
        this.breeding = breeding;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getLitterId() {
        return litterId;
    }

    public void setLitterId(Long litterId) {
        this.litterId = litterId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getIniparity() {
        return iniparity;
    }

    public void setIniparity(int iniparity) {
        this.iniparity = iniparity;
    }

    public String getInilLocation() {
        return inilLocation;
    }

    public void setInilLocation(String inilLocation) {
        this.inilLocation = inilLocation;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    public Long getMotherId() {
        return motherId;
    }

    public void setMotherId(Long motherId) {
        this.motherId = motherId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFcomment() {
        return fcomment;
    }

    public void setFcomment(String fcomment) {
        this.fcomment = fcomment;
    }
}