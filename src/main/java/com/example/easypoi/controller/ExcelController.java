package com.example.easypoi.controller;

import com.example.easypoi.model.PersonExportVo;
import com.example.easypoi.utils.ExcelUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: chenzheng
 * @Date: 2019/12/25 14:58
 */

@RestController
@RequestMapping("/excel")
public class ExcelController {
    /**
     * 导出
     *
     * @param response
     */
    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void exportExcel(HttpServletResponse response) throws IOException {
        List<PersonExportVo> personList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            PersonExportVo personVo = new PersonExportVo();
            personVo.setName("张三" + i);
            personVo.setUsername("张三" + i);
            personVo.setPhoneNumber("18888888888");
            personVo.setImageUrl("/static/user1-128x128.jpg");
            personVo.setCratetime(LocalDateTime.now());
            personList.add(personVo);
        }
        ExcelUtils.exportExcel(personList, "员工信息表", "员工信息", PersonExportVo.class, "员工信息", response);
    }


    /**
     * 导入
     *
     * @param file
     */
    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public Object importExcel(@RequestParam("file") MultipartFile file) throws IOException {
        List<PersonExportVo> personVoList = ExcelUtils.importExcel(file, PersonExportVo.class);
        return personVoList;
    }
}
