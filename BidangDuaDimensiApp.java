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
public class BidangDuaDimensiApp {
    
    public static void main(String[] args) {

        
        BidangDuaDimensi bujurSangkar = new BujurSangkar("Bujur Sangkar", 10);
        bujurSangkar.info();
        System.out.println("Luas        : " + bujurSangkar.luas());
        System.out.println();

        
        BidangDuaDimensi lingkaran = new Lingkaran("Lingkaran", 14);
        lingkaran.info();
        System.out.println("Luas        : " + lingkaran.luas());
    }
}


