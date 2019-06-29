package com.catchexception;
/*
 * try {
 * 		//可能发生的异常快
 * } catch (Exception e) {
 * 		//处理Exception e异常的语句块
 * } finally {
 * 		//无论异常是否发生都一定执行的语句块
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
		} catch(ArithmeticException e) {	//Arithmetic：算术、计算
			System.out.println("出现被0除的异常");
		} catch(Exception e) {
			System.out.println("异常类型为：" + e);
		} finally {
			System.out.println("除数=" + a);
			System.out.println("被除数=" + b);
		}
		a = 110;
		b = 10;
		try {
			c = a/b;
			System.out.println(a + "/" + b + "=" + c);
		} catch(ArithmeticException e) {	//Arithmetic：算术、计算
			System.out.println("出现被0除的异常");
		} catch(Exception e) {
			System.out.println("异常类型为：" + e);
		} finally {
			System.out.println("除数=" + a);
			System.out.println("被除数=" + b);
		}

	}

}
