package com.kh.first.run;

import com.kh.first.MethodTest;  // �ش� ��Ű���� �ִ� Ŭ������ ������ ���ڴ� ��� ������ �κ�

public class Run {

	public static void main(String[] args) {
	
		
		/*
		 * ���� Ŭ������ �޼ҵ带 ȣ���� ���� �ܼ��� ȣ�⸸ �ϸ� �Ǿ���!!
		 * �޼ҵ��();
		 * 
		 * �׷��� �ٸ� Ŭ������ �޼ҵ带 ȣ���� ��쿡��?
		 * 
		 */
		
		System.out.println("���θ޼ҵ� ���� ����!!");
		
		// 1. ȣ���� �޼ҵ尡 �ִ� Ŭ����(Ʋ)�� ���� �༮�� ����!!(����ϰ� �����Ȥ ��������) ���ش�.
		// [ǥ����] 
		// Ŭ�����̸� �����ҳ༮���̸� = new Ŭ�����̸�(); 
		MethodTest mt = new MethodTest(); // new ��� �ܾ ����.
		
		// => �⺻������ ���� com.kh.first.run ��Ű�� �ȿ� MethodTest ��� Ŭ������ �������� �ʾƼ�
		//    ã�� ���� ���� ������ import �������� MethodTest Ŭ������ ��ġ�� ã���� ��!
		
		// ���� import ���� ���� �ʰ� �̷��� �ص� ������ �� ���� �ʴ´�!
		// com.kh.first.MethodTest mt = new com.kh.first.MethodTest();
		
		// 2. ���� �� ���� �ش� Ŭ������ �ִ� �޼ҵ带 ȣ�����ָ� �ȴ�.
		// [ǥ����]
		// �����ѳ༮���̸�.ȣ���Ҹ޼ҵ��̸�();
		mt.testPrint();
	}
}
