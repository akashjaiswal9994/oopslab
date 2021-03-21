package com.labtest.q2;

public class Employee implements Cloneable{
private int id;
private String name;
public Department dep;
public Employee(int id,String name,String depName){
    this.id=id;
    this.name=name;
    dep=new Department(depName);
}
public void show(){
    System.out.println("Employee ID - "+this.id);
    System.out.println("Employee name - "+this.name);
    System.out.println("Department - "+this.dep.depName);
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public class Department{
    private String depName;
    public Department(String dName){
        depName=dName;
    }

        public String getDepName() {
            return depName;
        }

        public void setDepName(String depName) {
            this.depName = depName;
            System.out.println("Department - "+this.depName);
        }
    }//end of Department class
    public Object clone() throws CloneNotSupportedException{
    return super.clone();
    }

}//end of Employee class
