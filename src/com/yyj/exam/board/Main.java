package com.yyj.exam.board;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Scanner scan = new Scanner(System.in); //시스템인 : 키보드를 받아낸다

      System.out.println("==게시판 v 0.1==");
      System.out.println("==프로그램 시작==");
    while(true){
      System.out.printf("명령어 입력) ");
      String a = scan.next();

        if(a.equals("exit")){
          break;
        }
      }
      System.out.println("==프로그램 종료==");

      scan.close();
  }
}
