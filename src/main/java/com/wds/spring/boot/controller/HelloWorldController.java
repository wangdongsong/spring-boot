package com.wds.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by WANGDONGSONG846 on 2016-12-29.
 */

@Controller
public class HelloWorldController {


    @RequestMapping(value = "getTime", method = RequestMethod.GET, produces = "text/plain")
    @ResponseBody
    public String getTime() {
        return DateFormat.getDateTimeInstance().format(new Date());
    }

}
