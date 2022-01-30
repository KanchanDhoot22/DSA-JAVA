package com.company;

public class Stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<26; i++){
            char ch = (char)('a' + i);
//            System.out.println(ch);
           sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
