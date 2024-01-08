package com.handsoncreationaldp.prototype;

import java.sql.Statement;
import java.util.List;

public class StatementPrototype implements Cloneable{

    private String sql;
    private List<String> parameters;
    private Record record;

    public StatementPrototype(String sql, List<String> parameters, Record record){
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public Statement close(){
        try{
            return (Statement) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }
}
