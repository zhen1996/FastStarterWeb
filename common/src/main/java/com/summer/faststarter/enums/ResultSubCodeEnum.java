package com.summer.faststarter.enums;

import org.apache.commons.lang.StringUtils;

/**
 * subretcode和subretdesc的枚举值
 */
public enum ResultSubCodeEnum {
  SUCCESS_COMMON("success.common", "业务请求处理成功"),
  ;

  private String subretcode;
  private String subretdesc;

  ResultSubCodeEnum() {}

  ResultSubCodeEnum(String subretcode, String subretdesc) {
    this.subretcode = subretcode;
    this.subretdesc = subretdesc;
  }

  public String getSubretcode() {
    return subretcode;
  }

  public void setSubretcode(String subretcode) {
    this.subretcode = subretcode;
  }

  public String getSubretdesc() {
    return subretdesc;
  }

  public void setSubretdesc(String subretdesc) {
    this.subretdesc = subretdesc;
  }

  public static ResultSubCodeEnum getEnumByCode(String code){
    for(ResultSubCodeEnum subCodeEnum : ResultSubCodeEnum.values()){
      if(StringUtils.equals(code, subCodeEnum.getSubretcode())){
        return subCodeEnum;
      }
    }
    return null;
  }
}
