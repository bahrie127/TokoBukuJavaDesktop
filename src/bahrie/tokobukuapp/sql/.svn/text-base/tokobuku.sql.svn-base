-- phpMyAdmin SQL Dump
-- version 3.3.7deb2build0.10.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 14, 2011 at 07:34 AM
-- Server version: 5.1.49
-- PHP Version: 5.3.3-1ubuntu9.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `tokobuku`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE IF NOT EXISTS `buku` (
  `id_buku` varchar(20) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `noisbn` varchar(20) NOT NULL,
  `penulis` varchar(50) NOT NULL,
  `penerbit` varchar(30) NOT NULL,
  `tahun` varchar(5) NOT NULL,
  `stok` int(11) NOT NULL,
  `harga_pokok` double(10,2) NOT NULL,
  `harga_jual` double(10,2) NOT NULL,
  `ppn` int(11) NOT NULL,
  `diskon` int(11) NOT NULL,
  PRIMARY KEY (`id_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `noisbn`, `penulis`, `penerbit`, `tahun`, `stok`, `harga_pokok`, `harga_jual`, `ppn`, `diskon`) VALUES
('122', 'Wawan', '23453', 'wawann', 'wiwin', '2006', 23, 10000.00, 14000.00, 0, 100),
('342434', 'Harus bersabar', '2354324', 'Bahri', 'bahriePress', '2011', 502, 20000.00, 24000.00, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `distributor`
--

CREATE TABLE IF NOT EXISTS `distributor` (
  `id_distributor` int(11) NOT NULL AUTO_INCREMENT,
  `nama_distributor` varchar(100) NOT NULL,
  `alamat` varchar(150) NOT NULL,
  `telepon` varchar(14) NOT NULL,
  PRIMARY KEY (`id_distributor`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `distributor`
--

INSERT INTO `distributor` (`id_distributor`, `nama_distributor`, `alamat`, `telepon`) VALUES
(1, 'Al-Amin', 'Jalan Anggrek no 34 Jakarta selatan', '087665443334'),
(2, 'Gudang Buku', 'jalan muhamid selatan 45 bandung timur', '0999444555343');

-- --------------------------------------------------------

--
-- Table structure for table `kasir`
--

CREATE TABLE IF NOT EXISTS `kasir` (
  `id_kasir` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(150) NOT NULL,
  `telepon` varchar(14) NOT NULL,
  `status` varchar(12) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `akses` varchar(6) NOT NULL,
  PRIMARY KEY (`id_kasir`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `kasir`
--

INSERT INTO `kasir` (`id_kasir`, `nama`, `alamat`, `telepon`, `status`, `username`, `password`, `akses`) VALUES
(2, 'romdani', 'magelang', '088887665554', 'Aktif', 'romdani', 'romdani', 'Kasir'),
(3, 'Bahri', 'Jepara', '085640899224', 'Aktif', 'bahrie', 'bahrie', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `pasok`
--

CREATE TABLE IF NOT EXISTS `pasok` (
  `id_pasok` int(11) NOT NULL AUTO_INCREMENT,
  `id_distributor` int(11) NOT NULL,
  `id_buku` varchar(20) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  PRIMARY KEY (`id_pasok`),
  KEY `id_distributor` (`id_distributor`,`id_buku`),
  KEY `id_buku` (`id_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `pasok`
--


-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE IF NOT EXISTS `penjualan` (
  `id_penjualan` int(11) NOT NULL AUTO_INCREMENT,
  `id_buku` varchar(20) NOT NULL,
  `id_kasir` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` double(10,2) NOT NULL,
  `tanggal` date NOT NULL,
  PRIMARY KEY (`id_penjualan`),
  KEY `id_buku` (`id_buku`),
  KEY `id_kasir` (`id_kasir`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `penjualan`
--


--
-- Constraints for dumped tables
--

--
-- Constraints for table `pasok`
--
ALTER TABLE `pasok`
  ADD CONSTRAINT `pasok_ibfk_1` FOREIGN KEY (`id_distributor`) REFERENCES `distributor` (`id_distributor`),
  ADD CONSTRAINT `pasok_ibfk_2` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id_buku`);

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_2` FOREIGN KEY (`id_kasir`) REFERENCES `kasir` (`id_kasir`),
  ADD CONSTRAINT `penjualan_ibfk_3` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id_buku`);
