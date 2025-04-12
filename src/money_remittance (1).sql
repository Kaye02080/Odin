-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2025 at 03:37 PM
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
-- Database: `money_remittance`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_log`
--

CREATE TABLE `tbl_log` (
  `log_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `login_time` timestamp NOT NULL DEFAULT current_timestamp(),
  `u_type` varchar(50) NOT NULL,
  `log_status` enum('Pending','Active','Inactive','') NOT NULL,
  `logout_time` timestamp NULL DEFAULT NULL,
  `log_description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_log`
--

INSERT INTO `tbl_log` (`log_id`, `u_id`, `u_username`, `login_time`, `u_type`, `log_status`, `logout_time`, `log_description`) VALUES
(1, 28, 'hanseo123', '2025-03-29 12:45:06', 'Success - User Login', 'Active', NULL, ''),
(2, 24, 'paran1234', '2025-03-29 12:45:19', 'Success - Admin Login', 'Inactive', '2025-03-30 10:54:31', ''),
(3, 28, 'hanseo123', '2025-03-29 12:50:24', 'Success - User Login', 'Active', NULL, ''),
(4, 24, 'paran1234', '2025-03-29 12:50:35', 'Success - Admin Login', 'Inactive', '2025-03-30 10:54:31', ''),
(5, 24, 'paran1234', '2025-03-29 12:59:13', 'Success - Admin Login', 'Inactive', '2025-03-30 10:54:31', ''),
(6, 24, 'paran1234', '2025-03-29 12:59:58', 'Success - Admin Login', 'Inactive', '2025-03-30 10:54:31', ''),
(7, 24, 'paran1234', '2025-03-29 13:00:25', 'Success - Admin Login', 'Inactive', '2025-03-30 10:54:31', ''),
(8, 24, 'paran1234', '2025-03-29 13:05:20', 'Success - Admin Login', 'Inactive', '2025-03-30 10:54:31', ''),
(9, 24, 'paran1234', '2025-03-30 10:49:16', 'Success - Admin Login', 'Inactive', '2025-03-30 10:54:31', ''),
(10, 24, 'paran1234', '2025-03-30 10:54:26', 'Success - Admin Login', 'Inactive', '2025-03-30 10:54:31', ''),
(12, 29, 'beboy123', '2025-03-30 11:57:38', 'Success - User Login', 'Active', NULL, ''),
(13, 29, 'beboy123', '2025-03-30 12:48:21', 'Success - User Login', 'Active', NULL, ''),
(14, 29, 'beboy123', '2025-03-30 12:50:04', 'Success - User Login', 'Active', NULL, ''),
(15, 29, 'beboy123', '2025-03-30 12:53:56', 'Success - User Login', 'Active', NULL, ''),
(16, 29, 'beboy123', '2025-03-30 13:02:29', 'Success - User Login', 'Active', NULL, ''),
(17, 29, 'beboy123', '2025-03-30 13:02:39', 'Success - User Login', 'Active', NULL, ''),
(18, 29, 'beboy123', '2025-03-30 13:05:06', 'Success - User Login', 'Active', NULL, ''),
(19, 24, 'paran1234', '2025-04-12 12:24:45', 'Success - Admin Login', 'Inactive', '2025-04-12 12:26:23', NULL),
(20, 24, 'paran1234', '2025-04-12 12:25:34', 'Admin', 'Inactive', '2025-04-12 12:26:23', 'Admin Added a New Account: frans123'),
(21, 24, 'paran1234', '2025-04-12 12:28:05', 'Success - Admin Login', 'Inactive', '2025-04-12 13:35:50', NULL),
(22, 31, 'jay123', '2025-04-12 13:02:46', 'Failed - Inactive Account', 'Inactive', '2025-04-12 13:03:29', NULL),
(23, 31, 'jay123', '2025-04-12 13:03:28', 'Success - User Login', 'Inactive', '2025-04-12 13:03:29', NULL),
(24, 31, 'jay123', '2025-04-12 13:03:44', 'User Reset Their Password', 'Inactive', '2025-04-12 13:07:26', NULL),
(25, 31, 'jay123', '2025-04-12 13:06:55', 'Success - User Action', 'Inactive', '2025-04-12 13:07:26', 'User Reset Their Password'),
(26, 31, 'jay123', '2025-04-12 13:07:24', 'Success - User Login', 'Inactive', '2025-04-12 13:07:26', NULL),
(27, 33, 'rhex123', '2025-04-12 13:32:58', 'Success - User Action', 'Active', NULL, 'New user registered: rhex123'),
(28, 31, 'jay123', '2025-04-12 13:33:58', 'Success - User Login', 'Inactive', '2025-04-12 13:34:00', NULL),
(30, 31, 'jay123', '2025-04-12 13:34:23', 'Success - User Login', 'Inactive', '2025-04-12 13:34:39', NULL),
(31, 31, 'jay123', '2025-04-12 13:34:37', 'Success - User Action', 'Inactive', '2025-04-12 13:34:39', 'User Changed Their Password'),
(32, 31, 'jay123', '2025-04-12 13:35:00', 'Success - User Login', 'Active', NULL, NULL),
(33, 24, 'paran1234', '2025-04-12 13:35:22', 'Success - Admin Login', 'Inactive', '2025-04-12 13:35:50', NULL),
(34, 24, 'paran1234', '2025-04-12 13:35:30', 'Admin', 'Inactive', '2025-04-12 13:35:50', 'Deleted user account with ID: 12');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `u_id` int(11) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(255) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `security_question` varchar(255) NOT NULL,
  `security_answer` varchar(255) NOT NULL,
  `u_image` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_type`, `u_status`, `security_question`, `security_answer`, `u_image`) VALUES
(14, 'kayeshea', 'basilan', 'kaye123@gmail.com', 'kaye1233', 'NBYWrmoA/JoDM/ch9Tgq8p41ekFyon8BzFcia+U+AQc=', 'Admin', 'Active', '', '', ''),
(21, 'ross', 'sabio', 'rosssabio@gmail.com', 'ross1234', 'NBYWrmoA/JoDM/ch9Tgq8p41ekFyon8BzFcia+U+AQc=', 'Admin', 'Active', '', '', ''),
(22, 'daniel', 'failadona', 'danielfailadona@gmail.com', 'daniel1234', 'NBYWrmoA/JoDM/ch9Tgq8p41ekFyon8BzFcia+U+AQc=', 'Admin', 'Active', '', '', ''),
(24, 'benjohns', 'parans', 'benjohn@gmail.com', 'paran1234', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Admin', 'Active', '', '', ''),
(25, 'sarno', 'mamen', 'sarnomamen@gmail.com', 'mamen123', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', '', '', ''),
(28, 'han', 'seo', 'hanseo@gmail.com', 'hanseo123', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', '', '', ''),
(29, 'beboy', 'padriga', 'beboypadriga@gmail.com', 'beboy123', 'DR6kwlbNUKKnzL/SKz2ZWfb9ML2EC5/zx8Ze5OId8G0=', 'User', 'Active', 'What\'s the name of your first pet?', 'browny', 'C:\\Users\\milan\\OneDrive\\Desktop\\Odin\\src\\images\\462574929_1530386207674650_925214417452153602_n.jpg'),
(30, 'frans', 'ababa', 'fransababa@gmail.com', 'frans123', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Pending', 'User', 'What\'s the name of your first pet?', 'OstyYRKvTUuxwHH/PXNPTcb9/gMXt56CfKg7QYENPfA=', 'frans123_462581453_1264063778238587_8963988102995952736_n.jpg'),
(31, 'jay', 'boss', 'jayboss@gmail.com', 'jay123', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', 'What\'s the name of your first pet?', 'OstyYRKvTUuxwHH/PXNPTcb9/gMXt56CfKg7QYENPfA=', 'Null'),
(32, 'mark', 'pacaldo', 'markpacaldo@gmail.com', 'mark123', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', 'What\'s the name of your first pet?', 'Fkd2iMDgBpnGz6RJejYS1+g8UyBitkslD+2JCBKO1Ug=', 'Null'),
(33, 'delima', 'rhex', 'delimarhex@gmail.com', 'rhex123', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'User', 'Active', 'What\'s the name of your first pet?', 'Fkd2iMDgBpnGz6RJejYS1+g8UyBitkslD+2JCBKO1Ug=', 'Null');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `fk_log_user_id` (`u_id`);

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD CONSTRAINT `fk_log_user_id` FOREIGN KEY (`u_id`) REFERENCES `tbl_users` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
