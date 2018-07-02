package com.bridgelabz.reflection;

public class Test {
	
    private int number=8;
	   
    Test(){
        System.out.println("Test constructor called");
    }
   
    public  void secountMethod() {
        System.out.println("Second Method");
    }
    
    public void firstMethod(int number) {
        System.out.println( number + " First Method");
        System.out.println(number);
    }
    
    
    @Override
    public String toString() {
        return "Test [number=" + number + "]";
    }
    
    public  static void threeMethod() {
        System.out.println("third Method");
    }
}