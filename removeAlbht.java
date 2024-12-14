package StringsRecursion;

public class removeAlbht {
    //WITH  ARGUMENTS------>>
//    public static void main(String[] args) {
//        String empty = " ";
//        String alph = "baccabha";
//        skip(empty,alph);
//
//    }
//    static void skip(String store ,String alp ){
//        if(alp.isEmpty()){
//            System.out.println(store);
//            return;
//        }
//        char ch = alp.charAt(0);
//        if(ch=='a'){
//            skip(store,alp.substring(1));
//        }else skip(store+ch,alp.substring(1));
//    }
    public static void main(String[] args) {
        String ans ="babcaba";
        System.out.println(skip(ans));
    }
    static String skip(String ans){
        if(ans.isEmpty()){
            return " ";
        }
        char ch = ans.charAt(0);
        if (ch == 'a') {
            return skip(ans.substring(1));
        }else return ch+skip(ans.substring(1));
    }
}
