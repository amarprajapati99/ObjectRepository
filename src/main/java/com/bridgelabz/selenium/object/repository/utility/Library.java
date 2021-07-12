package com.bridgelabz.selenium.object.repository.utility;

import com.bridgelabz.selenium.object.repository.base.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

public class Library extends BaseClass{

    public static String CONFIG_PATH = "F:\\Selenium\\ObjectRepository\\src\\test\\resources\\config.properties";

    public static String getProperty(String CONFIG_PATH , String key){
        String property = "";
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream (CONFIG_PATH));
            property = pro.getProperty(key);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return property;
    }
}

