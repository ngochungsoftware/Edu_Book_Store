package dao;

public class Sach {
    private int maSach;
    private String tenSach;
    private double giaSach;
    private String moTa;
    private String anhBia;
    private String ngayCapNhat;
    private int soLuong;
    private int maNXB;
    private int maCoupon;

    public Sach(int maSach, String tenSach, double giaSach, String moTa, String anhBia, String ngayCapNhat, int soLuong, int maNXB, int maCoupon) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.moTa = moTa;
        this.anhBia = anhBia;
        this.ngayCapNhat = ngayCapNhat;
        this.soLuong = soLuong;
        this.maNXB = maNXB;
        this.maCoupon = maCoupon;
    }

    public Sach(String tenSach, double giaSach, String moTa, String anhBia, String ngayCapNhat, int soLuong, int maNXB, int maCoupon) {
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.moTa = moTa;
        this.anhBia = anhBia;
        this.ngayCapNhat = ngayCapNhat;
        this.soLuong = soLuong;
        this.maNXB = maNXB;
        this.maCoupon = maCoupon;
    }

    public Sach() {
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getAnhBia() {
        return anhBia;
    }

    public void setAnhBia(String anhBia) {
        this.anhBia = anhBia;
    }

    public String getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(String ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(int maNXB) {
        this.maNXB = maNXB;
    }

    public int getMaCoupon() {
        return maCoupon;
    }

    public void setMaCoupon(int maCoupon) {
        this.maCoupon = maCoupon;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", giaSach=" + giaSach + ", moTa=" + moTa + ", anhBia=" + anhBia + ", ngayCapNhat=" + ngayCapNhat + ", soLuong=" + soLuong + ", maNXB=" + maNXB + ", maCoupon=" + maCoupon + '}';
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            maSach, tenSach, giaSach, moTa, anhBia, ngayCapNhat, soLuong, maNXB, maCoupon
        };
    }
}
