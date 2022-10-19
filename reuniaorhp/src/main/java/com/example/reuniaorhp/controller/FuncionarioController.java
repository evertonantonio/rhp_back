package com.example.reuniaorhp.controller;

import com.example.reuniaorhp.model.Funcionario;
import com.example.reuniaorhp.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    @GetMapping
    public List<Funcionario> listar(){
        return funcionarioRepository.findAll();
    }
}
