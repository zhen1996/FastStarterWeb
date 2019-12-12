package com.summer.faststarter.mybatis.extend;

import com.summer.faststarter.mybatis.generate.dao.UserDao;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liuke on 2019/12/11 18:40
 */
public interface UserExtDao extends UserDao {

  int countUserNumGrater(@Param("age") Integer age);
}
