package com.gerenciadordecontas.contasapagar.controller;

import com.gerenciadordecontas.contasapagar.services.CidadeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CidadeController {
    @Autowired
    private CidadeServices
 cidadeServices;
}
