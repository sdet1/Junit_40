package core;

public class EvenNumberChecker {
	public Boolean val(final Integer n) {

			if ((n > 1 && (n & 1) == 0)) {
				return true;
				}
			
		return false;
		}
}