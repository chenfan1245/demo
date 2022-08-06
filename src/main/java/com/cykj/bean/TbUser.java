package com.cykj.bean;


public class TbUser {

  private String userid;
  private String username;
  private String password;
  private long age;
  private String address;
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
