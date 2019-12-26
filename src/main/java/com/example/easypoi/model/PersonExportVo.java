package com.example.easypoi.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description: model
 * @Author: chenzheng
 * @Date: 2019/12/25 14:56
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class PersonExportVo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 姓名
     */
    @Excel(name = "姓名", orderNum = "0", width = 15)
    private String name;

    /**
     * 登录用户名
     */
    @Excel(name = "用户名", orderNum = "1", width = 15)
    private String username;

    @Excel(name = "手机号码", orderNum = "2", width = 15)
    private String phoneNumber;

    /**
     * 人脸图片
     * TYPE 2 图片
     */
    @Excel(name = "人脸图片", orderNum = "3", width = 15, height = 30, type = 2)
    private String imageUrl;

    /**
     * 请教下日期格式化问题
     */
    @Excel(name = "创建时间", orderNum = "4", format = "yyyy-MM-dd HH.mm.ss", width = 30)
    private String cratetime;


}