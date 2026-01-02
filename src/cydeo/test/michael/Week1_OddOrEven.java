package cydeo.test.michael;

public class Week1_OddOrEven {

/*
* `Numbers -- odd & even
Write a method which can identifies given number is even or odd
EX:
identify(5) -> "Odd"
identify(6) -> "Even"*/
public static void main(String[] args) {

oddOrEven(2);
oddOrEven(3);
}

public static void oddOrEven(int number) {

    if (number % 2 == 0) {
        System.out.println(number+ " is Even");
    }else{
        System.out.println(number+ " is Odd");
    }

}


}
