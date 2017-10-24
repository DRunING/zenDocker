package com.zenDocker.init.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Druning on 2017/10/23.
 */
public interface DockerImageRespository extends JpaRepository<DockerImage, Long>{
    DockerImage findByRespository(String str);
    DockerImage findBy
}
