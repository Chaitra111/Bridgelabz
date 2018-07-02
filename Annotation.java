package com.bridgelabz.Annotations;


    class Animal{  
    void eatSomething(){
    	System.out.println("eating something");
    	}  
    }  
      
    class Dog extends Animal{  
    @Override  
    void eatSomething(){
    	System.out.println("eating foods");
    	}//should be eatSomething  
    }  
      
    public class Annotation { 
    public static void main(String args[]){  
    Animal a=new Dog();  
    a.eatSomething();  
    }
    }  