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
public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String judul;
    String tglPinjam;
    String tglKembali;

    public Mahasiswa(String nama, String nim, String prodi, String judul, String tglPinjam, String tglKembali) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.judul = judul;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    } 
}
