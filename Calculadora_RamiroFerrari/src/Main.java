import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        boolean condicional = true;
        while (condicional){ //inicio del bucle
            //cracion del menu de opciones
            System.out.print("bienvenido seleccione A para la suma B para la resta C para multiplicacion D para la division o ingrese E para salir: ");
            String option = sc.next().toLowerCase();
            switch (option) {
                case "a" -> {// suma
                    System.out.print("Ingrese el primer numero para la suma: ");
                    num1 = sc.nextDouble();
                    System.out.print("ingrese el segundo numero para la suma: ");
                    num2 = sc.nextDouble();
                    resultado = num1 + num2;
                    System.out.println(resultado);
                }
                case "b" -> {//resta
                    System.out.print("Ingrese el primer numero para la resta: ");
                    num1 = sc.nextDouble();
                    System.out.print("ingrese el segundo numero para la resta: ");
                    num2 = sc.nextDouble();
                    resultado = num1 - num2;
                    System.out.println(resultado);
                }
                case "c" -> {//multiplicacion
                    System.out.print("Ingrese el primer numero para la multiplicacion: ");
                    num1 = sc.nextDouble();
                    System.out.print("ingrese el segundo numero para la multiplicacion: ");
                    num2 = sc.nextDouble();
                    resultado = num1 * num2;
                    System.out.println(resultado);
                }
                case "d" -> {//division
                    System.out.print("Ingrese el primer numero para la division: ");
                    num1 = sc.nextDouble();
                    System.out.print("ingrese el segundo numero para la divicion: ");
                    num2 = sc.nextDouble();
                    if (num2 == 0){//division por 0
                        System.out.println("error no se puede dividir por 0");
                        continue;
                    }else {
                        resultado = num1 / num2;
                        System.out.println(resultado);
                    }

                }
                case "e" ->{//salida
                    System.out.println("Adios! vuelva pronto");
                    condicional = false;
                }
                default -> {//opcion incorrecta
                    System.out.println("opcion ingresada incorrecata, vuelva a intentarlo");
                    continue;
                }
            }
            resultado = 0;
        }
    }
}