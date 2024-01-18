package internship.task2;

import java.util.Scanner;

class Practice3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value for v :");
    int v=sc.nextInt();
    System.out.println("Enter a value for a :");
    int a=sc.nextInt(); 
    System.out.println("Enter a value for s :");
    int s=sc.nextInt();
    System.out.println("Enter a value for u :");
    int u=sc.nextInt();
      int exp=((v*v)-(u*u))/(2*a*s);
    System.out.println(exp);
  }
}