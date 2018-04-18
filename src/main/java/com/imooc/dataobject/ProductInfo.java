package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by w on 2018/4/18.
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;
    private String productName;/** 名字. */
    private BigDecimal productPrice;/** 单价. */
    private Integer productStock;/** 库存. */
    private String productDescription;/** 描述. */
    private String productIcon;/** 小图. */
    private Integer productStatus;/** 状态, 0正常1下架. */
    private Integer categoryType;/** 类目编号. */
    private Date createTime;
    private Date updateTime;
}
