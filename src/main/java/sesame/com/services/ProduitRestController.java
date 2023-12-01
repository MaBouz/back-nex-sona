package sesame.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sesame.com.entities.Produit;
import sesame.com.repositories.ProduitRepository;



@CrossOrigin
@RestController
@RequestMapping("/produits")
public class ProduitRestController {
@Autowired
private ProduitRepository prdRep;
@GetMapping(path="/api",produces= {MediaType.APPLICATION_JSON_VALUE})
public List<Produit> CompteList(){
return prdRep.findAll();
}
@GetMapping(path="/api/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})

public Produit getOne(@PathVariable(value="id") Long id){
	return prdRep.findById(id).get();
}
@PostMapping(path="/api",produces= {MediaType.APPLICATION_JSON_VALUE})

public Produit save(@RequestBody Produit produit){
	return prdRep.save(produit);
}

@PutMapping(path="/api/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})

public Produit update(@RequestBody Produit produit, @PathVariable(value="id") Long id){
	produit.setIdProduit(id);
	return prdRep.save(produit);
}

@DeleteMapping(path="/api/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})

public void delete(@PathVariable(value="id") Long id){
	prdRep.deleteById(id);
}


}
