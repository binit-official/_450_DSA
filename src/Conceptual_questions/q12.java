package Conceptual_questions;

//Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
//
//
//
//1, if the character is an uppercase alphabet (A - Z).
//0, if the character is a lowercase alphabet (a - z).
//-1, if the character is not an alphabet.

import java.util.Scanner;

public class q12 {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            char ch = sc.next().charAt(0);
            if(ch=='a'|| ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f'||ch=='g'||ch=='h'||ch=='i'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='o'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='u'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z'){
                System.out.println(0);
            }
            else if(ch=='A'|| ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z'){
                System.out.println(1);
            }
            else System.out.println(-1);

        }
    }

