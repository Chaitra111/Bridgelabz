package com.bridgelabz.Annotations;

class TestAnnotation3 {
	
void m() {
		System.out.println("hello m");
	}

	@Deprecated
	public void method() {
		System.out.println("hello n");
	}
}

class A {
	public static void main(String args[]) {

		TestAnnotation3 a = new TestAnnotation3();
		a.m();
		a.method();
	}
}
	