/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gladista.uts_no2_c_3057;

/**
 *
 * Gladista poskomalasari dwi rifan (21103057)
 */
public class CommissionEmployee extends Employee {

    int gajiPokok;
    int komisi;
    int totalPenjualan;

    public CommissionEmployee(int gajiPokok, int komisi, int totalPenjualan, String nama, String nip) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    @Override
    public void hitungGaji() {
        int hitungGaji = gajiPokok + (komisi * totalPenjualan);
        System.out.println("Gaji : " + hitungGaji);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Komisi : " + komisi);
        System.out.println("Total Hasil Penjualan : " + totalPenjualan);

    }

}
