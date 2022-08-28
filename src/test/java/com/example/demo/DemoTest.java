package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ZLJ
 * @description
 * @date 2022/5/19
 */
public class DemoTest {
    public static void main(String[] args) {

//        int s =10;
//        String name ="h";
//
//        if (10 ==s && "hh".equals(name)){
//            System.out.println(1);
//        }
//        System.out.println(2);

                String str = "aAmiwn@123456";
        String pattern = "^(?:(?=.*[0-9].*)(?=.*[A-Za-z].*)(?=.*[,\\.!@#$%^&*'\\+\\*\\-:;^_`].*))[,\\.!@#$%^&*'\\+\\*\\-:;^_`0-9A-Za-z]{8,20}$";

        Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(str);
                System.out.println(m.matches());
            }




}
