package com.summer.faststarter.config;

import com.summer.faststarter.enums.ResultCodeEnum;
import com.summer.faststarter.model.response.ResultData;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public ResultData processException(HttpServletRequest request, Exception e) {
    // todo：
    log.info("出现异常");
    return new ResultData(ResultCodeEnum.BUSSINESS_EXCEPTION, e.getMessage());
  }

}
