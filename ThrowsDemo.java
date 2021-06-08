package com.cg.demo.ex;

public class ThrowsDemo {
	public class ThrowsDemo {
		public static void m1() {
			System.out.println(10 / 2);//1 -{friend uncle} root cause of exception

		}

		public static void m2() {
			
////			try {
//				ThrowsDemo.m1();
//			}
//			catch(ArithmaticExceptiom ae){
//				System.out.println("Wrong");
//				
//			}
			
			
			ThrowsDemo.m1(); //2 friend

		}

		public static void m3() {
			ThrowsDemo.m2();;//3 you

		}

		public static void main(String[] args) {

			System.out.println("start");
			ThrowsDemo.m3();//4  driving
			System.out.println("End");
		}

	}

}
