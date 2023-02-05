/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Perpustakaan;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kelompok4
 * TI-A
 */
public class ControlerMahasiswa extends AbstractTableModel {
    ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
    String[] header = {"Nama", "Nim", "Prodi", "Judul Buku", "Tanggal Pinjam", "Tanggal Kembali"};
    
    
    public void add(Mahasiswa mhs){
        mahasiswa.add(mhs);
        fireTableRowsInserted(mahasiswa.size() - 1, mahasiswa.size() - 1);
    }
    
    public void remove(Mahasiswa mhs){
        mahasiswa.remove(mhs);
        fireTableRowsInserted(mahasiswa.size() - 1, mahasiswa.size() - 1);
    }
    
    public Mahasiswa getMhs(int row){
        return mahasiswa.get(row);
    }
    
    @Override
    public int getRowCount() {
        return mahasiswa.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
        public Object getValueAt(int row, int col) {
            Mahasiswa m = mahasiswa.get(row);
            switch(col){
                case 0 :
                    return m.getNama();
                case 1 :
                    return m.getNim();
                case 2 :
                    return m.getProdi();
                case 3 :
                    return m.getJudul();
                case 4 :
                    return m.getTglPinjam();
                case 5 :
                    return m.getTglKembali();
                default :
                    return "";
            }
    }
    
    @Override
        public String getColumnName(int column){
            return header[column];
        }
}
