package com.summer.faststarter.api.controller;

import com.summer.faststarter.mybatis.extend.UserExtDao;
import com.summer.faststarter.mybatis.generate.dao.TestDao;
import com.summer.faststarter.mybatis.generate.model.Test;
import com.summer.faststarter.redis.RedisUtil;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.*;


/**
 * Created by liuke on 2019/12/11 15:27
 */

@Api(value = "测试控制器", description = "测试控制器")
@RestController
@Slf4j
@RequestMapping("/api")
public class TestController {

  @Resource
  private TestDao testDao;

  @Resource
  private UserExtDao userExtDao;

  @Resource
  private RedisUtil redisUtil;

  @ApiImplicitParams(value = {})
  @ApiOperation("测试-generator-dao")
  @GetMapping("/test1")
  public Object test() {
    Test test = testDao.selectByPrimaryKey(1);
    log.info("调用接口test1");
    return test.toString();
  }

  @ApiImplicitParams(value = {})
  @ApiOperation("测试2-dao")
  @GetMapping("/test2")
  public Object test2() {
    int count = userExtDao.countUserNumGrater(10);
    return count;
  }

  @ApiOperation("测试3-redis-set")
  @GetMapping("/test3")
  public void test3(String value) {
    log.info("value:{}", value);
    redisUtil.set("cache_test_key", value, 3600 * 10);
  }

  @ApiImplicitParams(value = {})
  @ApiOperation("测试4-redis-get")
  @GetMapping("/test4")
  public Object test4() {
    String test = (String) redisUtil.get("cache_test_key");
    return test;
  }

}
