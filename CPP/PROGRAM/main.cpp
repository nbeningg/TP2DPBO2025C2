/* Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// library yang digunakan
#include <bits/stdc++.h>
#include "Baju.cpp"

using namespace std;

int main() {
    list<Baju> daftar_produk; // buat list untuk menyimpan objek Baju
    // variabel untuk inputan user
    string id, nama_produk, jenis, bahan, warna, untuk, size, merk;
    int harga_produk, stok_produk;
    
    // menambahkan 5 objek awal ke dalam daftar_produk
    // objek 1
    Baju produk1;
    produk1.set_id("P001");
    produk1.set_nama_produk("Baju_Kucing_Gemay");
    produk1.set_harga_produk(75000);
    produk1.set_stok_produk(20);
    produk1.set_jenis("Baju");
    produk1.set_bahan("Katun");
    produk1.set_warna("Ungu");
    produk1.set_untuk("Kucing");
    produk1.set_size("S");
    produk1.set_merk("Polo_Shirt");
    daftar_produk.push_back(produk1);
    
    // objek 2
    Baju produk2;
    produk2.set_id("P002");
    produk2.set_nama_produk("Sweater_Anget");
    produk2.set_harga_produk(100000);
    produk2.set_stok_produk(15);
    produk2.set_jenis("Sweater");
    produk2.set_bahan("Wol");
    produk2.set_warna("Biru");
    produk2.set_untuk("Anjing");
    produk2.set_size("M");
    produk2.set_merk("Ralph_Lauren");
    daftar_produk.push_back(produk2);
    
    // objek 3
    Baju produk3;
    produk3.set_id("P003");
    produk3.set_nama_produk("Hoodie_Dino");
    produk3.set_harga_produk(120000);
    produk3.set_stok_produk(10);
    produk3.set_jenis("Hoodie");
    produk3.set_bahan("Polyester");
    produk3.set_warna("Hijau");
    produk3.set_untuk("Kucing");
    produk3.set_size("L");
    produk3.set_merk("SHEIN");
    daftar_produk.push_back(produk3);
    
    // objek 4
    Baju produk4;
    produk4.set_id("P004");
    produk4.set_nama_produk("Jaket_Gelembung");
    produk4.set_harga_produk(150000);
    produk4.set_stok_produk(5);
    produk4.set_jenis("Jaket");
    produk4.set_bahan("Polyester");
    produk4.set_warna("Hijau");
    produk4.set_untuk("Anjing");
    produk4.set_size("L");
    produk4.set_merk("Spark_Paws");
    daftar_produk.push_back(produk4);
    
    // objek 5
    Baju produk5;
    produk5.set_id("P005");
    produk5.set_nama_produk("Sweater_Sapi");
    produk5.set_harga_produk(100000);
    produk5.set_stok_produk(15);
    produk5.set_jenis("Sweater");
    produk5.set_bahan("Wol");
    produk5.set_warna("Biru");
    produk5.set_untuk("Kucing");
    produk5.set_size("S");
    produk5.set_merk("MeowTee");
    daftar_produk.push_back(produk5);

    // inputan user berupa jumlah produk yang ingin ditambah
    int n;
    cin >> n;
    
    for (int i = 0; i < n; i++) {
        // inputan user berupa data produk sebanyak n
        Baju produk_baru;
        cin >> id >> nama_produk >> harga_produk >> stok_produk >> jenis >> bahan >> warna >> untuk >> size >> merk;
        
        // menetapkan nilai dari input user ke objek
        produk_baru.set_id(id);
        produk_baru.set_nama_produk(nama_produk);
        produk_baru.set_harga_produk(harga_produk);
        produk_baru.set_stok_produk(stok_produk);
        produk_baru.set_jenis(jenis);
        produk_baru.set_bahan(bahan);
        produk_baru.set_warna(warna);
        produk_baru.set_untuk(untuk);
        produk_baru.set_size(size);
        produk_baru.set_merk(merk);
        
        // menambahkan produk ke dalam daftar_produk
        daftar_produk.push_back(produk_baru);
    }

    // PERHITUNGAN TABEL AGAR DINAMIS
    vector<int> longestData = {2, 11, 12, 11, 5, 5, 5, 5, 4, 4}; 
    
    // menghitung objek terpanjang untuk setiap kolom masing-masing
    for (auto it = daftar_produk.begin(); it != daftar_produk.end(); it++) {
        // id
        if (longestData[0] < it->get_id().length()) 
            longestData[0] = it->get_id().length();
        // nama_produk
        if (longestData[1] < it->get_nama_produk().length()) 
            longestData[1] = it->get_nama_produk().length();
        // harga_produk
        string hargaString = to_string(it->get_harga_produk());
        if (longestData[2] < hargaString.length()) 
            longestData[2] = hargaString.length();
        // stok_produk
        string stokString = to_string(it->get_stok_produk());
        if (longestData[3] < stokString.length()) 
            longestData[3] = stokString.length();
        // jenis
        if (longestData[4] < it->get_jenis().length()) 
            longestData[4] = it->get_jenis().length();
        // bahan
        if (longestData[5] < it->get_bahan().length()) 
            longestData[5] = it->get_bahan().length();
        // warna
        if (longestData[6] < it->get_warna().length()) 
            longestData[6] = it->get_warna().length();
        // untuk
        if (longestData[7] < it->get_untuk().length()) 
            longestData[7] = it->get_untuk().length();
        // size
        if (longestData[8] < it->get_size().length()) 
            longestData[8] = it->get_size().length();
        // merk
        if (longestData[9] < it->get_merk().length()) 
            longestData[9] = it->get_merk().length();
    }

    // MENGHITUNG TOTAL LEBAR TABEL
    int tableWidth = 0;
    for (int i = 0; i < 10; i++) {
        tableWidth += longestData[i];
    }
    tableWidth += 31;
    
    // cetak garis atas tabel
    for (int i = 0; i < tableWidth; i++) {
        cout << "=";
    }
    cout << endl;
    
    // cetak header tabel
    cout << "| ID";
    for (int space = 0; space < longestData[0] - 2; space++) cout << " ";
    
    cout << " | Nama Produk";
    for (int space = 0; space < longestData[1] - 11; space++) cout << " ";
    
    cout << " | Harga Produk";
    for (int space = 0; space < longestData[2] - 12; space++) cout << " ";
    
    cout << " | Stok Produk";
    for (int space = 0; space < longestData[3] - 11; space++) cout << " ";
    
    cout << " | Jenis";
    for (int space = 0; space < longestData[4] - 5; space++) cout << " ";
    
    cout << " | Bahan";
    for (int space = 0; space < longestData[5] - 5; space++) cout << " ";
    
    cout << " | Warna";
    for (int space = 0; space < longestData[6] - 5; space++) cout << " ";
    
    cout << " | Untuk";
    for (int space = 0; space < longestData[7] - 5; space++) cout << " ";
    
    cout << " | Size";
    for (int space = 0; space < longestData[8] - 4; space++) cout << " ";
    
    cout << " | Merk";
    for (int space = 0; space < longestData[9] - 4; space++) cout << " ";
    
    cout << " |" << endl;
    
    // cetak garis bawah header
    for (int i = 0; i < tableWidth; i++) {
        cout << "=";
    }
    cout << endl;
    
    // cetak data produk (isi daftar_produk)
    for (auto it = daftar_produk.begin(); it != daftar_produk.end(); it++) {
        // id
        cout << "| " << it->get_id();
        for (int space = 0; space < longestData[0] - it->get_id().length(); space++) cout << " ";
        
        // nama_produk
        cout << " | " << it->get_nama_produk();
        for (int space = 0; space < longestData[1] - it->get_nama_produk().length(); space++) cout << " ";
        
        // harga_produk
        cout << " | " << it->get_harga_produk();
        string hargaString = to_string(it->get_harga_produk());
        for (int space = 0; space < longestData[2] - hargaString.length(); space++) cout << " ";
        
        // stok_produk
        cout << " | " << it->get_stok_produk();
        string stokString = to_string(it->get_stok_produk());
        for (int space = 0; space < longestData[3] - stokString.length(); space++) cout << " ";
        
        // jenis
        cout << " | " << it->get_jenis();
        for (int space = 0; space < longestData[4] - it->get_jenis().length(); space++) cout << " ";
        
        // bahan
        cout << " | " << it->get_bahan();
        for (int space = 0; space < longestData[5] - it->get_bahan().length(); space++) cout << " ";
        
        // warna
        cout << " | " << it->get_warna();
        for (int space = 0; space < longestData[6] - it->get_warna().length(); space++) cout << " ";
        
        // untuk
        cout << " | " << it->get_untuk();
        for (int space = 0; space < longestData[7] - it->get_untuk().length(); space++) cout << " ";
        
        // size
        cout << " | " << it->get_size();
        for (int space = 0; space < longestData[8] - it->get_size().length(); space++) cout << " ";
        
        // merk
        cout << " | " << it->get_merk();
        for (int space = 0; space < longestData[9] - it->get_merk().length(); space++) cout << " ";
        
        cout << " |" << endl;
    }
    
    // cetak garis bawah tabel
    for (int i = 0; i < tableWidth; i++) {
        cout << "=";
    }
    cout << endl;
    
    return 0;
}

