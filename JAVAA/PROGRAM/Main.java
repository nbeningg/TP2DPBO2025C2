/* Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// mengimpor library yang digunakan
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // membuat arraylist untuk menyimpan daftar produk
        ArrayList<Baju> daftar_produk = new ArrayList<>();

        // variabel untuk inputan user
        String id, nama_produk, jenis, bahan, warna, untuk, size, merk;
        int harga_produk, stok_produk;
        
        // menambahkan 5 objek awal ke dalam daftar_produk
        // objek 1
        Baju produk1 = new Baju();
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
        daftar_produk.add(produk1);
        
        // objek 2
        Baju produk2 = new Baju();
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
        daftar_produk.add(produk2);
        
        // objek 3
        Baju produk3 = new Baju();
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
        daftar_produk.add(produk3);
        
        // objek 4
        Baju produk4 = new Baju();
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
        daftar_produk.add(produk4);
        
        // objek 5
        Baju produk5 = new Baju();
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
        daftar_produk.add(produk5);

        // membuat objek scanner untuk input user
        Scanner sc = new Scanner(System.in);

        // membaca jumlah produk yang akan ditambahkan dari input user
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            // membuat objek baru untuk menyimpan data produk
            Baju produk_baru = new Baju();

            // membaca input user untuk setiap atribut produk (data produk)
            id = sc.next();
            nama_produk = sc.next();
            harga_produk = sc.nextInt();
            stok_produk = sc.nextInt();
            jenis = sc.next();
            bahan = sc.next();
            warna = sc.next();
            untuk = sc.next();
            size = sc.next();
            merk = sc.next();
            
            // menetapkan nilai atribut produk yang baru
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
            daftar_produk.add(produk_baru);
        }

        // PERHITUNGAN TABEL AGAR DINAMIS
        int[] longestData = {2, 11, 12, 11, 5, 5, 5, 5, 4, 4};
        
        // menghitung objek terpanjang untuk setiap kolom masing-masing
        for (Baju it : daftar_produk) {
            // id
            if (longestData[0] < it.get_id().length()) 
                longestData[0] = it.get_id().length();
            // nama_produk
            if (longestData[1] < it.get_nama_produk().length()) 
                longestData[1] = it.get_nama_produk().length();
            // harga_produk
            String hargaString = Integer.toString(it.get_harga_produk());
            if (longestData[2] < hargaString.length()) 
                longestData[2] = hargaString.length();
            // stok_produk
            String stokString = Integer.toString(it.get_stok_produk());
            if (longestData[3] < stokString.length()) 
                longestData[3] = stokString.length();
            // jenis
            if (longestData[4] < it.get_jenis().length()) 
                longestData[4] = it.get_jenis().length();
            // bahan
            if (longestData[5] < it.get_bahan().length()) 
                longestData[5] = it.get_bahan().length();
            // warna
            if (longestData[6] < it.get_warna().length()) 
                longestData[6] = it.get_warna().length();
            // untuk
            if (longestData[7] < it.get_untuk().length()) 
                longestData[7] = it.get_untuk().length();
            // size
            if (longestData[8] < it.get_size().length()) 
                longestData[8] = it.get_size().length();
            // merk
            if (longestData[9] < it.get_merk().length()) 
                longestData[9] = it.get_merk().length();
        }

        // MENGHITUNG TOTAL LEBAR TABEL
        int tableWidth = 0;
        for (int i = 0; i < 10; i++) {
            tableWidth += longestData[i];
        }
        tableWidth += 31;
        
        // cetak garis atas tabel
        for (int i = 0; i < tableWidth; i++) {
            System.out.print("=");
        }
        System.out.println();
        
        // cetak header tabel
        System.out.print("| ID");
        for (int space = 0; space < longestData[0] - 2; space++) System.out.print(" ");
        
        System.out.print(" | Nama Produk");
        for (int space = 0; space < longestData[1] - 11; space++) System.out.print(" ");
        
        System.out.print(" | Harga Produk");
        for (int space = 0; space < longestData[2] - 12; space++) System.out.print(" ");
        
        System.out.print(" | Stok Produk");
        for (int space = 0; space < longestData[3] - 11; space++) System.out.print(" ");
        
        System.out.print(" | Jenis");
        for (int space = 0; space < longestData[4] - 5; space++) System.out.print(" ");
        
        System.out.print(" | Bahan");
        for (int space = 0; space < longestData[5] - 5; space++) System.out.print(" ");
        
        System.out.print(" | Warna");
        for (int space = 0; space < longestData[6] - 5; space++) System.out.print(" ");
        
        System.out.print(" | Untuk");
        for (int space = 0; space < longestData[7] - 5; space++) System.out.print(" ");
        
        System.out.print(" | Size");
        for (int space = 0; space < longestData[8] - 4; space++) System.out.print(" ");
        
        System.out.print(" | Merk");
        for (int space = 0; space < longestData[9] - 4; space++) System.out.print(" ");
        
        System.out.println(" |");
        
        // cetak garis bawah header
        for (int i = 0; i < tableWidth; i++) {
            System.out.print("=");
        }
        System.out.println();
        
        // cetak data produk (isi daftar_produk)
        for (Baju it : daftar_produk) {
            // id
            System.out.print("| " + it.get_id());
            for (int space = 0; space < longestData[0] - it.get_id().length(); space++) 
                System.out.print(" ");
            
            // nama_produk
            System.out.print(" | " + it.get_nama_produk());
            for (int space = 0; space < longestData[1] - it.get_nama_produk().length(); space++) 
                System.out.print(" ");
            
            // harga_produk
            System.out.print(" | " + it.get_harga_produk());
            String hargaString = Integer.toString(it.get_harga_produk());
            for (int space = 0; space < longestData[2] - hargaString.length(); space++) 
                System.out.print(" ");
            
            // stok_produk
            System.out.print(" | " + it.get_stok_produk());
            String stokString = Integer.toString(it.get_stok_produk());
            for (int space = 0; space < longestData[3] - stokString.length(); space++) 
                System.out.print(" ");
            
            // jenis
            System.out.print(" | " + it.get_jenis());
            for (int space = 0; space < longestData[4] - it.get_jenis().length(); space++) 
                System.out.print(" ");
            
            // bahan
            System.out.print(" | " + it.get_bahan());
            for (int space = 0; space < longestData[5] - it.get_bahan().length(); space++) 
                System.out.print(" ");
            
            // warna
            System.out.print(" | " + it.get_warna());
            for (int space = 0; space < longestData[6] - it.get_warna().length(); space++) 
                System.out.print(" ");
            
            // untuk
            System.out.print(" | " + it.get_untuk());
            for (int space = 0; space < longestData[7] - it.get_untuk().length(); space++) 
                System.out.print(" ");
            
            // size
            System.out.print(" | " + it.get_size());
            for (int space = 0; space < longestData[8] - it.get_size().length(); space++) 
                System.out.print(" ");
            
            // merk
            System.out.print(" | " + it.get_merk());
            for (int space = 0; space < longestData[9] - it.get_merk().length(); space++) 
                System.out.print(" ");
            
            System.out.println(" |");
        }
        
        // cetak garis bawah tabel 
        for (int i = 0; i < tableWidth; i++) {
            System.out.print("=");
        }
        System.out.println();
        
        sc.close(); // menutup scanner 
    }
}