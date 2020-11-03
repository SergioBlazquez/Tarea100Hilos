/*import java.util.Random;

public class Iteracion1 extends Thread{

    ClasePrincipal clasePrincipal;

    public Iteracion1(ClasePrincipal clasePrincipal) {this.clasePrincipal=clasePrincipal;}

    @Override
    public void run() {

        System.out.println("ITERACION 1:");

        for (int i=0;i<5;i++){//Por ahora 5 para no comerme 100 hilos
            int tiempoDormido=ClasePrincipal.genNumRandom();
            try {
                sleep(tiempoDormido);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("El Hilo " + (i+1) + " ha dormido por " + tiempoDormido + " milisegundos");
        }

    }




}*/
import java.util.Random;

public class Iteracion1 extends Thread{

    ClasePrincipal clasePrincipal;

    public Iteracion1(ClasePrincipal clasePrincipal) {this.clasePrincipal=clasePrincipal;}

    @Override
    public void run() {

        int tiempoDormido=0;
        int cont=0;//Ni de coña funciona

        tiempoDormido=ClasePrincipal.genNumRandom();
        try {
            sleep(tiempoDormido);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El Hilo " + (cont+1) + " ha dormido por " + tiempoDormido + " milisegundos");

    }




}
