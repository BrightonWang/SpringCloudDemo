package com.brighton.brightonservicezuulfilterdynamic.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * </p>
 *
 * @author Brigh
 * @version $Id: <className>, v <versionName> 16:22 2019-05-14 Brigh Exp $
 */
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {
    private String root;
    private Integer interval;

    public String getRoot(){
        return root;
    }
    public void setRoot(String root){
        this.root = root;
    }
    public Integer getInternal(){
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
