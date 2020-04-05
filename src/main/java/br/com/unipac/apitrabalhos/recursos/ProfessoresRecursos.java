package br.com.unipac.apitrabalhos.recursos;

import br.com.unipac.apitrabalhos.model.domain.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/professores")

public class ProfessoresRecursos {

        List<Professor> professorList = new ArrayList<>();

        @GetMapping("/{id}")
        public ResponseEntity<Professor> getProfessor(@PathVariable("id") int id) {
                Professor professor = professorList.get(id);

                if (professor == null) {
                        return ResponseEntity.noContent().build();
                }

                return ResponseEntity.ok(professor);
        }

        @GetMapping
        public ResponseEntity<List<Professor>> getProfessorList() {
                if (professorList.isEmpty()) {
                        return ResponseEntity.noContent().build();
                }
                return ResponseEntity.ok(professorList);
        }

        @PostMapping
        public ResponseEntity<Professor> addProfessor(@RequestBody Professor professor) {
                System.out.println("Gravou o professor: " + professor.toString());
                professorList.add(professor);

                URI url = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(professor.getId()).toUri();
                return ResponseEntity.created(url).body(professor);

        }

        @PutMapping
        public ResponseEntity<List<Professor>> updateTrabalho(@PathVariable("id") int id, @RequestBody Professor novoProfessor) {
                Professor professor = professorList.remove(id);
                professorList.add(novoProfessor);

                return  ResponseEntity.ok(professorList);
        }
        @DeleteMapping("/{id}")
        public ResponseEntity<String> remove(@PathVariable("id")Long id){
                try {
                       professorList.remove(id);
                       return ResponseEntity.ok("Dados foram deletados seu filha da puta");
                }catch (Exception e){
                        return ResponseEntity.badRequest().body("dados nao podem ser removidos");

                }
        }
}
