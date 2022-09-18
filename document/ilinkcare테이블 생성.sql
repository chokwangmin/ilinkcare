-- ilinkcare.child definition

CREATE TABLE `child` (
  `child_no` int(8) NOT NULL AUTO_INCREMENT COMMENT '���� ��ȣ',
  `user_no` int(8) NOT NULL COMMENT '�� ��ȣ',
  `name` varchar(20) NOT NULL COMMENT '���� �̸�',
  `birth` date NOT NULL COMMENT '���� ����',
  `gender` char(1) NOT NULL COMMENT '����',
  `created_dt` datetime NOT NULL COMMENT '����Ͻ�',
  `created_by` int(8) NOT NULL COMMENT '�����',
  `update_dt` datetime NOT NULL COMMENT '�����Ͻ�',
  `update_by` int(8) NOT NULL COMMENT '������',
  PRIMARY KEY (`child_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ilinkcare.comment definition

CREATE TABLE `comment` (
  `comment_no` int(8) NOT NULL AUTO_INCREMENT COMMENT '������ ��ȣ',
  `user_no` int(8) NOT NULL COMMENT '����ȣ',
  `teacher_no` int(8) NOT NULL COMMENT '���� ��ȣ',
  `order_no` int(20) NOT NULL COMMENT '�ֹ���ȣ',
  `content` varchar(20) NOT NULL COMMENT '������ ����',
  `created_dt` datetime NOT NULL COMMENT '����Ͻ�',
  `created_by` int(8) NOT NULL COMMENT '�����',
  `update_dt` datetime NOT NULL COMMENT '�����Ͻ�',
  `update_by` int(8) NOT NULL COMMENT '������',
  PRIMARY KEY (`comment_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ilinkcare.orders definition

CREATE TABLE `orders` (
  `order_no` int(20) NOT NULL AUTO_INCREMENT COMMENT '�ֹ���ȣ',
  `user_no` int(8) NOT NULL COMMENT '����ȣ',
  `to_name` varchar(20) NOT NULL COMMENT '�޴���',
  `to_addr` varchar(20) NOT NULL COMMENT '�湮�ּ�',
  `to_tel` varchar(20) NOT NULL COMMENT '����ó',
  `care_time` char(2) NOT NULL COMMENT '�����ð�(4,6,8�ð�)',
  `child_no` int(8) NOT NULL COMMENT '���� ��ȣ',
  `teacher_no` int(8) NOT NULL COMMENT '�����ȣ',
  `start_time` datetime NOT NULL COMMENT '�������۽ð�',
  `end_time` datetime NOT NULL COMMENT '��������ð�',
  `status` varchar(10) NOT NULL COMMENT '����ܰ�',
  `contract` varchar(20) NOT NULL COMMENT 'ü�Ῡ��',
  `contract_time` datetime NOT NULL COMMENT 'ü��ð�',
  `created_dt` datetime NOT NULL COMMENT '�ֹ��Ͻ�',
  `created_by` int(8) NOT NULL COMMENT '�ֹ���',
  `update_dt` datetime NOT NULL COMMENT '�����Ͻ�',
  `update_by` int(8) NOT NULL COMMENT '������',
  PRIMARY KEY (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ilinkcare.teacher definition

CREATE TABLE `teacher` (
  `teacher_no` int(8) NOT NULL AUTO_INCREMENT COMMENT '�����ȣ',
  `teacher_id` varchar(20) NOT NULL COMMENT '������̵�',
  `name` varchar(20) NOT NULL COMMENT '���� �̸�',
  `password` varchar(45) NOT NULL COMMENT '��й�ȣ',
  `birth` date NOT NULL COMMENT '�������',
  `email` varchar(50) NOT NULL COMMENT '�̸���',
  `address1` varchar(100) NOT NULL COMMENT '�ּ�1',
  `address2` varchar(100) NOT NULL COMMENT '�ּ�2',
  `zip_cd` varchar(10) NOT NULL COMMENT '�����ȣ',
  `phone_num` varchar(14) NOT NULL COMMENT '�޴�����ȣ',
  `gender` char(1) NOT NULL COMMENT '����',
  `created_dt` datetime NOT NULL COMMENT '����Ͻ�',
  `created_by` int(8) NOT NULL COMMENT '�����',
  `update_dt` datetime NOT NULL COMMENT '�����Ͻ�',
  `update_by` int(8) NOT NULL COMMENT '������',
  `status` varchar(10) NOT NULL COMMENT '����ܰ�',
  `posting` varchar(10) NOT NULL COMMENT '������ �Խÿ���',
  PRIMARY KEY (`teacher_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- ilinkcare.`user` definition

CREATE TABLE `user` (
  `user_no` int(8) NOT NULL AUTO_INCREMENT COMMENT '����ȣ',
  `user_id` varchar(20) NOT NULL COMMENT '���̵�',
  `user_name` varchar(20) NOT NULL COMMENT '�̸�',
  `password` varchar(45) NOT NULL COMMENT '��й�ȣ',
  `birth` date NOT NULL COMMENT '����',
  `email` varchar(50) NOT NULL COMMENT '�̸���',
  `address1` varchar(100) NOT NULL COMMENT '�ּ�1',
  `address2` varchar(100) NOT NULL COMMENT '�ּ�2',
  `zip_cd` varchar(10) NOT NULL COMMENT '�����ȣ',
  `phone_num` varchar(14) NOT NULL COMMENT '�޴�����ȣ',
  `gender` char(1) NOT NULL COMMENT '����',
  `created_dt` datetime NOT NULL COMMENT '����Ͻ�',
  `created_by` int(8) NOT NULL COMMENT '�����',
  `update_dt` datetime NOT NULL COMMENT '�����Ͻ�',
  `update_by` int(8) NOT NULL COMMENT '������',
  PRIMARY KEY (`user_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;