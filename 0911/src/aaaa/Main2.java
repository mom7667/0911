package aaaa;

public class Main2 {

	public static void main(String[] args) {
		
		int ar = {"Java", "JavaScript", "Kotlin", "Swift"};
		int x = 10;
		
		try {
			//예외가 발생할 가능성이 있는 구문
			//ArithmeticException이 발
			System.out.printf("x/0:%d\n", x/0);
			
			
			for(int i=0; i<= languages.length; i=i+1) {
				System.out.printf("프로그래밍 언어:%s\n", languages[i]);
			}
			
		}catch(Exception e) {
			//예외 클래스에 해당하는 예외가 발생했을 때 처리할 구문
			System.out.printf("예외:%n\n", e.getMessage());
			
			
		}
		
		
		
		
		finally {
			//예외 발생 여부에 상관없이 수행할 구문
			System.out.printf("무조건 수행할 구\n");
		}
	}

}
