import java.util.Scanner;

public class Numbersorting{
    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner value = new Scanner(System.in);


        System.out.print("Number 1 : ");

        number1 = value.nextInt();

        System.out.print("Number 2 : ");

        number2 = value.nextInt();

        System.out.print("Number 3 : ");

        number3 = value.nextInt();


        if((number1 < number2) && (number1 < number3)){

            if(number2 < number3){

                System.out.println("number1 < number2 < number3");

            } else {

                System.out.println("number1 < number3 < number2");
            }

        } else if ((number2 < number1) && (number2 < number3)){

            if(number1 < number3){

                System.out.println("number2 < number1 < number3");

            } else {

                System.out.println("number2 < number3 < number1");

            }

        } else {

            if (number1 < number2){

                System.out.println("number3 < number1 < number2");

            } else {

                System.out.println("number3 < number2 < number1");

            }
        }
    }
}
