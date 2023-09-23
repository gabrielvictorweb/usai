package br.com.fiap.restapi.repository;


import br.com.fiap.restapi.domain.Planos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanosRepository extends JpaRepository<Planos, Integer> {
    List<Planos> findByNome(String nome);


}
