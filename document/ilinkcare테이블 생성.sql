-- ilinkcare.child definition

CREATE TABLE `child` (
  `child_no` int(8) NOT NULL AUTO_INCREMENT COMMENT '아이 번호',
  `user_no` int(8) NOT NULL COMMENT '고객 번호',
  `name` varchar(20) NOT NULL COMMENT '아이 이름',
  `birth` date NOT NULL COMMENT '아이 생일',
  `gender` char(1) NOT NULL COMMENT '성별',
  `created_dt` datetime NOT NULL COMMENT '등록일시',
  `created_by` int(8) NOT NULL COMMENT '등록자',
  `update_dt` datetime NOT NULL COMMENT '수정일시',
  `update_by` int(8) NOT NULL COMMENT '수정자',
  PRIMARY KEY (`child_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ilinkcare.comment definition

CREATE TABLE `comment` (
  `comment_no` int(8) NOT NULL AUTO_INCREMENT COMMENT '한줄평 번호',
  `user_no` int(8) NOT NULL COMMENT '고객번호',
  `teacher_no` int(8) NOT NULL COMMENT '교사 번호',
  `order_no` int(20) NOT NULL COMMENT '주문번호',
  `content` varchar(20) NOT NULL COMMENT '한줄평 내용',
  `created_dt` datetime NOT NULL COMMENT '등록일시',
  `created_by` int(8) NOT NULL COMMENT '등록자',
  `update_dt` datetime NOT NULL COMMENT '수정일시',
  `update_by` int(8) NOT NULL COMMENT '수정자',
  PRIMARY KEY (`comment_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ilinkcare.orders definition

CREATE TABLE `orders` (
  `order_no` int(20) NOT NULL AUTO_INCREMENT COMMENT '주문번호',
  `user_no` int(8) NOT NULL COMMENT '고객번호',
  `to_name` varchar(20) NOT NULL COMMENT '받는이',
  `to_addr` varchar(20) NOT NULL COMMENT '방문주소',
  `to_tel` varchar(20) NOT NULL COMMENT '연락처',
  `care_time` char(2) NOT NULL COMMENT '교육시간(4,6,8시간)',
  `child_no` int(8) NOT NULL COMMENT '아이 번호',
  `teacher_no` int(8) NOT NULL COMMENT '교사번호',
  `start_time` datetime NOT NULL COMMENT '교육시작시간',
  `end_time` datetime NOT NULL COMMENT '교육종료시간',
  `status` varchar(10) NOT NULL COMMENT '진행단계',
  `contract` varchar(20) NOT NULL COMMENT '체결여부',
  `contract_time` datetime NOT NULL COMMENT '체결시간',
  `created_dt` datetime NOT NULL COMMENT '주문일시',
  `created_by` int(8) NOT NULL COMMENT '주문자',
  `update_dt` datetime NOT NULL COMMENT '수정일시',
  `update_by` int(8) NOT NULL COMMENT '수정자',
  PRIMARY KEY (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ilinkcare.teacher definition

CREATE TABLE `teacher` (
  `teacher_no` int(8) NOT NULL AUTO_INCREMENT COMMENT '교사번호',
  `teacher_id` varchar(20) NOT NULL COMMENT '교사아이디',
  `name` varchar(20) NOT NULL COMMENT '교사 이름',
  `password` varchar(45) NOT NULL COMMENT '비밀번호',
  `birth` date NOT NULL COMMENT '교사생일',
  `email` varchar(50) NOT NULL COMMENT '이메일',
  `address1` varchar(100) NOT NULL COMMENT '주소1',
  `address2` varchar(100) NOT NULL COMMENT '주소2',
  `zip_cd` varchar(10) NOT NULL COMMENT '우편번호',
  `phone_num` varchar(14) NOT NULL COMMENT '휴대폰번호',
  `gender` char(1) NOT NULL COMMENT '성별',
  `created_dt` datetime NOT NULL COMMENT '등록일시',
  `created_by` int(8) NOT NULL COMMENT '등록자',
  `update_dt` datetime NOT NULL COMMENT '수정일시',
  `update_by` int(8) NOT NULL COMMENT '수정자',
  `status` varchar(10) NOT NULL COMMENT '진행단계',
  `posting` varchar(10) NOT NULL COMMENT '프로필 게시여부',
  PRIMARY KEY (`teacher_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- ilinkcare.`user` definition

CREATE TABLE `user` (
  `user_no` int(8) NOT NULL AUTO_INCREMENT COMMENT '고객번호',
  `user_id` varchar(20) NOT NULL COMMENT '아이디',
  `user_name` varchar(20) NOT NULL COMMENT '이름',
  `password` varchar(45) NOT NULL COMMENT '비밀번호',
  `birth` date NOT NULL COMMENT '생일',
  `email` varchar(50) NOT NULL COMMENT '이메일',
  `address1` varchar(100) NOT NULL COMMENT '주소1',
  `address2` varchar(100) NOT NULL COMMENT '주소2',
  `zip_cd` varchar(10) NOT NULL COMMENT '우편번호',
  `phone_num` varchar(14) NOT NULL COMMENT '휴대폰번호',
  `gender` char(1) NOT NULL COMMENT '성별',
  `created_dt` datetime NOT NULL COMMENT '등록일시',
  `created_by` int(8) NOT NULL COMMENT '등록자',
  `update_dt` datetime NOT NULL COMMENT '수정일시',
  `update_by` int(8) NOT NULL COMMENT '수정자',
  PRIMARY KEY (`user_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;