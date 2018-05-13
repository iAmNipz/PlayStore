package PlayStore;

public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {};
	public BalanceInsufficientException(String m) {
		super(m);
	};
}
