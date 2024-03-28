/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author pc
 */
public class ChiTietVoucher {
    private String maVoucher;
    private float giamGia;
    private String maSach;

    public ChiTietVoucher(String maVoucher, float giamGia, String maSach) {
        this.maVoucher = maVoucher;
        this.giamGia = giamGia;
        this.maSach = maSach;
    }

    public ChiTietVoucher() {
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    @Override
    public String toString() {
        return "ChiTietVoucher{" + "maVoucher=" + maVoucher + ", giamGia=" + giamGia + ", maSach=" + maSach + '}';
    }
    
    
}
