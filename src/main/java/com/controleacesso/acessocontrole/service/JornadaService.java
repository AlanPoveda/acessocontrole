package com.controleacesso.acessocontrole.service;

import com.controleacesso.acessocontrole.model.JornadaTrabalho;
import com.controleacesso.acessocontrole.repository.JornadaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRespository jornadaRespository;
    @Autowired
    public JornadaService(JornadaRespository jornadaRespository){
        this.jornadaRespository = jornadaRespository;
    }

    //Criando
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRespository.save(jornadaTrabalho);
    }


    //SELECT todos
    public List<JornadaTrabalho> findAll() {
        return jornadaRespository.findAll();
    }

    //SELECT ID
    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRespository.findById(idJornada);
    }

    //UPDATE ID
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRespository.save(jornadaTrabalho);
    }

    //DELETE
    public void deleteJornada(Long idJornada) {
        jornadaRespository.deleteById(idJornada);
    }
}
