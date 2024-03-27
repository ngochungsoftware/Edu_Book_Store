/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author macbook
 */
public class TacGia {
    private int MaTacGia;
    private String TenTacGia;
    private String DiaChi;
    private String TieuSu;
    private String DienThoai;

    public TacGia() {
    }

    public TacGia(int MaTacGia, String TenTacGia, String DiaChi, String TieuSu, String DienThoai) {
        this.MaTacGia = MaTacGia;
        this.TenTacGia = TenTacGia;
        this.DiaChi = DiaChi;
        this.TieuSu = TieuSu;
        this.DienThoai = DienThoai;
    }

    public int getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(int MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTieuSu() {
        return TieuSu;
    }

    public void setTieuSu(String TieuSu) {
        this.TieuSu = TieuSu;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }
    
    
}

