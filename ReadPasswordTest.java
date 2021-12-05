/**
 * @(#)ReadPasswordTest.java
 *
 *
 * @author  M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/12/5
 */

import java.io.Console;

class ReadPasswordTest{
   public static void main(String args[]){

      Console c=System.console();
      System.out.println("Enter password: ");
       char[] ch=c.readPassword();

      String pass=String.valueOf(ch);//converting char array into string
       System.out.println("Password is: "+pass);
   }
}