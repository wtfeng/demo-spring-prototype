package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    AService aService;


    @Test
    public void should_be_the_same_instance_if_not_using_get_mehtod() {
        assertEquals(aService.bService, aService.bService);
    }

    @Test
    public void should_lookup_introduce_a_new_instance() {
        assertNotEquals(aService.getbService(), aService.getbService());
        assertNotEquals(aService.printBService(), aService.printBService());
    }

    @Test
    public void should_target_class_introduce_a_new_instance() {
        assertNotEquals(aService.getcService(), aService.getcService());
    }

}
