package com.handsoncreationaldp.builder;

public class TestBuilder {

    public static void main(String[] args) {
        StringBuilderThroughBuilderPattern builderPattern = new StringBuilderThroughBuilderPattern();
        builderPattern.stringBuilder();

        System.out.println("------------- Simply Bean ----------");
        LunchOrderBean lunchOrderBean = new LunchOrderBean();
        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Goat");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());


        System.out.println("--------- Telescoping Constructor --------------");
        LunchOrderBeanWithTelescopingConstructor lunchOrderBeanWithTelescopingConstructor =
                new LunchOrderBeanWithTelescopingConstructor(
                "Wheat", "Lettuce", "Mustard oil", "Chicken");

        System.out.println(lunchOrderBeanWithTelescopingConstructor.getBread());
        System.out.println(lunchOrderBeanWithTelescopingConstructor.getCondiments());
        System.out.println(lunchOrderBeanWithTelescopingConstructor.getDressing());
        System.out.println(lunchOrderBeanWithTelescopingConstructor.getMeat());


        System.out.println("------------- Builder Pattern ---------------");
        LunchOrderBeanWithBuilderPattern.Builder builder = new LunchOrderBeanWithBuilderPattern.Builder();

        builder.bread("Whole wheat").condiments("Lettuce").dressing("Almond & Mustard").meat("Chicken");
        /* Here, the all items are not mandatory or must, we can take any of the combinations & set the remaining as default values*/

        LunchOrderBeanWithBuilderPattern lunchOrderBeanWithBuilder = builder.makeMeASandWage();

        System.out.println(lunchOrderBeanWithBuilder.getBread());
        System.out.println(lunchOrderBeanWithBuilder.getCondiments());
        System.out.println(lunchOrderBeanWithBuilder.getDressing());
        System.out.println(lunchOrderBeanWithBuilder.getMeat());

    }
}
