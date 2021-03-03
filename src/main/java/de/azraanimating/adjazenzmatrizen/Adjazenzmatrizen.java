package de.azraanimating.adjazenzmatrizen;

public class Adjazenzmatrizen {

    /**
     * Diese Methode überprüft ob jede Spalte mindestens einen Wert beinhaltet.
     * @param pGraph Ein Zweidimensionales Array welches die Adjazenzmatrix repräsentiert;
     * @return Rückgabewert gibt aus ob die Matrix vollständig ist oder nicht.
     */
    public boolean istVollstaendig(int[][] pGraph)
    {
        boolean lIsComplete = true;
        boolean[] lColumns = new boolean[pGraph.length];

        for (int i = 0; i < pGraph.length; i++) //Die gesamte Matrix wird in Spalten aufgeteilt, jede Spalte wird einzeln geladen.
        {
            int[] lInts = pGraph[i]; //Die Spalte wird in ein lokales Array geladen.
            boolean lColumnHasValue = false; //Wenn eine Spalte keinen Wert enthält bleibt dieser boolean "false"
            for (int anInt : lInts) { ;//Sollte allerdings in diesem Array ein Wert enthalten sein wird diese Spalte als vollständig (true) markiert.
                if (anInt > 0) {
                    lColumnHasValue = true;
                    break;
                }
            }
            lColumns[i] = lColumnHasValue;//Hier wird das Ergebnis der zuvorgehenden Operation in ein Array geladen, welches repräsentiert welche Spalten vollständig sind.
        }

        for (int i = 0; i < lColumns.length; i++)
        {
            if(!lColumns[i])//Sollte eine der Spalten Leer sein, wird die Matrix direkt als unvollständig markiert indem die Variable "lIsComplete" von dem Standartwert (true) auf false gesetzt wird
            {
                lIsComplete = false;
            }
        }
        return lIsComplete;//Das Ergebnis wird als Rückgabewert ausgegeben.
    }

    /**
     * Diese Funktion baut eine Adjazenzmatrix
     * @return Die Matrix wird zurückgegeben.
     */
    public int[][] buildArray()
    {
        return new int[][]{
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0}
        };
    }

}
