package com.handsoncreationaldp.singleton;

public class SingletonInstanceCompare {

    public void createSingletonInstanceCompare(){
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc(); //garbage collector

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        if( singletonRuntime == anotherInstance )
            System.out.println("They are the same instance....");

    }
}
