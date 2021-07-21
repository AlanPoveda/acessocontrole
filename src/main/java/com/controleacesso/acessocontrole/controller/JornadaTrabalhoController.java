package com.controleacesso.acessocontrole.controller;

import com.controleacesso.acessocontrole.model.JornadaTrabalho;
import com.controleacesso.acessocontrole.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    //Criar
    //Pegando do service
    @Autowired
    JornadaService jornadaService;
    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    //SELECT *
    @GetMapping
    public List<JornadaTrabalho> getJornada(){
        return jornadaService.findAll();
    }

    //SELECT ID
    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") long idJornada) throws Exception{
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(()->new NoSuchElementException("Not found"))) ;
    }

    //UPDATE
    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    //DELETE
    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteById(@PathVariable("idJornada") long idJornada) throws Exception{
        try {
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }

}
