package com.bridgelabz.Utility;



	class ClassA
	{	
		int x = 10;
		double y = 45.08;

		public void displayA() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	 class ClassB extends ClassA
	 {		
		float f=1.09f;
		long l=1987876l;
		public void displayB()
		{
			System.out.println(f);
			System.out.println(l);
		}
	 }
	class Mainclass
	{
		public static void main(String[] args) {
		 ClassA a=new ClassA();
		 a.displayA();
		 
		 ClassB b=new ClassB();
		 b.displayA();
		 b.displayB();
		 
		 ClassA a1=new ClassB(); 
		 a1.displayA();
		 //a1.displayB();
		 
		 //ClassB b1=new ClassA();
		 
		 ClassA a2=(ClassA) b;
		 a2.displayA();
		 //a2.displayB();
		 
		 ClassB b2=(ClassB) a;
		 b2.displayA();
		// b2.displayB();
	}

	}
