package com.mycompany.app;

public class App {

   private String message;

   //Constructor
   //@param message to be printed
	
   public App(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
}  
