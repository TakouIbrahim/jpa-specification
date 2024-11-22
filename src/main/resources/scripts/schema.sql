

-- Création de la table "eleve"
CREATE TABLE eleve (
    id BIGSERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    age INT,
    classe VARCHAR(255),
    date_inscription DATE,
    statut VARCHAR(255)
);