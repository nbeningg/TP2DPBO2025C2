<!-- Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php
// kelas Petshop untuk merepresentasikan data produk yang dijual di Petshop
class PetShop {
    // atribut private
    private $id;
    private $nama_produk;
    private $harga_produk;
    private $stok_produk;
    private $foto_produk;

    // konstruktor untuk menginisialisasi objek
    public function __construct($id = "", $nama_produk = "", $harga_produk = 0, $stok_produk = 0, $foto_produk = "") {
        $this->id = $id;
        $this->nama_produk = $nama_produk;
        $this->harga_produk = $harga_produk;
        $this->stok_produk = $stok_produk;
        $this->foto_produk = $foto_produk;
    }

    // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
    public function get_id() {
        return $this->id;
    }

    public function get_nama_produk() {
        return $this->nama_produk;
    }

    public function get_harga_produk() {
        return $this->harga_produk;
    }

    public function get_stok_produk() {
        return $this->stok_produk;
    }
    
    public function get_foto_produk() {
        return $this->foto_produk;
    }

    // SETTER UNTUK MENGUBAH NILAI ATRIBUT
    public function set_id($id) {
        $this->id = $id;
    }

    public function set_nama_produk($nama_produk) {
        $this->nama_produk = $nama_produk;
    }

    public function set_harga_produk($harga_produk) {
        $this->harga_produk = $harga_produk;
    }

    public function set_stok_produk($stok_produk) {
        $this->stok_produk = $stok_produk;
    }
    
    public function set_foto_produk($foto_produk) {
        $this->foto_produk = $foto_produk;
    }
}
?>