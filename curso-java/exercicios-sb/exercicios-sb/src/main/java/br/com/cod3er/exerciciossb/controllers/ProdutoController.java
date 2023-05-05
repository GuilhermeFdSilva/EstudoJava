package br.com.cod3er.exerciciossb.controllers;

import br.com.cod3er.exerciciossb.models.entities.Produto;
import br.com.cod3er.exerciciossb.models.repositories.ProdutoRepository;
import br.com.cod3er.exerciciossb.models.repositories.ProdutoRepositoryPaging;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private ProdutoRepositoryPaging produtoRepositoryPaging;
//    @PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public Produto novoProduto (@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }
//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto){
//        produtoRepository.save(produto);
//        return produto;
//    }
    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return produtoRepository.findAll();
    }
    @GetMapping(path = "/pagina/{numeroPagina}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina){
        Pageable page = PageRequest.of(numeroPagina, 2);
        return produtoRepositoryPaging.findAll(page);
    }
    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }
    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> ObterProdutosPorNome(@PathVariable String parteNome){
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }
    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}
