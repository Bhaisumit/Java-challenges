public class arraytostring {
    public static void main(String[] args) {
        String []arr=new String[]{"Absolutely ," ,"this","is "," best ","course", "of","java"};

        StringBuilder sb=new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
            
        }
        System.out.println(sb);
    }
}
