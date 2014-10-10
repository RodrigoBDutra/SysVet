/*
SQLyog Community v12.01 (64 bit)
MySQL - 5.6.14 : Database - bancosysvet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bancosysvet` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bancosysvet`;

/*Table structure for table `contatos` */

DROP TABLE IF EXISTS `contatos`;

CREATE TABLE `contatos` (
  `codContato` int(5) NOT NULL AUTO_INCREMENT,
  `telefoneResidencial` int(10) DEFAULT NULL,
  `telefoneCelular` int(11) DEFAULT NULL,
  `telefoneComercial` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `site` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codContato`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contatos` */

/*Table structure for table `dadospessoais` */

DROP TABLE IF EXISTS `dadospessoais`;

CREATE TABLE `dadospessoais` (
  `codDadosPessoais` int(5) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `dataNascimento` varchar(10) NOT NULL,
  `cpf` int(11) NOT NULL,
  `rg` varchar(10) NOT NULL,
  PRIMARY KEY (`codDadosPessoais`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dadospessoais` */

/*Table structure for table `endereco` */

DROP TABLE IF EXISTS `endereco`;

CREATE TABLE `endereco` (
  `codEndereco` int(7) NOT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` int(5) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `complemento` varchar(20) DEFAULT NULL,
  `cep` int(8) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `estado` char(2) DEFAULT NULL,
  PRIMARY KEY (`codEndereco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `endereco` */

/*Table structure for table `proprietario` */

DROP TABLE IF EXISTS `proprietario`;

CREATE TABLE `proprietario` (
  `codProprietario` int(5) NOT NULL AUTO_INCREMENT,
  `dataCadastro` varchar(10) DEFAULT NULL,
  `observacoes` varchar(1000) DEFAULT NULL,
  `codDadosPessoais` int(5) DEFAULT NULL,
  `codContato` int(5) DEFAULT NULL,
  `codEndereco` int(5) DEFAULT NULL,
  `codAnimal` int(5) DEFAULT NULL,
  PRIMARY KEY (`codProprietario`),
  KEY `FK_codDadosPessoais` (`codDadosPessoais`),
  CONSTRAINT `FK_codDadosPessoais` FOREIGN KEY (`codDadosPessoais`) REFERENCES `dadospessoais` (`codDadosPessoais`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `proprietario` */

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `codigo` int(4) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `login` varchar(13) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `permissao` varchar(12) NOT NULL,
  `logado` char(2) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`codigo`,`nome`,`login`,`senha`,`permissao`,`logado`) values (1,'Administrador','sysvet','sysvet','11111111111','n'),(2,'Pavão','Viado','gay','00000000000','n');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
