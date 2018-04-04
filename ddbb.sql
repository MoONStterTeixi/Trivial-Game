-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.29-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para trivialdb
CREATE DATABASE IF NOT EXISTS `trivialdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `trivialdb`;

-- Volcando estructura para tabla trivialdb.preguntas
CREATE TABLE IF NOT EXISTS `preguntas` (
  `NUM_PREG` int(11) NOT NULL AUTO_INCREMENT,
  `CATEGORIA` varchar(50) DEFAULT '0',
  `PREGUNTA` varchar(50) DEFAULT '0',
  `RESP_OK` varchar(50) DEFAULT '0',
  `RESP_KO1` varchar(50) DEFAULT '0',
  `RESP_KO2` varchar(50) DEFAULT '0',
  `RESP_KO3` varchar(50) DEFAULT '0',
  PRIMARY KEY (`NUM_PREG`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla trivialdb.preguntas: ~16 rows (aproximadamente)
/*!40000 ALTER TABLE `preguntas` DISABLE KEYS */;
INSERT INTO `preguntas` (`NUM_PREG`, `CATEGORIA`, `PREGUNTA`, `RESP_OK`, `RESP_KO1`, `RESP_KO2`, `RESP_KO3`) VALUES
	(1, 'Deportes', '¿Que tenista tiene más títulos de Grand Slam?', 'Roger Ferderer', 'Rafa Nadal', 'Novak Djokovic', 'Andy Murray'),
	(2, 'Deportes', '¿Que país ganó más medallas de oro en los juegos d', 'USA', 'China', 'Brasil', 'Rusia'),
	(3, 'Deportes', '¿Quién es el jugador máximo goleador de la histori', 'Josef Bican', 'Crsitiano Ronaldo', 'Leo Messi', 'Pele'),
	(4, 'Deportes', '¿Que deportista tiene más medallas olímpicas?', 'Michael Phelps', 'Usain Bolt', 'Larisa Latynina', 'Mark Spitz'),
	(5, 'Cultura', '¿Que actriz tiene más oscars?', 'Katharine Hepburn', 'Ingrid Bergman', 'Meryl Streep', 'Jodie Foster'),
	(6, 'Cultura', '¿Que país es el máximo produtor de vino?', 'Italia', 'Francia', 'USA', 'España'),
	(7, 'Cultura', '¿Que país es el más pobaldo del mundo?', 'China', 'India', 'USA', 'Brasil'),
	(8, 'Cultura', '¿Cuál es el río más largo del mundo?', 'Amazonas', 'Nilo', 'Yangtsé', 'Mississippi'),
	(9, 'Ciencias', '¿Que gas predomina en la atmósfera?', 'Nitrógeno', 'Oxígeno', 'Hidrógeno', 'Metano'),
	(10, 'Ciencias', '¿Que animal es un mamífero ovíparo?', 'Ornitorrinco', 'Nutria', 'Ballena', 'Oso hormiguero'),
	(11, 'Ciencias', '¿Cuantos Gigabits hay en 1 Terabyte?', '8000', '1000', '1000000', '8000000'),
	(12, 'Ciencias', '¿Quien el primer humano en decir que la tierra da ', 'Aristarco de Samos', 'Copérnico', 'Kepler', 'Galileo'),
	(13, 'Historia', '¿Cuanto duró la guerra de los 100 años?', '116', '100', '101', '99'),
	(14, 'Historia', '¿En que fecha acabó oficialmente la 2 Guerra Mundi', '02/09/1945', '07/05/1945', '14/08/1945', '31/12/1945'),
	(15, 'Historia', 'La frase "la suerte esta echada" se atribuye a ...', 'Julio Cesar', 'Atila', 'Espartaco', 'Alejandro Magno'),
	(16, 'Historia', '¿A que época pertenece el arte Románico?', 'Edad media', 'Edad Moderna', 'Edad Contemporánea', 'Edad antigüa');
/*!40000 ALTER TABLE `preguntas` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
