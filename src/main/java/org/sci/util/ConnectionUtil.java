package org.sci.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private Connection conn;
    private static ConnectionUtil connectionUtil;

    private ConnectionUtil(){
        try {
            Class.forName("org.h2.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.out.println("Driver Problems");
            throw new Error("Can’t load driver. Verify CLASSPATH");
        }


        try {
             conn = DriverManager.getConnection ("jdbc:h2:E:\\ScoalaIT\\Day 59 - Exe SQL\\SQL\\H2\\Books.h2",
                     "route","route");
        } catch (SQLException throwables) {
            throw new Error("Connection Error. Check user/password or path");
        }
    }

    public static ConnectionUtil getInstance(){
        if(connectionUtil == null)
       connectionUtil = new ConnectionUtil();
        return connectionUtil;
    }

    public Connection getConn(){
        return conn;
    }
}




