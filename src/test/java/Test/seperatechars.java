package Test;

public class seperatechars {

	public static void main(String[] args) {
		String s ="Sujith @1 2 3";
		s = s.replaceAll("\\s+", "");
		System.out.println(s);
	}

}
