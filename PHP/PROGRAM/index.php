<!-- Saya Nuansa Bening Aura Jelita dengan NIM 2301410 mengerjakan Tugas Praktikum 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya 
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php
// mengimpor file Baju.php agar kelas Baju bisa digunakan dalam file ini
require_once ('Baju.php');

$daftar_produk = array();  // daftar produk untuk menyimpan data produk 

// menambahkan 5 objek baru ke dalam daftar_produk
// objek 1
$produk1 = new Baju();
$produk1->set_id("P001");
$produk1->set_nama_produk("Baju Kucing Gemay");
$produk1->set_harga_produk(75000);
$produk1->set_stok_produk(20);
$produk1->set_foto_produk("kucing_gemay.jpeg");
$produk1->set_jenis("Baju");
$produk1->set_bahan("Katun");
$produk1->set_warna("Ungu");
$produk1->set_untuk("Kucing");
$produk1->set_size("S");
$produk1->set_merk("Polo Shirt");
$daftar_produk[] = $produk1;

//objek 2
$produk2 = new Baju();
$produk2->set_id("P002");
$produk2->set_nama_produk("Sweater Anget");
$produk2->set_harga_produk(100000);
$produk2->set_stok_produk(15);
$produk2->set_foto_produk("sweater_anget.jpeg");
$produk2->set_jenis("Sweater");
$produk2->set_bahan("Wol");
$produk2->set_warna("Biru");
$produk2->set_untuk("Anjing");
$produk2->set_size("M");
$produk2->set_merk("Ralph Lauren");
$daftar_produk[] = $produk2;

// objek 3
$produk3 = new Baju();
$produk3->set_id("P003");
$produk3->set_nama_produk("Hoodie Dino");
$produk3->set_harga_produk(120000);
$produk3->set_stok_produk(10);
$produk3->set_foto_produk("hoodie_dino.jpeg");
$produk3->set_jenis("Hoodie");
$produk3->set_bahan("Polyester");
$produk3->set_warna("Hijau");
$produk3->set_untuk("Kucing");
$produk3->set_size("L");
$produk3->set_merk("SHEIN");
$daftar_produk[] = $produk3;

// objek 4
$produk4 = new Baju();
$produk4->set_id("P004");
$produk4->set_nama_produk("Jaket Gelembung");
$produk4->set_harga_produk(150000);
$produk4->set_stok_produk(5);
$produk4->set_foto_produk("jaket_gelembung.jpeg");
$produk4->set_jenis("Jaket");
$produk4->set_bahan("Polyester");
$produk4->set_warna("Hijau");
$produk4->set_untuk("Anjing");
$produk4->set_size("L");
$produk4->set_merk("Spark Paws");
$daftar_produk[] = $produk4;

// objek 5
$produk5 = new Baju();
$produk5->set_id("P005");
$produk5->set_nama_produk("Sweater Sapi");
$produk5->set_harga_produk(100000);
$produk5->set_stok_produk(15);
$produk5->set_foto_produk("sweater_sapi.jpeg");
$produk5->set_jenis("Sweater");
$produk5->set_bahan("Wol");
$produk5->set_warna("Biru");
$produk5->set_untuk("Kucing");
$produk5->set_size("S");
$produk5->set_merk("MeowTee");
$daftar_produk[] = $produk5;
?>

<!DOCTYPE html>
<html lang="id">
<head>
    <!-- GAYA TAMPILAN UNTUK HALAMAN -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PetShop - Daftar Produk</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            padding: 8px;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
            font-weight: bold;
            text-align: center;
        }
        .product-image {
            width: 80px;
            height: 80px;
            object-fit: cover;
            display: block;
            margin: 0 auto;
        }
        .img-cell {
            text-align: center;
        }
        .center-cell {
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>PetShop - Daftar Produk</h1>
    <!-- MENAMPILKAN DAFTAR PRODUK -->
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nama Produk</th>
                <th>Foto</th>
                <th>Harga (Rp)</th>
                <th>Stok</th>
                <th>Jenis</th>
                <th>Bahan</th>
                <th>Warna</th>
                <th>Untuk</th>
                <th>Size</th>
                <th>Merk</th>
            </tr>
        </thead>
        <tbody>
            <!-- MENAMPILKAN DATA PRODUK UNTUK SETIAP KOLOM -->
            <?php foreach ($daftar_produk as $produk): ?>
            <tr>
                <td class="center-cell"><?php echo $produk->get_id(); ?></td>
                <td class="center-cell"><?php echo $produk->get_nama_produk(); ?></td>
                <td class="img-cell"><img src="<?php echo $produk->get_foto_produk(); ?>" alt="<?php echo $produk->get_nama_produk(); ?>" class="product-image"></td>
                <td class="center-cell"><?php echo number_format($produk->get_harga_produk(), 0, ',', '.'); ?></td>
                <td class="center-cell"><?php echo $produk->get_stok_produk(); ?></td>
                <td class="center-cell"><?php echo $produk->get_jenis(); ?></td>
                <td class="center-cell"><?php echo $produk->get_bahan(); ?></td>
                <td class="center-cell"><?php echo $produk->get_warna(); ?></td>
                <td class="center-cell"><?php echo $produk->get_untuk(); ?></td>
                <td class="center-cell"><?php echo $produk->get_size(); ?></td>
                <td class="center-cell"><?php echo $produk->get_merk(); ?></td>
            </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</body>
</html>