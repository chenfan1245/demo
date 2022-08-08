package com.cykj.bean;


public class Tblgoods {

  private long id;
  private String goodsTitle;
  private double price;
  private String goodsType;
  private String goodsImg;
  private long buyNum;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getGoodsTitle() {
    return goodsTitle;
  }

  public void setGoodsTitle(String goodsTitle) {
    this.goodsTitle = goodsTitle;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }


  public String getGoodsImg() {
    return goodsImg;
  }

  public void setGoodsImg(String goodsImg) {
    this.goodsImg = goodsImg;
  }


  public long getBuyNum() {
    return buyNum;
  }

  public void setBuyNum(long buyNum) {
    this.buyNum = buyNum;
  }

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品实体类")
public class Tblgoods {
    @ApiModelProperty(value = "商品ID")
    private long id;
    @ApiModelProperty(value = "商品标题")
    private String goodsTitle;
    @ApiModelProperty(value = "商品价格")
    private double price;
    @ApiModelProperty(value = "商品类型")
    private String goodsType;
    @ApiModelProperty(value = "商品图片")
    private String goodsImg;
    @ApiModelProperty(value = "购买人数")
    private long buyNum;


    public Tblgoods() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public long getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(long buyNum) {
        this.buyNum = buyNum;
    }

    @Override
    public String toString() {
        return "商品信息表{" +
                "id=" + id +
                ", 商品标题='" + goodsTitle + '\'' +
                ", 商品价格=" + price +
                ", 商品类型='" + goodsType + '\'' +
                ", 商品图片='" + goodsImg + '\'' +
                ", 购买人数=" + buyNum +
                '}';
    }
}
