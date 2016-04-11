CREATE TABLE `contact` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`last_name` varchar(100) NOT NULL,
`first_name` varchar(100) NOT NULL,
`mobile_no` varchar(11) NOT NULL,
`address` varchar(255) NOT NULL,
`date_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;