/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import javax.swing.JFrame;
/**
 *
 * @author ASUS
 */
public class ChiTietVoucher {
    private String maVoucher;
    private String maSach;
    private float giamGia;

    public ChiTietVoucher() {
    }

    public ChiTietVoucher(String maVoucher, String maSach, float giamGia) {
        this.maVoucher = maVoucher;
        this.maSach = maSach;
        this.giamGia = giamGia;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    @Override
    public String toString() {
        return "ChiTietVoucher{" + "maVoucher=" + maVoucher + ", maSach=" + maSach + ", giamGia=" + giamGia + '}';
    }

    
    
}
