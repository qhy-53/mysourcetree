package com.haiyu.mysourcetree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

import static java.lang.System.currentTimeMillis;

@Controller
public class ControllerTest {

    @ResponseBody
    @RequestMapping("/random")
    public String getRandom() {
        Random random = new Random();
        int firstRandom = random.nextInt(100);
        int max = 100, min = 1;
        int secondRandom = (int) (Math.random() * (max - min) + min);

        int thirdlyRandom = (int) (Math.random() * (max - min));


        long currentTimeMillis = currentTimeMillis();
        return "多个随机数 : " + firstRandom + "--" + secondRandom + "--" + thirdlyRandom + "--" + currentTimeMillis;
    }


}
