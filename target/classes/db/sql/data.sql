-- For my tests table composant is not used
INSERT INTO composant (ID, Nom, Marque, Description, Prix, Image)
VALUES (1, 'Intel Core i9-11900K', 'Intel', 'Processeur Intel de 11ème génération, débloqué pour l''overclocking', 609.99,
        'https://cdn-reichelt.de/bilder/web/xxl_ws/E200/BX8070811900K_01.png'),
       (2, 'AMD Ryzen 5 5600X', 'AMD', 'Processeur AMD Ryzen de 5ème génération, compatible PCIe 4.0', 319.99,
        'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/61vGQNUEsGL._AC_SX450_.jpg'),
       (3, 'Intel Pentium Gold G6400', 'Intel', 'Processeur Intel d''entrée de gamme, compatible avec les cartes mères LGA 1200', 79.99,
        'https://www.pure-gaming.fr/252954-large_default/pentium-gold-g6400-4-0-ghz.jpg'),
       (4, 'Corsair RM850x', 'Corsair', 'Alimentation modulaire 850 W, certifiée 80+ Gold pour une efficacité maximale', 149.99,
        'https://www.corsair.com/corsairmedia/sys_master/productcontent/CP-9020180-NA-RM850x_PSU_01.png'),
       (5, 'EVGA SuperNOVA 750 G5', 'EVGA', 'Alimentation de qualité supérieure avec une certification 80+ Gold pour une efficacité énergétique élevée et une modularité pour une installation facile', 129.99,
        'https://www.evga.com/products/productimages/400-G5-0750-Y1_LG.png'),
       (6, 'MSI B450 Tomahawk MAX', 'MSI', 'Carte mère pour processeur AMD Ryzen, compatible DDR4 jusqu''à 4133 MHz', 119.99,
        'https://asset.msi.com/resize/image/global/product/product_1_20200806161944_5f2bbd20c4441.png62405b38c58fe0f07fcef2367d8a9ba1/600.png');

INSERT INTO cartes_meres (ID, Nom, Marque, Socket, Format, Chipset, RAM_Max, Description, Prix, Image)
VALUES (1, 'Asus ROG Strix Z590-E Gaming WiFi', 'Asus', 'LGA 1200', 'ATX', 'Intel Z590', '128 Go',
        'Carte mère pour processeur Intel de 10ème et 11ème génération, compatible Wi-Fi 6 et Bluetooth 5.2', 399.99,
        'https://media.ldlc.com/r1600/ld/products/00/05/79/39/LD0005793975_1.jpg'),
       (2, 'MSI B450 Tomahawk MAX', 'MSI', 'AM4', 'ATX', 'AMD B450', '64 Go',
        'Carte mère pour processeur AMD Ryzen, compatible DDR4 jusqu''à 4133 MHz', 119.99,
        'https://asset.msi.com/resize/image/global/product/product_1_20200806161944_5f2bbd20c4441.png62405b38c58fe0f07fcef2367d8a9ba1/600.png'),
       (3, 'Gigabyte A520M DS3H', 'Gigabyte', 'AM4', 'Micro-ATX', 'AMD A520', '64 Go',
        'Carte mère pour processeur AMD Ryzen, compatible avec les processeurs de 3ème génération', 69.99,
        'https://media.ldlc.com/r1600/ld/products/00/05/73/59/LD0005735986_1.jpg');

INSERT INTO processeurs (ID, Nom, Marque, Socket, Fréquence, Coeurs, Threads, Cache, Gravure, Description, Prix, Image)
VALUES (1, 'Intel Core i9-11900K', 'Intel', 'LGA 1200', '3,5 GHz', 8, 16, '16 Mo', '14 nm',
        'Processeur Intel de 11ème génération, débloqué pour l''overclocking', 609.99,
        'https://cdn-reichelt.de/bilder/web/xxl_ws/E200/BX8070811900K_01.png'),
       (2, 'AMD Ryzen 5 5600X', 'AMD', 'AM4', '3,7 GHz', 6, 12, '32 Mo', '7 nm',
        'Processeur AMD Ryzen de 5ème génération, compatible PCIe 4.0', 319.99,
        'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/61vGQNUEsGL._AC_SX450_.jpg'),
       (3, 'Intel Pentium Gold G6400', 'Intel', 'LGA 1200', '4 GHz', 2, 4, '4 Mo', '14 nm',
        'Processeur Intel d''entrée de gamme, compatible avec les cartes mères LGA 1200', 79.99,
        'https://www.pure-gaming.fr/252954-large_default/pentium-gold-g6400-4-0-ghz.jpg');
INSERT INTO alimentations (ID, Nom, Marque, Puissance, Modulaire, Efficacité, Description, Prix, Image)
VALUES (1, 'Corsair RM850x', 'Corsair', '850 W', 'Modulaire', '80+ Gold',
        'Alimentation modulaire 850 W, certifiée 80+ Gold pour une efficacité maximale', 149.99,
        'https://www.corsair.com/corsairmedia/sys_master/productcontent/CP-9020180-NA-RM850x_PSU_01.png'),
       (2, 'EVGA SuperNOVA 750 G5', 'EVGA', '750W', '80+ Gold', 'Modulaire',
        'Alimentation de qualité supérieure avec une certification 80+ Gold pour une efficacité énergétique élevée et une modularité pour une installation facile',
        129.99, 'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/71T-Q6pNMlL._AC_SL1500_.jpg'),
       (3, 'Seasonic S12III 500 SSR-500GB3', 'Seasonic', '500W', '80+ Bronze', 'Non modulaire',
        'Alimentation d\entrée de gamme avec une certification 80+ Bronze pour une efficacité énergétique décente et un prix abordable',
        59.99, 'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/71k+MlfKp7S._AC_SS450_.jpg');


INSERT INTO memoires_ram (ID, Nom, Marque, Capacité, Type, Fréquence, Latence, Description, Prix, Image)
VALUES (1, 'Corsair Vengeance LPX', 'Corsair', '16 Go (2 x 8 Go)', 'DDR4', '3200 MHz', 'CL16',
        'Kit de mémoire DDR4 hautes performances pour une expérience de jeu fluide', 84.99,
        'https://media.ldlc.com/r1600/ld/products/00/03/19/23/LD0003192352_2.jpg'),
       (2, 'G.Skill Ripjaws V', 'G.Skill', '32 Go (2 x 16 Go)', 'DDR4', '3600 MHz', 'CL16',
        'Kit de mémoire DDR4 haute performance, compatible avec les cartes mères Intel et AMD', 164.99,
        'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/51DfIlP5A+L._AC_SX450_.jpg'),
       (3, 'Crucial Ballistix', 'Crucial', '8 Go', 'DDR4', '3200 MHz', 'CL16',
        'Module de mémoire DDR4, compatible avec les plateformes Intel et AMD', 44.99,
        'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/614av8uBN3L._AC_SS450_.jpg');

INSERT INTO cartes_graphiques (ID, Nom, Marque, Chipset, VRAM, Fréquence, Description, Prix, Image)
VALUES (1, 'Nvidia GeForce RTX 3090', 'Nvidia', 'GA102', '24 Go GDDR6X', '1695 MHz',
        'Carte graphique haut de gamme pour les jeux vidéo et la création de contenu, compatible avec le ray tracing',
        1499.99, 'https://images.nvidia.com/geforce/20-series/GeForce_RTX_3090/shop/rtx-3090-shop-image-1.png'),
       (2, 'AMD Radeon RX 6900 XT', 'AMD', 'Navi 21 XTX', '16 Go GDDR6', '2015 MHz',
        'Carte graphique haut de gamme pour les jeux vidéo et la création de contenu, compatible avec le ray tracing',
        1299.99,
        'https://www.amd.com/system/files/2020-10/584942-amd-radeon-rx-6900-xt-gpu-front-product-image-2000x2000.png'),
       (3, 'Nvidia GeForce GTX 1650 Super', 'Nvidia', 'TU116', '4 Go GDDR6', '1725 MHz',
        'Carte graphique d''entrée de gamme pour les jeux vidéo, offrant de bonnes performances à un prix abordable',
        189.99, 'https://images.nvidia.com/geforce-gtx/16-series/super/cards/GeForce_GTX_1650_Super_Gallery_Side.png');

INSERT INTO ventirads (ID, Nom, Marque, Socket, Type, Niveau_Bruit, Description, Prix, Image)
VALUES (1, 'Noctua NH-D15', 'Noctua', 'Intel LGA1200, LGA115x, LGA2066, AMD AM4, sTRX4', 'Air',
        '
19,2 dB(A) à pleine charge',
        'Ventirad double tour haut de gamme pour un refroidissement optimal de votre processeur', 99.99,
        'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/91Hw1zcAIjL._AC_SX425_.jpg'),
       (2, 'Be Quiet! Dark Rock Pro 4
', 'Be Quiet!',
        'Intel LGA1150/1151/1155/1156/1366/2011(-3) Square ILM / 2066, AMD AM4 / AM3(+)', 'Air',
        '
24,3 dB(A) à pleine charge',
        'Ventirad double tour pour un refroiding efficace et silencieux de votre processeur', 89.99,
        'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/81in8yGd6yL._SX385_.jpg'),
       (3, 'Cooler Master Hyper 212 RGB', 'Cooler Master',
        'Intel LGA 2066/2011-v3/2011/1366/1200/1151/1150/1155/1156/775, AMD AM4/AM3+/AM3/AM2+/FM2+/FM2/FM1', 'Air',
        '
26 dB(A) à pleine charge',
        'Ventirad à LED RGB pour un refroidissement efficace de votre processeur, compatible avec une grande variété de sockets',
        39.99, 'https://media.ldlc.com/r1600/ld/products/00/05/94/46/LD0005944628.jpg');
INSERT INTO boitiers_pc (ID, Nom, Marque, Type, Format, Ventilateurs, Description, Prix, Image)
VALUES (1, 'Fractal Design Meshify C', 'Fractal Design', 'ATX', 'ATX, Micro-ATX, Mini-ITX', '2 x 120 mm',
        'Boîtier PC de haute qualité avec une façade en maille pour une ventilation optimale, compatible avec des cartes mères ATX, Micro-ATX et Mini-ITX',
        89.99, 'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/91Edlq2QdFL._AC_SL1500_.jpg'),
       (2, 'Corsair Obsidian 500D', 'Corsair', 'ATX', 'ATX, Micro-ATX, Mini-ITX', '2 x 120 mm',
        'Boîtier PC haut de gamme avec une fenêtre en verre trempé pour une présentation élégante de vos composants, compatible avec des cartes mères ATX, Micro-ATX et Mini-ITX',
        169.99, 'https://media.ldlc.com/r1600/ld/products/00/04/93/52/LD0004935296_2.jpg'),
       (3, 'NZXT H510', 'NZXT', 'ATX', 'ATX, Micro-ATX, Mini-ITX', '2 x 120 mm',
        'Boîtier PC compact avec une façade en verre trempé pour une présentation élégante de vos composants, compatible avec des cartes mères ATX, Micro-ATX et Mini-ITX',
        79.99, 'https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/71QSKpbzlQL._AC_SL1500_.jpg');

INSERT INTO watercooling (ID, Nom, Marque, Socket_Compatible, Type, Description, Prix, Image)
VALUES (1, 'Corsair Hydro Series H150i', 'Corsair',
        'Intel 1200, 1150, 1151, 1155, 1156, 1366, 2011, 2066, AMD AM4, sTRX4, TR4', 'AIO (All-in-One)',
        'Système de refroidissement liquide tout-en-un avec une pompe à haute efficacité et un radiateur de 360 mm pour un refroidissement efficace de votre processeur',
        199.99, 'https://media.ldlc.com/r1600/ld/products/00/04/71/46/LD0004714629_2.jpg'),
       (2, 'NZXT Kraken Z73', 'NZXT', 'Intel 1200, 1151, 1150, 1155, 1156, 1366, 2011, 2066, AMD AM4, sTRX4, TR4',
        'AIO (All-in-One)',
        'Système de refroidissement liquide tout-en-un avec un écran LCD personnalisable et un radiateur de 360 mm pour un refroidissement efficace de votre processeur',
        279.99,
        'https://nzxt.com/assets/cms/34299/1631128782-kraken-z73-rgb-white-keyshot.png?auto=format&fit=crop&h=1000&w=1000'),
       (3, 'EKWB EK-Classic Kit P240', 'EKWB', 'Intel 1150, 1151, 1155, 1156, 1366, 2011, 2066, AMD AM4', 'Custom',
        'Kit de refroidissement liquide personnalisé avec un radiateur de 240 mm, une pompe à haut débit et des tuyaux en PVC de haute qualité pour un refroidissement efficace de votre processeur',
        259.99,
        'https://www.ekwb.com/shop/media/catalog/product/cache/1/image/x800/17f82f742ffe127f42dca9de82fb58b1/p/-/p-0213_ekint_ek-classic-kit_flat-lay_p240-d-rgb_1.jpg');


