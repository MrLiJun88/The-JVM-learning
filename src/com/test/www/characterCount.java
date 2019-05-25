package com.test.www;

import java.util.*;

public class characterCount {

    private Map<Character,Integer> map;

    public characterCount(){
        map = new HashMap<>();
    }

    public Map<Character,Integer> count(String str){
        //迭代处理字符串中的每个字符
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            Integer n;
            if(map.containsKey(ch)){
                n = map.get(ch);
                map.put(ch,n+1);
            }
            else {
                map.put(ch,1);
            }
        }
        return map;
    }

    public void showMap(){
        Set<Character> chars = map.keySet();
        Iterator<Character> iterator = chars.iterator();
        while(iterator.hasNext()){
            char c = iterator.next();
            int num = map.get(c);
            System.out.println(c + " : " + num);
        }
    }

    public static void main(String[] args) {

        System.out.println("请输入一段文本： ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        characterCount characterCount = new characterCount();
        characterCount.count(str);
        characterCount.showMap();
    }
}
