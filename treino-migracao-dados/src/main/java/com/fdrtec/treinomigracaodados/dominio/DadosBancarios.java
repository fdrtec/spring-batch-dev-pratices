package com.fdrtec.treinomigracaodados.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DadosBancarios {
    private int id;
    private int pessoaId;
    private int agencia;
    private int conta;
    private int banco;
}
