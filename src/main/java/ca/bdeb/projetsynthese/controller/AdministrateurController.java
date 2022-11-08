package ca.bdeb.projetsynthese.controller;

import ca.bdeb.projetsynthese.dao.AdministrateurRepository;
import ca.bdeb.projetsynthese.models.Administrateur;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Thomas Wang on 10/31/2022.
 */
@RestController
public class AdministrateurController {
    @Autowired
    private AdministrateurRepository administrateurRepository;

    @GetMapping("/admin")
    public List<Administrateur> findAllAdministrateurs(){
        return administrateurRepository.findAll();
    }
//    @GetMapping("/test")
//    public String  findTestAllAdministrateurs(){
//        return "test for allAdministrate";
//    }
}
