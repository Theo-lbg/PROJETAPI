package com.projetapi.lebegue.projetapi.services.impl;

import com.projetapi.lebegue.projetapi.model.Composant;
import com.projetapi.lebegue.projetapi.services.ComposantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class ComposantSerivceImpl implements ComposantService {

    @Override
    public ArrayList<Composant> findAll() {
        log.info("retrieving data from find all method");
        ArrayList<Composant> composants = new ArrayList<>();
        Composant composant1 = new Composant("1", "Carte mère", "Asus", "Carte mère", "Carte mère Asus", "100", "https://www.asus.com/media/global/products/4z3xq2jzqj3zqz3f/P_setting_fff_1_90_end_500.png");
        Composant composant2 = new Composant("2", "Carte graphique", "Asus", "Carte graphique", "Carte graphique Asus", "200", "https://www.asus.com/media/global/products/4z3xq2jzqj3zqz3f/P_setting_fff_1_90_end_500.png");
        Composant composant3 = new Composant("3", "Processeur", "Intel", "Processeur", "Processeur Intel", "300", "https://www.asus.com/media/global/products/4z3xq2jzqj3zqz3f/P_setting_fff_1_90_end_500.png");
        Composant composant4 = new Composant("4", "Mémoire vive", "Kingston", "Mémoire vive", "Mémoire vive Kingston", "400", "https://www.asus.com/media/global/products/4z3xq2jzqj3zqz3f/P_setting_fff_1_90_end_500.png");
        Composant composant5 = new Composant("5", "Disque dur", "Seagate", "Disque dur", "Disque dur Seagate", "500", "https://www.asus.com/media/global/products/4z3xq2jzqj3zqz3f/P_setting_fff_1_90_end_500.png");
        Composant composant6 = new Composant("6", "Alimentation", "Corsair", "Alimentation", "Alimentation Corsair", "600", "https://www.asus.com/media/global/products/4z3xq2jzqj3zqz3f/P_setting_fff_1_90_end_500.png");
        Composant composant7 =  new Composant("7", "Boitier", "Corsair", "Boitier", "Boitier Corsair", "700", "https://www.asus.com/media/global/products/4z3xq2jzqj3zqz3f/P_setting_fff_1_90_end_500.png");
        Composant composant8 = new Composant("8", "Ventirad", "Corsair", "Ventirad", "Ventirad Corsair", "800", "https://www.asus.com/media/global/products/4z3xq2jzqj3zqz3f/P_setting_fff_1_90_end_500.png");
        composants.add(composant1);
        composants.add(composant2);
        composants.add(composant3);
        composants.add(composant4);
        composants.add(composant5);
        composants.add(composant6);
        composants.add(composant7);
        composants.add(composant8);
        // ajouter relation BDD (Firebase)
        return composants;
    }

    @Override
    public Composant findById(String id) {
        log.info("Id of the retrieving composant is {}", id);
        return null;
    }

    @Override
    public void updateComposantById(String id, Composant newComposant) {
        log.info("Id of the updated composant is {}", id);
    }

    @Override
    public void deleteComposantById(String id) {
        log.info("Id of the deleting composant is {}", id);
    }

    @Override
    public void createComposant(Composant composant) {

    }
}
