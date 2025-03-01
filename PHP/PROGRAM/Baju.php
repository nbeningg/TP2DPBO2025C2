<!-- Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php
// mengimpor file Aksesoris.php agar kelas Aksesoris bisa digunakan dalam file ini
require_once ('Aksesoris.php');

// mendeklarasikan kelas Baju yang merupakan turunan dari Aksesoris
class Baju extends Aksesoris {
    // atribut private
    private $untuk;
    private $size;
    private $merk;

    // konstruktor untuk menginisialisasi objek
    public function __construct($untuk = "", $size = "", $merk = "") {
        parent::__construct();
        $this->untuk = $untuk;
        $this->size = $size;
        $this->merk = $merk;
    }

    // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
    public function get_untuk() {
        return $this->untuk;
    }

    public function get_size() {
        return $this->size;
    }

    public function get_merk() {
        return $this->merk;
    }

    // SETTER UNTUK MENGUBAH NILAI ATRIBUT
    public function set_untuk($untuk) {
        $this->untuk = $untuk;
    }

    public function set_size($size) {
        $this->size = $size;
    }

    public function set_merk($merk) {
        $this->merk = $merk;
    }
}
?>

