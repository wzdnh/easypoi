package com.example.easypoi.utils;

import cn.afterturn.easypoi.cache.manager.POICacheManager;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description: 监听项目启动时，对POICacheManager进行全局替换
 * @Author: chenzheng
 * @Date: 2019/12/25 14:57
 * @Param:
 * @Return:
 */

@Component
public class ExcelListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        POICacheManager.setFileLoader(new FileLoaderImpl());
    }
}