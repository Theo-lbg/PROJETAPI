package com.projetapi.lebegue.projetapi.util;

import com.projetapi.lebegue.projetapi.exceptions.RessourceNotFoundException;
import com.projetapi.lebegue.projetapi.model.Composant;

public final class Control {

    public static Composant checkFound(Composant composant) {
        if (composant == null) {
            throw new RessourceNotFoundException();
        }
        return composant;
    }
}
