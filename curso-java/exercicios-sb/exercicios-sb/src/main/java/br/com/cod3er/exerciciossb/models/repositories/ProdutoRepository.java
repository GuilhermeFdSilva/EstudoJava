package br.com.cod3er.exerciciossb.models.repositories;

import br.com.cod3er.exerciciossb.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository <Produto, Integer>{
    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
