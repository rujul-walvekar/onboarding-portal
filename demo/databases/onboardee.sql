-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2021 at 07:25 PM
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

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminID` int(50) NOT NULL,
  `a_name` varchar(100) DEFAULT NULL,
  `a_num` int(255) DEFAULT NULL,
  `a_email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminID`, `a_name`, `a_num`, `a_email`) VALUES
(1, 'Vinay', 2147483647, 'vinay@accolite.digital.com'),
(2, 'Soham', 2147483647, 'soham.b@accolitedigital.com'),
(3, 'Ayushi', 2147483647, 'ayushi.s@accolitedigital.com');

-- --------------------------------------------------------

--
-- Table structure for table `board_demand`
--

CREATE TABLE `board_demand` (
  `demandID` int(50) NOT NULL,
  `adminID` int(11) DEFAULT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `board_demand`
--

INSERT INTO `board_demand` (`demandID`, `adminID`, `id`) VALUES
(1, 1, 1),
(2, 3, 2),
(3, 2, 3);

-- --------------------------------------------------------

--
-- Table structure for table `board_details`
--

CREATE TABLE `board_details` (
  `Name` char(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `num` int(15) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `location` varchar(200) DEFAULT NULL,
  `cgpa` float DEFAULT NULL,
  `skills` varchar(500) DEFAULT NULL,
  `emailID` varchar(50) DEFAULT NULL,
  `id` int(10) NOT NULL,
  `adminID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `board_details`
--

INSERT INTO `board_details` (`Name`, `age`, `num`, `company`, `location`, `cgpa`, `skills`, `emailID`, `id`, `adminID`) VALUES
('Rujul Walvekar', 21, 2147483647, 'Accolite Digital', 'Mumbai', 8.62, 'C++,Angular,SpringBoot,Java', 'rujul.walvekar@accolitedigital.com', 1, 1),
('Rima Singh', 23, 2147483647, 'Accolite India', 'Hyderabad', 8.9, 'C++,Angular,SpringBoot,Java,PHP', 'rima.s@accolitedigital.com', 2, 3),
('Riddhi', 22, 2147483647, 'Morgan Stanley', 'Bangalore HQ', 9.02, 'C++,Angular,SpringBoot,Java,PHP', 'riddhi.mongodi@accolitedigital.com', 3, 2);

-- --------------------------------------------------------

--
-- Table structure for table `board_status`
--

CREATE TABLE `board_status` (
  `b_status` varchar(50) DEFAULT NULL,
  `boarding_status` varchar(50) DEFAULT NULL,
  `adminID` int(11) DEFAULT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `board_status`
--

INSERT INTO `board_status` (`b_status`, `boarding_status`, `adminID`, `id`) VALUES
('pass', 'approved', 1, 1),
('verification needed', 'complete', 2, 3),
('rejected', 'rejected', 3, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminID`);

--
-- Indexes for table `board_demand`
--
ALTER TABLE `board_demand`
  ADD PRIMARY KEY (`demandID`),
  ADD KEY `adminID` (`adminID`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `board_details`
--
ALTER TABLE `board_details`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `emailID` (`emailID`),
  ADD UNIQUE KEY `emailID_2` (`emailID`),
  ADD KEY `adminID` (`adminID`);

--
-- Indexes for table `board_status`
--
ALTER TABLE `board_status`
  ADD KEY `adminID` (`adminID`),
  ADD KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `board_demand`
--
ALTER TABLE `board_demand`
  MODIFY `demandID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `board_details`
--
ALTER TABLE `board_details`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `board_demand`
--
ALTER TABLE `board_demand`
  ADD CONSTRAINT `board_demand_ibfk_1` FOREIGN KEY (`adminID`) REFERENCES `admin` (`adminID`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `board_demand_ibfk_2` FOREIGN KEY (`id`) REFERENCES `board_details` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `board_details`
--
ALTER TABLE `board_details`
  ADD CONSTRAINT `board_details_ibfk_1` FOREIGN KEY (`adminID`) REFERENCES `admin` (`adminID`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `board_status`
--
ALTER TABLE `board_status`
  ADD CONSTRAINT `board_status_ibfk_1` FOREIGN KEY (`adminID`) REFERENCES `admin` (`adminID`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `board_status_ibfk_2` FOREIGN KEY (`id`) REFERENCES `board_details` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
