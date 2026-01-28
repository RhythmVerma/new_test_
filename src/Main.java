//import java.sql.SQLOutput;
//import java.util.Scanner;

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<day 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//public class Main {
//    public static void main(String[] args) {

//        System.out.println("hello world");
//        System.out.print("hello world\n   ");
//        System.out.print("hello world");
//        System.out.println("hello world with java\nfrom\nrhythm");
//
//
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        int age=10;
//        String name="rhythm";
//        double price=90.87;
//        int a=80;
//        name="iron man";
//        a=23;
//        System.out.println(age);
//        System.out.println(name);
//        System.out.println(a);
//        System.out.println(price);
//        int a=90;
//        int b=78;
//        int sum=a+b;
//        int diff=a-b;
//        int mul=a*b;
//
//
//        System.out.println(sum);
//        System.out.println(diff);
//        System.out.println(mul );
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println(name);
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.println(sum);
//        double pie=3.14;
//
//        Scanner sc=new Scanner(System.in);
//        int r=sc.nextInt();
//
//        double area=pie*r*r;
//        System.out.println(area);

//        <<<<<<<<<<<<<<<<<<<<<<day 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//   conditional
//        1...
//        Scanner sc=new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age>18){
//            System.out.println("adult");
//        }else{
//            System.out.println("not adult");
//        }

//        2......
//        Scanner sc=new Scanner(System.in);
//        int x = sc.nextInt();
//        if(x%2==0){
//            System.out.println("Even number");
//        }else{
//            System.out.println("Odd number");
//        }

//                        3
//        Scanner sc=new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a==b){
//            System.out.println("Equal");
//        }
//        else if(a>b){
//
//                System.out.println("a is greater");
//
//            }
//        else {
//            System.out.println("b is greater");
//
//        }

//                                           4


//        Scanner sc=new Scanner(System.in);
//        int button = sc.nextInt();
//        if(button==1){
//            System.out.println("HELLO");
//        } else if(button==2){
//            System.out.println("Namaste");
//        }else if(button==3){
//            System.out.println("Bongour");
//        }else{
//            System.out.println("invalid button");
//        }

//                       5
//        switch (button){
//            case 1:
//            System.out.println("?Hello");
//            break;
//
//            case 2:
//                System.out.println("?Namaste");
//                break;
//
//            case 3:
//                System.out.println("?Bongour");
//                break;
//
//
//            default:
//                System.out.println("invalid button");
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number for operation (1: Add, 2: Subtract, 3: Multiply, 4: Divide): ");
//        int cal = sc.nextInt();
//        int a = sc.nextInt();
//
//        int b = sc.nextInt();
//
//        switch (cal){
//            case 1:
//                cal=a+b;
//                System.out.println(cal);
//                break;
//
//            case 2:
//                cal=a-b;
//                System.out.println(cal);
//                break;
//            case 3:
//                cal=a*b;
//                System.out.println(cal);
//                break;
//            case 4:
//                cal=a/b;
//                System.out.println(cal);
//                break;
//
//            default:
//                System.out.println("invalid");
//        }
//                             day4

//        for(int counter=0;counter<100;counter= counter+1){
//            System.out.println("Hello World");
//        }
//        for(int i=0;i<11;i++){
//            System.out.println(i);
//        }
//        int i=0;
//        do{
//
//            System.out.println(i);
//            i=i+1;
//
//
//        }while (i<11);
//        int i=12;
//        while(i<11) {
//            System.out.println("yo");
//        }
//        do{
//            System.out.println("yo");
//        }while(i<11);
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();

//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

//        for(int i=1;i<11;i++){
//            System.out.println(i*n);
//        }

//        for(int i=0;i<n+1;i++){
//            if(i%2==0){
//                System.out.println(i);
//                i=i+1;
//
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("Enter 1 to input student marks, or 0 to exit:");
//            choice = scanner.nextInt();
//
//            if (choice == 1) {
//                System.out.println("Enter student's marks (0-100):");
//                int marks = scanner.nextInt();
//
//                if (marks >= 90 && marks <= 100) {
//                    System.out.println("This is Good");
//                } else if (marks >= 60 && marks <= 89) {
//                    System.out.println("This is also Good");
//                } else if (marks >= 0 && marks <= 59) {
//                    System.out.println("This is Good as well");
//                } else {
//                    System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
//                }
//                System.out.println("Because marks don’t matter but our effort does.");
//            } else if (choice != 0) {
//                System.out.println("Invalid input. Please enter 1 or 0.");
//            }
//
//        } while (choice != 0);
//
//        System.out.println("Exiting program. Goodbye!");
//        scanner.close();
//
//                           DAY-----5
//        int i;
//        for(i=1;i<=4;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=4;
//        int m=5;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==1 || j==1 || i==n || j==m){
//                    System.out.println("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//
//        }
//        int n=4;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        int n=4;
//
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=5;

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//        int number=1;
//
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//
//
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                int sum=i+j;
//                if(sum%2==0){
//                    System.out.print("1");
//                }else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }

//                                    DAY--->6
//        int n=5;
//      first half
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spaces=2*(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spaces=2*(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//

//        <<<<<<<<<<<<DAY7>>>>>>>>>>>>>>>>>>>>


//import java.util.Scanner;

//class Functions {   // not public anymore
//    public static void printMyName(String name) {
//        System.out.println("Your name is: " + name);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//        printMyName(name);
//        sc.close();
//    }
//
//}

//    public static int calsum(int a, int b) {
//        int sum=a+b;
//        return sum;
//
//
//    }


    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum=calsum(a,b);
//        System.out.println(sum);
//
//    }
//    public static int calmul(int a, int b) {
//        int mul = a * b;
//        return mul;
//
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int mul = calmul(a, b);
//        System.out.println(mul);
//
//    }
//    public static void  printfact(int n) {
//        if(n<0){
//            System.out.println("invalid");
//            return;
//
//        }
//        int factorial=1;
//        for(int i=n;i>=1;i--){
//            factorial=factorial*i;
//
//        }
//        System.out.println(factorial);
//        return;
//
//
//
//    }
//        public static void main (String[]args){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            printfact(n);
//
//
//        }


//    public static void  checkeven(int n) {
//        if(n%2==0){
//            System.out.println("even no."+n);
//            return;
//
//        }
//        else{
//            System.out.println("odd no."+n);
//
//
//        }
//        return;
//
//
//
//    }
//    public static void main (String[]args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        checkeven(n);
//
//
//    }

//    public static void printTable(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printTable(n);
//    }




//    }
//
//                      day 8
//q1
//class Functions {
//    public static void average(int a,int b,int c){
//        int average=(a+b+c)/3;
//        System.out.println("The average of three numbers is :"+ average);
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        average(a,b,c);
//
//
//
//    }
//    q2
//    public static void sum(int n){
//        int oddsum=0;
//        for(int i=1;i<=n;i++){
//            if (i%2!=0){
//                oddsum=oddsum+i;
//            }
//        }
//        System.out.println("the sum of odd no. is"+oddsum);
//    }
//    public static void  main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a positive number:");
//        int n=sc.nextInt();
//        sum(n);
//
//    }
//    public static void greater(int a ,int b){
//        if(a>b){
//            System.out.println(a+" is greater ");
//        }else{
//            System.out.println(b+" is greater");
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the two numbers");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        greater(a,b);
//    }

//}


//                   day 9


//        int marks[] = new int[3];
//        marks[0] = 97;
//        marks[1] = 99;
//        marks[2] = 93;
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for(int i=0;i<3;i++){
//            System.out.println(marks[i]);
//        }
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int num[]=new int[size];
//
//        for(int i=0;i<size;i++){
//            num[i]=sc.nextInt();
//
//
//        }
//        int x=sc.nextInt();
//
//        for(int i=0;i<size;i++){
//            if(num[i]==x){
//                System.out.println("x found at index:"+i);
//            }
//        }
//
//
//        <<<<<<<<<<<<<<<<<<<<<<day 10------2d array
//
//        Scanner sc=new Scanner(System.in);
//        int rows=sc.nextInt();
//        int cols=sc.nextInt();
//        int num[][]=new int[rows][cols];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                num[i][j]=sc.nextInt();
//
//            }
//        }
//        for(int i=0;i<rows;i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(num[i][j] + " ");
//            }
//            System.out.println();
//
//        }
import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        String name=sc.nextLine();
//        System.out.println("Your Name is :"+name);
//        String firstname="tony";
//        String lastname="stark";
//        String fullname=firstname+"@"+ lastname;
//        System.out.println(fullname.length());
//        for(int i=0;i<fullname.length();i++){
//            System.out.println(fullname.charAt(i));
//        }
//        String name1="Tony";
//        String name2="Tony1";
//        if(name1.compareTo(name2)==0){
//            System.out.println("strings are equal");
//        }else{
//            System.out.println("strings are not equal");
//        }
//        String sentence="Tony Stark";
//        String name=sentence.substring(5);
//        System.out.println(name);
//
//        StringBuilder sb=new StringBuilder("hello");
//        System.out.println(sb);
//        System.out.println(sb.charAt(0));
//        set character at a pos by replacing one
//        sb.setCharAt(0,'P');
//        System.out.println(sb);

//        to insert without replacing
//        sb.insert(0,'S');
//        sb.insert(2,'n');
//        System.out.println(sb);

//        delete
//        sb.delete(2,3);
//        sb.delete(0,1);
//        sb.delete(2,4);
//
//        System.out.println(sb);
//        for(int i=0;i<sb.length()/2;i++){
//            int front=i;
//            int back=sb.length()-1-i;
//            char frontChar=sb.charAt(front);
//            char backchar= sb.charAt(back);
//
//            sb.setCharAt(front,backchar);
//            sb.setCharAt(back,frontChar);
//
//
//        }
//        System.out.println(sb);

//>>>>>>>>>>>>>>>>>>>>>>>>>>>string builder>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.*;
public class Main{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
    }
}




















