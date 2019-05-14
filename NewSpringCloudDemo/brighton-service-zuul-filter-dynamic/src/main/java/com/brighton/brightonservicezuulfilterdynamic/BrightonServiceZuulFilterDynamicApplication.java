package com.brighton.brightonservicezuulfilterdynamic;

import com.brighton.brightonservicezuulfilterdynamic.config.FilterConfiguration;
import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import java.util.logging.Filter;

@EnableZuulProxy
@EnableConfigurationProperties({FilterConfiguration.class})
@SpringBootApplication
public class BrightonServiceZuulFilterDynamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrightonServiceZuulFilterDynamicApplication.class, args);
    }

    @Bean
    public FilterLoader filterLoader(FilterConfiguration filterConfiguration){
        FilterLoader filterLoader = FilterLoader.getInstance();
        filterLoader.setCompiler(new GroovyCompiler());
        try {
            FilterFileManager.setFilenameFilter(new GroovyFileFilter());
            FilterFileManager.init(
                    filterConfiguration.getInternal(),
                    filterConfiguration.getRoot()+"/pre",
                    filterConfiguration.getRoot()+"/post"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filterLoader;
    }
}
