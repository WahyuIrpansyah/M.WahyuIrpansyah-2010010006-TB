-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Jan 2023 pada 05.31
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tb_objekwisataklotok`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_klotok`
--

CREATE TABLE `tb_klotok` (
  `klotok` int(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jumlah_penumpang` int(10) NOT NULL,
  `tujuan_wisata` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_klotok`
--

INSERT INTO `tb_klotok` (`klotok`, `nama`, `jumlah_penumpang`, `tujuan_wisata`) VALUES
(3, 'fadli', 5, 'Wisata Kampung Hijau');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pembelian`
--

CREATE TABLE `tb_pembelian` (
  `nama` varchar(30) NOT NULL,
  `jumlah_penumpang` int(10) NOT NULL,
  `harga_tiket` int(20) NOT NULL,
  `total` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_pembelian`
--

INSERT INTO `tb_pembelian` (`nama`, `jumlah_penumpang`, `harga_tiket`, `total`) VALUES
('firman', 5, 35000, 175000),
('iwan', 10, 100000, 1000000),
('panda', 2, 10000, 20000),
('wahyu', 1, 35000, 35000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_klotok`
--
ALTER TABLE `tb_klotok`
  ADD PRIMARY KEY (`nama`);

--
-- Indeks untuk tabel `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  ADD PRIMARY KEY (`nama`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
