-- --------------------------------------------------------
-- Verkkotietokone:              mysql.metropolia.fi
-- Palvelinversio:               10.5.18-MariaDB - MariaDB Server
-- Server OS:                    Linux
-- HeidiSQL Versio:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for rikukosk
CREATE DATABASE IF NOT EXISTS `rikukosk` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `rikukosk`;

-- Dumping structure for taulu rikukosk.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `Käyttäjätunnus` varchar(45) NOT NULL,
  `salasana` varchar(45) NOT NULL,
  `kirjasto_id` int(11) NOT NULL,
  PRIMARY KEY (`Käyttäjätunnus`),
  UNIQUE KEY `kirjasto_id_UNIQUE` (`kirjasto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table rikukosk.admin: ~3 rows (suunnilleen)
INSERT INTO `admin` (`Käyttäjätunnus`, `salasana`, `kirjasto_id`) VALUES
	('admin', '123', 1),
	('admin200', '123', 2),
	('admin300', '222', 4),
	('null', 'null', 0);

-- Dumping structure for taulu rikukosk.asiakas
CREATE TABLE IF NOT EXISTS `asiakas` (
  `as_id` int(11) NOT NULL AUTO_INCREMENT,
  `etunimi` varchar(45) NOT NULL,
  `sukunimi` varchar(45) NOT NULL,
  `puhelinnum` varchar(50) DEFAULT '',
  PRIMARY KEY (`as_id`),
  UNIQUE KEY `puhelinnum` (`puhelinnum`),
  CONSTRAINT `FK_asiakas_asiakas_tiedot` FOREIGN KEY (`puhelinnum`) REFERENCES `asiakas_tiedot` (`puh_numero`) ON DELETE CASCADE ON UPDATE CASCADE) ENGINE=InnoDB AUTO_INCREMENT=1306 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table rikukosk.asiakas: ~8 rows (suunnilleen)
INSERT INTO `asiakas` (`as_id`, `etunimi`, `sukunimi`, `puhelinnum`) VALUES
	(5, 'erd', 'cvfd', '0452737665'),
	(6, 'riku', 'koski', '045666666888'),
	(8, 'meme', 'gamer', '05086578687'),
	(9, 'Fatlum', 'Gerguri', '0456462366'),
	(12, 'riku', 'kosko', '044355605'),
	(1235, 'Fatlum', 'Gerugri', '0142123151'),
	(1249, 'null', 'null', 'null'),
	(1294, 'Riku', 'Koski', '0445446465'),
	(1305, 'Matti', 'Meikäläinen', '0443960465');

-- Dumping structure for taulu rikukosk.asiakas_tiedot
CREATE TABLE IF NOT EXISTS `asiakas_tiedot` (
  `kaupunki` varchar(45) NOT NULL,
  `s_posti` varchar(45) NOT NULL,
  `posti_numero` varchar(50) NOT NULL DEFAULT '',
  `osoite` varchar(100) NOT NULL,
  `puh_numero` varchar(50) NOT NULL,
  PRIMARY KEY (`puh_numero`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table rikukosk.asiakas_tiedot: ~6 rows (suunnilleen)
INSERT INTO `asiakas_tiedot` (`kaupunki`, `s_posti`, `posti_numero`, `osoite`, `puh_numero`) VALUES
	('Espoo', 'mies', '027700', 'Espoo', '0142123151'),
	('espoo', 'ror@gmail.com', '0343', 'vabn 1C', '044355605'),
	('espoo', 'matti.meikäläinen@gmail.com', '02940', 'vanhatie 11 b 4', '0443960465'),
	('espoo', 'riku@meme.fi', '02940', 'Vanha', '0445446465'),
	('espoo', 'test@test.fi', '02940', 'vanhakartano 2 b', '0452737556'),
	('espoo', 'riku@koski', '02940', 'vanha 1 b 33', '0452737665'),
	('Espoo', 'fatlumg@metropolia.fi', '02770', 'Espoo', '0456462366'),
	('espoo', 'riku@metro', '02940', 'vanha', '045666666888'),
	('espoo', 'meme@gamer.fi', '02120', 'tie 2', '05086578687'),
	('null', 'null', 'null', 'null', 'null');

-- Dumping structure for taulu rikukosk.kirja
CREATE TABLE IF NOT EXISTS `kirja` (
  `kirja_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '2000',
  `tila` varchar(45) NOT NULL,
  `luokka` varchar(45) NOT NULL,
  `kirja_ISBN` bigint(20) NOT NULL,
  `kirjasto_id` int(11) NOT NULL,
  `lainaaja` int(11) DEFAULT NULL,
  PRIMARY KEY (`kirja_id`),
  KEY `kirjasto_id_UNIQUE` (`kirjasto_id`) USING BTREE,
  KEY `lainaaja` (`lainaaja`),
  KEY `kirja_ISBN` (`kirja_ISBN`),
  CONSTRAINT `FK_kirja_asiakas` FOREIGN KEY (`lainaaja`) REFERENCES `asiakas` (`as_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_kirja_kirjan_tiedot` FOREIGN KEY (`kirja_ISBN`) REFERENCES `kirjan_tiedot` (`kirja_ISBN`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=144 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table rikukosk.kirja: ~6 rows (suunnilleen)
INSERT INTO `kirja` (`kirja_id`, `tila`, `luokka`, `kirja_ISBN`, `kirjasto_id`, `lainaaja`) VALUES
	(50, 'hyllyssä', '2.1', 9780312608880, 1, NULL),
	(51, 'hyllyssä', '21', 9783453533011, 2, NULL),
	(130, 'hyllyssä', '1.4', 9781974725915, 1, NULL),
	(140, '2023-01-11', '1.4', 9780544273443, 1, 5),
	(141, 'hyllyssä', '1.2', 9781974725915, 1, NULL),
	(142, '2023-01-11', '1.4', 9781444720716, 1, 5);

-- Dumping structure for taulu rikukosk.kirjan_tiedot
CREATE TABLE IF NOT EXISTS `kirjan_tiedot` (
  `kirja_ISBN` bigint(20) NOT NULL,
  `nimi` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `kustantaja` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `kirjoittajat` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `kuva` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `julkaisuvuosi` int(11) NOT NULL,
  `sivumäärä` int(11) NOT NULL,
  PRIMARY KEY (`kirja_ISBN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table rikukosk.kirjan_tiedot: ~9 rows (suunnilleen)
INSERT INTO `kirjan_tiedot` (`kirja_ISBN`, `nimi`, `kustantaja`, `kirjoittajat`, `kuva`, `julkaisuvuosi`, `sivumäärä`) VALUES
	(0, 'null', 'null', 'null', 'null', 0, 0),
	(29, 'Babbitt', 'Fictionwise  Inc ', 'Sinclair Lewis', '6376827', 1922, 387),
	(213, 'Creative Gene', 'Viz Media', 'Hideo Kojima', 'null', 2021, 256),
	(131241, 'Grooks', 'Blackwell', 'Piet Hein', '4476368', 1966, 0),
	(773600124, 'Grooks', 'Blackwell', 'Piet Hein', '4476368', 1966, 0),
	(9780312608880, 'Comet In Moominland', 'Farrar, Straus and Giroux (BYR)', 'Elizabeth Portch', '7531452', 2010, 192),
	(9780544273443, 'The Lord of the Rings', 'Gallimard', 'J.R.R. Tolkien', '9255566', 1954, 1193),
	(9781250183866, 'Extreme Ownership', 'St  Martin s Press', 'Jocko Willink', '8312790', 2017, 0),
	(9781444720716, 'Misery', 'Signet', 'Stephen King', '8259296', 1987, 378),
	(9781974725915, 'Creative Gene', 'Viz Media', 'Hideo Kojima', 'null', 2021, 256),
	(9783453533011, 'Metro 2034', 'Heyne', 'Дми́трий Глухо́вский', 'null', 2009, 529);

-- Dumping structure for taulu rikukosk.kirjasto
CREATE TABLE IF NOT EXISTS `kirjasto` (
  `kirjasto_id` int(11) NOT NULL,
  `kirjasto_nimi` varchar(45) NOT NULL,
  `kirjasto_osoite` varchar(45) NOT NULL,
  `puh_numero` varchar(50) NOT NULL DEFAULT '',
  `posti_numero` varchar(50) NOT NULL DEFAULT '',
  `kaupunki` varchar(45) NOT NULL,
  PRIMARY KEY (`kirjasto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table rikukosk.kirjasto: ~2 rows (suunnilleen)
INSERT INTO `kirjasto` (`kirjasto_id`, `kirjasto_nimi`, `kirjasto_osoite`, `puh_numero`, `posti_numero`, `kaupunki`) VALUES
	(0, 'null', 'null', '0', '0', 'null'),
	(1, 'tapiola', 'rwesrwe', '4444', '2654', 'espoo'),
	(2, 'wes', 'weed', '234', '24234', 'espoo');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
