package br.com.fiap.restapi.controller;

import br.com.fiap.restapi.domain.Cliente;
import br.com.fiap.restapi.domain.Planos;
import br.com.fiap.restapi.repository.PlanosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanosController {

    @Autowired
    private PlanosRepository planosRepository;

    @GetMapping
    public List<Planos> listar(){
        return planosRepository.findAll();
    }
    @GetMapping("{codigo}")
    public Planos buscar(@PathVariable int codigo){
        return planosRepository.findById(codigo).get();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Planos cadastrar(@RequestBody Planos planos){

        return planosRepository.save(planos);
    }
    @PutMapping("{id}")
    public Planos atualizar(@RequestBody Planos planos, @PathVariable int id){
        planos.setId(id);
        return planosRepository.save(planos);
    }
    @DeleteMapping("/excluir/{codigo}")
    public void remover(@PathVariable int codigo){
        planosRepository.deleteById(codigo);
    }
}
