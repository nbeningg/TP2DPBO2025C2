/* Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// library yang digunakan
#include <bits/stdc++.h>
#include "PetShop.cpp"

using namespace std;

// kelas Aksesoris merupakan turunan dari kelas PetShop
class Aksesoris : public PetShop {

    private: // atribut private
        string jenis, bahan, warna;
    
    public:
        // konstruktor default tanpa parameter
        Aksesoris() {
        }
    
         // konstruktor dengan parameter untuk inisialisasi objek saat dibuat
        Aksesoris(string jenis, string bahan, string warna) {
            this->jenis = jenis;
            this->bahan = bahan;
            this->warna = warna;
        }
    
        // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
        string get_jenis() {
            return this->jenis;
        }

        string get_bahan() {
            return this->bahan;
        }

        string get_warna() {
            return this->warna;
        }

        // SETTER UNTUK MENGUBAH NILAI ATRIBUT
        void set_jenis(string jenis) {
            this->jenis = jenis;
        }
    
        void set_bahan(string bahan) {
            this->bahan = bahan;
        }

        void set_warna(string warna) {
            this->warna = warna;
        }
        
        // dekonstruktor
        ~Aksesoris() {
        }
};