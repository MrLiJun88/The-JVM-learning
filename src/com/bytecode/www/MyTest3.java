package com.bytecode.www;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

public class MyTest3 {

    public void test(){

       try{
           InputStream is = new FileInputStream("test.txt");

           ServerSocket serverSocket = new ServerSocket(6666);
           serverSocket.accept();
       }
       catch (FileNotFoundException e){

       }
       catch (IOException e2){

       }
       catch (Exception e3){

       }
       finally {
           System.out.println("finally");
       }
    }
}
