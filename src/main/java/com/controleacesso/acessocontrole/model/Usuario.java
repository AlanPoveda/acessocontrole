package com.controleacesso.acessocontrole.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Usuario {
    @Id
    private Long id;
    //1 para N
    @ManyToOne
    private CategoriaUsuario catetoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    //Como o java não trabalha muito bem com numero decimal, nesse caso usa o BigDecimal
    private BigDecimal tolerancia;
    //Usando biblioteca do próprio java
    private LocalDateTime inicioJornada;
    @ManyToOne
    private Localidade finalJornada;
}
