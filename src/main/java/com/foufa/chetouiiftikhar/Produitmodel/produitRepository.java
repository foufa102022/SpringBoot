package com.foufa.chetouiiftikhar.Produitmodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface produitRepository extends JpaRepository <Produit , Integer> {
}



