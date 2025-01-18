package DuAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static boolean TrungMSV(List<SinhVien> lt, String masv) {
	    for (SinhVien sv : lt) {
	        if (sv.getMasv().equalsIgnoreCase(masv)) {
	            return true; 
	        }
	    }
	    return false;
	}

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        List<SinhVien> lt = new ArrayList<>();
        Delete delete = new Delete();
        while(true) {
        	System.out.println("\nNhập Thông Tin Sinh Viên:");
            System.out.println("1. Nhập thông tin Sinh Viên");
            System.out.println("2. Hiển Thị Thông Tin Sinh Viên");
            System.out.println("3. Xoá sinh viên khỏi danh sách");
            System.out.println("4. Chỉnh sửa Sinh Viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int n = cs.nextInt();
            cs.nextLine(); 

            if (n == 1) {
                while (true) {
                    System.out.println("Nhập Mã Sinh Viên: ");
                    String masv = cs.nextLine();

                    if(TrungMSV(lt, masv)) {
                        System.out.println("Mã sinh viên đã tồn tại. Vui lòng nhập lại.");
                    } else {
                        System.out.println("Nhập Tên Sinh Viên: ");
                        String hoten = cs.nextLine();

                        System.out.println("Nhập Giới Tính (Nam/Nữ): ");
                        String gioitinh = cs.nextLine();

                        System.out.println("Nhập Ngày Sinh (dd/MM/yyyy): ");
                        String ngaysinh = cs.nextLine();

                        System.out.println("Nhập Địa Chỉ: ");
                        String diachi = cs.nextLine();

                        SinhVien sinhVien = new SinhVien(masv, hoten, gioitinh, ngaysinh, diachi);
                        lt.add(sinhVien);
                        System.out.println("Đã thêm thông tin sinh viên!");
                        break; 
                    }
                }
            }else if (n == 2) {
                System.out.println("\nDanh Sách Sinh Viên:");
                for (SinhVien sv : lt) {
                    sv.hienThiThongTin();
                }
            } else if(n == 3) {
            	System.out.print("Nhập mã sinh viên cần xóa: ");
                String maSV = cs.nextLine();
                Delete.XoaSV(lt, maSV);
                
                System.out.println("\nDanh Sách Sinh Viên Sau Khi Xóa:");
                for (SinhVien sv : lt) {
                    sv.hienThiThongTin();
                }
            }
                //else if() {
//            	
          // }
            else if (n == 5) {
                System.out.println("Thoát chương trình!");
                break;
            }
        }
        cs.close();
    }
}
