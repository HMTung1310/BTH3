package c3;

import java.util.Scanner;


public class KhachHang {
String hoten;
int sonha;
int maso;
public KhachHang() {}
public KhachHang(String hoten,int sonha,int maso) {
	hoten=hoten;
	sonha=sonha;
	maso=maso;
	
}
public void nhapTT() {
	Scanner sc= new Scanner(System.in);
	System.out.print("Nhap Ten :");
	this.hoten=sc.nextLine();
	System.out.print("Nhap so nha :");
    this.sonha=sc.nextInt();
	System.out.print("Nhap ma so :");
	this.maso=sc.nextInt();
}
public void inTT() {
	System.out.print("So Hieu Sach : "+this.hoten);
	System.out.print("Ngay Muon :"+this.sonha);
    System.out.print("Ngay Tra :"+this.maso);
}

}

