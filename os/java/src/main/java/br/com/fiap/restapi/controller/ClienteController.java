package br.com.fiap.restapi.controller;

import br.com.fiap.restapi.domain.Cliente;
import br.com.fiap.restapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }
    @GetMapping("{codigo}")
    public Cliente buscar(@PathVariable int codigo){
        return clienteRepository.findById(codigo).get();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
    @PutMapping("{id}")
    public Cliente atualizar(@RequestBody Cliente cliente, @PathVariable int id){
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }
    @DeleteMapping("/excluir/{codigo}")
    public void remover(@PathVariable int codigo){
        clienteRepository.deleteById(codigo);
    }
}
