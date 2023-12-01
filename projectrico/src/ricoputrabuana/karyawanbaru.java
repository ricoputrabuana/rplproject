package ricoputrabuana;

public class karyawanbaru {
        private String nama;
	private String nopeg;
	public int umur;
        private String jabatan;
        public float gaji;
	
	public karyawanbaru(String nama, String nopeg, int umur, String jabatan, float gaji) {
		this.nama = nama;
		this.nopeg = nopeg;
		this.umur = umur;
                this.jabatan = jabatan;
                this.gaji = gaji;
	}
	
	public String getNama() {
		return nama;
	}
        
        public void setNama(String nama) {
            this.nama = nama;
        }
	
        public void setNopeg(String nopeg) {
            this.nopeg = nopeg;
        }
                
	public String getNopeg() {
		return nopeg;
        }
        
        public void setUmur(int umur) {
            this.umur = umur;
        }
                
        public int getUmur() {
            return umur;
        }
        
        public void setJabatan(String jabatan) {
            this.jabatan = jabatan;
        }
        public String getJabatan() {
            return jabatan;
        }
        
        public void setGaji(float gaji) {
            this.gaji = gaji;
        }
        public float getGaji() {
            return gaji;
        }
        
        @Override
        public String toString() {
            return "Nama : " + nama + ", NOPEG: " + nopeg + ", Umur: " + umur + ", Jabatan: " + jabatan + ", Gaji: " + gaji;
        }
}
