package ca.bdeb.projetsynthese.controller;

import ca.bdeb.projetsynthese.models.IndisponibiliteDeLogement;
import ca.bdeb.projetsynthese.services.IndisponibiliteDeLogementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/IndisponibiliteDeLogement")
@Api(tags = "API pour indisponibilite de logement")
public class IndisponibiliteDeLogementController {
    @Autowired
    private IndisponibiliteDeLogementService service;

    @GetMapping("/list")
    @ApiOperation(value ="Récupérer une indisponibilite de logement par id")
    public List<IndisponibiliteDeLogement> getIndisponibiliteDeLogementList() {
       return service.getIndisponibiliteDeLogementList();
    }

    @GetMapping("/{id}")
    @ApiOperation(value ="Récupérer une indisponibilite de logement")
    public IndisponibiliteDeLogement getIndisponibiliteDeLogementById(@PathVariable("id") Integer id) {
        return service.getIndisponibiliteDeLogementById(id);
    }

    @PostMapping("/add")
    @ApiOperation(value ="Ajouter une indisponibilite de logement")
    public IndisponibiliteDeLogement addIndisponibiliteDeLogement(
            @RequestBody IndisponibiliteDeLogement indisponibiliteDeLogement){
        return service.addIndisponibiliteDeLogement(indisponibiliteDeLogement);
    }

    @PutMapping("/update")
    @ApiOperation(value ="Modifie une indisponibilite de logement")
    public IndisponibiliteDeLogement updateIndisponibiliteDeLogement(
            @RequestBody IndisponibiliteDeLogement indisponibiliteDeLogement) {
        return service.updateIndisponibiliteDeLogement(indisponibiliteDeLogement);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value ="Supprimer une indisponibilite de logement by id")
    public void deleteIndisponibiliteDeLogement(@PathVariable("id") Integer id){
        service.deleteIndisponibiliteDeLogement(id);
    }

}
