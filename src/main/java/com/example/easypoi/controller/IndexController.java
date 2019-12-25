package com.example.easypoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 去导入页面controller
 * @Author: chenzheng
 * @Date: 2019/12/25 14:52
 */

@Controller
@RequestMapping("/im")
public class IndexController {

    /**
     * 去导入页面
     *
     * @return
     */
    @RequestMapping("/to")
    public String toImport(){
        return "import";
    }
}
