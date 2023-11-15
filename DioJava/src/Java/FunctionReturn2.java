package Java;

public class FunctionReturn2 {

	public static void main(String[] args) {
		
		String userName = getFirstName("Caroline-Lima", "-");
		System.out.println("Welcome " + userName);
		
		userName = getFirstName("Teacher Felipe","-");
		System.out.println("Welcome " + userName);
	}

	public static String getFirstName(String name, String slipChar) {
		String[] nameParts = name.split(slipChar);
		return nameParts[0];
	}

}
