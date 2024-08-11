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
-- Database: `student_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_alert`
--

CREATE TABLE `admin_alert` (
  `MsgFrom` varchar(30) NOT NULL,
  `MsgTo` varchar(30) NOT NULL,
  `Msg` varchar(255) NOT NULL,
  `Status` varchar(30) NOT NULL,
  `time` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_alert`
--

INSERT INTO `admin_alert` (`MsgFrom`, `MsgTo`, `Msg`, `Status`, `time`) VALUES
('admin', 'INS23ICT5D10001', 'Hello All ...\r\nI am admin...\r\nThis msg is for Testing Purpose..', 'seen', '2024-04-23 20:44:05'),
('admin', 'INS23ICT5D10002', 'Hello All ...\r\nI am admin...\r\nThis msg is for Testing Purpose..', 'seen', '2024-04-23 20:44:05'),
('admin', 'JK23ICT5D20001', 'Hello All ...\r\nI am admin...\r\nThis msg is for Testing Purpose..', 'seen', '2024-04-23 20:44:05'),
('admin', 'JK23ICT5D20002', 'Hello All ...\r\nI am admin...\r\nThis msg is for Testing Purpose..', 'seen', '2024-04-23 20:44:05'),
('admin', 'JK23ICT5D20003', 'Hello All ...\r\nI am admin...\r\nThis msg is for Testing Purpose..', 'unseen', '2024-04-23 20:44:05'),
('admin', 'INS23ICT5D10001', 'Hello i am Admin\r\nThis msg is for testing purpose..', 'seen', '2024-05-11 00:25:14'),
('admin', 'INS23ICT5D10002', 'Hello i am Admin\r\nThis msg is for testing purpose..', 'seen', '2024-05-11 00:25:14'),
('admin', 'JK23ICT5D20001', 'Hello i am Admin\r\nThis msg is for testing purpose..', 'seen', '2024-05-11 00:25:14'),
('admin', 'JK23ICT5D20002', 'Hello i am Admin\r\nThis msg is for testing purpose..', 'seen', '2024-05-11 00:25:14'),
('admin', 'JK23ICT5D20003', 'Hello i am Admin\r\nThis msg is for testing purpose..', 'unseen', '2024-05-11 00:25:14');

-- --------------------------------------------------------

--
-- Table structure for table `admin_login_details`
--

CREATE TABLE `admin_login_details` (
  `userName` varchar(5) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_login_details`
--

INSERT INTO `admin_login_details` (`userName`, `password`) VALUES
('admin', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `admin_login_history`
--

CREATE TABLE `admin_login_history` (
  `HID` int(11) NOT NULL,
  `login_history` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_login_history`
--

INSERT INTO `admin_login_history` (`HID`, `login_history`) VALUES
(1, '2024-04-12 22:24:37'),
(2, '2024-04-12 22:25:08'),
(3, '2024-04-13 16:44:45'),
(4, '2024-04-16 13:36:19'),
(5, '2024-04-16 23:53:44'),
(6, '2024-04-17 22:50:35'),
(7, '2024-04-19 21:36:43'),
(8, '2024-04-21 00:18:08'),
(9, '2024-04-21 14:56:13'),
(10, '2024-04-21 22:47:05'),
(11, '2024-04-21 22:51:07'),
(12, '2024-04-21 22:53:49'),
(13, '2024-04-22 19:15:15'),
(14, '2024-04-23 14:28:41'),
(15, '2024-04-23 14:39:37'),
(16, '2024-04-23 14:49:14'),
(17, '2024-04-23 14:52:20'),
(18, '2024-04-23 14:55:02'),
(19, '2024-04-23 15:01:35'),
(20, '2024-04-23 15:03:31'),
(21, '2024-04-23 15:05:59'),
(22, '2024-04-23 15:08:09'),
(23, '2024-04-23 15:09:56'),
(24, '2024-04-23 15:11:08'),
(25, '2024-04-23 15:15:00'),
(26, '2024-04-23 15:17:29'),
(27, '2024-04-23 15:19:19'),
(28, '2024-04-23 17:23:31'),
(29, '2024-04-23 17:26:18'),
(30, '2024-04-23 17:27:54'),
(31, '2024-04-23 19:56:16'),
(32, '2024-04-23 19:58:23'),
(33, '2024-04-23 20:00:52'),
(34, '2024-04-23 20:02:26'),
(35, '2024-04-23 20:04:29'),
(36, '2024-04-23 20:35:05'),
(37, '2024-04-23 20:43:52'),
(38, '2024-04-28 15:48:11'),
(39, '2024-05-11 00:24:48');

-- --------------------------------------------------------

--
-- Table structure for table `admin_profile`
--

CREATE TABLE `admin_profile` (
  `PID` int(11) NOT NULL,
  `IMG` varchar(255) NOT NULL,
  `Theme` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_profile`
--

INSERT INTO `admin_profile` (`PID`, `IMG`, `Theme`) VALUES
(1, 'D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\1.png', 'DEFAULT');

-- --------------------------------------------------------

--
-- Table structure for table `instructor_alert`
--

CREATE TABLE `instructor_alert` (
  `MsgFrom` varchar(30) NOT NULL,
  `MsgTo` varchar(30) NOT NULL,
  `Msg` varchar(255) NOT NULL,
  `Status` varchar(30) NOT NULL,
  `time` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `instructor_alert`
--

INSERT INTO `instructor_alert` (`MsgFrom`, `MsgTo`, `Msg`, `Status`, `time`) VALUES
('oshada virajith wijesundara', 'JK23ICT5D20001', 'Hello Students \r\nThis msg is for testing purpose..', 'seen', '2024-05-11 00:26:17'),
('oshada virajith wijesundara', 'JK23ICT5D20002', 'Hello Students \r\nThis msg is for testing purpose..', 'seen', '2024-05-11 00:26:17'),
('oshada virajith wijesundara', 'JK23ICT5D20003', 'Hello Students \r\nThis msg is for testing purpose..', 'unseen', '2024-05-11 00:26:17'),
('rashmi jayasinghe', 'JK23ICT5D20001', 'Hello Students \r\nThis msg is for testing purpose..', 'seen', '2024-05-11 00:27:00'),
('rashmi jayasinghe', 'JK23ICT5D20002', 'Hello Students \r\nThis msg is for testing purpose..', 'seen', '2024-05-11 00:27:00'),
('rashmi jayasinghe', 'JK23ICT5D20003', 'Hello Students \r\nThis msg is for testing purpose..', 'unseen', '2024-05-11 00:27:00');

-- --------------------------------------------------------

--
-- Table structure for table `instructor_login_details`
--

CREATE TABLE `instructor_login_details` (
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `ProIMG` varchar(255) NOT NULL,
  `Theme` varchar(50) NOT NULL,
  `ID` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `instructor_login_details`
--

INSERT INTO `instructor_login_details` (`userName`, `password`, `ProIMG`, `Theme`, `ID`) VALUES
('oshada123', 'Oshada@123', 'D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\3.png', 'DEFAULT', 'INS23ICT5D10002'),
('Rashmi123', 'Rashmi@123', 'D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\10.png', 'DEFAULT', 'INS23ICT5D10001');

-- --------------------------------------------------------

--
-- Table structure for table `instructor_login_history`
--

CREATE TABLE `instructor_login_history` (
  `login_history` datetime NOT NULL DEFAULT current_timestamp(),
  `UserName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `instructor_login_history`
--

INSERT INTO `instructor_login_history` (`login_history`, `UserName`) VALUES
('2024-04-17 22:45:57', 'Rashmi123'),
('2024-04-17 22:54:15', 'Rashmi123'),
('2024-04-18 13:55:05', 'Rashmi123'),
('2024-04-18 22:44:44', 'Rashmi123'),
('2024-04-18 23:24:54', 'Rashmi123'),
('2024-04-18 23:28:30', 'Rashmi123'),
('2024-04-18 23:30:14', 'Rashmi123'),
('2024-04-18 23:33:34', 'Rashmi123'),
('2024-04-18 23:35:47', 'Rashmi123'),
('2024-04-18 23:38:51', 'Rashmi123'),
('2024-05-01 23:40:14', 'Rashmi123'),
('2024-04-18 23:46:06', 'Rashmi123'),
('2024-04-18 23:50:59', 'Rashmi123'),
('2024-04-19 01:03:19', 'Rashmi123'),
('2024-04-19 01:01:33', 'Rashmi123'),
('2024-04-19 01:08:09', 'Rashmi123'),
('2024-04-19 12:01:52', 'Rashmi123'),
('2024-04-19 12:03:34', 'Rashmi123'),
('2024-04-21 01:08:22', 'Rashmi123'),
('2024-04-21 01:08:58', 'Rashmi123'),
('2024-04-21 14:35:53', 'Rashmi123'),
('2024-04-21 14:54:00', 'Rashmi123'),
('2024-04-23 16:17:34', 'Rashmi123'),
('2024-04-23 19:51:41', 'Rashmi123'),
('2024-04-23 19:54:45', 'Rashmi123'),
('2024-04-23 20:06:00', 'Rashmi123'),
('2024-04-23 20:08:14', 'Rashmi123'),
('2024-04-23 20:10:03', 'Rashmi123'),
('2024-04-23 20:11:52', 'Rashmi123'),
('2024-04-23 20:17:33', 'Rashmi123'),
('2024-04-23 20:45:38', 'Rashmi123'),
('2024-05-07 14:07:17', 'oshada123'),
('2024-05-10 23:16:01', 'Oshada123'),
('2024-05-11 00:01:25', 'Oshada123'),
('2024-05-11 00:25:31', 'Oshada123'),
('2024-05-11 00:26:43', 'Rashmi123'),
('2024-05-11 00:27:14', 'Oshada123');

-- --------------------------------------------------------

--
-- Table structure for table `instructor_registration`
--

CREATE TABLE `instructor_registration` (
  `ID` varchar(15) NOT NULL,
  `Full_Name` varchar(255) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` char(1) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Phone_No` varchar(10) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `reg_date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `instructor_registration`
--

INSERT INTO `instructor_registration` (`ID`, `Full_Name`, `DOB`, `Gender`, `Email`, `Phone_No`, `Address`, `reg_date`) VALUES
('INS23ICT5D10001', 'rashmi jayasinghe', '1990-06-19', 'F', 'dhanush0000dhanu@gmail.com', '0776265381', 'Nuwara', '2024-03-29 21:38:06'),
('INS23ICT5D10002', 'oshada virajith wijesundara', '1985-08-16', 'M', 'dhanush66dhanush@gmail.com', '0716342612', 'Bandarawala', '2024-03-29 21:48:05');

-- --------------------------------------------------------

--
-- Table structure for table `students_assignments`
--

CREATE TABLE `students_assignments` (
  `File_Name` varchar(255) NOT NULL,
  `File_Location` varchar(255) NOT NULL,
  `time` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students_assignments`
--

INSERT INTO `students_assignments` (`File_Name`, `File_Location`, `time`) VALUES
('OCT  - 16 2023 GD assignment-1.pdf', 'D:\\ICT Level 05 (Diploma)\\NVQ 05 ICT Assignments\\Semester 1\\October Assignments\\OCT  - 16 2023 GD assignment-1.pdf', '2024-04-21 14:53:37'),
('OCT  - 26 2023 SP Assignment-1.pdf', 'D:\\ICT Level 05 (Diploma)\\NVQ 05 ICT Assignments\\Semester 1\\October Assignments\\OCT  - 26 2023 SP Assignment-1.pdf', '2024-04-21 14:53:37'),
('OCT - 30 2023 MWI Assignment-1.pdf', 'D:\\ICT Level 05 (Diploma)\\NVQ 05 ICT Assignments\\Semester 1\\October Assignments\\OCT - 30 2023 MWI Assignment-1.pdf', '2024-04-21 14:53:37');

-- --------------------------------------------------------

--
-- Table structure for table `students_notes`
--

CREATE TABLE `students_notes` (
  `File_Name` varchar(255) NOT NULL,
  `File_Location` varchar(255) NOT NULL,
  `time` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students_notes`
--

INSERT INTO `students_notes` (`File_Name`, `File_Location`, `time`) VALUES
('1.pdf', 'C:\\Users\\Dhanush\\Desktop\\New folder\\1.pdf', '2024-04-20 21:59:35'),
('2.pdf', 'C:\\Users\\Dhanush\\Desktop\\New folder\\2.pdf', '2024-04-20 21:59:35'),
('3.pdf', 'C:\\Users\\Dhanush\\Desktop\\New folder\\3.pdf', '2024-04-20 21:59:35'),
('4.pdf', 'C:\\Users\\Dhanush\\Desktop\\New folder\\4.pdf', '2024-04-20 21:59:36'),
('5.pdf', 'C:\\Users\\Dhanush\\Desktop\\New folder\\5.pdf', '2024-04-20 21:59:36');

-- --------------------------------------------------------

--
-- Table structure for table `students_testpapers`
--

CREATE TABLE `students_testpapers` (
  `File_Name` varchar(255) NOT NULL,
  `File_Location` varchar(255) NOT NULL,
  `time` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student_login_details`
--

CREATE TABLE `student_login_details` (
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `ProIMG` varchar(255) NOT NULL,
  `Theme` varchar(50) NOT NULL,
  `MIS_No` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_login_details`
--

INSERT INTO `student_login_details` (`userName`, `password`, `ProIMG`, `Theme`, `MIS_No`) VALUES
('bawan15', 'Bawan@2003', 'D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\4.png', 'DEFAULT', 'JK23ICT5D20004'),
('dhanush66', 'Dhanush@2005', 'D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\2.png', 'DEFAULT', 'JK23ICT5D20001'),
('Jaya_123', 'Jaya@123', 'D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\10.png', 'DEFAULT', 'JK23ICT5D20003'),
('Kabil_09', 'mjkd1896', 'D:\\Java NetBeans Workplace\\student_Management\\src\\main\\java\\imgs\\Profile imgs\\7.png', 'DEFAULT', 'JK23ICT5D20002');

-- --------------------------------------------------------

--
-- Table structure for table `student_login_history`
--

CREATE TABLE `student_login_history` (
  `login_history` datetime NOT NULL DEFAULT current_timestamp(),
  `UserName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_login_history`
--

INSERT INTO `student_login_history` (`login_history`, `UserName`) VALUES
('2024-04-16 21:06:20', 'Kabil_09'),
('2024-04-16 21:22:25', 'Kabil_09'),
('2024-04-16 23:52:34', 'Kabil_09'),
('2024-04-17 00:05:25', 'Kabil_09'),
('2024-04-17 19:53:12', 'Jaya_123'),
('2024-04-17 19:56:24', 'Jaya_123'),
('2024-04-17 20:01:36', 'Jaya_123'),
('2024-04-18 12:52:23', 'Jaya_123'),
('2024-04-21 14:10:03', 'Kabil_09'),
('2024-04-21 14:36:56', 'Kabil_09'),
('2024-04-21 14:55:11', 'Kabil_09'),
('2024-04-21 14:55:48', 'Jaya_123'),
('2024-04-23 20:26:07', 'Kabil_09'),
('2024-04-23 20:46:09', 'Kabil_09'),
('2024-05-07 12:44:55', 'jaya_123'),
('2024-05-07 12:45:37', 'Jaya_123'),
('2024-05-07 13:59:35', 'dhanush66'),
('2024-05-10 23:13:34', 'Dhanush66'),
('2024-05-11 00:27:41', 'Dhanush66'),
('2024-05-11 13:00:13', 'Kabil_09'),
('2024-05-11 13:10:19', 'bawan15');

-- --------------------------------------------------------

--
-- Table structure for table `student_registration`
--

CREATE TABLE `student_registration` (
  `MIS_No` varchar(14) NOT NULL,
  `Full_Name` varchar(255) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Phone_No` varchar(10) NOT NULL,
  `reg_date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_registration`
--

INSERT INTO `student_registration` (`MIS_No`, `Full_Name`, `DOB`, `Gender`, `Email`, `Address`, `Phone_No`, `reg_date`) VALUES
('JK23ICT5D20001', 'M.Dhanush', '2005-01-06', 'M', 'dhanush0000dhanu@gmail.com', 'Ragala', '0759561933', '2024-03-12 22:41:18'),
('JK23ICT5D20002', 'ABC', '2003-04-09', 'M', 'kabileshwaran1896@gmail.com', 'Ragala Halgranoya', '0784294012', '2024-03-12 22:43:26'),
('JK23ICT5D20003', 'XYZ', '1990-05-17', 'F', 'jaya123@gmail.com', 'Highforest', '0760890951', '2024-03-27 23:21:09'),
('JK23ICT5D20004', 'Bawanthika', '1992-02-02', 'F', 'dhanush66dhanush@gmail.com', 'Hatton', '0759561933', '2024-05-11 13:10:05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_login_history`
--
ALTER TABLE `admin_login_history`
  ADD PRIMARY KEY (`HID`);

--
-- Indexes for table `admin_profile`
--
ALTER TABLE `admin_profile`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `instructor_login_details`
--
ALTER TABLE `instructor_login_details`
  ADD PRIMARY KEY (`userName`),
  ADD KEY `fk_id` (`ID`);

--
-- Indexes for table `instructor_login_history`
--
ALTER TABLE `instructor_login_history`
  ADD KEY `UserName` (`UserName`);

--
-- Indexes for table `instructor_registration`
--
ALTER TABLE `instructor_registration`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Phone_No` (`Phone_No`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- Indexes for table `student_login_details`
--
ALTER TABLE `student_login_details`
  ADD PRIMARY KEY (`userName`) USING BTREE,
  ADD UNIQUE KEY `MIS_No` (`MIS_No`);

--
-- Indexes for table `student_login_history`
--
ALTER TABLE `student_login_history`
  ADD KEY `UserName` (`UserName`);

--
-- Indexes for table `student_registration`
--
ALTER TABLE `student_registration`
  ADD PRIMARY KEY (`MIS_No`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_profile`
--
ALTER TABLE `admin_profile`
  MODIFY `PID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `instructor_login_details`
--
ALTER TABLE `instructor_login_details`
  ADD CONSTRAINT `fk_id` FOREIGN KEY (`ID`) REFERENCES `instructor_registration` (`ID`);

--
-- Constraints for table `instructor_login_history`
--
ALTER TABLE `instructor_login_history`
  ADD CONSTRAINT `instructor_login_history_ibfk_1` FOREIGN KEY (`UserName`) REFERENCES `instructor_login_details` (`userName`);

--
-- Constraints for table `student_login_details`
--
ALTER TABLE `student_login_details`
  ADD CONSTRAINT `fk_MIS_No` FOREIGN KEY (`MIS_No`) REFERENCES `student_registration` (`MIS_No`);

--
-- Constraints for table `student_login_history`
--
ALTER TABLE `student_login_history`
  ADD CONSTRAINT `student_login_history_ibfk_1` FOREIGN KEY (`UserName`) REFERENCES `student_login_details` (`userName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
