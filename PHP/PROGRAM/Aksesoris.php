<!-- Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php
// mengimpor file PetShop.php agar kelas PetShop bisa digunakan dalam file ini
require_once ('PetShop.php');

// mendeklarasikan kelas Aksesoris yang merupakan turunan dari PetShop
class Aksesoris extends PetShop {
    // atribut private
    private $jenis;
    private $bahan;
    private $warna;

    // konstruktor untuk menginisialisasi objek
    public function __construct($jenis = "", $bahan = "", $warna = "") {
        parent::__construct();
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }

    // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
    public function get_jenis() {
        return $this->jenis;
    }

    public function get_bahan() {
        return $this->bahan;
    }

    public function get_warna() {
        return $this->warna;
    }

    // SETTER UNTUK MENGUBAH NILAI ATRIBUT
    public function set_jenis($jenis) {
        $this->jenis = $jenis;
    }

    public function set_bahan($bahan) {
        $this->bahan = $bahan;
    }

    public function set_warna($warna) {
        $this->warna = $warna;
    }
}
?>