package btbt;

public class sochinhphuong {
	public static void kiemTraSoChinhPhuong(int n) {
        boolean isSoChinhPhuong = false;

        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) {
                isSoChinhPhuong = true;
                break;
            }
        }

        if (isSoChinhPhuong) {
            System.out.println("Số " + n + " là số chính phương");
        } else {
            System.out.println("Số " + n + " không phải là số chính phương");
        }
    }
	public static void main(String[] args) {
		int n=9;
		kiemTraSoChinhPhuong(n);
		// TODO Auto-generated method stub

	}

}
