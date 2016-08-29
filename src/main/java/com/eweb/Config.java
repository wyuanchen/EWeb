package com.eweb;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by yuan on 8/29/16.
 */
public class Config {
    public static final String CONFIG_FILE;
    public static final String JDBC_DRIVER;
    public static final String JDBC_URL;
    public static final String JDBC_USER_NAME;
    public static final String JDBC_PASSWORD;

    public static final String APP_BASE_PACKAGE;
    public static final String APP_JSP_PATH;
    public static final String APP_ASSET_PATH;

    static {
        Properties prop=new Properties();
        InputStream in=Config.class.getClassLoader().getResourceAsStream("eweb.properties");
        try{
            prop.load(new InputStreamReader(in,"UTF-8"));
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        CONFIG_FILE=prop.getProperty("eweb.properties");
        JDBC_DRIVER=prop.getProperty("jdbc.driver");
        JDBC_URL=prop.getProperty("jdbc.url");
        JDBC_USER_NAME=prop.getProperty("jdbc.username");
        JDBC_PASSWORD=prop.getProperty("jdbc.password");

        APP_BASE_PACKAGE=prop.getProperty("app.basePackage");
        APP_JSP_PATH=prop.getProperty("app.jspPath");
        APP_ASSET_PATH=prop.getProperty("app.assetPath");
    }

}
