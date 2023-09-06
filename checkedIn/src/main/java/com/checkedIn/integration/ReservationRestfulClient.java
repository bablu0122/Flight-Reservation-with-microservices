package com.checkedIn.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.checkedIn.integration.dto.Reservation;
import com.checkedIn.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
