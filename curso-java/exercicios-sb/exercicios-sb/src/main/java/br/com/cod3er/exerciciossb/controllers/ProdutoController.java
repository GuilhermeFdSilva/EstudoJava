package br.com.cod3er.exerciciossb.controllers;

import br.com.cod3er.exerciciossb.models.entities.Produto;
import br.com.cod3er.exerciciossb.models.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @PostMapping
    public Produto novoProduto (@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return produtoRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }
    @PutMapping
    public Produto alterarProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }
}
