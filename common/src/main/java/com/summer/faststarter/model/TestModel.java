package com.summer.faststarter.model;

import lombok.Data;

import io.swagger.annotations.*;

/**
 * Created by liuke on 2019/12/12 14:09
 */
@ApiModel(value = "测试返回值", description = "测试返回值")
@Data
public class TestModel {

  @ApiModelProperty(value = "姓名")
  private String name;
  @ApiModelProperty(value = "年龄")
  private Integer age;
}
