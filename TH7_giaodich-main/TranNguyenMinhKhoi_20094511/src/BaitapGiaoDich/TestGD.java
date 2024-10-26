package BaitapGiaoDich;

import java.time.LocalDate;
import java.util.Scanner;

public class TestGD {
//	//in tieu de
//		public static void inTieuDe() {
//			System.out.println("");
//			System.out.printf("|%10s|%15s|%10s|%10s|%10s|%10s|", "Ma GD", "Ngay GD", "Don gia", "Dien Tich", "Loai", "Thanh Tien");
//			System.out.println();
//		}
//		
//		//in khoang cach
//				public static void inKhoangCach() {
//					for (int i = 0; i < 70; i++) {
//						System.out.printf("-");
//					}
//				}
//	
//	public static void main(String[] args) throws Exception {
//	ListGD ls = new ListGD();
//	GiaoDich g1 = new GiaoDichDat("D1", LocalDate.of(2024, 01, 01), 1000000, 200, "A");
//	ls.themGD(g1);
//	GiaoDich g11 = new GiaoDichDat("D11", LocalDate.of(2024, 02, 01), 1500000, 400, "B");
//	ls.themGD(g11);
//	
//	GiaoDich g2 = new GiaoDichNha("N1", LocalDate.of(2024, 02, 02), 2000000, 300, "caocap", "12 Nguyen Van Bao");
//	ls.themGD(g2);
//	GiaoDich g22 = new GiaoDichNha("N22", LocalDate.of(2024, 02, 04), 2100000, 500, "thuong", "1 Dien Bien Phu");
//	ls.themGD(g22);
//	
//	
//	inTieuDe();
//	System.out.println(g1.toString());
//	inKhoangCach();
//	inTieuDe();
//	System.out.println(g11.toString());
//	inKhoangCach();
//	inTieuDe();
//	System.out.println(g2.toString());
//	inKhoangCach();
//	inTieuDe();
//	System.out.println(g22.toString());
//	inKhoangCach();
//	}
	
	public static void main(String[] args) throws Exception{
        ListGD ls = new ListGD();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Thêm Giao Dịch Đất");
            System.out.println("2. Thêm Giao Dịch Nhà");
            System.out.println("3. Xuất Danh Sách Giao Dịch");
            System.out.println("4. Sắp Xếp Giao Dịch");
            System.out.println("5. Xóa Giao Dịch");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Thêm Giao Dịch Đất
                System.out.print("Nhập mã GD: ");
                String maGD = scanner.nextLine();
                System.out.print("Nhập ngày GD (yyyy-MM-dd): ");
                LocalDate ngayGD = LocalDate.parse(scanner.nextLine());
                System.out.print("Nhập đơn giá: ");
                double donGia = scanner.nextDouble();
                System.out.print("Nhập diện tích: ");
                double dientich = scanner.nextDouble();
                System.out.print("Nhập loại đất: ");
                String loaiDat = scanner.next();

                GiaoDichDat gdDat = new GiaoDichDat(maGD, ngayGD, donGia, dientich, loaiDat);
                ls.themGD(gdDat);
            } else if (choice == 2) {
                // Thêm Giao Dịch Nhà
                System.out.print("Nhập mã GD: ");
                String maGDN = scanner.nextLine();
                System.out.print("Nhập ngày GD (yyyy-MM-dd): ");
                LocalDate ngayGDN = LocalDate.parse(scanner.nextLine());
                System.out.print("Nhập đơn giá: ");
                double donGiaN = scanner.nextDouble();
                System.out.print("Nhập diện tích: ");
                double dientichN = scanner.nextDouble();
                System.out.print("Nhập loại nhà: ");
                String loaiNha = scanner.next();
                System.out.print("Nhập địa chỉ: ");
                String diaChi = scanner.next();

                GiaoDichNha gdNha = new GiaoDichNha(maGDN, ngayGDN, donGiaN, dientichN, loaiNha, diaChi);
                ls.themGD(gdNha);
            } else if (choice == 3) {
                // Xuất Danh Sách Giao Dịch
                ls.getAll();
            } else if (choice == 4) {
                // Sắp Xếp Giao Dịch
                ls.tim("");
                System.out.println("Đã sắp xếp theo mã giao dịch.");
            } else if (choice == 5) {
                // Xóa Giao Dịch
                System.out.print("Nhập mã GD cần xóa: ");
                String maGD = scanner.nextLine();
                ls.xoaGD(maGD);
            } else if (choice != 0) {
                System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        scanner.close();
        System.out.println("Thoát chương trình.");
    }
}
