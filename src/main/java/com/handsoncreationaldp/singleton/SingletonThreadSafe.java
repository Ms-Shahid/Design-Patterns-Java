package com.handsoncreationaldp.singleton;

public class SingletonThreadSafe {

    /* Making the singleton Thread safe
    *  `volatile` keyword is used to make it thread safe
    *  to make sure that No reflections are used, check in constructor that instance is not null
    * */

    private static volatile SingletonThreadSafe instance = null;

    private SingletonThreadSafe(){
        if(instance != null ){
            throw new RuntimeException("Use the getInstance() to create an instance");
        }
    }

    public static SingletonThreadSafe getInstance(){
         if( instance == null ){
             synchronized (SingletonThreadSafe.class){
                 if(instance == null)
                     instance = new SingletonThreadSafe();
             }
         }
         return instance;
    }
}
