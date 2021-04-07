package com.nelson.school.manage.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author nelson
 * @Desc inner controller
 * @date 2021/3/24 6:38 下午
 */
@Controller
public class InnerController {

    @RequestMapping("/data/inner/health-check")
    @ResponseBody
    public String healthCheck() {
        return "health check success!";
    }
}
