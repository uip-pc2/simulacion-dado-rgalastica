/**
 * Rafael Galastica
 */
package dado;

public class dados {
    private Integer lanzar;


    public dados() {

        this.lanzar = 1 + (int)(Math.random() * ((6 - 1) + 1));
    }


    public Integer getLanzar() {
        return lanzar;
    }

    public int lanzamiento() {
        System.out.println("\nSimulacion De Dados");
        System.out.println("\nLanzando Dados................");
        double probabilidad_lanzar = Math.random();
        System.out.println("Te ha salido el numero: " +lanzar);
        System.out.println("\nIncluyendo a la lista de resultados... ");

        return 0;
    }
}
