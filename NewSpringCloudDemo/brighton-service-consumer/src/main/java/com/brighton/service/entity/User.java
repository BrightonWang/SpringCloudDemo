/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.brighton.service.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: User, v <1.0> 16:12 2019-04-10 Brigh Exp $
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1883306912476754203L;

    private Long tbUserId;

    // 用户名
    private String username;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    private Date birthday;

    // 创建时间
    private Date created;

    // 更新时间
    private Date updated;

    public Long getTbUserId() {
        return tbUserId;
    }

    public void setTbUserId(Long id) {
        this.tbUserId = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday == null ? null : (Date) birthday.clone();
    }

    public void setBirthday(Date birthday) {
        if (birthday == null) {
            this.birthday = null;
        } else {
            this.birthday = (Date) birthday.clone();
        }
    }

    public Date getCreated() {
        return created == null ? null : (Date) created.clone();
    }

    public void setCreated(Date created) {
        this.created = created == null ? null : (Date) created.clone();
    }

    public Date getUpdated() {
        return updated == null ? null : (Date) updated.clone();
    }

    public void setUpdated(Date updated) {
        this.updated = updated == null ? null : (Date) updated.clone();
    }

//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public Date getCreated() {
//        return created;
//    }
//
//    public void setCreated(Date created) {
//        this.created = created;
//    }
//
//    public Date getUpdated() {
//        return updated;
//    }
//
//    public void setUpdated(Date updated) {
//        this.updated = updated;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(tbUserId, user.tbUserId) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(name, user.name) &&
                Objects.equals(age, user.age) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(created, user.created) &&
                Objects.equals(updated, user.updated);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tbUserId, username, password, name, age, sex, birthday, created, updated);
    }
}


