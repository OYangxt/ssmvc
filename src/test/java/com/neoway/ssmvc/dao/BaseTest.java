package com.neoway.ssmvc.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 *
 * @author 20190712713
 * @date 2019/8/26 19:35
 */

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration("classpath:applicationContext.xml")

public class BaseTest {
}
