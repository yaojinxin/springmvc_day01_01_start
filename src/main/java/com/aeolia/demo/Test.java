package com.aeolia.demo;

import com.aeolia.domain.Student;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Test {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
        Test.main(new String[]{"1","2","3"});
    }

    public class TestInner{

    }
}

