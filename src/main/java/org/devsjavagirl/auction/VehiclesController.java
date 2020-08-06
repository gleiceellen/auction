package org.devsjavagirl.auction;

import org.devsjavagirl.auction.model.AllVehicleResponse;
import org.devsjavagirl.auction.model.VehicleResponse;
import org.devsjavagirl.auction.services.VehiclesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController {

    private final VehiclesService vehiclesService;

    public VehiclesController(VehiclesService vehiclesService) {
        this.vehiclesService = vehiclesService;
    }

    @GetMapping("/starwars/vehicles")
    public ResponseEntity<AllVehicleResponse> getVehicles() {
        return ResponseEntity.ok(vehiclesService.getVehicles());
    }

    @GetMapping("/starwars/vehicles/{id}")
    public ResponseEntity<VehicleResponse> getVehicles(@PathVariable Integer id) {
        return ResponseEntity.ok(vehiclesService.getVehicle(id));
    }
}
