package com.rmz.core;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CoreService{

    public void coreEngine(){
        log.info("Core engine execution");
    }
}
