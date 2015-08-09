 insert into user values(1,'kiran','password','kiran pariyar','morang');
 insert into user values(1,'madan','password','madan dungana','ktm');
 insert into user values(3,'nabin','password','nabin phuyal','ktm');
 insert into user values(4,'laxman','password','laxman khanal','gulmi');
 insert into user values(5,'naran','password','naran dumre','syangja'); 
 update user set fullname = 'kiran pariyar' where id = 1;
 alter table user modify address varchar(50);
 delete from user where address = 'ktm';
