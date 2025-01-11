package com.ris.learnings.dsa.recursion;
import org.slf4j.LoggerFactory;


public class TestClass {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(TestClass.class);

    public static void main(String[] args) {
        for (int i = 0; i < 120; i += 30) {
            log.info("Started");
        }
    }
}
