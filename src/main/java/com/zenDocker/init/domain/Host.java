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
public class Host  implements Serializable{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String ipAddress;

    @Column(nullable = false, unique = false)
    private String passwd;

    @Column
    private String createTime;


    public Host(){
        super();
    }
    public Host(String name, String ipAddress, String passwd, String createTime){
        super();
        this.name = name;
        this.ipAddress = ipAddress;
        this.passwd = passwd;
        this.createTime = createTime;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getIpAddress(){
        return ipAddress;
    }
    public void setIpAddress(String ipAddress){
        this.ipAddress=ipAddress;
    }
    public String getPasswd(){
        return passwd;
    }
    public void setPasswd(String passwd){
        this.passwd = passwd;
    }
    public String getCreateTime(){
        return createTime;
    }
    public void setCreateTime(String createTime){
        this.createTime = createTime;
    }
}
