package Variable;

public class SwitchCase {
	public void month() {
		String str ="jan";
		switch (str) {
		case "Jan":
		case "jan":// always remember that java is case sensitive.
			System.out.println("Jan works");
			break;
		case "feb":
			System.out.println("feb works");

		default: System.out.println("None Works");
			break;
		}
		
		
	}

}
