-- MariaDB dump 10.19  Distrib 10.4.21-MariaDB, for osx10.10 (x86_64)
--
-- Host: localhost    Database: biblio
-- ------------------------------------------------------
-- Server version	10.4.21-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Alumnos`
--

DROP TABLE IF EXISTS `Alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Alumnos` (
  `Num_Control` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(20) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Num_Tel` varchar(13) NOT NULL,
  `Fecha_Insc` date NOT NULL,
  PRIMARY KEY (`Num_Control`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Alumnos`
--

LOCK TABLES `Alumnos` WRITE;
/*!40000 ALTER TABLE `Alumnos` DISABLE KEYS */;
INSERT INTO `Alumnos` VALUES (5,'Matias','Calle 1 # 692','+524457291613','2018-05-28'),(6,'Armando','Calle 1 # 928','+524445721076','2018-07-31'),(7,'Erick','Calle 2 # 653','+524457291642','2014-02-16'),(8,'Soler','Calle 4 # 495','+524445729275','2019-06-27'),(11,'Maria celeste','Conocida','4448182136','2022-01-01'),(12,'Juan Manuel','Conocida','4446325781','2021-08-15');
/*!40000 ALTER TABLE `Alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Info_Alumnos`
--

DROP TABLE IF EXISTS `Info_Alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Info_Alumnos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CantidadAlumnos` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Info_Alumnos`
--

LOCK TABLES `Info_Alumnos` WRITE;
/*!40000 ALTER TABLE `Info_Alumnos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Info_Alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Info_Libros`
--

DROP TABLE IF EXISTS `Info_Libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Info_Libros` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CantidadLibros` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Info_Libros`
--

LOCK TABLES `Info_Libros` WRITE;
/*!40000 ALTER TABLE `Info_Libros` DISABLE KEYS */;
/*!40000 ALTER TABLE `Info_Libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Libros`
--

DROP TABLE IF EXISTS `Libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Libros` (
  `Num_Libro` int(11) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(50) NOT NULL,
  `Autor` varchar(50) NOT NULL,
  `Fecha_Editado` date NOT NULL,
  PRIMARY KEY (`Num_Libro`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Libros`
--

LOCK TABLES `Libros` WRITE;
/*!40000 ALTER TABLE `Libros` DISABLE KEYS */;
INSERT INTO `Libros` VALUES (5,'La habitacion cerrada','Paul Auster','1986-02-16'),(6,'La trilogia de nueva york','Paul Auster','1985-07-31'),(7,'1984','Orwell','1947-02-16'),(8,'Que es el arte','Tolstoy','1897-06-27');
/*!40000 ALTER TABLE `Libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Prestamos`
--

DROP TABLE IF EXISTS `Prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Prestamos` (
  `ID_Prestamo` int(11) NOT NULL AUTO_INCREMENT,
  `Num_Control` int(11) NOT NULL,
  `Fecha_Retiro` date NOT NULL,
  `Fecha_Entrega` date DEFAULT NULL,
  `Num_Libro` int(11) NOT NULL,
  PRIMARY KEY (`ID_Prestamo`),
  KEY `Num_Control` (`Num_Control`),
  KEY `Num_Libro` (`Num_Libro`),
  CONSTRAINT `FK_NUM_CONTROL` FOREIGN KEY (`Num_Control`) REFERENCES `Alumnos` (`Num_Control`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_NUM_LIBRO` FOREIGN KEY (`Num_Libro`) REFERENCES `Libros` (`Num_Libro`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Prestamos`
--

LOCK TABLES `Prestamos` WRITE;
/*!40000 ALTER TABLE `Prestamos` DISABLE KEYS */;
INSERT INTO `Prestamos` VALUES (5,5,'2022-11-14','2022-11-15',5),(10,5,'2022-11-11','2022-11-12',5),(12,6,'2022-11-11','2022-11-12',5);
/*!40000 ALTER TABLE `Prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuarios`
--

DROP TABLE IF EXISTS `Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuarios` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(30) NOT NULL,
  `Clave` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Usuario` (`Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuarios`
--

LOCK TABLES `Usuarios` WRITE;
/*!40000 ALTER TABLE `Usuarios` DISABLE KEYS */;
INSERT INTO `Usuarios` VALUES (1,'Uno','Dos'),(3,'Strako','Mayuscula12.');
/*!40000 ALTER TABLE `Usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-29 12:25:41
