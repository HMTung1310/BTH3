package BTH3;

import java.util.Scanner;

public class Nguoi {
	String ht;
	String dc;
	int namsinh;
	
	
public static void nhapTT(Nguoi p) {
	Scanner input=new Scanner(System.in);
	System.out.print("Nhap ho ten : ");
	p.ht=input.nextLine();
	System.out.print("Nhap dia chi : ");
	p.dc=input.nextLine();
	System.out.print("Nhap nam sinh : ");
	p.namsinh=input.nextInt();
}
public static void hienthiTT(Nguoi p) {
	System.out.println("Ho ten la :"+p.ht);
	System.out.println("dia chi la :"+p.dc);
	System.out.println("nam sinh :"+p.namsinh);
}
}
