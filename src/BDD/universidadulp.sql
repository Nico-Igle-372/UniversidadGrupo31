-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-09-2023 a las 01:27:42
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `universidadulp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `dni` varchar(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) VALUES
(1, '36485798', 'Iglesias', 'Nicolas', '1992-01-01', 1),
(2, '36147852', 'Moreno', 'David', '1986-05-22', 1),
(3, '36453758', 'Lopez', 'Pablo', '1984-11-15', 1),
(4, '38018311', 'Kerlin', 'Franco', '1994-08-08', 1),
(8, '30000001', 'pascual', 'jorge', '1900-03-15', 1),
(14, '38018312', 'Kerling', 'Franco', '1994-08-08', 1),
(101, '37891234', 'López', 'Juan', '1995-03-15', 1),
(102, '39234567', 'Martínez', 'Ana', '1998-08-21', 1),
(103, '40567890', 'Gómez', 'Luis', '1997-11-10', 1),
(104, '41789012', 'Rodríguez', 'María', '1996-06-02', 1),
(105, '42234567', 'Pérez', 'Carlos', '1999-04-18', 1),
(106, '43567890', 'Sánchez', 'Laura', '1994-12-25', 1),
(107, '44789012', 'Fernández', 'Javier', '1993-07-11', 1),
(108, '45234567', 'González', 'Silvia', '2000-09-08', 1),
(109, '46567890', 'Ramírez', 'Diego', '1992-02-20', 1),
(110, '47234567', 'Torres', 'Paula', '1991-05-30', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripto` int(11) NOT NULL,
  `nota` double DEFAULT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`idInscripto`, `nota`, `idAlumno`, `idMateria`) VALUES
(2, 9, 1, 3),
(5, 8, 2, 3),
(7, 8.5, 3, 4),
(9, 2.5, 4, 1),
(10, 1, 4, 2),
(11, 9, 101, 13),
(12, 7, 102, 14),
(13, 8, 103, 15),
(14, 6, 104, 16),
(15, 9, 105, 17),
(16, 7, 106, 18),
(17, 8, 107, 19),
(18, 6, 108, 20),
(19, 9, 109, 21),
(20, 7, 110, 22),
(21, 8, 101, 23),
(22, 6, 102, 24),
(23, 9, 103, 25),
(24, 0, 107, 18);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre`, `año`, `estado`) VALUES
(1, 'matematica1', 1, 1),
(2, 'fisica3', 4, 1),
(3, 'ingles2', 3, 1),
(4, 'computacionAvanzada', 4, 1),
(13, 'Matemáticas', 1, 1),
(14, 'Lengua Española', 2, 1),
(15, 'Ciencias Naturales', 3, 1),
(16, 'Historia', 4, 1),
(17, 'Educación Física', 5, 1),
(18, 'Arte', 6, 1),
(19, 'Música', 7, 1),
(20, 'Geografía', 8, 1),
(21, 'Programación', 1, 1),
(22, 'Literatura', 2, 1),
(23, 'Química', 3, 1),
(24, 'Biología', 4, 1),
(25, 'Educación Cívica', 5, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripto`),
  ADD KEY `idAlumno` (`idAlumno`),
  ADD KEY `idMateria` (`idMateria`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
