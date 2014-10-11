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
  `codAnimal` int(6) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `sexo` binary(1) DEFAULT NULL,
  `cor` varchar(15) DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `altura` float DEFAULT NULL,
  `porte` varchar(15) DEFAULT NULL,
  `chip` binary(1) DEFAULT NULL,
  `numChip` int(12) DEFAULT NULL,
  `obito` binary(1) DEFAULT NULL,
  `observacao` varchar(1000) DEFAULT NULL,
  `codEspecie` int(6) DEFAULT NULL,
  `codProntuario` int(6) DEFAULT NULL,
  PRIMARY KEY (`codAnimal`),
  KEY `FK_especie` (`codEspecie`),
  KEY `FK_prontuario` (`codProntuario`),
  CONSTRAINT `FK_especie` FOREIGN KEY (`codEspecie`) REFERENCES `especie` (`codEspecie`),
  CONSTRAINT `FK_prontuario` FOREIGN KEY (`codProntuario`) REFERENCES `prontuario` (`codProntuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `animal` */

/*Table structure for table `contatos` */

DROP TABLE IF EXISTS `contatos`;

CREATE TABLE `contatos` (
  `codContato` int(6) NOT NULL AUTO_INCREMENT,
  `telefoneResidencial` int(10) DEFAULT NULL,
  `telefoneCelular` int(11) DEFAULT NULL,
  `telefoneComercial` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `site` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codContato`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `contatos` */

/*Table structure for table `dadospessoais` */

DROP TABLE IF EXISTS `dadospessoais`;

CREATE TABLE `dadospessoais` (
  `codDadosPessoais` int(6) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `dataNascimento` varchar(15) NOT NULL,
  `cpf` int(11) NOT NULL,
  `rg` varchar(10) NOT NULL,
  PRIMARY KEY (`codDadosPessoais`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `dadospessoais` */

/*Table structure for table `endereco` */

DROP TABLE IF EXISTS `endereco`;

CREATE TABLE `endereco` (
  `codEndereco` int(6) NOT NULL,
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

/*Table structure for table `especie` */

DROP TABLE IF EXISTS `especie`;

CREATE TABLE `especie` (
  `codEspecie` int(6) NOT NULL,
  `especie` varchar(50) DEFAULT NULL,
  `codTipoAnimal` int(6) DEFAULT NULL,
  PRIMARY KEY (`codEspecie`),
  KEY `FK_tipoAnimal` (`codTipoAnimal`),
  CONSTRAINT `FK_tipoAnimal` FOREIGN KEY (`codTipoAnimal`) REFERENCES `tipoanimal` (`codTipoAnimal`)
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
  CONSTRAINT `FK_codAnimal` FOREIGN KEY (`codAnimal`) REFERENCES `animal` (`codAnimal`),
  CONSTRAINT `FK_codDadosPessoais` FOREIGN KEY (`codDadosPessoais`) REFERENCES `dadospessoais` (`codDadosPessoais`),
  CONSTRAINT `FK_contato` FOREIGN KEY (`codContato`) REFERENCES `contatos` (`codContato`),
  CONSTRAINT `FK_endereco` FOREIGN KEY (`codEndereco`) REFERENCES `endereco` (`codEndereco`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `proprietario` */

/*Table structure for table `raca` */

DROP TABLE IF EXISTS `raca`;

CREATE TABLE `raca` (
  `codRaca` int(6) NOT NULL,
  `nomeRaca` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codRaca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `raca` */

/*Table structure for table `tipoanimal` */

DROP TABLE IF EXISTS `tipoanimal`;

CREATE TABLE `tipoanimal` (
  `codTipoAnimal` int(6) NOT NULL,
  `tipoAnimal` varchar(50) DEFAULT NULL,
  `codRaca` int(6) DEFAULT NULL,
  PRIMARY KEY (`codTipoAnimal`),
  KEY `FK_raca` (`codRaca`),
  CONSTRAINT `FK_raca` FOREIGN KEY (`codRaca`) REFERENCES `raca` (`codRaca`)
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

insert  into `usuario`(`codigo`,`nome`,`login`,`senha`,`permissao`,`logado`) values (1,'Administrador','sysvet','sysvet','11111111111','n'),(2,'Pavão','Pavaozinho','pave','00000000000','n');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
