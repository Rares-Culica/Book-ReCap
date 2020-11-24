package org.sci.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private Connection coon;
    private ConnectionUtil connectionUtil;

    private Object ConnectionUtil(){
        try {
            Class.forName("org.postgresql.h2").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.out.println("Driver problems");
            throw new Error("Can’t load driver. Verify CLASSPATH");

        }

        try {
            Connection coon = DriverManager.getConnection ("jdbc:h2:E:\\ScoalaIT\\Day 58 - Curs - Site-uri Execitii Java\\SQL\\H2\\MySQL.h2", "sa","");
        } catch (SQLException throwables) {
            throw new Error("Connection Error. Check user/passorwd or path");

        }

        public static ConnectionUtil getInstace(){
            if(connectionUtil == null)
                connectionUtil = new ConnectionUtil();

            return connectionUtil;
        }

        public Connection getConn(){
            return coon;
        }
    }
}
