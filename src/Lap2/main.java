package Lap2;
import  java.util.Scanner;
import  java.util.Arrays;

public class main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Arryss1 arr=new Arryss1();
        int []numbers=new int[6] ;
        System.out.println("enter"+numbers.length+"elements");
        arr.input(numbers);
        arr.traversal(numbers);
    }
}
