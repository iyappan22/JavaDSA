package com.iyappan.Subset;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String [] args){
        permutationArr("", "abc");
//        System.out.println(ans);
    }

    static void permutationArr(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            System.out.println(i);
//            System.out.println(p);
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            System.out.println(f);
            System.out.println(s);
//            System.out.println(f + ch + s);
            System.out.println(up.substring(1));
            permutationArr(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutationArrList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationArrList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
