CREATE DATABASE  IF NOT EXISTS `vrolsitedb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `vrolsitedb`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: vrolsitedb
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `jugadores_inscritos`
--

DROP TABLE IF EXISTS `jugadores_inscritos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugadores_inscritos` (
  `id_inscrito` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nombre_jugador` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `mesa_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id_inscrito`),
  KEY `FKe1pu8ibydmp4ovoplp7n3s70i` (`mesa_id`),
  CONSTRAINT `FKe1pu8ibydmp4ovoplp7n3s70i` FOREIGN KEY (`mesa_id`) REFERENCES `mesas` (`id_mesa`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugadores_inscritos`
--

LOCK TABLES `jugadores_inscritos` WRITE;
/*!40000 ALTER TABLE `jugadores_inscritos` DISABLE KEYS */;
INSERT INTO `jugadores_inscritos` VALUES (1,'test@test.cl','Alexis','1234124',1),(2,'test@test.cl','Savandija','12341234',1),(3,'test@test.cl','Milka','12341234',1);
/*!40000 ALTER TABLE `jugadores_inscritos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mesas`
--

DROP TABLE IF EXISTS `mesas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mesas` (
  `id_mesa` bigint NOT NULL AUTO_INCREMENT,
  `des_corta` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `dia` varchar(255) DEFAULT NULL,
  `formato` varchar(255) DEFAULT NULL,
  `juego` varchar(255) DEFAULT NULL,
  `jugadores` int NOT NULL,
  `narrador` varchar(255) DEFAULT NULL,
  `nombre_mesa` varchar(255) DEFAULT NULL,
  `tags` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_mesa`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mesas`
--

LOCK TABLES `mesas` WRITE;
/*!40000 ALTER TABLE `mesas` DISABLE KEYS */;
INSERT INTO `mesas` VALUES (1,'Hay un Dragon Quimerico suelto en la Ciudad','Hay un Dragon Quimerico Suelto pero enfrentarse a el es incesato','2023/04/17','presencial','Changeling',4,'Naitsirc','De quien es el Dragon?','traumas, abuso'),(2,'Se ha perdido un Cargamento de Arroz, encuentralo','Se ha detectado que un comerciante de arroz se ha perdido en circunstancias dudosas, averigua que ha pasado','2023/04/17','presencial','Mousguard',4,'Alexis','El Mercader Perdido','aventuras ratoniles');
/*!40000 ALTER TABLE `mesas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-04 22:20:32