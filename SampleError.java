  package assignment4;
import java.lang.Math;
import java.util.Scanner;

public class SampleError {
public static void    getAbsoluteError(double av, double ev)
{
    if(av==0)
    {
        System.out.println("Exit!");
    }
    else {
    System.out.println("Absolute error is units");
    System.out.println(Math.abs(av-ev));
    }
    
}
public static void getRelativeError(double av,double ev)                               
{

   System.out.println("Relative error  is  units");
    System.out.printf("%.3f %n",(Math.abs(ev-av)/av));
}
public static void getPercentageError(double av,double ev)
{
//double pererror;
    if((Math.abs((ev-av)/av)*(100)>=1))
    {
        System.out.println("Percentage error ");
    }
    else {
    System.out.printf("%.3f %n",(Math.abs((ev-av)/av)*(100)));
    }
}



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        SampleError.getAbsoluteError(12,34);
        SampleError.getRelativeError(12.000d,34.00d);
        SampleError.getPercentageError(12.0d,34.000d);
        
    }



}