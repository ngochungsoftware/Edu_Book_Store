
package dao;


public class DonHang {
    int maDonHang;
    int maNV;
    int maVoucher;
    int thanhToan;
    int tinhTrangGiaoHang;
    String ngayDat;
    String ngayGiao;
    int maKH;

    public DonHang() {
    }

    public DonHang(int maDonHang, int maNV, int maVoucher, int thanhToan, int tinhTrangGiaoHang, String ngayDat, String ngayGiao, int maKH) {
        this.maDonHang = maDonHang;
        this.maNV = maNV;
        this.maVoucher = maVoucher;
        this.thanhToan = thanhToan;
        this.tinhTrangGiaoHang = tinhTrangGiaoHang;
        this.ngayDat = ngayDat;
        this.ngayGiao = ngayGiao;
        this.maKH = maKH;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(int maVoucher) {
        this.maVoucher = maVoucher;
    }

    public int getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(int thanhToan) {
        this.thanhToan = thanhToan;
    }

    public int getTinhTrangGiaoHang() {
        return tinhTrangGiaoHang;
    }

    public void setTinhTrangGiaoHang(int tinhTrangGiaoHang) {
        this.tinhTrangGiaoHang = tinhTrangGiaoHang;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(String ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {
        return "DonHang{" + "maDonHang=" + maDonHang + ", maNV=" + maNV + ", maVoucher=" + maVoucher + ", thanhToan=" + thanhToan + ", tinhTrangGiaoHang=" + tinhTrangGiaoHang + ", ngayDat=" + ngayDat + ", ngayGiao=" + ngayGiao + ", maKH=" + maKH + '}';
    }
    
    
}
