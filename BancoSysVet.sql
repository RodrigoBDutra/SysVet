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

/*Table structure for table `animal` */

DROP TABLE IF EXISTS `animal`;

CREATE TABLE `animal` (
  `codAnimal` int(6) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `cor` varchar(15) DEFAULT NULL,
  `dataNascimento` varchar(10) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `altura` float DEFAULT NULL,
  `porte` varchar(15) DEFAULT NULL,
  `chip` varchar(1) DEFAULT NULL,
  `numChip` int(12) DEFAULT NULL,
  `obito` tinyint(1) DEFAULT NULL,
  `observacao` varchar(1000) DEFAULT NULL,
  `codProntuario` int(6) DEFAULT NULL,
  `CodTipoAnimal` int(6) DEFAULT NULL,
  PRIMARY KEY (`codAnimal`),
  KEY `FK_prontuario` (`codProntuario`),
  KEY `FK_TipoAnimal` (`CodTipoAnimal`),
  CONSTRAINT `FK_TipoAnimal` FOREIGN KEY (`CodTipoAnimal`) REFERENCES `tipoanimal` (`codTipoAnimal`),
  CONSTRAINT `FK_prontuario` FOREIGN KEY (`codProntuario`) REFERENCES `prontuario` (`codProntuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `animal` */

/*Table structure for table `contatos` */

DROP TABLE IF EXISTS `contatos`;

CREATE TABLE `contatos` (
  `codContato` int(6) NOT NULL AUTO_INCREMENT,
  `telefoneResidencial` varchar(13) DEFAULT NULL,
  `telefoneCelular` varchar(14) DEFAULT NULL,
  `telefoneComercial` varchar(14) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `site` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codContato`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;

/*Data for the table `contatos` */

insert  into `contatos`(`codContato`,`telefoneResidencial`,`telefoneCelular`,`telefoneComercial`,`email`,`site`) values (50,'(11)4647-6035','(11)98087-1006','','ppaarrr@gmail.com','');

/*Table structure for table `dadospessoais` */

DROP TABLE IF EXISTS `dadospessoais`;

CREATE TABLE `dadospessoais` (
  `codDadosPessoais` int(6) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `dataNascimento` varchar(15) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `rg` varchar(13) NOT NULL,
  PRIMARY KEY (`codDadosPessoais`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=latin1;

/*Data for the table `dadospessoais` */

insert  into `dadospessoais`(`codDadosPessoais`,`nome`,`dataNascimento`,`cpf`,`rg`) values (45,'Rodrigo','20/05/1987','008.692.379-00','4187989-9');

/*Table structure for table `endereco` */

DROP TABLE IF EXISTS `endereco`;

CREATE TABLE `endereco` (
  `codEndereco` int(6) NOT NULL AUTO_INCREMENT,
  `endereco` varchar(100) DEFAULT NULL,
  `numero` int(5) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `complemento` varchar(20) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `estado` char(2) DEFAULT NULL,
  PRIMARY KEY (`codEndereco`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

/*Data for the table `endereco` */

insert  into `endereco`(`codEndereco`,`endereco`,`numero`,`bairro`,`complemento`,`cep`,`cidade`,`estado`) values (42,'Rua Petropolis',204,'Vila São Roberto','','08572-280','Itaquaquecetuba','SP');

/*Table structure for table `especie` */

DROP TABLE IF EXISTS `especie`;

CREATE TABLE `especie` (
  `codEspecie` int(6) NOT NULL AUTO_INCREMENT,
  `especie` varchar(50) DEFAULT NULL,
  `CodRaca` int(6) DEFAULT NULL,
  PRIMARY KEY (`codEspecie`),
  KEY `FK_Raca` (`CodRaca`),
  CONSTRAINT `FK_Raca` FOREIGN KEY (`CodRaca`) REFERENCES `raca` (`codRaca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `especie` */

/*Table structure for table `mucosa` */

DROP TABLE IF EXISTS `mucosa`;

CREATE TABLE `mucosa` (
  `codMucosa` int(11) NOT NULL,
  `bucal` varchar(10) DEFAULT NULL,
  `labial` varchar(10) DEFAULT NULL,
  `ocular` varchar(10) DEFAULT NULL,
  `vulva` varchar(10) DEFAULT NULL,
  `prepucial` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codMucosa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mucosa` */

/*Table structure for table `prontuario` */

DROP TABLE IF EXISTS `prontuario`;

CREATE TABLE `prontuario` (
  `codProntuario` int(6) NOT NULL,
  `ectoparasitas` varchar(30) DEFAULT NULL,
  `estadogeral` varchar(30) DEFAULT NULL,
  `tumor` varchar(30) DEFAULT NULL,
  `ferida` varchar(30) DEFAULT NULL,
  `temperatura` float DEFAULT NULL,
  `frequenciarespiratoria` float DEFAULT NULL,
  `frequenciacardiaca` int(11) DEFAULT NULL,
  `observacoes` varchar(1000) DEFAULT NULL,
  `codMucosa` int(6) DEFAULT NULL,
  PRIMARY KEY (`codProntuario`),
  KEY `FK_mucosa` (`codMucosa`),
  CONSTRAINT `FK_mucosa` FOREIGN KEY (`codMucosa`) REFERENCES `mucosa` (`codMucosa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prontuario` */

/*Table structure for table `proprietario` */

DROP TABLE IF EXISTS `proprietario`;

CREATE TABLE `proprietario` (
  `codProprietario` int(6) NOT NULL AUTO_INCREMENT,
  `dataCadastro` varchar(15) DEFAULT NULL,
  `observacoes` varchar(1000) DEFAULT NULL,
  `codDadosPessoais` int(6) DEFAULT NULL,
  `codContato` int(6) DEFAULT NULL,
  `codEndereco` int(6) DEFAULT NULL,
  `codAnimal` int(6) DEFAULT NULL,
  PRIMARY KEY (`codProprietario`),
  KEY `FK_codDadosPessoais` (`codDadosPessoais`),
  KEY `FK_codAnimal` (`codAnimal`),
  KEY `FK_endereco` (`codEndereco`),
  KEY `FK_contato` (`codContato`),
  CONSTRAINT `FK_codDadosPessoais` FOREIGN KEY (`codDadosPessoais`) REFERENCES `dadospessoais` (`codDadosPessoais`),
  CONSTRAINT `FK_contato` FOREIGN KEY (`codContato`) REFERENCES `contatos` (`codContato`),
  CONSTRAINT `FK_endereco` FOREIGN KEY (`codEndereco`) REFERENCES `endereco` (`codEndereco`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

/*Data for the table `proprietario` */

insert  into `proprietario`(`codProprietario`,`dataCadastro`,`observacoes`,`codDadosPessoais`,`codContato`,`codEndereco`,`codAnimal`) values (39,'15/11/2014','nenhuma',45,50,42,NULL);

/*Table structure for table `raca` */

DROP TABLE IF EXISTS `raca`;

CREATE TABLE `raca` (
  `codRaca` int(6) NOT NULL AUTO_INCREMENT,
  `nomeRaca` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codRaca`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `raca` */

/*Table structure for table `tipoanimal` */

DROP TABLE IF EXISTS `tipoanimal`;

CREATE TABLE `tipoanimal` (
  `codTipoAnimal` int(6) NOT NULL AUTO_INCREMENT,
  `tipoAnimal` varchar(50) DEFAULT NULL,
  `CodEspecie` int(6) DEFAULT NULL,
  PRIMARY KEY (`codTipoAnimal`),
  KEY `FK_Especie` (`CodEspecie`),
  CONSTRAINT `FK_Especie` FOREIGN KEY (`CodEspecie`) REFERENCES `especie` (`codEspecie`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipoanimal` */

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `codigo` int(6) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `login` varchar(13) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `permissao` varchar(12) NOT NULL,
  `logado` char(2) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`codigo`,`nome`,`login`,`senha`,`permissao`,`logado`) values (1,'Sysvet','sysvet','sysvet','11111111111','n'),(2,'Pavao','pavaozinho','pavao','11111111100','n');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
