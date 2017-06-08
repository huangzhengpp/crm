package com.softfactory.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.softfactory.pojo.User;

@Repository("userMapper")
public interface UserMapper {

  @Select("SELECT ID,USER_NAME AS USERNAME,USER_PWD AS PASSWORD,USER_STATUS AS STATUS,USER_SEX AS USERSEX,USER_EMAIL AS USEREMAIL,USER_PHONE AS USERPHONE FROM USERS WHERE USER_NAME=#{username} AND USER_PWD=#{password} AND USER_STATUS='1'")
  User login(@Param("username") String username, @Param("password") String password);

  @Update("UPDATE USERS SET USER_PWD=#{password} WHERE ID=#{id}")
  int changePassword(@Param("id") Integer id, @Param("password") String password);

  // ** CRUD *********************************************************
  @Insert("insert into USERS(ID,USER_NAME,USER_PWD,USER_STATUS,USER_SEX,USER_EMAIL,USER_PHONE) values(#{id},#{username},#{password},#{status},#{userSex,jdbcType=VARCHAR},#{userEmail,jdbcType=VARCHAR},#{userPhone,jdbcType=VARCHAR})")
  @SelectKey(statement = "select SEQ_USER.nextval from dual", keyProperty = "id", resultType = int.class, before = true)
  int add(User user);

  @Update("update USERS set USER_NAME=#{username},USER_PWD=#{password},USER_STATUS=#{status},USER_SEX=#{userSex,jdbcType=VARCHAR},USER_EMAIL=#{userEmail,jdbcType=VARCHAR},USER_PHONE=#{userPhone,jdbcType=VARCHAR} where ID=#{id}")
  int modify(User user);

  @Delete("delete from USERS where ID=#{id}")
  int remove(Integer id);

  @Select("SELECT ID,USER_NAME AS USERNAME,USER_PWD AS PASSWORD,USER_STATUS AS STATUS,USER_SEX as USERSEX,USER_EMAIL AS USEREMAIL,USER_PHONE AS USERPHONE FROM USERS WHERE ID=#{id}")
  User findById(Integer id);

  List<User> findPager(@Param("pageno") Integer pageno, @Param("pagesize") Integer pagesize, @Param("sort") String sort,
      @Param("order") String order, @Param("username") String username, @Param("status") String status);

  long findPagerTotal(@Param("username") String username, @Param("status") String status);

  @Delete("delete from SYS_USER_ROLE where USER_ID=#{userId} and ROLE_ID=#{roleId}")
  void removeUserRole(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

  @Insert("insert into SYS_USER_ROLE(USER_ID,ROLE_ID) values(#{userId},#{roleId})")
  void addUserRole(@Param("userId") Integer userId, @Param("roleId") Integer roleId);
}
