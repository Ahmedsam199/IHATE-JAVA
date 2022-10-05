import java.util.*;
public class Method4 {
private static void A(String s,int l) {
	if(s.length()!=l) {
		if(s.charAt(l)=='t') {	
			B(s,l++);
		}else {
			A(s,l+1);
		}	
	}else {
		D();
	}
	
	}

	private static void B(String s, int i) {
	if(s.length()!=i) {
		if(s.charAt(i)=='h') {
			C(s,i+1);

		} else {
			B(s,i+1);
		}
	}else {
		D();
	}
}
	 static void C(String s, int i) {
		if(s.length()!=i) {
			if(s.charAt(i)=='e') {
				System.out.println("Accepted");
			}else if(s.charAt(i)=='t') {
				A(s,i);
			}else {
				C(s,i+1);
			}
		}else {
			D();
		}
		
	}

	private static void D() {
	System.out.println("Not Accepted");
}
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
A(in.next(),0);
	}

	

}
