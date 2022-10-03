package c2;

import java.util.Scanner;

public class SinhVien {
String hoten;
String lop;
int tuoi,namsinh;
public SinhVien() {}
public SinhVien(String ht,String lop,int tuoi,int ns) {
	hoten=ht;
	lop=lop;
	tuoi=tuoi;
	namsinh=ns;
	
}
public void nhapTT(SinhVien sv) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Nhap ho ten");
	this.hoten=sc.nextLine();
	System.out.println("Nhap lop");
	this.lop=sc.nextLine();
	System.out.println("Nhap tuoi");
	this.tuoi=sc.nextInt();
	System.out.println("Nhap nam sinh");
	this.namsinh=sc.nextInt();
}
public void inTT(SinhVien sv) {
	System.out.println("Ho ten la : "+this.hoten);
	System.out.println("Lop : "+this.lop);
	System.out.println("Tuoi la :"+this.tuoi);
	System.out.println("Nam Sinh :"+this.namsinh);
}

}
