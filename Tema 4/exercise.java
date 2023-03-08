public class Main {
    public static void main(String[] args) {

        int numeroIf = -14;
        if (numeroIf > 0) {
            System.out.println(numeroIf + " es positivo");
        }else if (numeroIf < 0){
            System.out.println(numeroIf + " es negativo");
        }else {
            System.out.println(numeroIf + " es igual a 0");
        }


        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }while (numeroWhile < 3);


        int numeroFor = 0;
        for( int i = 0; i <= 3; i++) {
            numeroFor = i;
            System.out.println(numeroFor);
        }


        var estacion = "Otoño";
        switch (estacion){
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}
