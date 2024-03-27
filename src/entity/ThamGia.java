/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author macbook
 */
public class ThamGia {
    private int MaSach;
    private int MaTacGia;
    private String VaiTro;
    private String ViTri;

    public ThamGia() {
    }

    public ThamGia(int MaSach, int MaTacGia, String VaiTro, String ViTri) {
        this.MaSach = MaSach;
        this.MaTacGia = MaTacGia;
        this.VaiTro = VaiTro;
        this.ViTri = ViTri;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public int getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(int MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String ViTri) {
        this.ViTri = ViTri;
    }
    
    
}
