package com.kh.third;

public class MethodTest {
		
	public static void testPrintA() {
		
		System.out.println("A �޼ҵ� ������!!");	
		
		testPrintB();
	}
	
	public static void testPrintB() {  
		
		System.out.println("B �޼ҵ� ������!!");
		
		testPrintC();
	}
	
	public static void testPrintC() {
		
		System.out.println("C �޼ҵ� ������!!");	
		
		 // testPrintA(); // ���Ѵ�� ���ư��� ������ ����!
	}
	
	
	/*public static void main(String[] args) {
	
	System.out.println("���θ޼ҵ� ���� ����!!");
	
	/*
	testPrintA();
	testPrintB();
	testPrintC();
	*/
	
	//testPrintA();
	
	// �� ���� ����� ���������� ��� � �޼ҵ带 ȣ���ϴ��Ŀ� ���� �ٸ���.
	// �̷������� �޼ҵ带 ��ɺ��� ���� �ʿ��� ������ ȣ���ϸ� �ȴ�.
    //}

}
