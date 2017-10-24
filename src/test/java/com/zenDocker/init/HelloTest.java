package com.zenDocker.init;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.zenDocker.init.controller.MainController;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Druning on 2017/10/23.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {

    private MockMvc mockMvc;
    @Test
    public void test() throws Exception
    {
        mockMvc.perform(MockMvcRequestBuilders.get("/main").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
//                .andExpect(content().string(equalTo("Hello World")));
//        System.out.print();
    }

    @Before
    public void setUp()  throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new MainController()).build();
    }
}
