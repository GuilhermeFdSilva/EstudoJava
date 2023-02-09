package br.com.cod3er.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraContoller {
    @GetMapping("/soma/{num1}/{num2}")
    public int somar(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }
    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int num1, @RequestParam(name = "b") int num2){
        return num1 - num2;
    }
}
