/* Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// library yang digunakan
#include <bits/stdc++.h>
#include "Aksesoris.cpp"

using namespace std;

// kelas Baju merupakan turunan dari kelas Aksesoris
class Baju : public Aksesoris {

    private: // atribut private
        string untuk, size, merk;
    
    public:
        // konstruktor default tanpa parameter
        Baju() {
        }
    
        // konstruktor dengan parameter untuk inisialisasi objek saat dibuat
        Baju(string untuk, string size, string merk) {
            this->untuk = untuk;
            this->size = size;
            this->merk = merk;
        }
    
        // GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
        string get_untuk() {
            return this->untuk;
        }
            
        string get_size() {
            return this->size;
        }

        string get_merk() {
            return this->merk;
        }

        // SETTER UNTUK MENGUBAH NILAI ATRIBUT
        void set_untuk(string untuk) {
            this->untuk = untuk;
        }

        void set_size(string size) {
            this->size = size;
        }
    
        void set_merk(string merk) {
            this->merk = merk;
        }
    
        // dekonstruktor
        ~Baju() {
        }
};
    