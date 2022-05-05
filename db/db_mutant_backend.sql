-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-05-2022 a las 20:56:06
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `db_mutant_backend`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_mutant`
--

CREATE TABLE IF NOT EXISTS `tbl_mutant` (
`id` bigint(20) NOT NULL,
  `create_date` date DEFAULT NULL,
  `dna_cadena` varchar(255) DEFAULT NULL,
  `is_mutant` bit(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbl_mutant`
--

INSERT INTO `tbl_mutant` (`id`, `create_date`, `dna_cadena`, `is_mutant`) VALUES
(1, '2022-05-05', '[CTGCTA, CAGTGC, TTCTGT, AGTGGA, CTGCTA, GCACTA]', b'0'),
(2, '2022-05-05', '[CTGCTA, CAGTGC, TTCTGT, AGTGGA, CTGCTA, GCACTA]', b'0'),
(3, '2022-05-05', '[CTGCTA, CAGTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(4, '2022-05-05', '[CTGCTA, CCCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(5, '2022-05-05', '[CTGCTA, CCCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(6, '2022-05-05', '[CTGCTA, CCCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(7, '2022-05-05', '[CTGCTA, CCCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(8, '2022-05-05', '[CTGCTA, CCCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(9, '2022-05-05', '[CTGCTA, CCCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(10, '2022-05-05', '[CTGCTA, CCCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(11, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(12, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGA, AGTGGA, CTGCTA, GCACTA]', b'1'),
(13, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(14, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(15, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(16, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(17, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(18, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(19, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(20, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(21, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(22, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(23, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(24, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(25, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(26, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(27, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(28, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(29, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(30, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(31, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(32, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(33, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0'),
(34, '2022-05-05', '[CTGCTA, CGCTGC, TTCTGC, AGTGGA, CTGCTA, GCACTA]', b'0');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_mutant`
--
ALTER TABLE `tbl_mutant`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_mutant`
--
ALTER TABLE `tbl_mutant`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=35;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
