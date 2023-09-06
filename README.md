# Flight-Reservation-with-microservices project(using java 1.8 version with Mysql)
# No of bags checking and flight reservation interact with each other using microservices
use differnet port
Flight reservation - server.servlet.context-path=/flights
http://localhost:8080/flights/confirmReservation flight reservation url

checkedin - server.servlet.context-path=/checkedIn
http://localhost:9090/checkedIn/confirmReservation
