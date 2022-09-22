import java.util.Scanner;
public class Lec1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int len1=input.nextInt(),len2=input.nextInt();
		int len3=0;
				int[] arr1=new int [len1];
		int[] arr2=new int [len2];
		
		for (int i=0;i<len1;i++) {
			arr1[i]=input.nextInt();
		}
		for (int j=0;j<len2;j++) {
			arr2[j]=input.nextInt();
					}
		int[] arr3 =new int[arr2.length];
		for (int i : arr2) {
for (int j : arr1) {
	if(i==j) {
		System.out.println(len3);
		arr3[len3]=i;
		len3=len3+1;
	}
}
		}
		for (int i : arr3) {
			System.out.print("Im The Number "+i+" in The Array 3\n");
		}					
	}
}
