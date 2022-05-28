package com.danyllo.crudbasico.service;

import com.danyllo.crudbasico.entity.Pessoa;
import com.danyllo.crudbasico.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa buscarUmaPessoa(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public List<Pessoa> ListarTodos() {
        return pessoaRepository.findAll();
    }

    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }

}
