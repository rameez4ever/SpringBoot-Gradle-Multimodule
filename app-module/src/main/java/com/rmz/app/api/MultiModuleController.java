package com.rmz.app.api;

import com.rmz.core.CoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/api")
@Slf4j
public class MultiModuleController {

    @Autowired
    CoreService coreService;

    @GetMapping
    public ResponseEntity<String> hello(){
        log.info("Calling core service module");
        coreService.coreEngine();
        return ResponseEntity.ok("Welcome to multi module gradle world");
    }
}
