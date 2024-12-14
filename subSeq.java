package StringsRecursion;
import java.util.*;

public class subSeq {
    // SIMPLE APPROACH---->>
    public static void main(String[] args) {
        String p ="";
        String up = "abc";
        subseq(p,up);
    }
    static void subseq(String proc , String uproc){
        if(uproc.isEmpty()){
            System.out.println("'"+ proc + "' ");
            return;
        }
        char ch = uproc.charAt(0);
        subseq(proc+ch,uproc.substring(1));
        subseq(proc,uproc.substring(1));
    }



    //WITH ARRAY LIST----->>


//    public static void main(String[] args) {
//        String p =" ";
//        String up = "abc";
//        System.out.println(SubSeq(p,up));
//    }
//    static ArrayList<String> SubSeq(String p , String up){
//        if(up.isEmpty()){
//            ArrayList<String> str = new ArrayList<>();
//            str.add(p);
//            return str;
//        }
//        char ch = up.charAt(0);
//        ArrayList<String> left =SubSeq(p+ch,up.substring(1));
//        ArrayList<String> right =SubSeq(p,up.substring(1));
//        left.addAll(right);
//        return left;
//    }
}
