/* Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// library yang digunakan
#include <bits/stdc++.h>

using namespace std;

// deklarasi kelas untuk mengimplementasikan sebuah Petshop
class PetShop {

    private: // atribut private
        string id, nama_produk;
        int harga_produk, stok_produk;

    public:
        // konstruktor default tanpa parameter
        PetShop() {
        }

        // konstruktor dengan parameter untuk inisialisasi objek Petshop
        PetShop(string id, string nama_produk, int harga_produk, int stok_produk) {
            this->id = id;
            this->nama_produk = nama_produk;
            this->harga_produk = harga_produk;
            this->stok_produk = stok_produk;
        }

        // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
        string get_id() {
            return this->id;
        }

        string get_nama_produk() {
            return this->nama_produk;
        }

        int get_harga_produk() {
            return this->harga_produk;
        }

        int get_stok_produk() {
            return this->stok_produk;
        }
        
        // SETTER UNTUK MENGUBAH NILAI ATRIBUT
        void set_id(string id) {
            this->id = id;
        }

        void set_nama_produk(string nama_produk) {
            this->nama_produk = nama_produk;
        }

        void set_harga_produk(int harga_produk) {
            this->harga_produk = harga_produk;
        }

        void set_stok_produk(int stok_produk) {
            this->stok_produk = stok_produk;
        }

        // dekonstruktor
        ~PetShop() {
        }
};