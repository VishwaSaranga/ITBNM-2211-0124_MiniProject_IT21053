-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 05:40 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `road_tour_drafter`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `AdminID` varchar(5) NOT NULL,
  `AdminName` varchar(50) NOT NULL,
  `AdminPassword` varchar(10) NOT NULL,
  `AdminContact` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AdminID`, `AdminName`, `AdminPassword`, `AdminContact`) VALUES
('A001', 'vishwa', '123456', '0711038899'),
('A002', 'pramith', '123789', '0775212584');

-- --------------------------------------------------------

--
-- Table structure for table `guide`
--

CREATE TABLE `guide` (
  `GuideID` varchar(5) NOT NULL,
  `GuideNIC` varchar(12) NOT NULL,
  `GuideName` varchar(50) NOT NULL,
  `GuidePassword` varchar(10) NOT NULL,
  `GuideContact` varchar(10) NOT NULL,
  `VehicleNo` varchar(12) NOT NULL,
  `VehicleModel` varchar(20) NOT NULL,
  `PriceForDay` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `guide`
--

INSERT INTO `guide` (`GuideID`, `GuideNIC`, `GuideName`, `GuidePassword`, `GuideContact`, `VehicleNo`, `VehicleModel`, `PriceForDay`) VALUES
('G001', '199804', 'Ranjan', '123789', '0785912452', 'wp AAC-1212', 'Car', 4000),
('G002', '19986525', 'Vije', '123123', '0778521245', 'up BAA-1262', 'Three weel', 2000),
('G003', '19961254', 'Tharaka', '147147', '0712589514', 'sp AAB-1111', 'Mini Bus', 7500);

-- --------------------------------------------------------

--
-- Table structure for table `tourdetails`
--

CREATE TABLE `tourdetails` (
  `TourID` varchar(10) NOT NULL,
  `TravelerId` varchar(5) NOT NULL,
  `StartCity` varchar(20) NOT NULL,
  `EndCity` varchar(20) NOT NULL,
  `Locations` varchar(100) NOT NULL,
  `Days` int(3) NOT NULL,
  `GuideId` varchar(5) NOT NULL,
  `TotalPrice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tourdetails`
--

INSERT INTO `tourdetails` (`TourID`, `TravelerId`, `StartCity`, `EndCity`, `Locations`, `Days`, `GuideId`, `TotalPrice`) VALUES
('TR002G001', 'TR002', 'Colombo', 'Jaffna', 'Kilinochchi, Anuradhapura', 2, 'G001', 8000),
('TR003G002', 'TR003', 'Gampaha', 'Galle', 'Ambalangoda', 2, 'G002', 4000);

-- --------------------------------------------------------

--
-- Table structure for table `traveler`
--

CREATE TABLE `traveler` (
  `TravelerID` varchar(5) NOT NULL,
  `TravelerNIC` varchar(12) NOT NULL,
  `TravelerName` varchar(50) NOT NULL,
  `TravelerPassword` varchar(10) NOT NULL,
  `TravelerContact` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `traveler`
--

INSERT INTO `traveler` (`TravelerID`, `TravelerNIC`, `TravelerName`, `TravelerPassword`, `TravelerContact`) VALUES
('TR001', '20010212', 'Saranga', '123456', '0711023512'),
('TR002', '20001015', 'Chathura', '123987', '0775512412'),
('TR003', '19831542', 'Tharaka', '123654', '0758451245');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`AdminID`);

--
-- Indexes for table `guide`
--
ALTER TABLE `guide`
  ADD PRIMARY KEY (`GuideID`);

--
-- Indexes for table `tourdetails`
--
ALTER TABLE `tourdetails`
  ADD PRIMARY KEY (`TourID`);

--
-- Indexes for table `traveler`
--
ALTER TABLE `traveler`
  ADD PRIMARY KEY (`TravelerID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
