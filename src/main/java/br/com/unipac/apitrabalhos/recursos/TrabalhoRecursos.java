package br.com.unipac.apitrabalhos.recursos;

import br.com.unipac.apitrabalhos.Repository.TrabalhoRepository;
import br.com.unipac.apitrabalhos.model.domain.Trabalho;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")

public class TrabalhoRecursos {
   	
	@Autowired
	TrabalhoRepository trabalhorepository;
	
    @GetMapping("/trabalho/{id}")
    public Trabalho getTrabalho(@PathVariable("id") long id){
    		
    	return trabalhorepository.findById(id);
    	
//        if (id == null) {
//            return trabalhorepository.noContent().build();
//        }
//        //early return
//        return trabalhorepository.;
    }


    @GetMapping("/trabalhos")
    public List<Trabalho> getTrabalhoList(){
//        if (trabalhoList.isEmpty()){
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.ok(trabalhoList);
    	return trabalhorepository.findAll();
    }

    @PostMapping("/trabalho")
    public Trabalho addTrabalho(@RequestBody Trabalho trabalho){
    	
    	return trabalhorepository.save(trabalho);
//        System.out.println("Gravou o trabalho: " +trabalho.toString());
//
//        URI url = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(trabalho.getId()).toUri();
//        return ResponseEntity.created(url).body(trabalho);
    }
    
    @PutMapping("/trabalho")
    public Trabalho updateTrabalho(@RequestBody Trabalho trabalho){
    	
    	return trabalhorepository.save(trabalho);
    }
    
    @DeleteMapping("/trabalho")
    public void deleteTrabalho(@RequestBody Trabalho trabalho){
    	trabalhorepository.delete(trabalho);
    }
    
    
//    @PutMapping
//    public ResponseEntity<List<Trabalho>> updateTrabalho(@PathVariable("id") int id, @RequestBody Trabalho novoTrabalho){
//        Trabalho trabalho = trabalhoList.remove(id);
//        trabalhoList.add(novoTrabalho);
//
//        return ResponseEntity.ok(trabalhoList);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> remove(@PathVariable("id") Long id) {
//        try {
//            trabalhoList.remove(id);
//            return ResponseEntity.ok("Dados Deletados");
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Dados nao pode ser removidos" + e.getMessage());
//        }
//    }

//    @PostMapping
//    public void addTrabalho(@RequestBody Trabalho trabalho){
//        System.out.println("Gravou o trabalho: " +trabalho.toString());
//        trabalhoList.add(trabalho);
//    }
}