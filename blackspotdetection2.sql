-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 25, 2022 at 08:34 AM
-- Server version: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `blackspotdetection2`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `email` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email`, `password`) VALUES
('sneha@gmail.com', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `blackspots`
--

CREATE TABLE IF NOT EXISTS `blackspots` (
  `Location` varchar(60) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `Reason` varchar(60) NOT NULL,
  `Latitude` varchar(60) NOT NULL,
  `Longitude` varchar(60) NOT NULL,
  `Level` varchar(60) NOT NULL,
  `City` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blackspots`
--

INSERT INTO `blackspots` (`Location`, `Address`, `Reason`, `Latitude`, `Longitude`, `Level`, `City`) VALUES
('Sindhi colony', 'Tollway Road,Dondaicha', 'Accident', '12.5', '10.5', '2', 'Dondaicha'),
('Savalde ', 'Savalde ,Dhule bypass', 'Accident', '13.6', '16.7', '2', 'Shirpur'),
('Mahadev Temple', 'near ganesh hospital', 'Crime', '15.5', '17.8', '0', 'Shahada'),
('Nirmal mall', 'near hasti school', 'Crime', '54.2', '65.3', '1', 'Malegaon'),
('Big Bazaar', 'main highway', 'Fight', '52.5', '65.3', '1', 'Thane'),
('Sai baba mandir', 'Kalher Thane Bypass', 'Political fight', '52.3', '54.1', '0', 'Kalher'),
('Shivaji Natya Mandir', 'Main road , nandurbar', 'School bus accident', '13.5', '45.0', '1', 'Nandurbar');

-- --------------------------------------------------------

--
-- Table structure for table `policestation`
--

CREATE TABLE IF NOT EXISTS `policestation` (
  `StationName` varchar(60) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `Contact` varchar(60) NOT NULL,
  `Emailid` varchar(60) NOT NULL,
  `pass` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `policestation`
--

INSERT INTO `policestation` (`StationName`, `Address`, `Contact`, `Emailid`, `pass`) VALUES
('Dondaicha Station', 'Dhule road,Dondaicha', '425408', 'dondaicha@gmail.com', '123'),
('Kalher Station', 'Market Road,kalher', '3456', 'kalher@gmail.com', '555'),
('Thane Station', 'Railway Station road,thane', '67890', 'thane@gmail.com', '666'),
('Shahada Station', 'near mahadev mandir,shahada', '4567', 'shahada@gmail.com', '888');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `NAME` varchar(60) NOT NULL,
  `EMAILID` varchar(60) NOT NULL,
  `MOBILE` varchar(60) NOT NULL,
  `PASSWORD` varchar(60) NOT NULL,
  `CITY` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`NAME`, `EMAILID`, `MOBILE`, `PASSWORD`, `CITY`) VALUES
('Sneha Girase', 'girase@gmail.com', '832948', '222', 'Dondaicha'),
('Lokesh Girase', 'lokesh@gmail.com', '963730', '333', 'Shirpur');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
