package fr.francois.facto;



public class Factoriel {

	public static void main(String[] args) {
		
		System.out.println(factoriel(5));
		
	}
	public static int factoriel(int n) {
		int f = n;
		if(n >= 1) {
			for (int i = 1; i < n; i++) {
				f = f *i;
			}
		}
		
		return f;
	}

}
