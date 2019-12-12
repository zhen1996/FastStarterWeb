package com.summer.faststarter.enums;

/**
 * retcode和retdesc的枚举值
 */
public enum ResultCodeEnum {
  SUCCESS(10000, "接口调用成功"),
  PARAM_ERROR(20001, "参数不正确"),


  BUSSINESS_EXCEPTION(20001, "业务异常"),
  ;

  private int retcode;
  private String retdesc;

  ResultCodeEnum() {}

  ResultCodeEnum(int retcode, String retdesc) {
    this.retcode = retcode;
    this.retdesc = retdesc;
  }

  public int getRetcode() {
    return retcode;
  }

  public void setRetcode(int retcode) {
    this.retcode = retcode;
  }

  public String getRetdesc() {
    return retdesc;
  }

  public void setRetdesc(String retdesc) {
    this.retdesc = retdesc;
  }
}
