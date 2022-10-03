package c2;

import java.util.Scanner;

public class TheMuon {
String ngaytra,ngaymuon,hantra;
String sohieusach;
public TheMuon() {}
public TheMuon(String nt,String nm,String htra,String so) {
	ngaytra=nt;
	ngaymuon=nm;
	hantra=htra;
	sohieusach=so;
}
public void nhapTM(TheMuon Tm) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Nhap so hieu sach");
	this.sohieusach=sc.nextLine();
	System.out.println("Nhap ngay muon");
    this.ngaymuon=sc.nextLine();
	System.out.println("Nhap ngay tra");
	this.ngaytra=sc.nextLine();
	System.out.println("Nhap han tra");
	this.hantra=sc.nextLine();
}
public void inTM(TheMuon Tm) {
	System.out.println("So Hieu Sach : "+this.sohieusach);
	System.out.println("Ngay Muon :"+this.ngaymuon);
    System.out.println("Ngay Tra :"+this.ngaytra);
	System.out.println("Han Tra :"+this.hantra);
}
}
