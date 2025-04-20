package com.smartapi.CadastroDeClientes.Ninjas;

import com.smartapi.CadastroDeClientes.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne => Um ninja uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreing key or chave estrangeira
    private MissoesModel missoes;

}
