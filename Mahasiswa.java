/*Nama : Awalia Mutiara Hikmah
Nim : 22166001
Prodi : Sistem Informasi
Semester : 3
Matkul : PBO 1*/

package mahasiswa;

public class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class MahasiswaBaru extends Mahasiswa {
    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
}

class MahasiswaLama extends Mahasiswa {
    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Angkatan: " + angkatan);
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat instances of Mahasiswa, MahasiswaBaru, and MahasiswaLama
        Mahasiswa mahasiswa = new Mahasiswa("John", 20);
        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Jane", 22, 123456);
        MahasiswaLama mahasiswaLama = new MahasiswaLama("Doe", 25, 2019);

        // Menampilkan informasi menggunakan metode displaynfo
        System.out.println("Mahasiswa:");
        mahasiswa.displayInfo();

        System.out.println("\nMahasiswa Baru:");
        mahasiswaBaru.displayInfo();

        System.out.println("\nMahasiswa Lama:");
        mahasiswaLama.displayInfo();
    }
}
