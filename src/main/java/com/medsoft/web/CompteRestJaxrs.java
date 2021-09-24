package com.medsoft.web;

import com.medsoft.entities.Compte;
import com.medsoft.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//path annotation utilise losqu'il s'agit de jersey cad jaxrs pour l'utiliser en tant que composant spring on rajoute @component
//This api is gonna use jersey servlet instead of diapatcher servlet
// this api use Jaxrs as specification and jersey implementation
@Component
@Path("/banque")
public class CompteRestJaxrs {
    @Autowired
    private CompteRepository compteRepository ;
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> compteList() {
    return compteRepository.findAll() ;

    }
    @Path("/comptes/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Compte getOne (@PathParam(value = "id")Long id){
        return compteRepository.findById(id).get();
    }

    @Path("/comptes")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Compte save (Compte compte){
        return compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Compte update (Compte compte , @PathParam("id") Long id){
        compte.setId(id);
        return compteRepository.save(compte);
    }
    @Path("/comptes/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void delete (@PathParam("id") Long id ){
         compteRepository.deleteById(id);
    }


}
