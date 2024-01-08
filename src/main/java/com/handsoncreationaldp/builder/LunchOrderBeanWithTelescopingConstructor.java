package com.handsoncreationaldp.builder;

public class LunchOrderBeanWithTelescopingConstructor {

    /*
    * This Builder of Telescoping Constructor Recursively
    * The bread call the this constructor
    * bread & condiments call out this(bread) constructor...
    * Notice only we have getter here, as we can set there value using constructors
    * This is immutable
    * But we are forcing here, i.e if we want the condiments then bread is must required object,
    * lll'y if we want meat, then we must need to instance all the required constructors
    * We can't have options such as bread + meat or dressing + condiments etc...
    * */
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBeanWithTelescopingConstructor(String bread) {
        this.bread = bread;
    }

    public LunchOrderBeanWithTelescopingConstructor(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderBeanWithTelescopingConstructor(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderBeanWithTelescopingConstructor(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
