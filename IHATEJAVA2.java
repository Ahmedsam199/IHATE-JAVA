import java.util.*;
public class MethodDemon {
public static void A(String S) {
	if(S.charAt(S.length()-2)=='0' ) {
		B(S);
	}else if(S.charAt(S.length()-2)=='1') {
		C(S);
	}else {
		D(S);
	}
}


	private static void C(String s) {
		if( s.charAt(s.length()-1)=='1') {
			
			System.out.println("Accepted by"+ s);
				}else {
					D(s);
				}
	
}

	private static void B(String s) {
		if( s.charAt(s.length()-1)=='0') {
			System.out.println("Accepted by"+s);
		}else {
			D(s);
		}
}
	private static void D(String S) {
System.out.println("NOT Accepted");	
}


	public static void main(String[] args) {
Scanner in=new Scanner(System.in);

String s=in.next();
System.out.println(s.charAt(s.length()-2));

//System.out.println(s.charAt(s.length()-4));
A(s);
	}

}
