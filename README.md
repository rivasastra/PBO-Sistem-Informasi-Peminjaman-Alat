# PBO-Sistem-Informasi-Peminjaman-Alat
Sistem Informasi Peminjaman Alat (SIPA) adalah aplikasi desktop berbasis Java yang digunakan untuk mengelola data peminjaman alat di lingkungan kampus, sekolah, atau laboratorium. Sistem ini membantu pencatatan peminjaman menjadi lebih rapi, cepat, dan terorganisir.

# Tujuan
- mempermudah proses peminjaman alat
- mengelola data alat dan stok
- mencatat transaksi peminjaman dan pengembalian
- membuat laporan peminjaman secara otomatis

# Fitur Utama
- Login multi user
- Manajemen data alat
- Transaksi peminjaman alat
- Pengembalian alat
- Monitoring stok alat
- Laporan peminjaman

# Teknologi yang digunakan
- Java (Swing/Jframe)
- NetBeans IDE
- MariaDB/MySQL
- JDBC
- XAMPP

# Struktur Database
## Tabel Utama
**1. user**
- id_user
- username
- password
- role
  
**2. alat**
- id_alat
- nama_alat
- stok
- kondisi

**3. peminjaman**
 - id_pinjam
- id_user
- id_alat
 - tanggal_pinjam
 - tanggal_kembali
 - status

  # Cara menjalankan Aplikasi
  ### 1. Setup Database
- Jalankan XAMPP/MySQL  
- Buat database `peminjaman_alat`  
- Import file SQL yang tersedia di folder `/database`

  ### 2. Setup Project
- Buka project di NetBeans  
- Tambahkan library MySQL Connector/J  
- Pastikan konfigurasi koneksi database sesuai

  ### 3. Run Aplikasi
- Jalankan `LoginFrame.java`  
- Login sesuai data user di database

# Role Pengguna
### Admin
- Kelola data alat  
- Kelola data user  
- Melihat laporan
  
  ### Petugas
- Input peminjaman  
- Input pengembalian  
- Monitoring alat

  ## Pengembangan selanjutnya
- Notifikasi pengembalian  
- Scan barcode alat  
- Versi web/mobile  
- Export laporan PDF/Excel
