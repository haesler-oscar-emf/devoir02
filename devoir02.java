package devoirs.devoir02;

public class devoir02 {
    public static final int CAPACITE_RESERVOIR_A = 3;
    public static final int CAPACITE_RESERVOIR_B = 5;
    public static void main(String[] args) {

 

        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * (CAPACITE_RESERVOIR_B - CAPACITE_RESERVOIR_A + 1)) + CAPACITE_RESERVOIR_A;

 

        System.out.println("Il y a " + remplissage + " litres à remplir");

 

        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                int dispo = CAPACITE_RESERVOIR_A - reservoirA;
                int quantiteA = remplissage - (reservoirA + reservoirB);
                if (quantiteA > dispo) {
                    quantiteA = dispo;
                }

                reservoirA += quantiteA;
                System.out.println("Remplissage du réservoir A...");

 

            } else if (reservoirB < CAPACITE_RESERVOIR_B) {

 

                int dispoB = CAPACITE_RESERVOIR_B - reservoirB;
                int quantiteB = remplissage - (reservoirA + reservoirB);
                if (quantiteB > dispoB) {
                    quantiteB = dispoB;
                }

                reservoirB += quantiteB;
                System.out.println("Remplissage du réservoir B...");
            }
            System.out.println("Le réservoir A : " + reservoirA + " , le réservoir B " + reservoirB);
        }
        System.out.println("Remplissage terminé.");
    }

 

}
    

