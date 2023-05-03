package br.com.cod3er.exerciciossb.controllers;

import br.com.cod3er.exerciciossb.models.entities.Cliente;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id, "Guilherme", "123.456.789-10");
    }
}
