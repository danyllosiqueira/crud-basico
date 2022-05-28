package com.danyllo.crudbasico.controller;

import com.danyllo.crudbasico.entity.Pessoa;
import com.danyllo.crudbasico.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PessoaController {
    @Autowired
    PessoaService pessoaService;

    @PostMapping("/pessoa/salvar")
    public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

    @GetMapping("/pessoa/{id}")
    public Pessoa buscarUm(@PathVariable Long id) {
        return pessoaService.buscarUmaPessoa(id);
    }
    @GetMapping("/pessoa/listar")
    public List<Pessoa> listar() {
        return pessoaService.ListarTodos();
    }

    @DeleteMapping("/pessoa/deletar/{id}")
    public void deletarPorId(@PathVariable Long id) {
        pessoaService.deletarPessoa(id);
    }

}

