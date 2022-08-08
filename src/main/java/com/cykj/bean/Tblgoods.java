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
}

