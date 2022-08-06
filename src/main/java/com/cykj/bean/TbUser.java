package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体类")
public class TbUser {
  @ApiModelProperty(value = "用户ID")
  private String userid;
  @ApiModelProperty(value = "用户姓名")
  private String username;
  @ApiModelProperty(value = "用户密码")
  private String password;
  @ApiModelProperty(value = "用户年龄")
  private long age;
  @ApiModelProperty(value = "用户地址")
  private String address;
  @ApiModelProperty(value = "用户图片地址")
  private String image;

  public TbUser() {
  }

  public TbUser(String username, String password, long age, String address, String image) {
    this.username = username;
    this.password = password;
    this.age = age;
    this.address = address;
    this.image = image;
  }

  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

}
