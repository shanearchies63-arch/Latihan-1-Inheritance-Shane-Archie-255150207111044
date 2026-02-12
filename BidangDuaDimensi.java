/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemdasC2025;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class BidangDuaDimensi {
   
    protected String nama;
    
    public BidangDuaDimensi(String nama) {
        this.nama = nama;
    }
    
    public void info() {
        System.out.println("Nama Bidang : " + nama);
    }
    
    public double luas() {
        return 0;
    }
}


class BujurSangkar extends BidangDuaDimensi {
    
    private double sisi;
    
    public BujurSangkar(String nama, double sisi) {
        super(nama); 
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}

class Lingkaran extends BidangDuaDimensi {

    private double jariJari;
    
    public Lingkaran(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }
    
    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
}
