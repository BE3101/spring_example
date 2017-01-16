package com.tutorialspoint;

public class HelloMe implements HelloInterface {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("My Message is Cooler: " + message);
   }
}