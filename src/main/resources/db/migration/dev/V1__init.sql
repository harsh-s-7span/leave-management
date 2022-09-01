
CREATE TABLE `department` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `x_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `experience` float DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `salary` float DEFAULT NULL,
  `x_id` binary(16) DEFAULT NULL,
  `department_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbejtwvg9bxus2mffsm3swj3u9` (`department_id`),
  CONSTRAINT `FKbejtwvg9bxus2mffsm3swj3u9` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `leaves` (
  `id` bigint(20) NOT NULL,
  `apply_date` date DEFAULT NULL,
  `available_leaves` float DEFAULT NULL,
  `duration` float DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `leave_span` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `to_date` date DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `x_id` binary(16) DEFAULT NULL,
  `emp_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4h9fhxapdjn7vlalyungsr8h9` (`emp_id`),
  CONSTRAINT `FK4h9fhxapdjn7vlalyungsr8h9` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `address` (
  `id` bigint(20) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `house_no` int(11) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `x_id` binary(16) DEFAULT NULL,
  `emp_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqle0sh55wsafol7dkqfqu1shc` (`emp_id`),
  CONSTRAINT `FKqle0sh55wsafol7dkqfqu1shc` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

