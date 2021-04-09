package com.r500076108.q3;


public class Excep extends Exception{

    Excep(){
        super("the value is non numeric ");
    }
}
class s06_03
{
    public static void main(String ar[])
    {
        int a,b,c=0;
        try
        {
            a=Integer.parseInt(ar[0]);
            throw new Excep();
        }
        catch(NumberFormatException e)
        {System.out.println(e);
        }
        catch(Excep e)
        { System.out.println(e);
        }
    }
}
