package cn.ksdshpx.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/3/20
 * Time: 11:27
 * Description:Logback-案例1日志输出到控制台
 */
public class LogbackDemo1 {
    public static void main(String[] args) {
        //创建日志记录对象
        Logger logger = LoggerFactory.getLogger(LogbackDemo1.class);
        logger.trace("This is trace message");
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
        logger.error("This is error message");
    }
}
