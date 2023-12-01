package ricoputrabuana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataKaryawan{
    	public static void main(String[] args) {
		List<karyawanbaru> daftarKaryawan = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Tambah Data Karyawan Baru (y/n): ");
			String jawaban = input.nextLine();
			
			if (jawaban.equalsIgnoreCase("n")) {
				break;
			}
			System.out.print("Nama: ");
			String nama = input.nextLine();
			
			System.out.print("NOPEG: ");
			String nopeg = input.nextLine();
			
			System.out.print("Umur: ");
			int umur = input.nextInt();
			input.nextLine();
                        
                        System.out.print("Jabatan: ");
			String jabatan = input.nextLine();
                        
			System.out.print("Gaji: ");
			float gaji = input.nextFloat();
			input.nextLine();
			
			karyawanbaru karyawan = new karyawanbaru(nama, nopeg, umur, jabatan, gaji);
			daftarKaryawan.add(karyawan);
		}
		
		System.out.println("Daftar Karyawan");
		for (karyawanbaru karyawan : daftarKaryawan){
			System.out.println(karyawan);
		}
	}
}
