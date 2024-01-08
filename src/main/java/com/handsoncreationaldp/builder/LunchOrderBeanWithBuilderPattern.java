package com.handsoncreationaldp.builder;

public class LunchOrderBeanWithBuilderPattern {

    public static class Builder{
        /*
        * The builder is like a container, which holds what we want to order in this case*/
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        //In order to use this builder we this object ref is stored in Main class
        public LunchOrderBeanWithBuilderPattern makeMeASandWage(){
            return new LunchOrderBeanWithBuilderPattern(this);
        }

        /* Here we are not forcing the constructor to have all the fields, which is in case of LunchOrderBeanTelescopingConstructor*/
        public Builder(){

        }

        /* Below are the methods looks similar to constructor, but they aren't*/

        public Builder bread(String bread){
            this.bread = bread;
            return this; //builder object
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this; //return builder object(condiments)
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBeanWithBuilderPattern(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
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


