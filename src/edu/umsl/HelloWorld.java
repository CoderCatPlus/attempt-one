/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

/**
 *
 * @author Meg
 */
import java.util.Scanner;
public class HelloWorld 
{
    public static void main(String[] args )
    {
        // This is to print "hello world" on the screen. 
     System.out.println( "Hello World ~Kitty" );
     
     float x, y, z, a,b,c,d;
     
     Scanner sc = new Scanner(System.in);
     System.out.println("please enter the first number: ");
     x=sc.nextFloat(); 
     
     System.out.println("please enter second number: " );
     y=sc.nextFloat();
     
     z= x+y; 
     a=x*y;
     b=x-y;
     c=x/y;
     d=x%y;
     
     System.out.println( "here is the sum: "+z );
     System.out.println("here is the product: "+a );
     System.out.println("here is the difference: "+b);
     System.out.println("here is the quotient: "+c);
     System.out.println("here is the modulus: "+d);
     
     // now on to hours and wages with possible overtime at
     //some point
     double hour, wage, pay, over;
     System.out.println("Excellent, now enter your hours worked: ");
     hour=sc.nextDouble();
     System.out.println("what is your hourly rate? ");
     wage=sc.nextDouble();
     pay= hour* wage; 
     System.out.println("Your paycheck should be "+pay);
     if (hour>40 )
     {
         over= hour-40;
         double extra = wage*1.5;
         double ovrpay= extra*over;
         System.out.println("Overtime hours: "+over);
         System.out.println("You should get this much extra for overtime "+ovrpay);

     }
     

             
             
             
    }       

    
}
