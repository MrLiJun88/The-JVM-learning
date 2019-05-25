package com.test.www;

import java.util.Scanner;

public class TestThrow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        try{
            TestThrow.chkStr(str);
        }
        catch (MyException e){

            System.out.println(e.getMessage());
        }
    }

    public static void chkStr(String message) throws MyException{

        boolean flag = message.matches("[a-zA-Z]+");
        boolean flag2 = message.matches("[0-9]+");

        if(flag || flag2){
            System.out.println(message);
        }
        else {
            throw new MyException("输入的字符串不全法，不能通过检验！");
        }
    }
}
