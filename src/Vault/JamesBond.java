package Vault;

public class JamesBond {

	public static void main(String[] args) {
		Vault vault = new Vault();
		JamesBond jb = new JamesBond();
		jb.crackVault(vault);
	}
	int crackVault(Vault vault){
		for (int i = 0; i < 1000000; i++) {
			if (vault.tryCode(i) == true) {
				System.out.println(i);
				return i; 
			}
		}
		return 0;
		
	}
}
