package com.handsoncreationaldp.singleton;

public class DbSingletonEagerlyLoaded {

    private static  DbSingletonEagerlyLoaded instance = new DbSingletonEagerlyLoaded(); //manages only one instance of this class

    private DbSingletonEagerlyLoaded(){}

    public  static DbSingletonEagerlyLoaded getInstance(){
        return instance;
    }


}
