
package dao;


public class KhachHang {
    String maKH;
    String hoTen,email,diaChi,dienThoai,gioiTinh;
    int ngaySinh;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, String email, String diaChi, String dienThoai, String gioiTinh, int ngaySinh) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTen=" + hoTen + ", email=" + email + ", diaChi=" + diaChi + ", dienThoai=" + dienThoai + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + '}';
    }
    
    
}
