/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Voucher {

    private String maVoucher;
    private String tenChuongTrinh;
    private String Loai;
    private Date NgayBD;
    private Date NgayKT;  
    private String dieuKien;

    public Voucher(String maVoucher, String tenChuongTrinh, String Loai, Date NgayBD, Date NgayKT, String dieuKien) {
        this.maVoucher = maVoucher;
        this.tenChuongTrinh = tenChuongTrinh;
        this.Loai = Loai;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.dieuKien = dieuKien;
    }

    
    
    public Voucher(String maVoucher, String tenChuongTrinh, String Loai, Date NgayBD, Date NgayKT) {
        this.maVoucher = maVoucher;
        this.tenChuongTrinh = tenChuongTrinh;
        this.Loai = Loai;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        
    }

    
    public Voucher() {
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getTenChuongTrinh() {
        return tenChuongTrinh;
    }

    public void setTenChuongTrinh(String tenChuongTrinh) {
        this.tenChuongTrinh = tenChuongTrinh;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
    }

    @Override
    public String toString() {
        return "Voucher{" + "maVoucher=" + maVoucher + ", tenChuongTrinh=" + tenChuongTrinh + ", NgayBD=" + NgayBD + ", NgayKT=" + NgayKT + ", Loai=" + Loai + ", dieuKien=" + dieuKien + '}';
    }

    

    
    
    

    
}