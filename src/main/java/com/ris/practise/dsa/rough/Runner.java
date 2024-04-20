package com.ris.practise.dsa.rough;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner {
    public static void main(String args []){
        System.out.println(testingStrFnc());
    }

    public static String testingStrFnc(){
        return "Success";
    }
}
