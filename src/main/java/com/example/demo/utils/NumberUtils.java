package com.example.demo.utils;

public class NumberUtils {

    private NumberUtils() {
        // Constructeur privé pour empêcher l'instanciation
    }

    /**
     * Convertit une chaîne en un Integer. Retourne null si une NumberFormatException est levée.
     *
     * @param input la chaîne à convertir
     * @return un Integer ou null en cas d'échec
     */
    public static Integer safeStringToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
