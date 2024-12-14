package StringsRecursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",3);
        System.out.println(diceret("",3));
    }
    static void dice(String str,int target){
        if(target==0){
            System.out.println(str);
            return;
        }
        for (int i = 1; i < 6 && i<=target ; i++) {
            dice(str+i,target-i);
        }
    }

        //WITH ARRAYLIST---->>
    static ArrayList<String> diceret(String str, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i < 6 && i<=target ; i++) {
            list.addAll(diceret(str+i,target-i));
        }
        return list;
    }
}
