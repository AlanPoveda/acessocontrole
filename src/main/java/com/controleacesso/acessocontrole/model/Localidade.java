package com.controleacesso.acessocontrole.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Localidade {
    @Id
    private long id;
    //relacionamento, ja puxa outra classe para fazer o relacionamento
    //Relacionamento de 1 - N
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
