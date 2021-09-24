package com.medsoft.web;

import com.medsoft.entities.Compte;
import com.medsoft.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import java.util.List;

//path annotation utilise losqu'il s'agit de jersey cad jaxrs pour l'utiliser en tant que composant spring on rajoute @component
//This api is gonna use jersey servlet instead of diapatcher servlet
// this api use Jaxrs as specification and jersey implementation
@RestController
@RequestMapping("/banque")
public class CompteRestController {
    @Autowired
    private CompteRepository compteRepository ;
    @GetMapping(path = "/comptes" , produces = {MediaType.APPLICATION_JSON_VALUE})
    @GET
    public List<Compte> compteList() {
    return compteRepository.findAll() ;

    }
    @GetMapping(path = "/comptes/{id}")
    public Compte getOne (@PathVariable Long id){
        return compteRepository.findById(id).get();
    }

    @PostMapping("/comptes")
    public Compte save (@RequestBody Compte compte){
        return compteRepository.save(compte);
    }

    @PutMapping("/comptes/{id}")
    public Compte update (@RequestBody Compte compte , @PathVariable Long id){
        compte.setId(id);
        return compteRepository.save(compte);
    }
    @DeleteMapping("/comptes/{id}")
    public void delete (@PathVariable Long id ){
         compteRepository.deleteById(id);
    }

}
