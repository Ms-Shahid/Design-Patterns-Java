package com.handsoncreationaldp.builder;

public class StringBuilderThroughBuilderPattern {

    public void stringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("Example of Builder Pattern through String Builder");
        builder.append("Appending more through string builder");
        builder.append(40);
        builder.append('s');

        System.out.println(builder.toString());
    }
}
