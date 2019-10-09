package com.tradeo.exp.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 引入自定义配置文件
 * @author duwenjie
 *
 */
@Configuration
@ImportResource(locations = "classpath:applcation-beanl.xml")
public class ApplicationBeanConfig {

}
