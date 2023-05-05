package br.com.cod3er.exerciciossb.models.repositories;

import br.com.cod3er.exerciciossb.models.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepositoryPaging extends PagingAndSortingRepository<Produto, Integer> {
}
