package Vault;

public class Vault {
	int secretCode = 3856;
	boolean tryCode(int num){
		if (num == secretCode) {
			return true;
		}
		else{
			return false;
		}
	}

}

