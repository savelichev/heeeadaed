package com.sava;

import java.sql.Timestamp;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(new Timestamp(date.getTime()));
        System.out.println(new java.util.Date(date.getTime()));

    }

}




