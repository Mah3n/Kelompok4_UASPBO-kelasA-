/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Perpustakaan;

/**
 *
 * @author Kelompok4
 * TI-A
 */
public class DataBuku {
    String kode;
    String judul;
    String pengarang;
    String penerbit;
    String thn_terbit;

    public DataBuku(String kode, String judul, String pengarang, String penerbit, String thn_terbit) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.thn_terbit = thn_terbit;
    }
}
