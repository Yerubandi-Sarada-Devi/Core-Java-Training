package day4;
import java.util.*;
import java.io.*;

class DictionaryDemo{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Dictionary phone_book = new Hashtable();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          phone_book.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
          // Write code here
          if(phone_book.get(s) != null){
              System.out.println(s + "=" + phone_book.get(s));
          }
          else{
              System.out.println("Not found");
          }
      }
      in.close();
  }
}
