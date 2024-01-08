package com.handsoncreationaldp.singleton;

public class DbSingletonLazilyLoaded {

    /*
    * Lazily loaded provides improvement in performance
    * Only during the first time instance get created, other time same instance will be used.
    * */

    private static DbSingletonLazilyLoaded instance = null;

    private DbSingletonLazilyLoaded(){}

    public static DbSingletonLazilyLoaded getInstance(){
        if( instance == null )
            instance = new DbSingletonLazilyLoaded();
        return instance;
    }

}
