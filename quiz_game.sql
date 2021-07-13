CREATE DATABASE quizdb;
USE quizdb;
CREATE TABLE `quiz_game` (
	`question_id` INT(5) NOT NULL AUTO_INCREMENT,
	`question_type` varchar(1) NOT NULL,
	`questions` TEXT NOT NULL,
	`option1` varchar(500) NOT NULL,
	`option2` varchar(500) NOT NULL,
	`option3` varchar(500) NOT NULL,
	`option4` varchar(500) NOT NULL,
	`answers` varchar(500) NOT NULL,
	PRIMARY KEY (`question_id`)
);
/*
Inserting easy questions in the table
*/
insert into quiz_game values(111,'e',"Ten years ago, P was half of Q's age.If the ratio of their present ages is 3:4, what will be the total of their present ages?",'30','45','35','40','c');
insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('e',"Father is aged three times more than his son Sunil. After 8 years, he would be two and a half times of Sunil's age. After further 8 years, how many times would he be of Sunil's age?",'5 times','4 times','2 times','3 times','c');
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('e',"A man's age is 125% of what it was 10 years ago, but 83 1/3% of what it will be after 10
 years. What is his present age?",'40','60','50','70','c');
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('e',"Present ages of Kiran and Syam are in the ratio 5:4. Three years hence, the ratio of their ages will become 11:9. What is Syam's present age in years?",'26','24','22','28','b');
 
 
 
 
 /*
 Inserting medium questions in the table
 */
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('m',"A man buys Rs. 20 shares paying 9% dividend. The man wants to have an interest of 12% on his money. What is the market value of each share?",'Rs.18','Rs.15','Rs.21','Rs.12','b');
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('m',"A man invested Rs.1552 in a stock at 97 to obtain an income of Rs.128. What is the dividend from the stock?",'7.5%','None of these','9.7%','8%','d');
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('m',"In order to obtain an income of Rs. 650 from 10% stock at Rs. 96, one must make an investment of",'Rs.9600','Rs.6500','Rs.6240','Rs.3100','c');
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('m',"12500 shares, of par value Rs. 20 each, are purchased from Ram by Mohan at a price of Rs. 25 each. Find the amount required to purchase the shares.",'311500','314500','312500','313500','c');
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('m',"12500 shares, of par value Rs. 20 each, are purchased from Ram by Mohan at a price of Rs. 25 each. If Mohan further sells the shares at a premium of Rs. 11 each, find his gain in the transaction.",'Rs. 70000','Rs. 65000',' Rs. 85000','Rs. 75000','d');
 
 /*
 Inserting hard questions in the table
  insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('h',"",'','','','','');
 
 */
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('h',"10 men can complete a work in 7 days. But 10 women need 14 days to complete the same work. How many days will 5 men and 10 women need to complete the work?",'8','7','5','6','d');
  insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('h',"Kamal can complete a work in 20 days. If Suresh is 25% more efficient than Kamal, he can complete the same work in _ days.",'14','20','18','16','d');
  insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('h',"P and Q can complete a work in 20 days and 12 days respectively. P alone started the work and Q joined him after 4 days till the completion of the work. How long did the work last?",'10  days','22  days','5 days','14 days','a');
 insert into quiz_game(question_type,questions,option1,option2,option3,option4,answers) values('h',"If daily wages of a man is double to that of a woman, how many men should work for 25 days to earn ₹14400 ? Given that wages for 40 women for 30 days are ₹21600",'16','14','18','12','a');