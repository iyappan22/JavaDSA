package com.iyappan.Subset;

import java.util.ArrayList;

public class phonePadNumber {
    public static void main(String [] args){
       ArrayList<String> k =  padArr("", "12");
        System.out.println(k);
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = ((digit -1)*3); i < digit *3 ; i++){
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padArr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = ((digit -1)*3); i < digit *3 ; i++){
            char ch = (char) ('a' + i);
            ans.addAll(padArr(p + ch, up.substring(1)));
        }
        return ans;
    }
}
