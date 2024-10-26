package BaitapGiaoDich;

import java.time.LocalDate;
import java.util.Scanner;

public class TestGiaoDich {
	public static GiaoDich nhap() throws Exception {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập mã giao dịch: ");
		String ma = sc.nextLine();
		System.out.println("Nhập ngày giao dich: ");
		String ngay = sc.nextLine();
		LocalDate ngayTo = LocalDate.parse(ngay);
		System.out.println("Nhập diện tích: ");
		double dienTich = sc.nextDouble();
		System.out.println("Nhập đơn giá: ");
		double donGia = sc.nextDouble();
		System.out.println("Loại đất: ");
		String ld = sc.nextLine();
		
		GiaoDich g = new GiaoDichDat(ma, ngayTo, dienTich, donGia, ld);
		return g;
	}
	
	public static void main(String[] args) throws Exception {
		GiaoDich g = new GiaoDichDat("D1", LocalDate.now(), 1000000, 200);
		System.out.println(g);
		nhap();
	}
}
