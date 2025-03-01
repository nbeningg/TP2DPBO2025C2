# Janji

Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Diagram

![diagram-tp2](https://github.com/user-attachments/assets/66a9340a-8aa9-4c1e-9991-0198f42acae3)

# Desain Program
Program ini dirancang untuk mengelola produk sebuah PetShop, khususnya produk pakaian hewan. Struktur program menggunakan konsep inheritance (pewarisan) dengan 3 class utama:
1. **PetShop** (Kelas Dasar)  
   - Atribut: id, nama_produk, harga_produk, stok_produk, foto_produk
     
2. **Aksesoris** (Turunan dari PetShop)  
   - Atribut tambahan: jenis, bahan, warna
     
3. **Baju** (Turunan dari Aksesoris)  
   - Atribut tambahan: untuk (jenis hewan), size, merk

Jadi desain ini menggunakan hierarki dari umum ke spesifik, dimana **Baju** merupakan jenis dari **Aksesoris**, dan **Aksesoris** merupakan jenis produk di **PetShop**.
Hal ini memungkinkan pemanfaatan prinsip inheritance, sehingga atribut dan metode dapat digunakan kembali pada kelas turunan.

# Alur Program
Secara garis besar alur programnya seperti ini
1. **Inisialisasi**  
   - Membuat objek **Baju** dan mengatur nilainya menggunakan **setter**

2. **Input Data**  
   - Menerima input dari user untuk menambahkan produk baru (hanya bisa add saja)  

3. **Pengolahan Data**  
   - Menggunakan **getter** untuk mengambil data dan menghitung **lebar tabel** secara dinamis.  

4. **Output**  
   - Menampilkan daftar produk dalam format tabel dengan menggunakan **getter**. 

**NOTES**
----------------------------------------------
| Bahasa | Input Data          | Foto Produk |
|--------|---------------------|-------------|
| C++    | Bisa menerima input | Tidak ada   |
| Java   | Bisa menerima input | Tidak ada   |
| Python | Bisa menerima input | Tidak ada   |
| PHP 	 | Hardcode saja       | Ada         |
----------------------------------------------
