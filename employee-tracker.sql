CREATE DATABASE IF NOT EXISTS `web_employee_tracker`;
USE `web_employee_tracker`;

--
-- Table Structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
	`id` int(100) NOT NULL AUTO_INCREMENT,
    `name` varchar(45) DEFAULT NULL,
    `empid` int(11) DEFAULT NULL,
    `dateofjoinning` date DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    `password` varchar(45) DEFAULT NULL,
    `designation` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `EMAIL_UNIQUE` (`email`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;