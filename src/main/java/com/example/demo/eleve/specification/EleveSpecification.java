package com.example.demo.eleve.specification;

import com.example.demo.eleve.dao.Eleve;
import com.example.demo.utils.NumberUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

public class EleveSpecification {
    private static Specification<Eleve> hasNom(String nom) {

        return (root, query, cb) -> {
            if (!StringUtils.hasText(nom)) {
                return null;
            }
            return cb.like(
                    cb.function("unaccent", String.class, cb.lower(root.get("nom"))), "%" + nom + "%"
            );
        } ;
    }

    private static Specification<Eleve> hasPrenom(String prenom) {
        return (root, query, cb) -> {
            if (!StringUtils.hasText(prenom)) {
                return null;
            }
            return cb.like(
                    cb.function("unaccent", String.class, cb.lower(root.get("nom"))), "%" + prenom + "%"
            );
        } ;
    }

    private static Specification<Eleve> hasClasse(String classe) {
        return (root, query, cb) -> {
            if (!StringUtils.hasText(classe)) {
                return null;
            }
            return cb.like(
                    cb.function("unaccent", String.class, cb.lower(root.get("nom"))), "%" + classe + "%"
            );
        } ;
    }

    private static Specification<Eleve> hasAge(String age) {
        return (root, query, cb) -> {
            Integer intValue = NumberUtils.safeStringToInteger(age);
            if (intValue == null || intValue.equals(0)) {
                return null;
            }
            return cb.like(
                    cb.function("unaccent", String.class, cb.lower(root.get("nom"))), "%" + age + "%"
            );
        } ;
    }

    private static Specification<Eleve> isActif(Boolean actif) {
        return (root, query, cb) -> cb.isTrue(root.get("actif"));
    }

    public  Specification<Eleve> getFilter(EleveSearchSpecification eleveSearchSpecification){
        Specification<Eleve> eleveSpecification = Specification.where(
                hasNom(eleveSearchSpecification.getSearch())
                        .or(hasPrenom(eleveSearchSpecification.getSearch()))
                        .or(hasClasse(eleveSearchSpecification.getSearch()))
                        .or(hasAge((eleveSearchSpecification.getSearch())))
        );

        return eleveSpecification;
    }


}
