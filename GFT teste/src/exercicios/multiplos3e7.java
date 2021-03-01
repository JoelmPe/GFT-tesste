package exercicios;

public class multiplos3e7 {
public static void main(String[] args) {
	 int i;
	 for(i = 1;  i <=216; i++) {
		 
		 if ( i % 3 == 0) {
			 System.out.println(i);
			 System.out.println("divisivel 3");
			 
			 int b;
			 for (b  = 1; b <= 216; b++) {
				 if ( b % 7 == 0) {
					 System.out.println(b);
					 System.out.println("divisivel 7");
				 }
			 }
		 }
		 
	 }
}
}
