
package entity;

import java.util.Date;


public class Voucher {
     private String maVoucher;
     private String tenVoucher;
     private Date ngayBatDau;
     private Date ngayKetThuc;
     private String loaiVoucher;
     private String dieuKien;

    public Voucher() {
    }

    public Voucher(String maVoucher, String tenVoucher, Date ngayBatDau, Date ngayKetThuc, String loaiVoucher, String dieuKien) {
        this.maVoucher = maVoucher;
        this.tenVoucher = tenVoucher;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.loaiVoucher = loaiVoucher;
        this.dieuKien = dieuKien;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getTenVoucher() {
        return tenVoucher;
    }

    public void setTenVoucher(String tenVoucher) {
        this.tenVoucher = tenVoucher;
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

    public String getLoaiVoucher() {
        return loaiVoucher;
    }

    public void setLoaiVoucher(String loaiVoucher) {
        this.loaiVoucher = loaiVoucher;
    }

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
    }

    @Override
    public String toString() {
        return "Voucher{" + "maVoucher=" + maVoucher + ", tenVoucher=" + tenVoucher + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", loaiVoucher=" + loaiVoucher + ", dieuKien=" + dieuKien + '}';
    }
     
     
}
