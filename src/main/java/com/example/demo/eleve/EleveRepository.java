package com.example.demo.eleve;

import com.example.demo.eleve.dao.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long>, JpaSpecificationExecutor<Eleve> {

}
