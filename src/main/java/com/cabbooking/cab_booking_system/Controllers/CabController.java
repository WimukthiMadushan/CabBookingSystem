package com.cabbooking.cab_booking_system.Controllers;

import com.cabbooking.cab_booking_system.Model.Cab;
import com.cabbooking.cab_booking_system.Service.CabService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cabs")
public class CabController {
    private final CabService cabService;

    public CabController() {
        this.cabService = new CabService();
    }
    @PostMapping("/add")
    public String addCab(@RequestBody Cab cab) {
        cabService.addCab(cab);
        return "Cab added successfully";
    }

}
