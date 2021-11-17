package com.yyj.exam.board;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Scanner scan = new Scanner(System.in); //시스템인 : 키보드를 받아낸다
    int articlesLastId = 0;


      System.out.println("==게시판 v 0.1==");
      System.out.println("==프로그램 시작==");
    while(true){
      System.out.printf("명령) ");
      String cmd = scan.next();

        if(cmd.equals("/usr/article/write")){
          System.out.println("- 게시물 등록 -");
          System.out.print("제목 : ");
          String title = scan.next();
          System.out.print("내용 : ");
          String body = scan.next();
          articlesLastId = articlesLastId+1;
          int tempId = articlesLastId;


          Aritcle article = new Aritcle();
          article.id = tempId;
          article.title = title;
          article.body = body;

          System.out.println("생성된 게시물 객체 : " + article);



          System.out.printf("%d번 게시물이 등록되었습니다.\n",article.id);


        }

        else if(cmd.equals("exit")){
          break;
        }

        else {
        System.out.printf("입력된 명령어 : %s\n",cmd);
      }
      }
      System.out.println("==프로그램 종료==");

      scan.close();
  }
}


class Aritcle{

  int id;
  String title;
  String body;


}