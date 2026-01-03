package cydeo.test.abdelhak;

public class Week1_OddOrEven {

/*
* `Numbers -- odd & even
Write a method which can identifies given number is even or odd
EX:
identify(5) -> "Odd"
identify(6) -> "Even"*/

    public static void main(String[] args) {

        identify(6);
        identify(3);

    }

    public static void identify(int number){
        if (number % 2 == 0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
    }

}
