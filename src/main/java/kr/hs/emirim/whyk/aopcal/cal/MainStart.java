package kr.hs.emirim.whyk.aopcal.cal;

public class MainStart {
	public static void main(String[] args) {
		Calculator call = new ImpCalculator();
		long f1 = call.factorial(100);
		System.out.println("Imp 100 : "+ f1);
		
		Calculator call2 = new RecCalculator();
		long f2 = call2.factorial(100);
		System.out.println("Rec 100 : "+ f2);
	}
}
