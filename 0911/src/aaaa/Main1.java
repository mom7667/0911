package aaaa;

public class Main1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.printf("a:%d b:%d\n", a, b);
		try {
			//여기서 문제가 발생하더라도 아래 문장들을 계속 처리
		System.out.printf("a/b\n", a/b);
		}catch(Exception e) {
			System.out.printf("계산하는 도중 문제가 발생했습니다.\n");
		}
		System.out.printf("예외 처리의 목적에 대해서 알아봅니다.\n");

	}

}
