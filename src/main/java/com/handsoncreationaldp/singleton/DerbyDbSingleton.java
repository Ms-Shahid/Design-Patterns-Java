package com.handsoncreationaldp.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Derby is a light weigh database server
 * We can use it to see the real use case of singleton with Derby
 * */
public class DerbyDbSingleton {

    private static volatile DerbyDbSingleton instance = null;
    private static volatile Connection connection = null;

    private DerbyDbSingleton() {

        try {
            DriverManager.registerDriver(new org.apache.derby.client.ClientAutoloadedDriver());
        } catch (SQLException sql) {
            sql.printStackTrace();
        }

        if (connection != null) {
            throw new RuntimeException("User getConnection() to create an instance");
        }

        if (instance != null) {
            throw new RuntimeException("User getInstance() to create an instance");
        }
    }

    public static DerbyDbSingleton getInstance() {
        if (instance == null) {
            synchronized (DerbyDbSingleton.class) {
                if (instance == null) {
                    instance = new DerbyDbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            synchronized (DerbyDbSingleton.class) {
                if (connection == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        connection = DriverManager.getConnection(dbUrl);
                    } catch (SQLException sqlException) {
                        sqlException.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
