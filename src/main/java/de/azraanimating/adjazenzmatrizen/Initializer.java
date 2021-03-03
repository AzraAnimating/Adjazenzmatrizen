package de.azraanimating.adjazenzmatrizen;

public class Initializer {

    public static void main(String[] args) {
        Adjazenzmatrizen adjazenzmatrizen = new Adjazenzmatrizen();

        System.out.println(adjazenzmatrizen.istVollstaendig(adjazenzmatrizen.buildArray()));
    }

}
