/* Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// kelas Aksesoris merupakan turunan dari kelas PetShop
class Aksesoris extends PetShop {

    // private atribut 
    private String jenis;
    private String bahan;
    private String warna;
    
    // konstruktor default tanpa parameter
    public Aksesoris() {
    }
    
    // konstruktor dengan parameter untuk inisialisasi objek saat dibuat
    public Aksesoris(String jenis, String bahan, String warna) {
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }
    
    // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
    public String get_jenis() {
        return this.jenis;
    }

    public String get_bahan() {
        return this.bahan;
    }

    public String get_warna() {
        return this.warna;
    }

    // SETTER UNTUK MENGUBAH NILAI ATRIBUT
    public void set_jenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void set_bahan(String bahan) {
        this.bahan = bahan;
    }

    public void set_warna(String warna) {
        this.warna = warna;
    }
}