package ca.bdeb.projetsynthese.controller;

import ca.bdeb.projetsynthese.models.Reservation;
import ca.bdeb.projetsynthese.services.ReservationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reservation")
@Api(tags = "API pour reservation")
public class ReservationController {
    @Autowired
    private ReservationService service;

    @GetMapping("/list")
    @ApiOperation("Récupérer la liste de reservations")
    public List<Reservation> getReservationList() {
        return service.getReservationList();
    }

    @GetMapping("/{numero}")
    @ApiOperation("Récupérer une reservation par numero")
    public Reservation getReservationByNumero(@PathVariable("numero") Integer numero) {
        return service.getReservationByNumero(numero);
    }

    @PostMapping("/add")
    @ApiOperation("Ajouter une reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return service.addReservation(reservation);
    }

    @PutMapping("/update")
    @ApiOperation("Modifier une reservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return service.updateReservation(reservation);
    }

    @DeleteMapping("/delete/{numero}")
    @ApiOperation("Supprimer une reservation par numero")
    public void deleteReservation(@PathVariable Integer numero) {
        service.deleteReservation(numero);
    }

}

