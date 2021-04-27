package com.r500076108.q1;

public class StudentData {
    public String name;
    public int sapId;

    @Override
    public String toString() {
        return "Roll No  = " + sapId  +
                ", Student Name = " + name ;
    }

    public StudentData(int sapId, String name) {
        this.name=name;
        this.sapId=sapId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSapId() {
        return sapId;
    }

    public void setSapId(int sapId) {
        this.sapId = sapId;
    }
}
