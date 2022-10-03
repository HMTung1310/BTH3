package c3;
import java.util.Scanner;
public class BienLai extends KhachHang{

	int chisocu,chisomoi;
	float sotien;
	KhachHang kh = new KhachHang();
	public BienLai() {}
	public BienLai(int cscu,int csmoi,int sotien) {
		chisocu=cscu;
		chisomoi=csmoi;
		sotien=sotien;
		}
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		kh.nhapTT();
		do {
		System.out.print("Nhap chi so moi");
		this.chisocu=sc.nextInt();
		System.out.print("Nhap chi so cu");
		this.chisomoi=sc.nextInt();
		
	}while(chisocu>chisomoi);
	sotien=(chisomoi-chisocu)*85000;
	}
	public void xuat() {
		kh.inTT();
		System.out.print("Chi so cu : "+chisocu);
		System.out.print("Chi so moi : "+chisomoi);
		System.out.print(sotien);
	}
	
}
