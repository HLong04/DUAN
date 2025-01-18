package DuAn;

public class SinhVien {
    private String masv;
    private String hoten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;

    public SinhVien(String masv, String hoten, String gioitinh, String ngaysinh, String diachi) {
        this.masv = masv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void hienThiThongTin() {
    	System.out.println("Mã SV: " + masv + ", Họ tên: " + hoten + ", Giới tính: " + gioitinh 
                + ", Ngày sinh: " + ngaysinh + ", Địa chỉ: " + diachi);
    }
}
