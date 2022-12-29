package demo;

public class OperatorDemo {

	public static void main(String[] args) {
		int mark = 20;
		int mark2 = 40;
		int sum = mark-mark2;
		// should be 18 and above
		int minAge = 18;
		
		if(10 >= minAge) {
			System.out.println("hey u can vote");
		}else { //else statement is optional
			System.out.println("u cannot vote");
		}
//        if(18<= 30) {
//			
//		}
		
		int age = 10;
		age++;//increment the value by 1
		System.out.println(age); //11
		age++;
		System.out.println(age); //12
		age--; //post decrement

		int a = 10;
		++a;
		System.out.println(a);
		
		int b = 10;
		
		System.out.println(++b);
		
        int c = 10;
		System.out.println(c++); //10
		System.out.println(c);//11
	}

}
