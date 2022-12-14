package ca.bdeb.projetsynthese.controller;

import ca.bdeb.projetsynthese.dto.CritereHebergementDTO;
import ca.bdeb.projetsynthese.dto.HebergementDTO;
import ca.bdeb.projetsynthese.dto.IndisponibiliteDeLogementDTO;
import ca.bdeb.projetsynthese.dto.UserDTO;
import ca.bdeb.projetsynthese.models.Hebergement;

import ca.bdeb.projetsynthese.services.HebergementService;
import ca.bdeb.projetsynthese.vo.HebergementVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Api(tags = "API pour hebergement")
@RestController
@RequestMapping("/api/v1/hebergement")
//@CrossOrigin(origins = "*")
public class HebergementController {
    @Autowired
    private HebergementService service;

    @ApiOperation(value = "Récupérer la list des hebergements")
    @GetMapping("/list")
    public List<Hebergement> getList() {
        return service.getList();
    }

    @ApiOperation(value = "Récupérer l'hebergement spécifié par id")
    @GetMapping("/{id}")
    public Hebergement getById(@ApiParam("Hebergement Id") @PathVariable int id) {
        return service.getById(id);
    }

    @ApiOperation(value = "Ajouter un nouvel hebergement")
    @PostMapping("/add")
    public Hebergement add(@RequestBody Hebergement hebergement) {
        return service.add(hebergement);
    }

    @ApiOperation(value = "Modifer un hebergement")
    @PutMapping("/update")
    public Hebergement update(@RequestBody Hebergement hebergement) {
        return service.update(hebergement);
    }

    @ApiOperation(value = "Supprimer un hebergement")
    @DeleteMapping("/delete/{id}")
    public void delete(@ApiParam("Hebergement Id") @PathVariable Integer id) {
        service.delete(id);
    }

    /**
     * method is for get available herbergement avec his indisponibilite list
     *
     * @return map available with his indisponibilite list
     * if indisponibilite list is null, it means hebergement is available all time
     */
    @ApiOperation(value = "Récupérer la liste de l'hébergement par requête critère. " +
            "retourner un map de hebergemment disponible avec leur liste indisponibilite")
    @GetMapping("/critere")
    public List<HebergementVO> list(@RequestParam float prixMin,
                                    @RequestParam float prixMax,
                                    @RequestParam String typeDeHebergementId,
                                    @RequestParam String secteurDeHebergementId,
                                    @RequestParam String dateDeArrive,
                                    @RequestParam String dateDeDepart) {

        // construire objet de critere
        CritereHebergementDTO critereHebergementDTO = new CritereHebergementDTO();
        critereHebergementDTO.setPrixMin(prixMin);
        critereHebergementDTO.setPrixMax(prixMax);
        critereHebergementDTO.setTypeDeHebergementId(Integer.valueOf(typeDeHebergementId));
        critereHebergementDTO.setSecteurDeHebergementId(Integer.valueOf(secteurDeHebergementId));
        critereHebergementDTO.setDateDeArrive(LocalDate.parse(dateDeArrive, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        critereHebergementDTO.setDateDeDepart(LocalDate.parse(dateDeDepart, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("CritereHebergementDTO in controllor: => " + critereHebergementDTO);
        System.out.println("================================================");

        // recuperer donnees
        List<HebergementDTO> hebergementDTOList = service.getListByCriteria(critereHebergementDTO);
        System.out.println(hebergementDTOList);

        // translate DTO to VO
        List<HebergementVO> hebergementVOList = new ArrayList<>();
        if (!hebergementDTOList.isEmpty()) {
            for (HebergementDTO hebergementDTO : hebergementDTOList) {
                hebergementVOList.add(hebergementDTO.asVO());
            }
        }

        return hebergementVOList;
    }

}
