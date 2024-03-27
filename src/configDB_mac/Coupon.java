package entity;
import java.util.Date;
public class Coupon {

    private String maCoupon;
    private String tenCoupon;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String quaTang;
    private String dieuKien;

    public Coupon() {
    }

    public Coupon(String maCoupon, String tenCoupon, Date ngayBatDau, Date ngayKetThuc, String quaTang, String dieuKien) {
        this.maCoupon = maCoupon;
        this.tenCoupon = tenCoupon;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.quaTang = quaTang;
        this.dieuKien = dieuKien;
    }

    public String getMaCoupon() {
        return maCoupon;
    }

    public void setMaCoupon(String maCoupon) {
        this.maCoupon = maCoupon;
    }

    public String getTenCoupon() {
        return tenCoupon;
    }

    public void setTenCoupon(String tenCoupon) {
        this.tenCoupon = tenCoupon;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
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
