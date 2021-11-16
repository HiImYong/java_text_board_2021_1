package com.yyj.exam.board;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Scanner scan = new Scanner(System.in);

      System.out.println("==게시판 v 0.1==");
      System.out.println("==프로그램 시작==");
      System.out.print("명령어 입력)");
      String a = scan.next();
    System.out.println("입력된 명령어 : " + a);
      System.out.println("==프로그램 종료==");
  }
}
