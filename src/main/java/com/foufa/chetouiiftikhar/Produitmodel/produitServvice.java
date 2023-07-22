package com.foufa.chetouiiftikhar.Produitmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class produitServvice {


        @Autowired
        produitRepository pRep;
        public List<Produit> getProduit(){
            return  pRep.findAll();
        }
    public void addProduit(Produit p){
        pRep.save(p);
    }
    public void deleteProduit(Produit id) {
        pRep.delete(id);
    }
}


