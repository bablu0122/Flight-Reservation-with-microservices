package com.checkedIn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.checkedIn.integration.ReservationRestfulClient;
import com.checkedIn.integration.dto.Reservation;
import com.checkedIn.integration.dto.ReservationUpdateRequest;

@Controller
public class ReservationController {

    @Autowired
    private ReservationRestfulClient restClient;

    @RequestMapping("/startCheckIn")
    public String startCheckIn() {
        return "startCheckedIn";
    }

    @RequestMapping("/proceedCheckedIn")
    public String proceedCheckedIn(@RequestParam("id") Long id, ModelMap modelMap) {
    	Reservation reservation = restClient.findReservation(id);
        modelMap.addAttribute("reservation", reservation);

        return "displayReservation";
    }
    
    @RequestMapping("/proceedToCheckedIn")
    public String proceedToCheckedIn(@RequestParam("id") Long id, @RequestParam("numberOfBags") int numberOfBags) { 
        ReservationUpdateRequest request = new ReservationUpdateRequest();
        request.setId(id);
        request.setNumberOfBags(numberOfBags);
        request.setCheckInStatus(true);
        
        restClient.updateReservation(request);
        return "confirmReservation"; // Return the appropriate view
    }
}