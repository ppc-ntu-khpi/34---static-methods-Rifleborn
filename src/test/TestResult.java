package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Task 1: n");
        Exercise.Task1(123456);
        
        System.out.println("Task 2: ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        System.out.println(Exercise.Task2(ch));
        
        System.out.println("Task 3: ");
        String str1, str2;
        System.out.println("Введіть дві строки");
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        System.out.println(Exercise.Task3(str1, str2));
    
    }
}
