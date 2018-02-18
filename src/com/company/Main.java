package com.company;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;



public class Main {
    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        switchAnnotation();
        TestExample.method1();
        TestExample.method2();
        TestExample.method3();
        TestExample.method4();

    }

    public static void switchAnnotation() {
        Class<TestExample> obj = TestExample.class;

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Log.class)) {

                logger.info(method.getName());

            }

        }
    }
}
