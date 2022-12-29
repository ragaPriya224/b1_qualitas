package demo;

public class IfDemo {

	public static void main(String[] args) {


		if (3>5) {
			System.out.println("yes it is greater");
		}else {
			System.out.println("no ");
		}
		int money = 5;
		int penCost = 10;
		int pencilCost = 4;
		
		
		if(money>=penCost) {
			System.out.println(" you can buy pen");
		}
		else if(money>=pencilCost) {
			System.out.println("u can buy pencil");
		}
		else {
			System.out.println("return home ");
		}

	}

}
