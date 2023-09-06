# Flight-Reservation-with-microservices project(using java 1.8 version with Mysql)
# No of bags checking and flight reservation interact with each other using microservices
use differnet port
Flight reservation - server.servlet.context-path=/flights
http://localhost:8080/flights/confirmReservation flight reservation url

checkedin - server.servlet.context-path=/checkedIn
http://localhost:9090/checkedIn/confirmReservation


mysql
use flights

use flightspsa

CREATE TABLE USER
(
ID INT NOT NULL AUTO_INCREMENT,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(20),
EMAIL VARCHAR(120),
PASSWORD VARCHAR(256),
PRIMARY KEY(ID),
UNIQUE KEY(EMAIL)
)

select * from user

CREATE TABLE FLIGHT
(
ID INT NOT NULL AUTO_INCREMENT,
FLIGHT_NUMBER VARCHAR(20) NOT NULL,
OPERATING_AIRLINES VARCHAR(20) NOT NULL,
DEPARTURE_CITY VARCHAR(20) NOT NULL,
ARRIVAL_CITY VARCHAR(20) NOT NULL,
DATE_OF_DEPARTURE DATE NOT NULL,
ESTIMATED_DEPARTURE_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY(ID)
)

select * from FLIGHT
   
CREATE TABLE PASSENGER
(
ID      INT NOT NULL AUTO_INCREMENT,
FIRST_NAME VARCHAR(256),
LAST_NAME VARCHAR(256),
MIDDLE_NAME VARCHAR(256),
EMAIL VARCHAR(150),
PHONE VARCHAR(10),
PRIMARY KEY (ID)
)

select * from passenger

CREATE TABLE RESERVATION

(
ID INT NOT NULL AUTO_INCREMENT,
CHECKED_IN TINYINT(1),
NUMBER_OF_BAGS INT,
PASSENGER_ID INT,
FLIGHT_ID INT,
CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY(ID),
FOREIGN KEY (PASSENGER_ID) REFERENCES PASSENGER(ID) ON DELETE CASCADE,
FOREIGN KEY (FLIGHT_ID) REFERENCES FLIGHT(ID)
)
 select * from reservation
 
 desc flight
 
 insert into flight values(1,'AA1','American Airlines','Aus',
'NYC',STR_TO_DATE('02-08-2023','%m-%d-%Y'),'2023-02-08 05:14:07')

insert into flight values( 2,'UA123','United Airlines','Los Angeles',
'Chicago',  STR_TO_DATE('09-10-2023', '%m-%d-%Y'),'2023-09-10 10:30:00')

insert into flight values(3,'AA3','American Airlines','Aus',
'NYC', STR_TO_DATE('02-05-2023','%m-%d-%Y'),'2023-02-05 10:14:07')

insert into flight values(9,'AA8','American Airlines1','Aus',
'NYC', STR_TO_DATE('02-05-2023','%m-%d-%Y'),'2023-02-05 11:14:07')

insert into flight values(5,'AA5','United Airlines','NYC',
'DAL', STR_TO_DATE('02-05-2023','%m-%d-%Y'),'2023-02-05 11:14:07')

insert into flight values(6,'AA1','American Airlines','Aus',
'NYC',STR_TO_DATE('02-05-2023','%m-%d-%Y'),'2023-02-05 06:14:07')
