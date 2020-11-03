import java.util.Random;

public class Iteracion2 extends Thread{

    ClasePrincipal clasePrincipal;

    public Iteracion2(ClasePrincipal clasePrincipal) {this.clasePrincipal=clasePrincipal;}

    @Override
    public void run() {

        System.out.println("HEY");

    }
}
