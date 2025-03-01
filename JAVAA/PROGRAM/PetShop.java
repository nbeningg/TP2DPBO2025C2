/* Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// deklarasi kelas untuk mengimplementasikan sebuah Petshop
class PetShop {
    
    // private atribut 
    private String id;
    private String nama_produk;
    private int harga_produk;
    private int stok_produk;

    // konstruktor default (tanpa parameter)
    public PetShop() {
    }

    // konstruktor dengan parameter (untuk membuat objek Petshop)
    public PetShop(String id, String nama_produk, int harga_produk, int stok_produk) {
        this.id = id;
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
        this.stok_produk = stok_produk;
    }

    // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
    public String get_id() {
        return this.id;
    }

    public String get_nama_produk() {
        return this.nama_produk;
    }

    public int get_harga_produk() {
        return this.harga_produk;
    }

    public int get_stok_produk() {
        return this.stok_produk;
    }
    
    // SETTER UNTUK MENGUBAH NILAI ATRIBUT
    public void set_id(String id) {
        this.id = id;
    }

    public void set_nama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public void set_harga_produk(int harga_produk) {
        this.harga_produk = harga_produk;
    }

    public void set_stok_produk(int stok_produk) {
        this.stok_produk = stok_produk;
    }
}