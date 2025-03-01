# Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
# maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# mengimpor kelas Aksesoris dari file Aksesoris.py
from Aksesoris import Aksesoris

# mendeklarasikan kelas Baju yang merupakan turunan dari Aksesoris
class Baju(Aksesoris):
    # atribut private menggunakan double underscore (__)
    __untuk = ""
    __size = ""
    __merk = ""

    # konstruktor dengan parameter untuk inisialisasi objek saat dibuat
    def __init__(self, untuk="", size="", merk=""):
        self.__untuk = untuk
        self.__size = size
        self.__merk = merk
    
    # GETTER UNTUK MENDAPATKAN NILAI ATRIBUT
    def get_untuk(self):
        return self.__untuk
    
    def get_size(self):
        return self.__size
    
    def get_merk(self):
        return self.__merk
    
    # SETTER UNTUK MENGUBAH NILAI ATRIBUT
    def set_untuk(self, untuk):
        self.__untuk = untuk
    
    def set_size(self, size):
        self.__size = size
    
    def set_merk(self, merk):
        self.__merk = merk
