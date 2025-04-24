-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 24, 2025 at 10:21 AM
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
-- Table structure for table `tbl_loans`
--

CREATE TABLE `tbl_loans` (
  `loan_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `loan_amount` decimal(10,2) NOT NULL,
  `loan_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `loan_status` enum('PENDING','PAID','REJECTED','APPROVED') NOT NULL DEFAULT 'PENDING',
  `loan_description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_loans`
--

INSERT INTO `tbl_loans` (`loan_id`, `u_id`, `u_username`, `loan_amount`, `loan_date`, `loan_status`, `loan_description`) VALUES
(1, 33, 'rhex123', 30000.00, '2025-04-15 12:31:52', 'REJECTED', 'Loan request submitted'),
(2, 33, 'rhex123', 40000.00, '2025-04-15 12:52:24', 'REJECTED', 'Loan request submitted'),
(3, 33, 'rhex123', 40000.00, '2025-04-15 12:55:17', 'PAID', 'Loan request submitted'),
(4, 33, 'rhex123', 60000.00, '2025-04-15 12:58:11', 'PAID', 'Loan request submitted'),
(5, 33, 'rhex123', 30000.00, '2025-04-24 07:54:19', 'APPROVED', 'Loan request submitted'),
(6, 33, 'rhex123', 45000.00, '2025-04-24 08:09:44', 'APPROVED', 'Loan request submitted');

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
(27, 33, 'rhex123', '2025-04-12 13:32:58', 'Success - User Action', 'Inactive', '2025-04-24 07:54:23', 'New user registered: rhex123'),
(28, 31, 'jay123', '2025-04-12 13:33:58', 'Success - User Login', 'Inactive', '2025-04-12 13:34:00', NULL),
(30, 31, 'jay123', '2025-04-12 13:34:23', 'Success - User Login', 'Inactive', '2025-04-12 13:34:39', NULL),
(31, 31, 'jay123', '2025-04-12 13:34:37', 'Success - User Action', 'Inactive', '2025-04-12 13:34:39', 'User Changed Their Password'),
(32, 31, 'jay123', '2025-04-12 13:35:00', 'Success - User Login', 'Active', NULL, NULL),
(33, 24, 'paran1234', '2025-04-12 13:35:22', 'Success - Admin Login', 'Inactive', '2025-04-12 13:35:50', NULL),
(34, 24, 'paran1234', '2025-04-12 13:35:30', 'Admin', 'Inactive', '2025-04-12 13:35:50', 'Deleted user account with ID: 12'),
(35, 33, 'rhex123', '2025-04-15 12:27:30', 'Success - User Login', 'Inactive', '2025-04-24 07:54:23', NULL),
(36, 33, 'rhex123', '2025-04-15 12:28:58', 'Success - User Login', 'Inactive', '2025-04-24 07:54:23', NULL),
(37, 33, 'rhex123', '2025-04-15 12:31:38', 'Success - User Login', 'Inactive', '2025-04-24 07:54:23', NULL),
(38, 24, 'paran1234', '2025-04-15 12:33:20', 'Success - Admin Login', 'Inactive', '2025-04-15 12:33:33', NULL),
(39, 24, 'paran1234', '2025-04-15 12:34:02', 'Success - Admin Login', 'Active', NULL, NULL),
(40, 24, 'paran1234', '2025-04-15 12:34:44', 'Success - Admin Login', 'Active', NULL, NULL),
(41, 24, 'paran1234', '2025-04-15 12:36:35', 'Success - Admin Login', 'Active', NULL, NULL),
(42, 24, 'paran1234', '2025-04-15 12:43:08', 'Success - Admin Login', 'Active', NULL, NULL),
(43, 24, 'paran1234', '2025-04-15 12:46:08', 'Success - Admin Login', 'Active', NULL, NULL),
(44, 24, 'paran1234', '2025-04-15 12:49:35', 'Success - Admin Login', 'Active', NULL, NULL),
(45, 33, 'rhex123', '2025-04-15 12:52:17', 'Success - User Login', 'Inactive', '2025-04-24 07:54:23', NULL),
(46, 33, '', '2025-04-15 12:52:26', 'Success - User Action', 'Active', NULL, 'User Reset Their Password'),
(47, 33, 'rhex123', '2025-04-15 12:55:09', 'Success - User Login', 'Inactive', '2025-04-24 07:54:23', NULL),
(48, 33, '', '2025-04-15 12:55:18', 'Success - User Action', 'Active', NULL, 'User Loan a Money'),
(49, 33, 'rhex123', '2025-04-15 12:58:04', 'Success - User Login', 'Inactive', '2025-04-24 07:54:23', NULL),
(50, 33, 'rhex123', '2025-04-15 12:58:12', 'Success - User Action', 'Inactive', '2025-04-24 07:54:23', 'User Loan a Money'),
(51, 24, 'paran1234', '2025-04-15 13:04:11', 'Success - Admin Login', 'Active', NULL, NULL),
(52, 24, 'paran1234', '2025-04-15 13:06:27', 'Success - Admin Login', 'Active', NULL, NULL),
(53, 24, 'paran1234', '2025-04-15 13:09:27', 'Success - Admin Login', 'Active', NULL, NULL),
(54, 24, 'paran1234', '2025-04-15 13:09:30', 'Success - User Action', 'Active', NULL, 'Admin approved Loan ID: 3'),
(55, 24, 'paran1234', '2025-04-15 13:11:40', 'Success - Admin Login', 'Active', NULL, NULL),
(56, 24, 'paran1234', '2025-04-15 13:11:44', 'Success - User Action', 'Active', NULL, 'Admin rejected Loan ID: 2'),
(57, 33, 'rhex123', '2025-04-15 13:56:19', 'Success - User Login', 'Inactive', '2025-04-24 07:54:23', NULL),
(58, 24, 'paran1234', '2025-04-24 07:51:41', 'Success - Admin Login', 'Active', NULL, NULL),
(59, 24, 'paran1234', '2025-04-24 07:51:45', 'Success - User Action', 'Active', NULL, 'Admin approved Loan ID: 4'),
(60, 33, 'rhex123', '2025-04-24 07:54:08', 'Success - User Login', 'Inactive', '2025-04-24 07:54:23', NULL),
(61, 33, 'rhex123', '2025-04-24 07:54:20', 'Success - User Action', 'Inactive', '2025-04-24 07:54:23', 'User Loan a Money'),
(62, 24, 'paran1234', '2025-04-24 07:57:59', 'Success - Admin Login', 'Active', NULL, NULL),
(63, 24, 'paran1234', '2025-04-24 07:58:50', 'Success - Admin Login', 'Active', NULL, NULL),
(64, 24, 'paran1234', '2025-04-24 08:01:38', 'Success - Admin Login', 'Active', NULL, NULL),
(65, 24, 'paran1234', '2025-04-24 08:07:24', 'Success - Admin Login', 'Active', NULL, NULL),
(66, 24, 'paran1234', '2025-04-24 08:07:30', 'Success - User Action', 'Active', NULL, 'Admin approved Loan ID: 5'),
(67, 33, 'rhex123', '2025-04-24 08:09:31', 'Success - User Login', 'Inactive', '2025-04-24 08:09:49', NULL),
(68, 33, 'rhex123', '2025-04-24 08:09:45', 'Success - User Action', 'Inactive', '2025-04-24 08:09:49', 'User Loan a Money'),
(69, 24, 'paran1234', '2025-04-24 08:09:57', 'Success - Admin Login', 'Active', NULL, NULL),
(70, 24, 'paran1234', '2025-04-24 08:10:06', 'Success - User Action', 'Active', NULL, 'Admin approved Loan ID: 6');

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
-- Indexes for table `tbl_loans`
--
ALTER TABLE `tbl_loans`
  ADD PRIMARY KEY (`loan_id`),
  ADD KEY `tbl_loans_ibfk_1` (`u_id`);

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
-- AUTO_INCREMENT for table `tbl_loans`
--
ALTER TABLE `tbl_loans`
  MODIFY `loan_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_loans`
--
ALTER TABLE `tbl_loans`
  ADD CONSTRAINT `tbl_loans_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_users` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD CONSTRAINT `fk_log_user_id` FOREIGN KEY (`u_id`) REFERENCES `tbl_users` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
