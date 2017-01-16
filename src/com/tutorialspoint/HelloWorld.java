package com.tutorialspoint;

public class HelloWorld implements HelloInterface {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}