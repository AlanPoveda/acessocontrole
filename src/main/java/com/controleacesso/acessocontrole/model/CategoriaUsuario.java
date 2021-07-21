package com.controleacesso.acessocontrole.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

//Criando o espelho do banco, porém usando o Lombook para fazer os getters e setters. Constructor, hascode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class CategoriaUsuario {
    @Id
    private long id;
    private String descricao;
}
