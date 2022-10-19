package com.example.reuniaorhp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "tbl_funcionario")
@Getter @Setter
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;

    @Column(name = "nome", length = 100)
    @NotNull
    private String nome;

    @Column(name = "email", length = 100)
    @NotNull
    private String email;

    @Column(name = "senha", length = 50)
    private String senha;

    public Funcionario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

}
