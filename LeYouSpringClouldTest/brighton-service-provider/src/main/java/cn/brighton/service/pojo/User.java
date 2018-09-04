package cn.brighton.service.pojo;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * <p>
 * </p>
 *
 * @author lenovo
 * @version $Id: <className>, v <versionName> 17:35 2018/9/4 lenovo Exp $
 */
@Table(name = "tb_user")
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //用户名
    private String userName;

    //密码
    private String password;

    //姓名
    private String name;

    //年龄
    private Integer age;

    //性别,1.男性,2.女性
    private Integer sex;

    //出生日期
    private Date birthday;

    //创建时间
    private Date created;

    //更新时间
    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

        //return birthday;
        return birthday == null ? null : (Date) birthday.clone();
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
//        if (birthday == null){
//            birthday = null;
//        }else {
//            birthday = (Date)birthday.clone();
//        }
    }

    public Date getCreated() {
        return created;
//        return created == null ? null :(Date)created.clone();
    }


    public void setCreated(Date created) {
        this.created = created;
//        if(created == null){
//            created = null;
//        }else {
//            created = (Date)created.clone();
//        }
    }


    public Date getUpdated() {
        return updated;
//        return updated == null ? null : (Date)updated.clone();
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
//        if (updated == null){
//            updated = null;
//        }else {
//            updated = (Date)updated.clone();
//        }
    }
}
