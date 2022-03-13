package com.cleomar.ApiMaquina.Controller;

import com.cleomar.ApiMaquina.Entity.Maquina;
import com.cleomar.ApiMaquina.Repository.MaquinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaquinaController {
    @Autowired
    MaquinaRepository maquinaRepository;

    @RequestMapping(value = "/maquina", method = RequestMethod.POST)
    public ResponseEntity<Maquina> CreateMaquina(@RequestBody Maquina maquina){
        maquina.MudarEstado(maquina);
        maquinaRepository.save(maquina);
        return new ResponseEntity<>(maquina, HttpStatus.OK);
    }

    @RequestMapping(value = "/maquina", method = RequestMethod.GET)
    public List<Maquina> GetMaquina(){
        return maquinaRepository.findAll();
    }
}
