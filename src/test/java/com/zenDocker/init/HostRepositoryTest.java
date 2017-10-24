package com.zenDocker.init;

import com.zenDocker.init.domain.Host;
import com.zenDocker.init.domain.HostRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Druning on 2017/10/23.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HostRepositoryTest {
    @Autowired
    private HostRepository hostRepository;

    @Test
    public void test() throws Exception{
        Date date = new Date();
        String dateString = date.toString();

//        hostRepository.save(new Host());
//        hostRepository.save(new Host("ubuntu", "127.0.0.1", "123456", dateString));

        Assert.assertEquals("ubuntu", hostRepository.findByName("ubuntu").getName());
    }
}
