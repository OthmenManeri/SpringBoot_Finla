package com.othmen.meuble.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.othmen.meuble.entities.meuble;
import com.othmen.meuble.service.MeubleService;
@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("meubleController")
public class MeubleRESTController {
	
@Autowired
MeubleService meubleService;


@GetMapping("getAllMeubles")
public List<meuble> getAllMeubles() {
return meubleService.getAllMeubles();
}

@GetMapping("getMeubleById/{id}")
public meuble getMeubleById(@PathVariable("id") Long id) {
return meubleService.getMeuble(id);
 }

@PostMapping("createMeuble")
public meuble createMeuble(@RequestBody meuble meuble) {
return meubleService.saveMeuble(meuble);
}

@PutMapping("updateMeuble")
public meuble updateMeuble(@RequestBody meuble meuble) {
return meubleService.updateMeuble(meuble);
}


@DeleteMapping("deleteMeuble/{id}")
public void deleteMeuble(@PathVariable("id") Long id)
{
meubleService.deleteMeubleById(id);
}

@GetMapping("getMeublesByTypeId/{idType}")
public List<meuble> getMeublesByTypeId(@PathVariable("idType") Long idType) {
return meubleService.findByTypeIdType(idType);
}


@GetMapping("meublebyName/{nom}")
public List<meuble> findByNomMeubleContains(@PathVariable("nom") String nom) {
return meubleService.findByNomMeubleContains(nom);
}
}
