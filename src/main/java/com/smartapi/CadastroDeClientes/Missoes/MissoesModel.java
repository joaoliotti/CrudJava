package com.smartapi.CadastroDeClientes.Missoes;

import com.smartapi.CadastroDeClientes.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //OneToMany => Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}