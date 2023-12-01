package ricoputrabuana;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerKaryawan {
    ArrayList<karyawanbaru> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerKaryawan(){
        ArrayData = new ArrayList<karyawanbaru>();
    }
    public void InsertData(String nama, String nopeg, int umur, String jabatan, float gaji){
        karyawanbaru karyawan = new karyawanbaru(nama, nopeg, umur, jabatan, gaji);
        ArrayData.add(karyawan);
    }
    public void updateData(int rowIndex, String nama, String nopeg, int umur, String jabatan, float gaji){
        if (rowIndex >= 0 && rowIndex < ArrayData.size()){
            karyawanbaru karyawan = ArrayData.get(rowIndex);
            
            karyawan.setNama(nama);
            karyawan.setNopeg(nopeg);
            karyawan.setUmur(umur);
            karyawan.setJabatan(jabatan);
            karyawan.setGaji(gaji);
        }
    }
    
    public void deleteData(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < ArrayData.size()){
            ArrayData.remove(rowIndex);
        }
    }
    public DefaultTableModel showData(){
        String[] kolom = { "Nama", "NOPEG", "Umur", "Jabatan", "Gaji"};
        Object[][] objData = new Object [ArrayData.size()][3];
        int i = 0;
        
        for(karyawanbaru n : ArrayData){
            String[] arrData = {n.getNama(), n.getNopeg(), String.valueOf(n.umur), n.getJabatan(), String.valueOf(n.gaji)};
            objData[i] = arrData;
            i++;
        }
        
        tablelist = new DefaultTableModel(objData, kolom){
            public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tablelist;
    }
}
