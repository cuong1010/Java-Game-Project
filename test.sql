-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2016 at 02:10 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `diemcao`
--

CREATE TABLE `diemcao` (
  `MATK` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MAGAME` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `DIEMCAO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `diemcao`
--

INSERT INTO `diemcao` (`MATK`, `MAGAME`, `DIEMCAO`) VALUES
('0000000000', 'GAME01', 2400),
('0000000000', 'GAME02', 48),
('0000000001', 'GAME01', 2200),
('0000000001', 'GAME02', 52),
('0000000002', 'GAME01', 1400),
('0000000002', 'GAME02', 22),
('0000000005', 'GAME01', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `game`
--

CREATE TABLE `game` (
  `MAGAME` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TENGAME` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `HUONGDAN` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `NOIDUNG` varchar(500) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `game`
--

INSERT INTO `game` (`MAGAME`, `TENGAME`, `HUONGDAN`, `NOIDUNG`) VALUES
('GAME01', 'GAME TÌM KHO BÁU', 'DÙNG CHUỘT TRÁI ĐỂ PHÁ HUỶ 1 Ơ,CHUỘT PHẢI ĐỂ ĐÁNH DẤU KHO BÁU,DÒNG ĐẦU TIÊN,CỘT ĐẦU TIÊN VÀ Ô GÓC PHẢI DƯỚI CHẮC CHẮN KO CÓ KHO BÁU NÊN BẠN CÓ THỂ PHÁ HUỶ NHỮNG Ô NÀY ĐỂ LẤY THÔNG TIN ', 'NHIỆM VỤ CỦA BẠN LÀ PHẢI ĐÁNH DẤU ĐƯỢC TẤT CẢ VỊ TRÍ KHO BÁU TRÊN BẢN ĐỒ, MỐI LẦN BẠN PHÁ HỦY 1 Ô BẠN SẼ NHẬN ĐƯỢC THÔNG TIN CÓ BAO NHIÊU KHO BÁU XUNG QUANH VÀ BỊ TRỪ ĐI 1 LƯỢNG ĐIỂM, VÀ KHI BẠN TÌM ĐƯỢC 1 KHO BÁU BẠN SẼ ĐƯỢC CÔNG THÊM ĐIỂM,TRÒ CHƠI KẾT THÚC KHI BẠN PHÁ HỦY Ô KHO BÁU HOẶC ĐÀO VÀO Ô KO CÓ KHO BÁU HOẶC KHI BẠN ÂM ĐIỂM,KHI TÌM ĐƯỢC ĐỦ KHO BÁU BẠN SẼ CHIẾN THẮNG'),
('GAME02', 'GAME TÌM HÌNH', 'NHẤN CHUỘT TRÁI ĐỂ MỞ HÌNH,KHI TÌM ĐƯỢC 1 CẶP BẠN SẼ ĐƯỢC THÊM ĐIỂM,MỖI LẦN MỞ 1 Ô SẼ BỊ TRỪ ĐIỂM', 'BẠN HÃY TÌM CÁC CẶP HÌNH GIỐNG NHAU SAO CHO K CÒN CẶP HÌNH NÀO BỊ BỎ SÓT');

-- --------------------------------------------------------

--
-- Table structure for table `lichsuchoi`
--

CREATE TABLE `lichsuchoi` (
  `STT` int(11) NOT NULL,
  `MATK` varchar(10) COLLATE utf8_bin NOT NULL,
  `MAGAME` varchar(10) COLLATE utf8_bin NOT NULL,
  `DIEM` int(11) NOT NULL,
  `NGAYCHOI` date NOT NULL,
  `TGBATDAU` time NOT NULL,
  `TGCHOI` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `lichsuchoi`
--

INSERT INTO `lichsuchoi` (`STT`, `MATK`, `MAGAME`, `DIEM`, `NGAYCHOI`, `TGBATDAU`, `TGCHOI`) VALUES
(1, '0000000000', 'GAME01', 48, '2015-05-09', '13:38:37', 8),
(3, '0000000000', 'GAME01', 1200, '2015-02-09', '13:44:09', 1),
(4, '0000000000', 'GAME01', 1400, '2015-05-09', '13:45:07', 6),
(5, '0000000000', 'GAME01', 2400, '2016-02-08', '11:21:25', 2),
(7, '0000000000', 'GAME01', 1200, '2016-05-10', '21:22:56', 3),
(8, '0000000002', 'GAME01', 1000, '2016-05-10', '21:25:09', 7),
(9, '0000000001', 'GAME02', 52, '2016-05-11', '07:21:34', 53),
(10, '0000000001', 'GAME01', 1300, '2016-05-11', '07:22:39', 25),
(11, '0000000000', 'GAME01', 2200, '2016-02-11', '08:43:10', 56),
(12, '0000000003', 'GAME02', 100, '2014-04-08', '13:00:00', 58),
(13, '0000000001', 'GAME01', 1200, '2016-01-20', '08:23:39', 15),
(14, '0000000005', 'GAME01', 1200, '2016-05-12', '09:27:13', 1),
(15, '0000000000', 'GAME01', 1100, '2016-05-12', '09:46:29', 4),
(16, '0000000000', 'GAME01', 1200, '2016-05-12', '09:46:38', 2),
(17, '0000000000', 'GAME01', 1400, '2016-05-12', '09:46:42', 5),
(18, '0000000001', 'GAME01', 500, '2016-05-12', '10:55:20', 29),
(19, '0000000002', 'GAME01', 900, '2016-05-12', '13:07:17', 15),
(20, '0000000002', 'GAME01', 800, '2016-05-12', '13:07:46', 16),
(21, '0000000002', 'GAME01', 900, '2016-05-12', '13:08:05', 27),
(22, '0000000002', 'GAME01', 1400, '2016-05-12', '13:09:31', 98),
(23, '0000000002', 'GAME02', 22, '2016-05-12', '13:13:24', 81);

-- --------------------------------------------------------

--
-- Table structure for table `nguoidung`
--

CREATE TABLE `nguoidung` (
  `MATK` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `BIDANH` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `TENNGDUNG` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `SODT` varchar(13) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `EMAIL` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `PHAI` varchar(4) COLLATE utf8_unicode_ci NOT NULL,
  `NGAYSINH` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nguoidung`
--

INSERT INTO `nguoidung` (`MATK`, `BIDANH`, `TENNGDUNG`, `SODT`, `EMAIL`, `PHAI`, `NGAYSINH`) VALUES
('0000000000', 'Admin', 'Nguyễn Mạnh Cường', '0937927161', 'abc@gmail.com', 'NAM', '1996-10-10'),
('0000000001', 'Alt', 'ewqe', '123', '213', 'NAM', '2000-10-14'),
('0000000005', 'Cuong', 'Nguyễn Mạnh Cường', '0937927161', 'cawd', 'NAM', '1996-10-10'),
('0000000009', 'Demo123', 'Demo', '123456', 'Demo@gamil.com', 'NAM', '2012-02-02'),
('0000000002', 'Dung', '23123', '1', '123', 'NU', '1996-12-10'),
('0000000003', 'test3', '3wda', '123123', '2321', 'NAM', '1980-12-12'),
('0000000004', 'test4', '2312', '21', '123', 'NU', '1987-12-21'),
('0000000006', 'test6', '5wda', '2132', 'dwad', 'NAM', '1998-01-12'),
('0000000011', 'vanne', 'van', '0954414111', 'diego@gmail.com', 'NAM', '1996-10-27');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MATK` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `TENTK` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `MATKHAU` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `MATKHAU2` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `TRANGTHAI` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `NGDK` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`MATK`, `TENTK`, `MATKHAU`, `MATKHAU2`, `TRANGTHAI`, `NGDK`) VALUES
('0000000009', 'Demo', '123456', '654321', 'KHONG KHOA', '2016-05-05'),
('0000000007', 'Test1', '1', '11', 'KHONG KHOA', '2016-03-14'),
('0000000000', 'admin', 'admin', 'admin', 'KHONG KHOA', '2015-10-14'),
('0000000012', 'dwa', '1', '1', 'KHONG KHOA', '2016-05-12'),
('0000000008', 'test á nha', '2', '11', 'KHONG KHOA', '2016-03-14'),
('0000000010', 'test1', '1', '111111', 'KHONG KHOA', '2016-03-03'),
('0000000002', 'test2', '2', '22', 'KHONG KHOA', '2016-03-24'),
('0000000003', 'test3', '3', '33', 'KHOA', '2016-07-10'),
('0000000004', 'test4', '4', '34', 'KHOA', '2016-04-14'),
('0000000005', 'test5', '5', '5', 'KHOA', '1996-10-10'),
('0000000006', 'test6', '6', '111111', 'KHONG KHOA', '2016-03-03'),
('0000000001', 'té đây', '1', '12', 'KHONG KHOA', '2016-03-14'),
('0000000011', 'vanne', 'ZlatanVanne1996', '1996', 'KHOA', '2016-05-12');

-- --------------------------------------------------------

--
-- Table structure for table `thongke`
--

CREATE TABLE `thongke` (
  `THOIDIEM` datetime NOT NULL,
  `MATK` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MAGAME` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TONGDIEM` int(11) NOT NULL,
  `TONGTG` int(11) NOT NULL,
  `TONGSL` int(11) NOT NULL,
  `TGIAN1` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TGIAN2` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `thongke`
--

INSERT INTO `thongke` (`THOIDIEM`, `MATK`, `MAGAME`, `TONGDIEM`, `TONGTG`, `TONGSL`, `TGIAN1`, `TGIAN2`) VALUES
('2016-05-11 23:06:46', '0000000003', 'GAME01', 0, 0, 0, '2015-01-01', '2016-01-01'),
('2016-05-11 23:06:50', '0000000003', 'GAME02', 0, 0, 0, '2015-01-01', '2016-01-01'),
('2016-05-11 23:07:00', '0000000003', 'GAME02', 0, 0, 0, '2015-01-01', '2016-12-01'),
('2016-05-11 23:08:07', '0000000000', 'GAME01', 8448, 76, 6, '2015-01', '2016-12'),
('2016-05-11 23:08:18', '0000000000', 'GAME02', 0, 0, 0, '2015-02', '2016-02'),
('2016-05-11 23:08:26', '0000000000', 'GAME01', 4600, 58, 2, '2016-02', '2016-02'),
('2016-05-11 23:09:36', '0000000002', 'GAME01', 1000, 7, 1, '2016-02-01', '2016-02-01'),
('2016-05-11 23:09:41', '0000000002', 'GAME01', 1000, 7, 1, '2015-02-01', '2016-02-01'),
('2016-05-11 23:09:45', '0000000002', 'GAME02', 0, 0, 0, '2015-02-01', '2016-02-01'),
('2016-05-11 23:10:49', '0000000001', 'GAME01', 2500, 40, 2, '2015-02', '2016-12'),
('2016-05-11 23:10:59', '0000000001', 'GAME01', 1300, 25, 1, '2016-02', '2016-12'),
('2016-05-12 10:59:48', '0000000000', 'GAME01', 9500, 72, 6, '2016-01-01', '2016-05-19'),
('2016-05-12 11:01:18', '0000000000', 'GAME01', 12148, 87, 9, '2014-01-01', '2016-05-19'),
('2016-05-12 11:01:26', '0000000000', 'GAME01', 12148, 87, 9, '2014-01-01', '2017-05-19');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diemcao`
--
ALTER TABLE `diemcao`
  ADD PRIMARY KEY (`MATK`,`MAGAME`);

--
-- Indexes for table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`MAGAME`);

--
-- Indexes for table `lichsuchoi`
--
ALTER TABLE `lichsuchoi`
  ADD PRIMARY KEY (`STT`);

--
-- Indexes for table `nguoidung`
--
ALTER TABLE `nguoidung`
  ADD PRIMARY KEY (`BIDANH`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`TENTK`);

--
-- Indexes for table `thongke`
--
ALTER TABLE `thongke`
  ADD PRIMARY KEY (`THOIDIEM`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
