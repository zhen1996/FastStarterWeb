package com.summer.faststarter.api.controller;

import com.summer.faststarter.datasource.mybatis.extend.UserExtDao;
import com.summer.faststarter.datasource.mybatis.generate.dao.TestDao;
import com.summer.faststarter.datasource.mybatis.generate.model.Test;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.*;

/**
 * Created by liuke on 2019/12/11 15:27
 */
@Api(value = "测试控制器", description = "测试控制器")
@RestController
@RequestMapping("/api")
public class TestController {

  @Resource
  private TestDao testDao;

  @Resource
  private UserExtDao userExtDao;

  @ApiImplicitParams(value = {})
  @ApiOperation("测试")
  @GetMapping("/test1")
  public Object test() {
    Test test = testDao.selectByPrimaryKey(1);
    return test.toString();
  }

  @ApiImplicitParams(value = {})
  @ApiOperation("测试2")
  @GetMapping("/test2")
  public Object test2() {
    int count = userExtDao.countUserNumGrater(10);
    return count;
  }
}
