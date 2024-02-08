import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Canada", "Otawwa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("Mexico", "Mexico DF");
        capitales.put("Belice", "Belmopan");
        capitales.put("Costa rica", "San Jose");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panama", "Panama");

        String pais = "";

        while (true) {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = scanner.nextLine();

            if (pais.equals("salir")) {
                break;
            }

            if (capitales.containsKey(pais)) {
                System.out.print("La capital de " + pais);
                System.out.println(" es " + capitales.get(pais));
            } else {
                System.out.print("No conozco la respuesta ");
                System.out.print("¿cuál es la capital de " + pais + "?: ");
                String nuevaCapital = scanner.nextLine();
                capitales.put(pais, nuevaCapital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }

        scanner.close();
    }
}