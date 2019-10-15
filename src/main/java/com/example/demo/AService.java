package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class AService {
    @Lookup
    public BService getbService() {
        return bService;
//        return null;
    }

    public void setbService(BService bService) {
        this.bService = bService;
    }

    @Autowired
    BService bService;

    public CService getcService() {
        return cService;
    }

    public void setcService(CService cService) {
        this.cService = cService;
    }

    @Autowired
    CService cService;

    public String printBService(){
        return getbService().toString();
    }


}
