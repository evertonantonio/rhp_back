package com.example.reuniaorhp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tbl_reuniao")
@Getter @Setter
public class Reuniao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReuniao;

    @OneToOne
    private Funcionario criador;

    @OneToMany
    private List<Funcionario> convidados;

    @OneToOne
    private Data data;

    public Reuniao(Funcionario criador, Data data){
        this.criador = criador;
        this.data = data;
    }

}
