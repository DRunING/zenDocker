package com.zenDocker.init.controller;

/**
 * Created by Druning on 2017/10/23.
 */

import com.zenDocker.init.domain.Host;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetHostList {
    @RequestMapping("/hostlist")
    public List<Host> getHost(){
        Host host = new Host();

        List<Host> hostList = new ArrayList<>();

        return hostList;
    }
}
