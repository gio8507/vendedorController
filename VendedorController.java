package com.example.demo.controller;


import com.example.demo.domain.Coche;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class VendedorController {

    @PostMapping("/vendedorAlta")
    public String getvendedor(@RequestBody String vendedor) {
        return vendedor;


    }
    @PutMapping("/vendedorAct")
    public String getvendedorActualizar( @Valid @RequestBody String vendedorActulizar){

        return vendedorActulizar;
    }
    @DeleteMapping("/vendedorE/{vendedor}")
    public String getvendedorEliminar(@PathVariable String vendedor){
        return " vendedor eliminado";
    }
}


