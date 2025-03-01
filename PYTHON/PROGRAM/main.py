# Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
# maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# mengimpor kelas Baju dari file Baju.py
from Baju import Baju

# daftar produk untuk menyimpan data produk 
daftar_produk = []

# menambahkan 5 objek awal ke dalam daftar_produk
# objek 1
produk1 = Baju()
produk1.set_id("P001")
produk1.set_nama_produk("Baju_Kucing_Gemay")
produk1.set_harga_produk(75000)
produk1.set_stok_produk(20)
produk1.set_jenis("Baju")
produk1.set_bahan("Katun")
produk1.set_warna("Ungu")
produk1.set_untuk("Kucing")
produk1.set_size("S")
produk1.set_merk("Polo_Shirt")
daftar_produk.append(produk1)

# objek 2
produk2 = Baju()
produk2.set_id("P002")
produk2.set_nama_produk("Sweater_Anget")
produk2.set_harga_produk(100000)
produk2.set_stok_produk(15)
produk2.set_jenis("Sweater")
produk2.set_bahan("Wol")
produk2.set_warna("Biru")
produk2.set_untuk("Anjing")
produk2.set_size("M")
produk2.set_merk("Ralph_Lauren")
daftar_produk.append(produk2)

# objek 3
produk3 = Baju()
produk3.set_id("P003")
produk3.set_nama_produk("Hoodie_Dino")
produk3.set_harga_produk(120000)
produk3.set_stok_produk(10)
produk3.set_jenis("Hoodie")
produk3.set_bahan("Polyester")
produk3.set_warna("Hijau")
produk3.set_untuk("Kucing")
produk3.set_size("L")
produk3.set_merk("SHEIN")
daftar_produk.append(produk3)

# objek 4
produk4 = Baju()
produk4.set_id("P004")
produk4.set_nama_produk("Jaket_Gelembung")
produk4.set_harga_produk(150000)
produk4.set_stok_produk(5)
produk4.set_jenis("Jaket")
produk4.set_bahan("Polyester")
produk4.set_warna("Hijau")
produk4.set_untuk("Anjing")
produk4.set_size("L")
produk4.set_merk("Spark_Paws")
daftar_produk.append(produk4)

# objek 5
produk5 = Baju()
produk5.set_id("P005")
produk5.set_nama_produk("Sweater_Sapi")
produk5.set_harga_produk(100000)
produk5.set_stok_produk(15)
produk5.set_jenis("Sweater")
produk5.set_bahan("Wol")
produk5.set_warna("Biru")
produk5.set_untuk("Kucing")
produk5.set_size("S")
produk5.set_merk("MeowTee")
daftar_produk.append(produk5)

n = int(input()) # inputan user berupa jumlah produk yang ingin ditambah
for i in range(n):
    # membuat objek baru untuk menyimpan data produk
    produk_baru = Baju()

    # inputan user berupa data produk sebanyak n
    id = input()
    nama_produk = input()
    harga_produk = int(input())
    stok_produk = int(input())
    jenis = input()
    bahan = input()
    warna = input()
    untuk = input()
    size = input()
    merk = input()

    # menetapkan nilai dari input user ke objek
    produk_baru.set_id(id)
    produk_baru.set_nama_produk(nama_produk)
    produk_baru.set_harga_produk(harga_produk)
    produk_baru.set_stok_produk(stok_produk)
    produk_baru.set_jenis(jenis)
    produk_baru.set_bahan(bahan)
    produk_baru.set_warna(warna)
    produk_baru.set_untuk(untuk)
    produk_baru.set_size(size)
    produk_baru.set_merk(merk)

    daftar_produk.append(produk_baru)

# PERHITUNGAN TABEL AGAR DINAMIS
longestData = [2, 11, 12, 11, 5, 5, 5, 5, 4, 4]  

# menghitung objek terpanjang untuk setiap kolom masing-masing
for produk in daftar_produk:
    longestData[0] = max(longestData[0], len(produk.get_id()))
    longestData[1] = max(longestData[1], len(produk.get_nama_produk()))
    longestData[2] = max(longestData[2], len(str(produk.get_harga_produk())))
    longestData[3] = max(longestData[3], len(str(produk.get_stok_produk())))
    longestData[4] = max(longestData[4], len(produk.get_jenis()))
    longestData[5] = max(longestData[5], len(produk.get_bahan()))
    longestData[6] = max(longestData[6], len(produk.get_warna()))
    longestData[7] = max(longestData[7], len(produk.get_untuk()))
    longestData[8] = max(longestData[8], len(produk.get_size()))
    longestData[9] = max(longestData[9], len(produk.get_merk()))

# MENGHITUNG TOTAL LEBAR TABEL
tableWidth = 31 + sum(longestData)

# cetak garis atas tabel
print("=" * tableWidth)

# cetak header tabel
header = "| ID" + " " * (longestData[0] - 2)
header += " | Nama Produk" + " " * (longestData[1] - 11)
header += " | Harga Produk" + " " * (longestData[2] - 12)
header += " | Stok Produk" + " " * (longestData[3] - 11)
header += " | Jenis" + " " * (longestData[4] - 5)
header += " | Bahan" + " " * (longestData[5] - 5)
header += " | Warna" + " " * (longestData[6] - 5)
header += " | Untuk" + " " * (longestData[7] - 5)
header += " | Size" + " " * (longestData[8] - 4)
header += " | Merk" + " " * (longestData[9] - 4)
header += " |"
print(header)

# cetak garis bawah header
print("=" * tableWidth)

# cetak data produk (isi daftar_produk)
for produk in daftar_produk:
    row = "| " + produk.get_id() + " " * (longestData[0] - len(produk.get_id()))
    row += " | " + produk.get_nama_produk() + " " * (longestData[1] - len(produk.get_nama_produk()))

    hargaString = str(produk.get_harga_produk())
    row += " | " + hargaString + " " * (longestData[2] - len(hargaString))

    stokString = str(produk.get_stok_produk())
    row += " | " + stokString + " " * (longestData[3] - len(stokString))

    row += " | " + produk.get_jenis() + " " * (longestData[4] - len(produk.get_jenis()))
    row += " | " + produk.get_bahan() + " " * (longestData[5] - len(produk.get_bahan()))
    row += " | " + produk.get_warna() + " " * (longestData[6] - len(produk.get_warna()))
    row += " | " + produk.get_untuk() + " " * (longestData[7] - len(produk.get_untuk()))
    row += " | " + produk.get_size() + " " * (longestData[8] - len(produk.get_size()))
    row += " | " + produk.get_merk() + " " * (longestData[9] - len(produk.get_merk()))
    row += " |"
    print(row)

# cetak garis bawah tabel
print("=" * tableWidth)