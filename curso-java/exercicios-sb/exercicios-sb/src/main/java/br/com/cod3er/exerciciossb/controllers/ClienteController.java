package br.com.cod3er.exerciciossb.controllers;

import br.com.cod3er.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @GetMapping("/qualquer2")
    public Cliente obterCliente(){
        return new Cliente(28, "Guilherme", "123.456.789-10");
    }
    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Guilherme", "123.456.789-10");
    }
}
