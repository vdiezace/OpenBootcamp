class Main {
    public static void main(String[] args) {

        suma(5,10,15);

        Coche miCoche = new Coche();
        miCoche.añadirPuertas();
        System.out.println(miCoche.puertas);
    }

    public static void suma (int a, int b, int c){
        int resultado_AB, resultado_ABC;
        resultado_AB = a + b;
        resultado_ABC = resultado_AB + c;

        System.out.println(resultado_AB);
        System.out.println(resultado_ABC);

    }
}

class Coche {
    public int puertas = 0;

    public void añadirPuertas(){
        this.puertas++;
    }
}