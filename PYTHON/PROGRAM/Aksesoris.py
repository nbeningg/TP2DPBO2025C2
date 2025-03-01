# Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
# maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# mengimpor kelas PetShop dari file PetShop.py
from PetShop import PetShop

# mendeklarasikan kelas Aksesoris yang merupakan turunan dari PetShop
class Aksesoris(PetShop):
    # atribut private menggunakan double underscore (__)
    __jenis = ""
    __bahan = ""
    __warna = ""

    # konstruktor dengan parameter untuk inisialisasi objek saat dibuat
    def __init__(self, jenis = "", bahan = "", warna = ""):
        self.__jenis = jenis
        self.__bahan = bahan
        self.__warna = warna
    
    # GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
    def get_jenis(self):
        return self.__jenis
    
    def get_bahan(self):
        return self.__bahan
    
    def get_warna(self):
        return self.__warna
    
    # SETTER UNTUK MENGUBAH NILAI ATRIBUT
    def set_jenis(self, jenis):
        self.__jenis = jenis
    
    def set_bahan(self, bahan):
        self.__bahan = bahan
    
    def set_warna(self, warna):
        self.__warna = warna