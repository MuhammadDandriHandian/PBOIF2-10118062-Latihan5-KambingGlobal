/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan5.kambingglobal;

/**
 *
 * @author 
 * Nama     : Muhammad Dandri Handian
 * Kelas    : IF-2
 * NIM      : 10118062
 */
public class PBOIF210118062Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
      int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +
                jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210118062Latihan5KambingGlobal kambingSusu = new PBOIF210118062Latihan5KambingGlobal();
      
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
         kambingSusu.getJumlahKambing();
         
        // Menambah satu kambing
         kambingSusu.tambahKambing();
         
        // Menampilkan jumlah kambing yang ada
         kambingSusu.getJumlahKambing();

    }
    
}
