package Demo;
import java.util.Scanner;

public class SoNguyenTo {
	public static void CheckSoNguyenTo(int n) {
		if(n<2) {
			System.out.println("No khong phai la so nguyen to");
		}else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println("No khong phai la so nguyen to");
					return;
				}
			}
			System.out.println("No la so nguyen to");
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner objSc=new Scanner(System.in);
		System.out.println("Nhap vao n:");
		n=objSc.nextInt();
		CheckSoNguyenTo(n);
		}

}
