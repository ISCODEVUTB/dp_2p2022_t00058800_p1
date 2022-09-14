public class Main{
    public static void main(String[] args) {
        //Se crea una instancia de armas
        Armas arma = new Armas("Espada","Elaborada por enanos",400,10,10);
        //Se crea un array de Characterization y se inicializa en 5, un personaje solo podrá tener 5
        Characterization[] characterization = new Characterization[5];
        characterization[0] = new Poderes("Enojo","Cuando se enoja se incrementa el daño",70,15,false);
        characterization[1] = new Personalidad("Orgullo","Su orgullo lo hace mas fuerte",false,true,true);
        characterization[2] = new Debilidades("Fuego","Pasado doloroso",20,30,10);
        //Se crean los enemigos
        Personajes[] enemigo = new Personajes[3];
        enemigo[0] = new Aliens("Yusra",150,"F",100,null,45,35,false,true,null,null);
        //Se crean las ligas
        String[] ligas = new String[2];
        ligas[0] = "Teen Titans";
        //Creamos una instancia de Humanos
        Humanos h = new Humanos("Iván",500,200,50,10,"M",characterization, enemigo,ligas);
        //Creamos una instancia Aliens
        Aliens a = new Aliens("Lutxu",900,"F",70,characterization,60,25, false,true,enemigo,ligas);
        //Creamos una instancia SuperHumanos
        SuperHumanos s = new SuperHumanos("Superman",1200,"M",characterization,400,120,30, true,false,5,enemigo,ligas);
        //Le añadimos lo que contiene el array Characterizations[3] al personaje
        characterization[3] = arma;
        s.add(characterization[3],s);
        //Le añadimos aliens como enemigo al superhumano instanciado anteriormente
        s.enemigo(a,s);
        //Le añadimos humanos como enemigo al superhumano instanciado anteriormente
        s.enemigo(h,s);
        //Le añadimos una liga a superhumano
        ligas[1] = "Marvel";
        s.liga(ligas[1],s);

        //Mostramos por consola la informacion de Aliens, Superhumanos y humanos.
        System.out.println(s);
        System.out.println(a);
        System.out.println(h);
    }
}
