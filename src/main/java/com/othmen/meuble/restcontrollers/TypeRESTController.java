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
import com.othmen.meuble.entities.Type;
import com.othmen.meuble.service.TypeService;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("typeController")
public class TypeRESTController {
	
@Autowired
TypeService typeService;


@GetMapping("getAllTypes")
public List<Type> getAllMeubles() {
return typeService.findAll();
}

@GetMapping("getTypeById/{id}")
public Type getMeubleById(@PathVariable("id") Long id) {
return typeService.getType(id);
 }

@PostMapping("createType")
public Type createMeuble(@RequestBody Type type) {
return typeService.saveType(type);
}

@PutMapping("updateType")
public Type updateMeuble(@RequestBody Type type) {
return typeService.updateType(type);
}


@DeleteMapping("deleteType/{id}")
public void deleteType(@PathVariable("id") Long id)
{
typeService.deleteTypeById(id);
}


}
