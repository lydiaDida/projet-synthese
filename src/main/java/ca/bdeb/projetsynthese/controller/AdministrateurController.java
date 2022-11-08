package ca.bdeb.projetsynthese.controller;

import ca.bdeb.projetsynthese.dao.AdministrateurRepository;
import ca.bdeb.projetsynthese.models.Administrateur;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Thomas Wang on 10/31/2022.
 */
@Api(tags = "api pour administrateur")
@RestController
@RequestMapping("/api/v1/administrateur")
public class AdministrateurController {
    @Autowired
    private AdministrateurRepository administrateurRepository;

    @ApiOperation(value = "requête la list d'administrateur")
    @GetMapping("/admin")
    public List<Administrateur> findAllAdministrateurs(){
        return administrateurRepository.findAll();
    }


    // ce methode est pour test ce controller
    @ApiOperation(value="test access administrateur controller")
    @GetMapping("/test")
    public String  findTestAllAdministrateurs(){
        return "test for allAdministrate";
    }
}
