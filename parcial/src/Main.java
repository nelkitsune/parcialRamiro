import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese su nota: ");
        int nota = sc.nextInt();
        if (nota == 0) {
            System.out.println("su nota es muy mediocre con un : " + nota);
        } else if (nota < 0) {
            System.out.println("su nota esta fuera de rango");
        } else if (nota < 4) {
            System.out.println("su nota no alcanza para aprobar: " + nota);
        } else if (nota <= 6) {
            System.out.println("su nota alcanzo para aprobar pero no para promocionar: " + nota);
        } else if (nota <= 10) {
            System.out.println("promocionaste con un: " + nota);
        } else {
            System.out.println("su nota esta fuera de rango");
        }
        System.out.print("ingreses primer nombre para ver si son iguales: ");
        String nombre = sc.next();
        System.out.print("ingreses segundo nombre para ver si son iguales: ");
        String nombre2 = sc.next();
        if (nombre.equals(nombre2)){
            System.out.println("son el mismo nombre: ");
        } else {
            System.out.println("no son los mismos");
        }
        System.out.print("ingrese un numero del uno al tres: ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1 :
                System.out.println("ramiro");
                break;
            case 2 :
                System.out.println("jose");
                break;
            case 3:
                System.out.println("pepino");
                break;
            default:
                System.out.println("miguel");
        }

        int cil = 0;
        while (cil <= 5){
            System.out.println(cil);
            cil++;
        }
        do {
            System.out.println(cil);
            cil++;
        } while (cil == 5 || cil <= 10);
        System.out.println("----o----o----o----o---o---o---o---o");
        for ( int i = 0 ; i <= 5 ; i++){
            System.out.println(i);
        }
    }
}