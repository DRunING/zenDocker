package com.zenDocker.init;

import com.zenDocker.init.domain.DockerImage;
import com.zenDocker.init.domain.DockerImageRespository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
/**
 * Created by Druning on 2017/10/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DockerImageRepositoryTest {
    @Autowired
    private DockerImageRespository dockerImageRespository;

//    @Before
//    public
    @Test
    public void test(){
        dockerImageRespository.save(new DockerImage("y51563118/oai_spgw", "latest", "45afbbdfd220", (new Date()).toString(), "1.266 GB"));
    }
}
