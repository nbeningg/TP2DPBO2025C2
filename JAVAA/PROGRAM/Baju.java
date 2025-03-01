/* Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// kelas Baju merupakan turunan dari kelas Aksesoris
class Baju extends Aksesoris {
    
    // private atribut 
    private String untuk;
    private String size;
    private String merk;
    
    // konstruktor default tanpa parameter
    public Baju() {
    }
    
    // konstruktor dengan parameter untuk inisialisasi objek saat dibuat
    public Baju(String untuk, String size, String merk) {
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }
    
    // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
    public String get_untuk() {
        return this.untuk;
    }
        
    public String get_size() {
        return this.size;
    }

    public String get_merk() {
        return this.merk;
    }

    // SETTER UNTUK MENGUBAH NILAI ATRIBUT
    public void set_untuk(String untuk) {
        this.untuk = untuk;
    }

    public void set_size(String size) {
        this.size = size;
    }
    
    public void set_merk(String merk) {
        this.merk = merk;
    }
}