public class CompareNM {
    public static String compareNM(int n, int m){
        return (n==m ? "equal" : n<m ? "lesser" : "greater");
    }

    public static void main(String[] args) {
        System.out.println(compareNM(4,6));
        System.out.println(compareNM(4,1));
        System.out.println(compareNM(4,4));
    }
}
