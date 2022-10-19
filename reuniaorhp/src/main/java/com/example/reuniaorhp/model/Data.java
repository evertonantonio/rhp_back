package com.example.reuniaorhp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TBL_DATA")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idData;

    @Column(name = "dia")
    @NotNull
    private String dia;

    @Column(name = "mes")
    @NotNull
    private String mes;

    @Column(name = "ano")
    @NotNull
    private String ano;

    @Column(name = "hora_inicial")
    @NotNull
    private String horaInical;

    @Column(name = "minuto_inicial")
    @NotNull
    private String minutoInicial;

    @Column(name = "hora_final")
    @NotNull
    private String horaFinal;

    @Column(name = "minuto_final")
    @NotNull
    private String minutoFinal;

    @OneToOne
    private Reuniao reunião;

    public Data(String dia, String mes, String ano, String horaInical, String minutoInicial, String horaFinal, String minutoFinal) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.horaInical = horaInical;
        this.minutoInicial = minutoInicial;
        this.horaFinal = horaFinal;
        this.minutoFinal = minutoFinal;
    }
}
