-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2024 at 09:43 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_instructor_attendance`
--

-- --------------------------------------------------------

--
-- Table structure for table `april_2024`
--

CREATE TABLE `april_2024` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `april_2024`
--

INSERT INTO `april_2024` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', '1', '1', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '1', NULL, NULL, '0', '1', '1', NULL, '0', '1', '0', '1', '1', '0', NULL, NULL, '1', '0', NULL),
('INS23ICT5D10002', '1', '1', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '0', NULL, NULL, '1', '1', '1', NULL, '0', '1', '1', '1', '1', '0', NULL, '0', '0', '1', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `august_2023`
--

CREATE TABLE `august_2023` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `august_2023`
--

INSERT INTO `august_2023` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', NULL, '1', '0', '1', NULL, NULL, '1', '1', '1', '0', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '0', '1', '1', '1', '0', NULL, NULL, '1', '0', NULL, '1'),
('INS23ICT5D10002', NULL, '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '0', '0', '1', '0', '0', NULL, NULL, '1', '0', NULL, '1');

-- --------------------------------------------------------

--
-- Table structure for table `classdays`
--

CREATE TABLE `classdays` (
  `Month` varchar(30) NOT NULL,
  `No_of_Days` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `classdays`
--

INSERT INTO `classdays` (`Month`, `No_of_Days`) VALUES
('july_2023', 11),
('august_2023', 21),
('september_2023', 19),
('october_2023', 22),
('november_2023', 22),
('december_2023', 22),
('january_2024', 23),
('february_2024', 14),
('march_2023', 22),
('may_2024', 0),
('june_2024', 0),
('july_2024', 0),
('august_2024', 0),
('september_2024', 0),
('october_2024', 0),
('november_2024', 0),
('december_2024', 0),
('april_2024', 22);

-- --------------------------------------------------------

--
-- Table structure for table `december_2023`
--

CREATE TABLE `december_2023` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `december_2023`
--

INSERT INTO `december_2023` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', '0', NULL, NULL, '1', '1', '1', '0', '0', NULL, NULL, '1', '1', '1', '1', '0', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL),
('INS23ICT5D10002', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '0', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `february_2024`
--

CREATE TABLE `february_2024` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `february_2024`
--

INSERT INTO `february_2024` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '0', '0', NULL, NULL, '0', '0', '0', '1', '0', NULL, NULL, '1', '1', '1', '1', NULL, NULL),
('INS23ICT5D10002', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '0', '1', NULL, NULL, '1', '1', '1', '1', '0', NULL, NULL, '1', '1', '1', '1', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `january_2024`
--

CREATE TABLE `january_2024` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `january_2024`
--

INSERT INTO `january_2024` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', '0', '0', '1', '0', '0', NULL, NULL, '0', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1'),
('INS23ICT5D10002', '0', '1', '1', '0', '1', NULL, NULL, '1', '0', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `july_2023`
--

CREATE TABLE `july_2023` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `july_2023`
--

INSERT INTO `july_2023` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1'),
('INS23ICT5D10002', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1');

-- --------------------------------------------------------

--
-- Table structure for table `march_2024`
--

CREATE TABLE `march_2024` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `march_2024`
--

INSERT INTO `march_2024` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', '0', NULL, NULL, '1', '1', '1', '0', '0', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('INS23ICT5D10002', '1', NULL, NULL, '1', '1', '1', '0', '0', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `november_2023`
--

CREATE TABLE `november_2023` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `november_2023`
--

INSERT INTO `november_2023` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '0', NULL, NULL, '1', '0', '1', '1', '1', NULL, NULL, '1', '1', '0', '0', '1', NULL, NULL, '1', '1', '0', '1', NULL),
('INS23ICT5D10002', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '0', '1', '1', '1', '1', NULL, NULL, '0', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `october_2023`
--

CREATE TABLE `october_2023` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `october_2023`
--

INSERT INTO `october_2023` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', NULL, '1', '0', '0', '1', '0', NULL, NULL, '1', '0', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1'),
('INS23ICT5D10002', NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `september_2023`
--

CREATE TABLE `september_2023` (
  `ID` varchar(15) NOT NULL,
  `1` varchar(1) DEFAULT NULL,
  `2` varchar(1) DEFAULT NULL,
  `3` varchar(1) DEFAULT NULL,
  `4` varchar(1) DEFAULT NULL,
  `5` varchar(1) DEFAULT NULL,
  `6` varchar(1) DEFAULT NULL,
  `7` varchar(1) DEFAULT NULL,
  `8` varchar(1) DEFAULT NULL,
  `9` varchar(1) DEFAULT NULL,
  `10` varchar(1) DEFAULT NULL,
  `11` varchar(1) DEFAULT NULL,
  `12` varchar(1) DEFAULT NULL,
  `13` varchar(1) DEFAULT NULL,
  `14` varchar(1) DEFAULT NULL,
  `15` varchar(1) DEFAULT NULL,
  `16` varchar(1) DEFAULT NULL,
  `17` varchar(1) DEFAULT NULL,
  `18` varchar(1) DEFAULT NULL,
  `19` varchar(1) DEFAULT NULL,
  `20` varchar(1) DEFAULT NULL,
  `21` varchar(1) DEFAULT NULL,
  `22` varchar(1) DEFAULT NULL,
  `23` varchar(1) DEFAULT NULL,
  `24` varchar(1) DEFAULT NULL,
  `25` varchar(1) DEFAULT NULL,
  `26` varchar(1) DEFAULT NULL,
  `27` varchar(1) DEFAULT NULL,
  `28` varchar(1) DEFAULT NULL,
  `29` varchar(1) DEFAULT NULL,
  `30` varchar(1) DEFAULT NULL,
  `31` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `september_2023`
--

INSERT INTO `september_2023` (`ID`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, `18`, `19`, `20`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`) VALUES
('INS23ICT5D10001', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '0', '0', '1', '1', NULL, '0', '0', '0', '1', '1', '0', NULL, NULL),
('INS23ICT5D10002', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '1', '1', '1', '1', NULL, NULL, '1', '0', '0', '1', '1', NULL, '0', '0', '0', '1', '1', '1', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `april_2024`
--
ALTER TABLE `april_2024`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `august_2023`
--
ALTER TABLE `august_2023`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `december_2023`
--
ALTER TABLE `december_2023`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `february_2024`
--
ALTER TABLE `february_2024`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `january_2024`
--
ALTER TABLE `january_2024`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `july_2023`
--
ALTER TABLE `july_2023`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `march_2024`
--
ALTER TABLE `march_2024`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `november_2023`
--
ALTER TABLE `november_2023`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `october_2023`
--
ALTER TABLE `october_2023`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `september_2023`
--
ALTER TABLE `september_2023`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
