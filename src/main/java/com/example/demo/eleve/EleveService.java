package com.example.demo.eleve;

import com.example.demo.eleve.dao.Eleve;
import com.example.demo.eleve.specification.EleveSearchSpecification;
import com.example.demo.eleve.specification.EleveSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EleveService {
    private final EleveRepository eleveRepository;

    public List<Eleve> findEleve(EleveSearchSpecification specification){
        return eleveRepository.findAll(new EleveSpecification().getFilter(specification));
    }

    public Eleve add(Eleve eleve){
        return eleveRepository.save(eleve);
    }

}
