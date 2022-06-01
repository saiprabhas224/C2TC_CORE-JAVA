package string;

public class EqualsIgnore {

	public static void main(String[] args) {
		String s1 = "shasana is a good girl";
		String s2 = "SHASANA IS A GOOD GIRL";
		String s3 = "she goes to school";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s1));
	}

}
