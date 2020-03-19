package com.example.swagger.resource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Api model of contact")
public class Contact {

  @ApiModelProperty(notes = "id of the contact")
  private String id;

  @ApiModelProperty(notes = "name of the contact")
  private String name;

  @ApiModelProperty(notes = "phone of the contact")
  private String phone;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
