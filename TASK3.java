import java.util.*;
public class TASK3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a four digit number: ");
        int number = input.nextInt();
        int tousands;
        int hundereds;
        int tens;
        int units;

        tousands = number/1000;
        number = number-(1000*tousands);

        hundereds = number/100;
        number = number-(100*hundereds);

        tens = number/10;
        number = number-(10*tens);

        units = number/1;

        System.out.println("tousands: " + tousands);
        System.out.println("hundereds: " + hundereds);
        System.out.println("tens: " + tens);
        System.out.println("units: " + units);

    }
}
