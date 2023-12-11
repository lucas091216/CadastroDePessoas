package com.example.cadastrodepessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PessoaController {
    @Autowired PessoaRepository pessoaRepository;


    @PostMapping("/Pessoa")
    public Pessoa SavePessoa(@RequestBody Pessoa pessoa){
        var save = pessoaRepository.save(pessoa);

    return save;
    }

    @GetMapping("/Pessoa/{id}")
    public Optional<Pessoa> getPessoaByID(@PathVariable Long id ){
        var pessoa = pessoaRepository.findById(id);
    return pessoa;
    }

    @GetMapping("/Pessoa")
    public List<Pessoa> getALLPessoa(){
        return pessoaRepository.findAll();
    }

    @DeleteMapping("/Pessoa/{id}")
    public void DeletePessoa(@PathVariable Long id){
         pessoaRepository.deleteById(id);
    }


}
