public class ClasePrincipal {

    public ClasePrincipal() throws Exception{
/*
        Iteracion1 Iteracion1 = new Iteracion1(this);

        Iteracion1.start();
        Iteracion1.join();


        Iteracion2 Iteracion2 = new Iteracion2(this);

        Iteracion2.start();
        Iteracion2.join();

 */
        //Puede que tenga que hacer aquí un for con los 100 hilos.



        for(int i=0;i<5;i++){

            Iteracion1 Iteracion1 = new Iteracion1(this);
            Iteracion1.start();
            Iteracion1.join();


            Iteracion2 Iteracion2 = new Iteracion2(this);

            Iteracion2.start();
            Iteracion2.join();



        }









    }


    public static int genNumRandom(){

        int random=0;

        do{
            random= (int) ((Math.random())*10);


        }while(random<=1 && random>8);

        return random*1000;
    }


}
