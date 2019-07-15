-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-09-2018 a las 18:12:07
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `cedula` int(10) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `fecha_de_nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cedula`, `nombre`, `apellido`, `direccion`, `telefono`, `fecha_de_nacimiento`) VALUES
(1005044130, 'sergio', 'vega', 'pacheles', '3125708001', '1999-11-11'),
(1010101010, 'ronaldo', 'torres', 'atalaya', '3220150549', '2050-07-18'),
(1093299058, 'victor', 'rojas', 'mz35b3lote5', '322818293', '1999-07-28'),
(1093887224, 'Ronaldo', 'Torres Caceres', 'chupelo para ', '3213073686', '1999-07-16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE IF NOT EXISTS `inventario` (
  `codigo_producto_fk` int(11) NOT NULL,
  `nombre_producto` varchar(45) DEFAULT NULL,
  `stock` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`codigo_producto_fk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`codigo_producto_fk`, `nombre_producto`, `stock`) VALUES
(2, 'papa', '1100');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
  `idcliente` int(11) NOT NULL,
  `cantidad` varchar(10) DEFAULT NULL,
  `producto` varchar(10) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `idclientefk` int(11) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido_producto`
--

CREATE TABLE IF NOT EXISTS `pedido_producto` (
  `pedido_id_cliente` int(10) DEFAULT NULL,
  `pedido_cliente_idcliente` int(10) DEFAULT NULL,
  `producto_codigo` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `marca` varchar(30) NOT NULL,
  `precio_costo` int(10) DEFAULT NULL,
  `precio_venta` int(10) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigo`, `nombre`, `marca`, `precio_costo`, `precio_venta`) VALUES
(1, 'arroz', 'zulia', 2500, 3000),
(2, 'papa', 'labuena', 18000000, 1000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE IF NOT EXISTS `proveedores` (
  `nit` int(10) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `nombre` varchar(30) NOT NULL,
  `contraseña` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombre`, `contraseña`) VALUES
('yo', '1sd1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `codigo_venta` int(11) NOT NULL,
  `fecha` varchar(8) NOT NULL,
  `Nombre` varchar(40) NOT NULL,
  `Apellido` varchar(40) NOT NULL,
  `codigo_productofk` int(11) DEFAULT NULL,
  `articulo` varchar(40) NOT NULL,
  `valor_unidad` int(11) NOT NULL,
  `cantidad` int(10) NOT NULL,
  `total_venta` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`codigo_venta`),
  KEY `codigo_productofk` (`codigo_productofk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `codigo_productofk` FOREIGN KEY (`codigo_productofk`) REFERENCES `producto` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
