package person;

public class UnderAgeException extends Exception {

	public UnderAgeException() {
		super("Parent too young.");
		
	}

	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = -8485977422559477127L;

}
