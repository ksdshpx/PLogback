package cn.ksdshpx.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/3/21
 * Time: 14:18
 * Description:Logback-案例3滚动日志附加器
 */
public class LogbackDemo3 {
    public static void main(String[] args) {
        //创建日志记录对象
        Logger logger = LoggerFactory.getLogger(LogbackDemo3.class);
        for (int i = 0; i < 10000; i++) {
            logger.trace("This is trace message");
            logger.debug("This is debug message");
            logger.info("This is info message");
            logger.warn("This is warn message");
            logger.error("This is error message");
        }
    }
}
