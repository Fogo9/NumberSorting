# **NUMBER SORTİNG**

# Information

* **Sorting the entered numbers from smallest to largest is defined.**

# Technologies Used

* **JAVA**

# Contents

* For integer value input, integer definition and number1, number2, number3 values ​​are defined to receive data from the user.

* In order to receive data from the user, a value definition was made from the Scanner class.

* Ordering of numbers is created with if - else if - else conditional statements.

<br />

```Java

        import java.util.Scanner;

        public class Numbersorting{

            public static void main(String[] args) {

            int number1, number2, number3;

            Scanner value = new Scanner(System.in);

```

```Java

            System.out.print("Number 1 : ");

            number1 = value.nextInt();

            System.out.print("Number 2 : ");

            number2 = value.nextInt();

            System.out.print("Number 3 : ");

            number3 = value.nextInt();}

```
```Java

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
```

```bash

        Number 1 : 2
        Number 2 : 3
        Number 3 : 4
        number1 < number2 < number3

```
```bash

        Number 1 : 3
        Number 2 : 2
        Number 3 : 4
        number2 < number1 < number3

```
```bash

        Number 1 : 3
        Number 2 : 4
        Number 3 : 2
        number3 < number1 < number2

```

<br />

# LINK

* Click here https://github.com/Fogo9/NumberSorting.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
