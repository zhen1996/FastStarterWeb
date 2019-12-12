package com.summer.faststarter.model.response;

import com.summer.faststarter.enums.ResultCodeEnum;
import com.summer.faststarter.enums.ResultSubCodeEnum;
import java.io.Serializable;

/**
 * 此类是请求的返回数据
 */
public class ResultData<T> extends ResultInfo implements Serializable {

  private static final long serialVersionUID = -4444641144802156949L;
  private T data = null;

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public ResultData() {
  }

  public ResultData(ResultCodeEnum resultCodeEnum) {
    super(resultCodeEnum.getRetcode(), resultCodeEnum.getRetdesc());

  }

  public ResultData(ResultCodeEnum resultCodeEnum, T data) {
    super(resultCodeEnum.getRetcode(), resultCodeEnum.getRetdesc());
    this.data = data;
  }

  public ResultData(ResultCodeEnum resultCodeEnum, ResultSubCodeEnum resultSubCodeEnum) {
    super(
        resultCodeEnum.getRetcode(),
        resultCodeEnum.getRetdesc(),
        resultSubCodeEnum.getSubretcode(),
        resultSubCodeEnum.getSubretdesc());
  }

  public ResultData(ResultCodeEnum resultCodeEnum, String retdesc) {
    super(
        resultCodeEnum.getRetcode(),
        retdesc);
  }

  public ResultData(ResultCodeEnum resultCodeEnum, ResultSubCodeEnum resultSubCodeEnum, T data) {
    this(resultCodeEnum, resultSubCodeEnum);
    this.data = data;
  }
}
