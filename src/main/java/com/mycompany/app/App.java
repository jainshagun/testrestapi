package com.mycompany.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    //@RequestMapping("/")
private final String message = "Hello World!";
public HelloController(){}

public static void main(String[] args){
	System.out.println(new HelloController().getmessage());
}
public final String getmessage(){
	return message;
}
}
