
package assignment4;
import java.util.Scanner;
public class ArmstrongMain {
     int n;public boolean isArmstrong(int n) {
            int temp, digits=0, last=0, sum=0;   
              
            temp=n;   
             
            while(temp>0)    
            {   
            temp = temp/10;   
            digits++;   
            }   
            temp = n;   
            while(temp>0)   
            {   
                 
            last = temp % 10;   
            
            sum +=  (Math.pow(last, digits));   
            
            temp = temp/10;   
            }  
              
            if(n==sum)   
            
            return true;      
            
            else return false;   
            }   
    public static void main(String[] args) {
        // TODO Auto-generated method stub



        ArmstrongMain pf = new ArmstrongMain();
            int num;   
            Scanner sc= new Scanner(System.in);  
            System.out.println("Enter the number: ");  
             
            num=sc.nextInt();  
            if(pf.isArmstrong(num))  
            {  
            System.out.println("Number is Armstrong ");
            System.out.print("true ");
            }  
            else   
            {  
            System.out.println("Not a Armstrong number ");  
            System.out.print("false");
            }   





      }
        
        
        
    }