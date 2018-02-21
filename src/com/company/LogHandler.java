package com.company;

import org.apache.log4j.Logger;

import java.lang.reflect.Method;
import java.util.Date;

public class LogHandler {

    public static void writeToLog(Logger logger) {
        Class<TestExample> obj = TestExample.class;

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Log.class)) {

                logger.info("Method: " + method.getName() + " " + "called at " + new Date());

            }

        }
    }
}
