package com.example.demo.eleve;

import com.example.demo.eleve.dao.Eleve;
import com.example.demo.eleve.specification.EleveSearchSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class EleveController {
    private final EleveService eleveService;


    @PostMapping("search")
    public List<Eleve> findBySpecification(@RequestBody EleveSearchSpecification eleve){
        return eleveService.findEleve(eleve);
    }

    @PostMapping("add")
    public Eleve createEleve(@RequestBody Eleve eleve){
        return eleveService.add(eleve);
    }

}
