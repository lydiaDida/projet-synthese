package ca.bdeb.projetsynthese.controller;

import ca.bdeb.projetsynthese.models.SecteurDeHebergement;
import ca.bdeb.projetsynthese.services.SecteurDeHebergementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Thomas Wang on 11/7/2022.
 */
@RestController
public class SecteurDeHebergementController {
    @Autowired
    private SecteurDeHebergementService secteurDeHebergementService;

    @GetMapping("/secteurDeHeberge")
    public List<SecteurDeHebergement> getSecteurDeHebergement() {
        return secteurDeHebergementService.getSecteurDeHebergementList();
    }
}
