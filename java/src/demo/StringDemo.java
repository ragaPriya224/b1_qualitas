package demo;

public class StringDemo {

	public static void main(String[] args) {
		char alpha = 'z';
		String name= "Burgerzingerking";
		String day = "sunday";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(1));
		System.out.println(name.indexOf('g'));
		System.out.println(name.indexOf('r'));
		System.out.println(name.lastIndexOf('r'));
		System.out.println(name.contains("king"));
		System.out.println(name.concat(" welcome"));
		System.out.println(name.isEmpty());
		System.out.println(name.replace('r', 'z'));
		System.out.println(name.substring(6));
		System.out.println(name.substring(6, 12));
	}

}
