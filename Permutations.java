package StringsRecursion;

public class Permutations {
    public static void main(String[] args) {
        String p ="";
        String up = "abc";
        perm(p,up);
        //System.out.println(permcount(p,up));
    }
    static void perm(String p,String up){

        if(up.isEmpty()){
            System.out.println("'" + p + "'");
            return;
        }
        char ch =up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s =p.substring(i);
            perm(f+ch+s,up.substring(1));

        }
    }
    // counting no of permutations ------------------>>>
    static int  permcount(String p,String up){
        if(up.isEmpty()){
            return 1 ;
        }
        char ch =up.charAt(0);
        int count =0;
        for (int i = 0; i <=p.length(); i++) {
            String f = p.substring(0,i);
            String s =p.substring(i,p.length());
            count+= permcount(f+ch+s,up.substring(1));

        }
        return count;
    }
}
