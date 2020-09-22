import java.util.Scanner;

public class Convertisseur {

    public static void main(String[] args) {

        System.out.println("\nApplication lancer !");

        String reponse;
        Scanner msg = new Scanner(System.in);

        System.out.println("BIENVENUE DANS MON CONVERTISSEUR DE TEMPERATURE : ");
        System.out.println("-------------------------------------------------");

        do {

            do {

                System.out.println("Choissisez le mode de conversion : \n");
                System.out.println("1 : Celsius -> Fahrenheit");
                System.out.println("2 : Fahrenheit -> Celsius");

                reponse = msg.nextLine();

                if (reponse.charAt(0) != '1' && reponse.charAt(0) != '2') System.out.println("\n\n\nERREUR : Reponse incorrecte !");

                if (reponse.charAt(0) == '1') {

                    System.out.println("Choissisez une température en celsius ! : ");
                    reponse = msg.nextLine();
                    double result = (((1.80) * (double)(Double.parseDouble(reponse))) + 32);
                    double resultArrondi = arrondi(result, 2); 
                    System.out.println("Cette température vaut " + resultArrondi + " degres Fahrenheit !");

                    reponse = "1";

                }

                if (reponse.charAt(0) == '2') {

                    System.out.println("Choissisez une température en Fahrenheit ! : ");
                    reponse = msg.nextLine();
                    double result = (((Double.parseDouble(reponse) - 32) * 5) / 9); 
                    double resultArrondi = arrondi(result, 2);
                    System.out.println("Cette température vaut " + resultArrondi + " degres Celsius !");

                    reponse = "1";

                }

            } while (reponse.charAt(0) != '1' && reponse.charAt(0) != '2');

            System.out.println("Voulez-vous réessayez ? (O pour Oui)");
            reponse = msg.nextLine();


        } while (reponse.charAt(0) == 'O');

        msg.close();

    }

    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }


}