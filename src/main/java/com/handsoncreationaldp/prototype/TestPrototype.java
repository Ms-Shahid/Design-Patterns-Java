package com.handsoncreationaldp.prototype;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestPrototype {

    public static void main(String[] args) {

        String sql = "SELECT * FROM movies WHERE title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Avengers End Game!");
        Record record = new Record();

        StatementPrototype statementPrototype = new StatementPrototype( sql, parameters, record);

        System.out.println(statementPrototype.getSql());
        System.out.println(statementPrototype.getParameters());
        System.out.println(statementPrototype.getRecord());


        //another instance using the clone
        StatementPrototype anotherStatementPrototype = (StatementPrototype) statementPrototype.close();
        System.out.println(anotherStatementPrototype.getSql());
        System.out.println(anotherStatementPrototype.getParameters());
        System.out.println(anotherStatementPrototype.getRecord());

    }
}
