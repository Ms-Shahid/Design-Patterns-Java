package com.handsoncreationaldp.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonTest {

    public static void main(String[] args) {
        System.out.println("Db Singleton Eagerly loaded..");
        DbSingletonEagerlyLoaded instance = DbSingletonEagerlyLoaded.getInstance();
//        DbSingleton testConst = new DbSingleton(); //cannot create instance
        System.out.println(instance);

        //verify that only one instance is created
        DbSingletonEagerlyLoaded anotherInstance = DbSingletonEagerlyLoaded.getInstance();
        System.out.println(anotherInstance);

        System.out.println(" Db Singleton Lazily loaded...");
        DbSingletonLazilyLoaded lazilyLoadedInstance = DbSingletonLazilyLoaded.getInstance();
        System.out.println(lazilyLoadedInstance);

        DbSingletonLazilyLoaded lazilyLoadedAnotherInstance = DbSingletonLazilyLoaded.getInstance();
        System.out.println(lazilyLoadedAnotherInstance);

        System.out.println(" Db Singleton Thread safe...");
        SingletonThreadSafe threadSafeInstance = SingletonThreadSafe.getInstance();
        System.out.println(threadSafeInstance);

        SingletonThreadSafe threadSafeAnotherInstance = SingletonThreadSafe.getInstance();
        System.out.println(threadSafeAnotherInstance);

        System.out.println("!.... Derby Connection Request !...");

        DerbyDbSingleton derbyDbSingleton = DerbyDbSingleton.getInstance();
        System.out.println("Performance measurement through  1difference in time of instance creations ");

        long timeBefore = 0;
        long timeAfter = 0;

        timeBefore = System.currentTimeMillis();

        Connection connection = derbyDbSingleton.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println("Time difference of 1st instance creation -> " + (timeAfter - timeBefore));

        Statement statement;
        try{
            statement = connection.createStatement();
            int count = statement
                    .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), " +
                            " City VARCHAR(20))");
            System.out.println("Table created successfully..");
            statement.close();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        connection = derbyDbSingleton.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println("Time difference of 2nd instance creation -> " + (timeAfter - timeBefore));

    }
}
