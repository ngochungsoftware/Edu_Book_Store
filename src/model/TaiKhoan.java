/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pc
 */
public class TaiKhoan {

    private String TenTK;
    private String maNV;
    private String MaTK; 
    private String mk;
    private String Quyen;
    private String status;

    public TaiKhoan(String TenTK, String maNV, String MaTK, String mk, String Quyen, String status) {
        this.TenTK = TenTK;
        this.maNV = maNV;
        this.MaTK = MaTK;
        this.mk = mk;
        this.Quyen = Quyen;
        this.status = status;
    }


    public TaiKhoan() {
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
