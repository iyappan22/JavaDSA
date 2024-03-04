package com.iyappan.Subset;

import java.util.ArrayList;
import java.util.List;

public class maze {
    public static void main(String [] args) {
        int[] arr = {1, 2, 2};
        ArrayList<String> ans = mazePathArr("", 3, 3);
        System.out.println(ans);
    }

    static int mazePathCount(int R, int C){
        if(C == 1 || R == 1){
            return 1;
        }
        int left = mazePathCount(R - 1, C);
        int right = mazePathCount(R, C -1 );
        return left + right;
    }

    static void mazePath(String p, int R, int C){
        if(C == 1 && R == 1){
            System.out.println(p);
            return;
        }
        if(R > 1){
            mazePath(p + "D", R - 1, C);
        }
        if(C > 1){
            mazePath(p + "R", R, C -1 );
        }
    }

    static ArrayList<String> mazePathArr(String p, int R, int C){
        if(C == 1 && R == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> paths = new ArrayList<>();
        if(R > 1){
            paths.addAll(mazePathArr(p + "D", R - 1, C));
        }
        if(C > 1){
            paths.addAll(mazePathArr(p + "R", R, C -1 ));
        }
        return paths;
    }
}
