package com.example.server;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
 
    @Autowired
    private SampleDao sampleDao;
     
    @RequestMapping(method = RequestMethod.GET)
    @Transactional
    public List<VoiceStringData> get() {
        return sampleDao.findAll();
    }
}
