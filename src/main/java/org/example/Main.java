package org.example;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a[]= {5,10,30,40,50,45,37};
//        System.out.println("Odd Numbers:");
//        int len = a.length;
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2!=0){
//                System.out.println(a[i]);
//            }
//        }
//        System.out.println("Even Numbers:");
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                System.out.println(a[i]);
//            }
//        }
//    }
//}
//***************************2nd method of even array******************
//    int[] data = {5, 10, 30, 40, 50, 45, 37};
//    int size = data.length;
//
//    int[] evenValues = new int[size]; // Creating an array to store even values
//    int evenCount = 0; // Counter for even values
//
//        for (int i = 0; i < size; i++) {
//        if (data[i] % 2 == 0) {
//        evenValues[evenCount] = data[i];
//        evenCount++;
//        }
//        }
//
//        // Printing even values
//        System.out.print("Even values: ");
//        for (int j = 0; j < evenCount; j++) {
//        System.out.print(evenValues[j] + " ");
//        }
//        }


// ********* reverse of string *************
//        String str = "Shreya";
//        String rev = "";
//
//        int len = str.length();//6
//        for (int i = len - 1; i >= 0; i--)//len-1=6-1=5/4/3/2/1/0
//        {
//            rev = rev + str.charAt(i);//i=5=a//i=4=y//i=3=e.....
//        }
//        System.out.println(rev);
//    }
//}
//////        *********reverse of integer**************
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int rev = 0;
//        {
//            rev = rev * 10 + num / 10;
//            num = num % 10;
//        }
//        System.out.println(rev);
//    }
//}


//    ******************swapping of nums*************

//        int a=10,b=20,t;
//        a=a+b;
//        b=a-b;
//        a=a-b;

//        t=a;
//        a=b;
//        b=t;
//
//        a=a*b;//10*20=200
//        b= a/b;//200/20=10
//        a=a/b;//200/10=20
//
//        System.out.println("after swappping");
//        System.out.println("a= " +a);
//        System.out.println("b= " +b);
//
//    }
//}

////********************add num of digits*****************

        int num = 1234;
        int sum=0;

        while(num>0);//1234
        {
            sum = sum+num%10;//1234/10
            num = num/10;
        }
        System.out.print("Sum of digits of num" +num);

    }
}
//*******************Fibonacci series***************************8 without using recrusion
//        {
//            int n1 = 0, n2 = 1, n3, i, count = 10;
//            System.out.print(n1 + " " + n2);//printing 0 and 1
//
//            for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
//            {
//                n3 = n1 + n2;
//                System.out.print(" " + n3);
//                n1 = n2;
//                n2 = n3;
//            }
//
//        }
//    }
