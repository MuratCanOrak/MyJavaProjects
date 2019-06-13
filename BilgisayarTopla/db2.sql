-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anakart`
--

DROP TABLE IF EXISTS `anakart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anakart` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaID` int(11) NOT NULL,
  `Model` varchar(100) DEFAULT NULL,
  `Ozellik` text,
  `Fiyat` double DEFAULT NULL,
  `SoketTipi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anakart`
--

LOCK TABLES `anakart` WRITE;
/*!40000 ALTER TABLE `anakart` DISABLE KEYS */;
INSERT INTO `anakart` VALUES (1,4,'MSI H81M-P33 Intel H81','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	Intel H81;COM Port	Yok;Dahili Ekran Kartı Var;DisplayPort Yok;DVI Çıkışı Var;HDMI Çıkışı Yok;İşlemci Soket Tipi	1150 Pin;M.2 Slotu	Yok;Optik Ses Çıkışı	Yok;Overclock (Hız Aşırtma) Yok;Paralel Port Yok;PCI Express Hızı PCI Express 2.0;PCI Slot Yok;PCI-E x1 Slot	1 Adet;PCI-E x16 Slot 1 Adet;PS/2 Girişi	Var;RAM Frekansı 1600 MHz;Ram Kapasitesi 16 GB;Ram Slotu 2 Adet;Ram Tipi	DDR3;SATA 2 2 Adet;SATA 3	2 Adet;',230.89,'1150'),(2,4,'MSI A68HM-E33 V2 Amd A68H','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	AMD A68;COM Port	Yok;Dahili Ekran Kartı Var;DisplayPort Yok;DVI Çıkışı Yok;HDMI Çıkışı Var;İşlemci Soket Tipi	Soket FM2+;M.2 Slotu Yok;Optik Ses Çıkışı Yok;Overclock (Hız Aşırtma) Var;Paralel Port Yok;PCI Express Hızı	PCI Express 3.0;PCI Slot 1 Adet;PCI-E x1 Slot 1 Adet;PCI-E x16 Slot	1 Adet;PS/2 Girişi	Var;RAM Frekansı 1866 MHz;Ram Kapasitesi 32 GB;Ram Slotu 2 Adet;Ram Tipi	DDR3;SATA 2 Yok;SATA 3 4 Adet;',253,'FM2+'),(3,4,'MSI H81M-E33 Intel H81','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	Intel H81;COM Port	Yok;Dahili Ekran Kartı Yok;DisplayPort Yok;DVI Çıkışı Yok;HDMI Çıkışı Var;İşlemci Soket Tipi	1150 Pin;M.2 Slotu	Yok;Optik Ses Çıkışı	Yok;Overclock (Hız Aşırtma) Var;Paralel Port Yok;PCI Express Hızı PCI Express 2.0;PCI Slot Yok;PCI-E x1 Slot	1 Adet;PCI-E x16 Slot 1 Adet;PS/2 Girişi	Var;RAM Frekansı	1600 MHz;Ram Kapasitesi 32 GB;Ram Slotu 2 Adet;Ram Tipi  DDR3;SATA 2 2 Adet;SATA 3	2 Adet',259.35,'1150'),(4,3,'Asus A68Hm-K','Uyumlu İşlemciler Amd Richland A10  Amd Richland A8;PCI Express x1 Slot Sayıs  1 ;İşlemci Üreticisi Amd ;PCI Express x4 Slot Sayı Yok;Ram Hızı 2400 MHz (OC) ;',255.45,'FM2+'),(5,3,'Asus H81M-K','PCI Express x1 Slot Sayıs  2 ;Tümleşik Görüntü Kartı  Var ;İşlemci Üreticisi Intel;PCI Express x16 Slot Sayı 1 ;PCI Slot Sayısı Yok ;Maksimum Bellek 16 GB ;Yapı Standartı mATX ;PCI Express x4 Slot Sayı Yok;Sabit Diskler :2 x SATA II  2 x SATA III ( 6Gb/s );Ram Hızı 1333 MHz1600 MHz ',269.25,'1150'),(6,3,'Asus H81M-D Intel H81','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	Intel H81;COM Port	Yok;Dahili Ekran Kartı Var;DisplayPort Yok;DVI Çıkışı Var;HDMI Çıkışı Yok;İşlemci Soket Tipi	1150 Pin;M.2 Slotu	Yok;Optik Ses Çıkışı	Yok;Overclock (Hız Aşırtma)	Yok;Paralel Port Var;PCI Express Hızı PCI Express 2.0;PCI Slot Yok;PCI-E x1 Slot 2 Adet;PCI-E x16 Slot 1 Adet;PS/2 Girişi Var;RAM Frekansı	1600 MHz;Ram Kapasitesi 16 GB;Ram Slotu 2 Adet;Ram Tipi	DDR3;SATA 2 2 Adet;SATA 3	2 Adet;',339.2,'1150'),(7,4,'MSI A320M PRO-VD/S','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	AMD A320;COM Port Yok;Dahili Ekran Kartı Var;DisplayPort	Yok;DVI Çıkışı Var;HDMI Çıkışı	Yok;İşlemci Soket Tipi Soket AM4;M.2 Slotu Yok;Optik Ses Çıkışı Yok;Overclock (Hız Aşırtma) Var;Paralel Port Yok;PCI Express Hızı	PCI Express 3.0;PCI Slot Yok;PCI-E x1 Slo 2 Adet;PCI-E x16 Slot 1 Adet;PS/2 Girişi Var;RAM Frekansı 2667 MHz;Ram Kapasitesi 32 GB;Ram Slotu 2 Adet;Ram Tipi DDR4;SATA 2 Yok;SATA 3	4 Adet;',345,'AM4'),(8,3,'Asus H110M-D D3','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	Intel H110;COM Port Yok;Dahili Ekran Kartı Var;DisplayPort	Yok;DVI Çıkışı Var;HDMI Çıkışı	Yok;İşlemci Soket Tipi 1151 Pin;M.2 Slotu Yok;Overclock (Hız Aşırtma)	Var;Paralel Port Yok;PCI Express Hızı PCI Express 3.0;PCI Slot Yok;PCI-E x1 Slot 2 Adet;PCI-E x16 Slot 1 Adet;PS/2 Girişi Var;RAM Frekansı	1600 MHz;Ram Kapasitesi 32 GB;Ram Slotu 2 Adet;Ram Tipi	DDR4;SATA 2 Yok;SATA 3 4 Adet;',375.5,'1151'),(9,3,'Asus Prime H310M-K','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	Intel H310;COM Port Yok;Dahili Ekran Kartı Yok;DisplayPort	Yok;DVI Çıkışı Var;HDMI Çıkışı	Yok;İşlemci Soket Tipi 1151 Pin;M.2 Slotu Yok;Overclock (Hız Aşırtma)	Yok;Paralel Port Yok;PCI Express Hızı PCI Express 3.0;PCI Slot Yok;PCI-E x1 Slot 2 Adet;PCI-E x16 Slot 1 Adet;PS/2 Girişi Yok;RAM Frekansı	2666 MHz;Ram Kapasitesi 32 GB;Ram Slotu 2 Adet;Ram Tipi	DDR4;SATA 2 Yok;SATA 3 4 Adet;',375.75,'1151'),(10,4,'MSI AMD AM4 B350M','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	AMD B350;COM Port Yok;Dahili Ekran Kartı Var;DisplayPort	Yok;DVI Çıkışı Var;HDMI Çıkışı	Var;İşlemci Soket Tipi Soket AM4;M.2 Slotu 1 Adet;Optik Ses Çıkışı Yok;Overclock (Hız Aşırtma) Var;Paralel Port	Yok;PCI Express Hızı PCI Express 3.0;PCI Slot Yok;PCI-E x1 Slot 2 Adet;PCI-E x16 Slot 1 Adet;PS/2 Girişi Var;RAM Frekansı 2400 MHz;Ram Kapasitesi	64 GB;Ram Slotu 4 Adet;Ram Tipi DDR4;SATA 2 Yok;SATA 3	4 Adet;',529.8,'AM4'),(11,4,'MSI B350 TOMAHAWK ARCTIC','Anakart Boyutu ATX;Bluetooth Yok;Chipset AMD B350;COM Port Yok;Dahili Ekran Kartı Var;DisplayPort Yok;DVI Çıkışı Var;HDMI Çıkışı Var;İşlemci Soket Tipi Soket AM4;M.2 Slotu 1 Adet;Optik Ses Çıkışı Yok;Overclock (Hız Aşırtma) Var;Paralel Port  Yok;PCI Express Hızı PCI Express 3.0;PCI Slot	2 Adet;PCI-E x1 Slot 2 Adet;PCI-E x16 Slot 2 Adet;PS/2 Girişi Var;RAM Frekansı	2400 MHz;Ram Kapasitesi 64 GB;Ram Slotu 4 Adet;Ram Tipi	DDR4;SATA 2 Yok;SATA 3 4 Adet;',628.45,'AM4'),(12,4,'MSI H370M Bazooka','Anakart Boyutu Micro ATX;Bluetooth Yok;Chipset	Intel H370;COM Port Yok;Dahili Ekran Kartı Var;DisplayPort	Yok;DVI Çıkışı Var;HDMI Çıkışı	Var;İşlemci Soket Tipi 1151 Pin;M.2 Slotu 1 Adet;Overclock (Hız Aşırtma) Yok;Paralel Port	Yok;PCI Express Hızı PCI Express 3.0;PCI Slot Yok;PCI-E x1 Slot 2 Adet;PCI-E x16 Slot 1 Adet;PS/2 Girişi Yok;RAM Frekansı 2666 MHz;Ram Kapasitesi	64 GB;Ram Slotu 2 Adet;Ram Tipi DDR4;SATA 2	Yok;SATA 3 Yok;',672.4,'1151'),(13,4,'MSI x299 RAIDER INTEL X299','4500MHZ(OC) DDR4 Socket 2066 ATX Anakart',1300,'2066'),(14,3,'Asus Prime X399-A AMD X399','Soket TR4 Ryzen DDR4 3200(O.C.) MHz Anakart',1760,'TR4'),(15,4,'MSI X399 SLI PLUS','DDR4 3600(oc) TR4 USB3.1 ATX',1470,'TR4'),(16,3,'Asus M4N68T-M V2','Nvidia Geforce 7025/nForce 630a DDR3 1800(O.C.) Soket AM3 Anakart',380,'AM3+'),(17,3,'Asus M4A79XTD Evo AMD 790X','DDR3 1800MHz(O.C.) Soket AM3 Anakart',790,'AM3+'),(18,1,'İNTEL X58','Marka Intel Uyumlu Kasa TipiAtx Soket Yapısı Soket 1366 Anakart Yapısı Atx',520,'1366');
/*!40000 ALTER TABLE `anakart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ekrankarti`
--

DROP TABLE IF EXISTS `ekrankarti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ekrankarti` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaID` int(11) NOT NULL,
  `Model` varchar(100) DEFAULT NULL,
  `Ozellik` text,
  `Fiyat` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ekrankarti`
--

LOCK TABLES `ekrankarti` WRITE;
/*!40000 ALTER TABLE `ekrankarti` DISABLE KEYS */;
INSERT INTO `ekrankarti` VALUES (1,4,'MSI AMD Radeon R5 230','3D Desteği Yok; Bağlantı Analog (D-Sub), DVI-D, HDMI;Bellek Hızı 1000 MHz;Bellek Tipi DDR3;Bit Değeri 64 Bit;Chip Seti	AMD;Çekirdek Hızı	625 MHz;Grafik Bellek 1 GB;Grafik İşlemcisi AMD Radeon R5 230;Overclock (Hız Aşırtma) Yok;Slot Tipi PCI-Express 2.0;',178.5),(2,3,'Asus Amd Radeon R5 230','3D Desteği Yok;Bağlantı Analog (D-Sub), DVI-D, HDMI;Bellek Hızı 1200 MHz;Bellek Tipi DDR3;Bit Değeri 64 Bit;Chip Seti AMD;Çekirdek Hızı 625 MHz;Grafik Bellek 1 GB;Grafik İşlemcisi	AMD Radeon R5 230;Overclock (Hız Aşırtma) Yok;Slot Tipi	PCI-Express 2.1;',230),(3,4,'MSI NVIDIA GeForce GT 710','3D Desteği Yok;Bağlantı Analog (D-Sub), DVI-D, HDMI;Bellek Hızı 1600 MHz;Bellek Tipi DDR3;Bit Değeri 64 Bit;Chip Seti  NVIDIA;Çekirdek Hızı	954 MHz;Grafik Bellek 1 GB;Grafik İşlemcisi NVIDIA GeForce GT710;Overclock (Hız Aşırtma) Yok;Slot Tipi PCI-Express 2.0',248),(4,3,'Asus AMD Radeon R5 230','3D Desteği Var;Bağlantı Analog (D-Sub), DVI-D, HDMI;Bellek Hızı 1200 MHz;Bellek Tipi DDR3;Bit Değeri 64 Bit;Chip Seti  AMD;Çekirdek Hızı 625 MHz;Grafik Bellek	2 GB;Grafik İşlemcisi AMD Radeon R5 230;Overclock (Hız Aşırtma) Yok;Slot Tipi	PCI-Express 2.1;',281.03),(5,3,'Asus 710-2-SL Nvidia Geforce GT710','3D Desteği Yok;Bağlantı Analog (D-Sub), DVI-D, HDMI;Bellek Hızı 1800 MHz;Bellek Tipi DDR3;Bit Değeri 64 Bit;Chip Seti	NVIDIA;Çekirdek Hızı 954 MHz;Grafik Bellek 2 GB;Grafik İşlemcisi NVIDIA GeForce GT710;Overclock (Hız Aşırtma) Var;Slot Tipi PCI-Express 2.0',290),(6,2,'AMD FirePro W4100','3D Desteği Var;Bağlantı Mini Display;Bellek Hızı 5500 MHz;Bellek Tipi DDR5;Bit Değeri 128 Bit;Chip Seti AMD;Çekirdek Hızı	630 MHz;Grafik Bellek 2 GB;Grafik İşlemcisi AMD FirePro W4100;Overclock (Hız Aşırtma) Yok;Slot Tipi	PCI-Express 3.0',1099),(7,4,'MSI NVIDIA GeForce','3D Desteği Yok;Bağlantı Display, DVI-D, HDMI;Bellek Hızı 7000 MHz;Bellek Tipi GDDR5;Bit Değeri 128 Bit;Chip Seti NVIDIA GeForce GTX;Çekirdek Hızı 1290 MHz;Grafik Bellek 4 GB;Grafik İşlemcisi NVIDIA GeForce GTX1050 Ti;Overclock (Hız Aşırtma) Var;Slot Tipi PCI-Express 3.0',1117.07),(8,4,'MSI NVIDIA GeForce GTX','3D Desteği Yok;Bağlantı Display, DVI-D, HDMI;Bellek Hızı 7008 MHz;Bellek Tipi DDR5X;Bit Değeri 128 Bit;Chip Seti NVIDIA GeForce GTX;Çekirdek Hızı 1430 MHz;Grafik Bellek 4 GB;Grafik İşlemcisi NVIDIA GeForce GTX1050 Ti;Overclock (Hız Aşırtma) Var;Slot Tipi PCI-Express 3.0',1249.5),(9,2,'AMD FirePro','3D Desteği Var;Bağlantı Mini Display;Bellek Hızı 6000 MHz;Bellek Tipi GDDR5;Bit Değeri 128 Bit;Chip Seti AMD;Çekirdek Hızı 930 MHz;Grafik Bellek 4 GB;Grafik İşlemcisi AMD FirePro W4300;Overclock (Hız Aşırtma)	Yok;Slot Tipi PCI-Express 3.0',1499),(10,4,'MSI AMD Radeon','3D Desteği Var;Bağlantı Display, DVI, HDMI;Bellek Hızı 7000 MHz;Bellek Tipi GDDR5;Bit Değeri 256 Bit;Chip Seti	AMD;Çekirdek Hızı	1266 MHz;Grafik Bellek 4 GB;Grafik İşlemcisi AMD Radeon RX 570;Overclock (Hız Aşırtma)	Var;Slot Tipi PCI-Express 3.0;',1779),(11,4,'MSI NVIDIA GeForce GTX 1050 AERO ITX 2G OCV1','2GB 128 bit GDDR5 DX(12) PCI-E 3.0 Ekran Kartı (GTX 1050 AERO ITX 2G OCV1 )',790),(12,4,'MSI NVIDIA GeForce GTX 1060 GAMING X','3G 3GB 192 bit GDDR5 DX(12) PCI-E 3.0 Ekran Kartı (GTX 1060 GAMING X 3G)',1610),(13,4,'MSI NVIDIA GeForce GTX 1070 ARMOR ',' 8G OC 8GB 256 bit GDDR5 DX(12) PCI-E 3.0 Ekran Kartı (GTX 1070 ARMOR 8G OC)',2800),(14,3,'Asus ROG Strix GTX1080Ti','11GB 128Bit DDR5 (DX12) PCI-E 3.0 Ekran Kartı (GTX1080Ti-11GB)',5600),(15,4,'MSI NVIDIA GeForce GTX 1080 GAMING X','8G 8GB 256 bit GDDR5X DX(12) PCI-E 3.0 Ekran Kartı (GTX 1080 GAMING X 8G)',3534);
/*!40000 ALTER TABLE `ekrankarti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `islemci`
--

DROP TABLE IF EXISTS `islemci`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `islemci` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaID` int(11) NOT NULL,
  `Model` varchar(100) DEFAULT NULL,
  `Ozellik` varchar(500) DEFAULT NULL,
  `Fiyat` double DEFAULT NULL,
  `SoketTipi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `islemci`
--

LOCK TABLES `islemci` WRITE;
/*!40000 ALTER TABLE `islemci` DISABLE KEYS */;
INSERT INTO `islemci` VALUES (42,1,'Intel Celeron G3930','İşlemci Hızı:	2,9 GHz,Soket Yapısı:1151 Pin',219,'1151'),(44,1,'Intel Skylake Pentium G4400 ','İşlemci Hızı 3,3 GHz;Soket Yapısı 1151 Pin',247.9,'1151'),(45,1,'Intel Boxed Pentium G4560','İşlemci Hızı 3,5 GHz;Soket Yapısı 1151 Pin',279,'1151'),(46,1,'Intel Kaby Lake Pentium G4600','İşlemci Hızı 3,6 GHz;Soket Yapısı 1151 Pin',379,'1151'),(47,1,'Intel Quadcore i7 960','İşlemci Hız 3,2 GHz;Soket Yapısı 1366 Pin',399,'1366'),(48,1,'Intel Pentium G5400','İşlemci Hızı 3,7 GHz;Soket Yapısı 1151 Pin',423.8,'1151'),(49,1,'Intel Pentium G3260','İşlemci Hızı 3,3 GHz;Soket Yapısı 1150 Pin',497,'1150'),(50,1,'Intel Pentium Gold G5500','İşlemci Hızı 3,8 GHz;Soket Yapısı 1151 Pin',515.29,'1151'),(51,1,'Intel Boxed Pentium G4520','İşlemci Hızı 3,6 GHz;Soket Yapısı 1151 Pin',580.91,'1151'),(52,1,'Intel Core i3-6100T','İşlemci Hızı 3,2 GHz;Soket Yapısı 1151 Pin',589,'1151'),(53,2,'Amd A6-6400K','İşlemci Hızı 3,9 GHz;Soket Yapısı FM2',238.96,'FM2+'),(54,2,'Amd A6-9500','İşlemci Hızı 3,5 GHz;Soket Yapısı AM4',303.85,'AM4'),(55,2,'AMD Athlon X4 880K 4.0','İşlemci Hızı 4 GHz;Soket Yapısı	FM2+',345.43,'FM2+'),(56,2,'Amd Athlon X4 950','İşlemci Hızı 3,5 GHz;Soket Yapısı AM4',349,'AM4'),(57,2,'Amd FX-4300','İşlemci Hızı 3,8 GHz;Soket Yapısı AM3+',362.76,'AM3+'),(58,2,'Amd FX-4320','İşlemci Hızı 4 GHz;Soket Yapısı	AM3+',362.76,'AM3+'),(59,2,'AMD A8 7650K X4','İşlemci Hızı 3,3 GHz;Soket Yapısı FM2+',377.09,'FM2+'),(60,2,'AMD A8-9600','İşlemci Hızı 3,1 GHz;Soket Yapısı AM4',388.04,'AM4'),(61,2,'Amd FX-6100 ','İşlemci Hızı 3,3 GHz;Soket Yapısı AM3+',427.04,'AM3+'),(62,2,'Amd FX-6300','İşlemci Hızı 3,5 GHz;Soket Yapısı AM3+',489,'AM3+'),(63,2,'AMD A10-9700','İşlemci Hızı 3,5 GHz;Soket Yapısı AM4',500.9,'AM4'),(64,2,'AMD Ryzen 5 2600','İşlemci Hızı 3,4 GHz;Soket Yapısı AM4',1175.55,'AM4'),(65,1,'Intel Core i5 4460','İşlemci Hızı 3,2 GHz;Soket Yapısı 1150 Pin',1199,'1150'),(66,1,'Intel Skylake Core i5 6600','İşlemci Hızı 3,3 GHz;Soket Yapısı 1151 Pin',1246.56,'1151'),(67,1,'Intel Kaby Lake Core i5 7600','İşlemci Hızı 3,5 GHz; Soket Yapısı 1151 Pin',1295,'1151'),(68,1,'Intel İ5-6600K','İşlemci Hızı 3,5 GHz;Soket Yapısı 1151 Pin',1303.95,'1151'),(69,2,'AMD Ryzen 5 2600X','İşlemci Hızı 3,6 GHz;Soket Yapısı AM4',1402.04,'AM4'),(70,1,'Intel Kaby Lake Core i5 7600K','İşlemci Hızı 3,8 GHz;Soket Yapısı 1151 Pin',1408.04,'1151'),(71,2,'AMD Ryzen 7 1700','İşlemci Hızı 3 GHz;Soket Yapısı	AM4',1548,'AM4'),(72,1,'Intel Skylake Core İ7 6700','İşlemci Hızı 3,4 GHz;Soket Yapısı 1151 Pin',1670,'1151'),(73,1,'Intel Kaby Lake Core i7 7700','İşlemci Hızı 3,6 GHz;Soket Yapısı 1151 Pin',1719,'1151'),(74,2,'AMD Ryzen 7 1800X ','İşlemci Hızı 3,6 GHz;Soket Yapısı AM4',1773.05,'AM4'),(75,1,'Intel Core i7-8700','İşlemci Hızı 3,2 GHz;Soket Yapısı 1151 Pin',1839,'1151'),(76,2,'AMD Ryzen 7 2700X','İşlemci Hızı 3,7 GHz;Soket Yapısı AM4',2067.16,'AM4'),(77,2,'AMD Ryzen Threadripper 1900X 8 Core','İşlemci Hızı 3,8 GHz;Soket Yapısı TR4',2818.52,'TR4'),(78,2,'AMD Ryzen 1920X Threadripper','İşlemci Hızı 3,4 GHz;Soket Yapısı TR4',4642,'TR4'),(79,2,'AMD Ryzen 1950X Threadripper','İşlemci Hızı 3,4 GHz;Soket Yapısı TR4',5437,'TR4'),(80,1,'Intel i9-7900X','İşlemci Hızı 3,3 GHz;Soket Yapısı 2066',6155.03,'2066'),(81,1,'Intel i7-7700 ',' 3.6GHz 8MB Cache',1545,'1151');
/*!40000 ALTER TABLE `islemci` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kasa`
--

DROP TABLE IF EXISTS `kasa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kasa` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaID` int(11) NOT NULL,
  `Model` varchar(100) DEFAULT NULL,
  `Fiyat` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kasa`
--

LOCK TABLES `kasa` WRITE;
/*!40000 ALTER TABLE `kasa` DISABLE KEYS */;
INSERT INTO `kasa` VALUES (1,18,'Everest 329R',129.55),(2,16,'Aerocool V2X',149),(3,18,'Everest 707BR Cavalier',178.44),(4,17,'Dark F40 2x',199),(5,17,'Dark Shadow 3x ',209),(6,16,'Aerocool Aero 800',319.52),(7,16,'Aerocool Quartz Blue',329.9),(8,18,'Everest Rampage STORM ',469.23),(9,16,'Aerocool Quartz RGB ',469.9),(10,16,'Aerocool P7-C1 Pro',749.9);
/*!40000 ALTER TABLE `kasa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marka`
--

DROP TABLE IF EXISTS `marka`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marka` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaAdi` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marka`
--

LOCK TABLES `marka` WRITE;
/*!40000 ALTER TABLE `marka` DISABLE KEYS */;
INSERT INTO `marka` VALUES (1,'İntel'),(2,'AMD'),(3,'Asus'),(4,'Msi'),(5,'Lenovo'),(6,'Casper'),(7,'Hp'),(8,'Monster'),(9,'Toshiba'),(10,'Acer'),(11,'Hometech'),(12,'Apple'),(13,'Dell'),(14,'Samsung'),(15,'Exper'),(16,'Aerocool'),(17,'Dark'),(18,'Everest'),(19,'Corsair');
/*!40000 ALTER TABLE `marka` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `powersupply`
--

DROP TABLE IF EXISTS `powersupply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `powersupply` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaID` int(11) NOT NULL,
  `Model` varchar(100) DEFAULT NULL,
  `Fiyat` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `powersupply`
--

LOCK TABLES `powersupply` WRITE;
/*!40000 ALTER TABLE `powersupply` DISABLE KEYS */;
INSERT INTO `powersupply` VALUES (1,18,'Everest Everest Eps-1400A',56.9),(2,18,'Everest Eps-4800B',72.5),(3,18,'Everest 200W',77.74),(4,18,'Everest Eps-1700A',99.9),(5,18,'Everest Eps-2200',115.11),(6,18,'Everest 350 Watt ',130),(7,19,'Corsair Builder VS450',240),(8,19,'Corsair 450W',289.54),(9,19,'Corsair Builder VS550',329),(10,19,'Corsair 550W',397.02);
/*!40000 ALTER TABLE `powersupply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ram`
--

DROP TABLE IF EXISTS `ram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ram` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaID` int(11) NOT NULL,
  `Ozellik` text,
  `Fiyat` double DEFAULT NULL,
  `Model` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ram`
--

LOCK TABLES `ram` WRITE;
/*!40000 ALTER TABLE `ram` DISABLE KEYS */;
INSERT INTO `ram` VALUES (1,18,'CAS Hızı	9 ns;Kullanım Tipi DDR3;Ram Hızı 1333 MHz;Ram Kapasitesi	2 GB;',63.28,'Everest Rm-22'),(2,18,'Hızı 1333Mhz;Kapasite 2 Gb;Türü DDR3 CL9',84.5,'Everest Rm-21'),(3,18,'CAS Hızı 11 ns;Kullanım Tipi DDR3;Ram Hızı 1600 MHz;Ram Kapasitesi	4 GB',139,'Everest RM-44'),(4,18,'CAS Hızı 9 ns;Kullanım Tipi DDR3;Ram Hızı 1333 MHz;Ram Kapasitesi	4 GB',154.9,'Everest Rm-42'),(5,7,'Kategori	DDR4;Arayüz 288-Pin;Kapasite 4 GB',229,'HP 4GB D4'),(6,18,'CAS Hızı	9 ns;Kullanım Tipi DDR3;Ram Hızı 1600 MHz;Ram Kapasitesi	8 GB',283.45,'Everest RM-83'),(7,18,'CAS Hızı	15 ns;Kullanım Tipi	DDR4;Ram Hızı 2133 MHz;Ram Kapasitesi 8 GB',435,'Everest Rm-82'),(8,7,'CAS Hızı	15 ns;Kullanım Tipi	DDR4;Ram Hızı 2133 MHz;Ram Kapasitesi 8 GB',950,'Hp 819880-B21'),(9,7,'CAS Hızı 17 ns;Kullanım Tipi DDR4;Ram Hızı 2400 MHz;Ram Kapasitesi	16 GB',1850.9,'Hp 805349-B21');
/*!40000 ALTER TABLE `ram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sabitdisk`
--

DROP TABLE IF EXISTS `sabitdisk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sabitdisk` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaID` int(11) NOT NULL,
  `Model` varchar(100) DEFAULT NULL,
  `Ozellik` text,
  `Fiyat` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sabitdisk`
--

LOCK TABLES `sabitdisk` WRITE;
/*!40000 ALTER TABLE `sabitdisk` DISABLE KEYS */;
INSERT INTO `sabitdisk` VALUES (1,9,'Toshiba 2.5\" 320GB','Bağlantı Tipi Sata 2;Cache Bellek 8 MB;Disk Boyutu 2,5 inç;Dönüş Hızı	5400 RPM;Kapasite	320 GB',119.9),(2,9,'Toshiba 500GB ','Bağlantı Tipi Sata 3;Cache Bellek 8 MB;Disk Boyutu 2,5 inç;Dönüş Hızı	5400 RPM;Kapasite	500 GB;',175),(3,14,'Samsung 500Gb','Bağlantı Tipi Sata 2;Cache Bellek 8 MB;Disk Boyutu 2,5 inç;Dönüş Hızı 5400 RPM;Kapasite	500 GB',269.56),(4,9,'Toshiba 1TB 2.5','Bağlantı Tipi Sata 3;Cache Bellek 8 MB;Disk Boyutu 2,5 inç;Dönüş Hızı	5400 RPM;Kapasite	1 TB',274),(5,9,'Toshiba 2.5 1Tb ','Bağlantı Tipi Sata 3;Cache Bellek 8 MB;Disk Boyutu 2,5 inç;Dönüş Hızı	5400 RPM;Kapasite	1 TB',289.02),(6,9,'Toshiba L200 1TB ','Bağlantı Tipi Sata 3;Cache Bellek 8 MB;Cache Bellek 8 MB;Disk Boyutu	2,5 inç;Dönüş Hızı	5400 RPM;Kapasite	1 TB',299),(7,9,'Toshiba N300','Bağlantı Tipi Sata 3;Cache Bellek 128 MB;Disk Boyutu 3,5 inç;Disk Tipi	NAS;Dönüş Hızı 7200 RPM;Kalınlık 10,2 mm;Kapasite 4 TB',922.9),(8,9,'Toshiba 5TB','Bağlantı Tipi Sata 3;Cache Bellek 128 MB;Disk Boyutu 3,5 inç;Dönüş Hızı 5400 RPM;Kalınlık	10,2 mm;Kapasite	5 TB',1049),(9,9,'Toshiba X300','Bağlantı Tipi Sata 3;Cache Bellek 128 MB;Disk Boyutu 3,5 inç;Dönüş Hızı 7200 RPM;Kalınlık	10,2 mm;Kapasite	8 TB',1739),(10,7,'Hp-E Hp Msa','Bağlantı Tipi Sas;Disk Boyutu	3,5 inç;Dönüş Hızı	7200 RPM;Kapasite	4 TB;',5870.59);
/*!40000 ALTER TABLE `sabitdisk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sogutucu`
--

DROP TABLE IF EXISTS `sogutucu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sogutucu` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaID` int(11) NOT NULL,
  `Model` varchar(100) DEFAULT NULL,
  `Ozellik` text,
  `Fiyat` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sogutucu`
--

LOCK TABLES `sogutucu` WRITE;
/*!40000 ALTER TABLE `sogutucu` DISABLE KEYS */;
INSERT INTO `sogutucu` VALUES (1,16,'Aerocool \"Lightning\" 12cm Mavi Ledli Sessiz Kasa Fanı','Fan Çapı	120 mm;Kullanım Yeri Kasa Fanı;Overclock (Hız Aşırtma) Yok',24.9),(2,17,'Dark 12cm Ultra Bright 33X Mavi Ledli Kasa Fanı ','Fan Çapı	120 mm;Kullanım Yeri Kasa Fanı;Fan Hızı	 1000rpm +/- %10',29.9),(3,16,'Aerocool 12cm PWM 4Pin Kırmızı Ledi Kasa Fanı ','Fan Çapı	120 mm;Kullanım Yeri Kasa Fanı;Fan Hızı 1200 RPM',33.9),(4,17,'Dark 120mm RGB Ring Led Fan','Fan Çapı	120 mm;Kullanım Yeri Kasa Fanı;Fan Hızı 900~1700rpm',35.9),(5,16,'Aerocool \"Lightning\" 14cm Kırmızı Ledli Sessiz Kasa Fanı ','Fan Çapı	140 mm;Kullanım Yeri Kasa Fanı;Fan Hızı	 1200 RPM',37.9),(6,19,'Corsair Air Series AF120 Led Blue Quiet Edition HighAirflow ','Fan Çapı	120 mm;Kullanım Yeri Kasa Fanı;Fan Hızı	 1500 RPM',74.8),(7,19,'Corsair Air Sp120','Fan Çapı	120 mm;Kullanım Yeri Kasa Fanı',76),(8,19,'Corsair AF120','Fan Çapı	120 mm;Kullanım Yeri Kasa Fanı',77.74),(9,17,'Dark Freezer X120','Fan Çapı	120 mm;Kullanım Yeri İşlemci (CPU);Fan Devri (±%10) 500-1600 rpm',179),(10,19,'Corsair HD120','Fan Çapı	120 mm;Kullanım Yeri Kasa Fanı',184),(11,1,'İntel Bxts15A','Fan Çapı	95 mm;İşlemci Soket Tipi 1151 Pin;Kullanım Yeri İşlemci (CPU)',229),(12,1,'Intel Socket 1151P','İşlemci Soket Tipi 1151 Pin;Kullanım Yeri	İşlemci (CPU);Overclock (Hız Aşırtma) Yok',270.26);
/*!40000 ALTER TABLE `sogutucu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-21  0:49:32
