package com.catchexception;
/*
 * try {
 * 		//���ܷ������쳣��
 * } catch (Exception e) {
 * 		//����Exception e�쳣������
 * } finally {
 * 		//�����쳣�Ƿ�����һ��ִ�е�����
 * }
 */
public class CatchException {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 0;
		try {
			c = a/b;
			System.out.println(a + "/" + b + "=" + c);
		} catch(ArithmeticException e) {	//Arithmetic������������
			System.out.println("���ֱ�0�����쳣");
		} catch(Exception e) {
			System.out.println("�쳣����Ϊ��" + e);
		} finally {
			System.out.println("����=" + a);
			System.out.println("������=" + b);
		}
		a = 110;
		b = 10;
		try {
			c = a/b;
			System.out.println(a + "/" + b + "=" + c);
		} catch(ArithmeticException e) {	//Arithmetic������������
			System.out.println("���ֱ�0�����쳣");
		} catch(Exception e) {
			System.out.println("�쳣����Ϊ��" + e);
		} finally {
			System.out.println("����=" + a);
			System.out.println("������=" + b);
		}

	}

}
