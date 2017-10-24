package com.zenDocker.init.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Druning on 2017/10/23.
 */
@Entity
public class DockerImage implements Serializable{
    @Id
    @GeneratedValue
    private Long Id;

    @Column
    private String respository;

    @Column
    private String tag;

    @Column
    private String imageId;

    @Column
    private String createTime;

    @Column
    private String virtualSize;

    public DockerImage(){
        super();
    }

    public DockerImage(String respository, String tag, String imageId, String createTime, String virtualSize){
        super();
        this.respository = respository;
        this.tag = tag;
        this.imageId = imageId;
        this.createTime = createTime;
        this.virtualSize = virtualSize;
    }

    public Long getId(){
        return this.Id;
    }
    public void setId(Long id){
        this.Id = id;
    }

    public String getRespository(){
        return respository;
    }
    public void setRespository(String respository){
        this.respository =respository;
    }

    public String getTag(){
        return tag;
    }
    public void setTag(String tag){
        this.tag =tag;
    }

    public String getImageId(){
        return imageId;
    }

    public void setImageId(String imageId){
        this.imageId = imageId;
    }

    public String getCreateTime(){
        return createTime;
    }
    public void setCreateTime(String createTime){
        this.createTime =createTime;
    }
    public String getVirtualSize(){
        return virtualSize;
    }
    public void setVirtualSize(String virtualSize){
        this.virtualSize = virtualSize;
    }
}
