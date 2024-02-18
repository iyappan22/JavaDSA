package com.iyappan.Subset;

import java.util.ArrayList;

public class Dice {

    public static void main(String [] args){
        diceProb("", 4);
//        System.out.println(k);
    }

    static void diceProb(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i<=6 && i <= target; i++){
            diceProb(p + i, target - i);
        }
    }

    static ArrayList<String> diceProbArr(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i<=6 && i <= target; i++){
            ans.addAll(diceProbArr(p + i, target - i));
        }
        return ans;
    }

    static int diceProbCount(String p, int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i<=6 && i <= target; i++){
            count = count + diceProbCount(p + i, target - i);
        }
        return count;
    }
}
