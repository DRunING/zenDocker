package com.zenDocker.init.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Druning on 2017/10/23.
 */

@Component
public class ZenDockerProperties {

    @Value("${com.zenDocker.init.title}")
    private String title;

    @Value("${com.zenDocker.init.description}")
    private String description;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
