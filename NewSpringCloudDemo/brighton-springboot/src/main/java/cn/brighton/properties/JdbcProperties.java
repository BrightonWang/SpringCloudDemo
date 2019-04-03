/**
 * BrightonWang.com Inc.
 * Copyright (c) 2019- All Rights Reserved.
 */
package cn.brighton.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * </p>
 *
 * @author BrightonWang
 * @version $Id: NewSpringCloudDemo, v 1.0 21:08 2019-03-31 BrightonWang Exp $
 */
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
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
}
