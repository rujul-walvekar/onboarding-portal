-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2021 at 12:37 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `onboardee`
--
CREATE DATABASE IF NOT EXISTS `onboardee` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `onboardee`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminID` int(50) NOT NULL,
  `aName` varchar(100) NOT NULL,
  `aNum` varchar(15) NOT NULL,
  `aEmail` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminID`, `aName`, `aNum`, `aEmail`) VALUES
(1, 'Vinay', '9846377263', 'vinay@accolite.digital.com'),
(2, 'Soham', '2147483647', 'soham.b@accolitedigital.com'),
(3, 'Siddhi', '7758291145', 'ayushi.s@accolitedigital.com');

-- --------------------------------------------------------

--
-- Table structure for table `board_details`
--

CREATE TABLE `board_details` (
  `Name` char(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `num` varchar(15) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `location` varchar(200) DEFAULT NULL,
  `cgpa` float DEFAULT NULL,
  `skills` varchar(500) DEFAULT NULL,
  `emailID` varchar(50) DEFAULT NULL,
  `id` int(10) NOT NULL,
  `adminID` int(11) DEFAULT NULL,
  `demandID` int(50) DEFAULT NULL,
  `bgCheck` varchar(50) DEFAULT NULL,
  `boardingStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `board_details`
--

INSERT INTO `board_details` (`Name`, `age`, `num`, `company`, `location`, `cgpa`, `skills`, `emailID`, `id`, `adminID`, `demandID`, `bgCheck`, `boardingStatus`) VALUES
('Rima Singh', 23, '2147483647', 'Accolite India', 'Hyderabad', 8.9, 'C++,Angular,SpringBoot,Java,PHP', 'rima.s@accolitedigital.com', 2, 3, NULL, NULL, NULL),
('Pranav Bakre', 26, '8411969975', 'Apisero', 'Pune', 9.08, 'C++,Angular,SpringBoot,Java', 'psbakre123@gmail.com', 14, NULL, 110, 'Approved', 'In Process');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminID`),
  ADD UNIQUE KEY `aEmail` (`aEmail`);

--
-- Indexes for table `board_details`
--
ALTER TABLE `board_details`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `emailID` (`emailID`),
  ADD UNIQUE KEY `demandID` (`demandID`),
  ADD KEY `adminID` (`adminID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `board_details`
--
ALTER TABLE `board_details`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `board_details`
--
ALTER TABLE `board_details`
  ADD CONSTRAINT `board_details_ibfk_1` FOREIGN KEY (`adminID`) REFERENCES `admin` (`adminID`) ON DELETE SET NULL ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
