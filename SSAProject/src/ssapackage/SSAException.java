package ssapackage;

public class SSAException extends Exception {

	public SSAException() {
	}

	public SSAException(String message) {
		super(message);
	}

	public SSAException(Throwable cause) {
		super(cause);
	}

	public SSAException(String message, Throwable cause) {
		super(message, cause);
	}

	public SSAException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
