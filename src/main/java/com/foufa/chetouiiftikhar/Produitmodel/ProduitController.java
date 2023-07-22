package com.foufa.chetouiiftikhar.Produitmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController        //fournir des api
@RequestMapping(path="api/v1/produit")

public class ProduitController {

    @Autowired
    produitServvice proser;
    @GetMapping
    public List<Produit> getProduit(){
        return proser.getProduit();
    }
    @PostMapping
    public void newStudent(@RequestBody Produit p){
        proser.addProduit(p);
    }
    @DeleteMapping(path ="/{ProduitId}")
    public void deleteStudent(@PathVariable Produit ProdId){
        proser.deleteProduit(ProdId);
    }




}
