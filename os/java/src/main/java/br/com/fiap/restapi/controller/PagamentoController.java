package br.com.fiap.restapi.controller;


import br.com.fiap.restapi.domain.Pagamento;
import br.com.fiap.restapi.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping
    public List<Pagamento> listar(){
        return pagamentoRepository.findAll();
    }
    @GetMapping("{codigo}")
    public Pagamento buscar(@PathVariable int codigo){
        return pagamentoRepository.findById(codigo).get();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Pagamento cadastrar(@RequestBody Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }
    @PutMapping("{id}")
    public Pagamento atualizar(@RequestBody Pagamento pagamento, @PathVariable int id){
        pagamento.setidPagamento(id);
        return pagamentoRepository.save(pagamento);
    }
    @DeleteMapping("/excluir/{codigo}")
    public void remover(@PathVariable int codigo){
        pagamentoRepository.deleteById(codigo);
    }
}
