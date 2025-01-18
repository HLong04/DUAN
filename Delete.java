package DuAn;

import java.util.List;

public class Delete {
	public static void XoaSV(List<SinhVien> danhSachSinhVien, String maSV) {
        boolean block = false;
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMasv().equals(maSV)) {
                danhSachSinhVien.remove(i);
                System.out.println("Đã xóa sinh viên có mã " + maSV);
                block = true;
                break;
            }
        }
    }
}
