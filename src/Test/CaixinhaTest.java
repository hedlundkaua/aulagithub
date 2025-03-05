package Test;

import Entities.Person;

import java.util.Scanner;

public class CaixinhaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        person.setAmount(20.00);
        System.out.print(person.getAmount());

        sc.close();
    }
}
