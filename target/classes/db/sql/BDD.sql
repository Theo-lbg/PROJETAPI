DROP TABLE IF EXISTS Composant, cartes_meres, processeurs, alimentations, ventirads, boitiers_pc, memoires_ram, ventilateurs, cartes_graphiques, watercooling;

CREATE TABLE Composant
(
    id          INT PRIMARY KEY,
    nom         VARCHAR(255),
    marque      VARCHAR(255),
    description VARCHAR(1000),
    prix        INT not null,
    image       VARCHAR(255)
);

CREATE TABLE cartes_meres
(
    ID          INT PRIMARY KEY,
    Nom         VARCHAR(255),
    Marque      VARCHAR(255),
    Socket      VARCHAR(255),
    Format      VARCHAR(255),
    Chipset     VARCHAR(255),
    RAM_Max     VARCHAR(255),
    Description TEXT not null,
    Prix        DECIMAL(10, 2),
    Image       VARCHAR(255)
);

CREATE TABLE processeurs
(
    ID          INT PRIMARY KEY,
    Nom         VARCHAR(255),
    Marque      VARCHAR(255),
    Socket      VARCHAR(255),
    Fréquence   VARCHAR(255),
    Coeurs      VARCHAR(255),
    Threads     VARCHAR(255),
    Cache       VARCHAR(255),
    Gravure     VARCHAR(255),
    Description TEXT not null,
    Prix        DECIMAL(10, 2),
    Image       VARCHAR(255)
);

CREATE TABLE alimentations
(
    ID          INT PRIMARY KEY,
    Nom         VARCHAR(255),
    Marque      VARCHAR(255),
    Puissance   VARCHAR(255),
    Modulaire   VARCHAR(255),
    Efficacité  VARCHAR(255),
    Description TEXT not null,
    Prix        DECIMAL(10, 2),
    Image       VARCHAR(255)
);
CREATE TABLE ventirads
(
    ID           INT            NOT NULL PRIMARY KEY,
    Nom          VARCHAR(255)   NOT NULL,
    Marque       VARCHAR(255)   NOT NULL,
    Socket       VARCHAR(255)   NOT NULL,
    Type         VARCHAR(255)   NOT NULL,
    Niveau_bruit VARCHAR(255)   NOT NULL,
    Description  VARCHAR(1000)  NOT NULL,
    Prix         DECIMAL(10, 2) NOT NULL,
    Image        VARCHAR(1000)  NOT NULL
);


CREATE TABLE boitiers_pc
(
    ID           INT PRIMARY KEY,
    Nom          VARCHAR(255),
    Marque       VARCHAR(255),
    Format       VARCHAR(255),
    Type         VARCHAR(255),
    Ventilateurs VARCHAR(255),
    Description  TEXT not null,
    Prix         DECIMAL(10, 2),
    Image        VARCHAR(255)
);
CREATE TABLE memoires_ram
(
    ID          INT PRIMARY KEY,
    Nom         VARCHAR(255),
    Marque      VARCHAR(255),
    Capacité    VARCHAR(255),
    Type        VARCHAR(255),
    Fréquence   VARCHAR(255),
    Latence     VARCHAR(255),
    Description TEXT not null,
    Prix        DECIMAL(10, 2),
    Image       VARCHAR(255)
);

CREATE TABLE cartes_graphiques
(
    ID          INT PRIMARY KEY,
    Nom         VARCHAR(255),
    Marque      VARCHAR(255),
    Chipset     VARCHAR(255),
    VRAM        VARCHAR(255),
    Fréquence   VARCHAR(255),
    Description TEXT not null,
    Prix        DECIMAL(10, 2),
    Image       VARCHAR(255)
);

CREATE TABLE watercooling
(
    ID          INT PRIMARY KEY,
    Nom         VARCHAR(255),
    Marque      VARCHAR(255),
    Socket_Compatible VARCHAR(255),
    Type        VARCHAR(255),
    Description TEXT not null,
    Prix        DECIMAL(10, 2),
    Image       VARCHAR(255)
);

