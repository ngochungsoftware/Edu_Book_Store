
package dao;


public class Coupon {
    int maCoupon;
    String tenCoupon;
    String ngayBatDau;
    String ngayKetThuc;
    String quaTang;
    String dieuKien;

    public Coupon(int maCoupon, String tenCoupon, String ngayBatDau, String ngayKetThuc, String quaTang, String dieuKien) {
        this.maCoupon = maCoupon;
        this.tenCoupon = tenCoupon;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.quaTang = quaTang;
        this.dieuKien = dieuKien;
    }

    public Coupon() {
    }

    public int getMaCoupon() {
        return maCoupon;
    }

    public void setMaCoupon(int maCoupon) {
        this.maCoupon = maCoupon;
    }

    public String getTenCoupon() {
        return tenCoupon;
    }

    public void setTenCoupon(String tenCoupon) {
        this.tenCoupon = tenCoupon;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getQuaTang() {
        return quaTang;
    }

    public void setQuaTang(String quaTang) {
        this.quaTang = quaTang;
    }

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
    }

    @Override
    public String toString() {
        return "Coupon{" + "maCoupon=" + maCoupon + ", tenCoupon=" + tenCoupon + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", quaTang=" + quaTang + ", dieuKien=" + dieuKien + '}';
    }
    
}
