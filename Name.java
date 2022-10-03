package c3;
import java.util.Scanner;
import java.util.ArrayList;
public class Name extends BienLai {
	public static void main(String[] args) {
        int n;
        BienLai bl;
        Scanner scanner = new Scanner(System.in);
        ArrayList<BienLai> arrBienLai = new ArrayList<>();
         
        System.out.print("Nhập so luong: ");
        n = scanner.nextInt();
         
        for (int i = 0; i < n; i++) {
            bl = new BienLai();
            System.out.println("Nhập thong tin nha " + (i + 1) + ": ");
            bl.nhap();
            arrBienLai.add(bl);
        }
         
        System.out.println("THONG TIN BIEN LAI ");
        for (int i = 0; i < arrBienLai.size(); i++) {
            System.out.println("Thong tin nha thu " + (i + 1) + ": ");
            arrBienLai.get(i).xuat();
        }
    }
	}


