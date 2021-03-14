package com.r177219015.q1;

public class Class1
{
    public int i,j;
private void sumIt(int i,int j){
    this.i=i;
    this.j=j;
    System.out.println("sum="+(i+j));
}
public static void main(String args[]){
    Class1 cc= new Class1();
    cc.sumIt(4,5);
}

}


