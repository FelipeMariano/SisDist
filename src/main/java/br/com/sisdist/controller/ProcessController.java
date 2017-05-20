/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisdist.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Felipe
 */
@RestController
@RequestMapping("/processos")
public class ProcessController {

    private void process1() {
        System.out.println("SIMULANDO PROCESSO 1 - 5 SEGUNDOS");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProcessController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("FIM DA SIMULAÇÃO DO PROCESSO 1");
    }

    private void process2() {
        System.out.println("SIMULANDO PROCESSO 2 - 5 SEGUNDOS ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProcessController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("FIM DA SIMULAÇÃO DO PROCESSO 2");
    }


    @RequestMapping(value = "/run", method = RequestMethod.GET)
    public ResponseEntity<?> run(@RequestParam("id") Integer id) {
        switch (id) {
            case 1:
                this.process1();
                break;
            case 2:
                this.process2();
                break;
        }

        return new ResponseEntity<>("COMPLETE", HttpStatus.OK);
    }

}
