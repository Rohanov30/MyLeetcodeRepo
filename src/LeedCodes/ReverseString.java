package LeedCodes;

public class ReverseString {

    public String reverse(String str) {
        String[] Arr = str.split("\\s+");
        ;
        StringBuffer sb = new StringBuffer();
        for (int i = Arr.length - 1; i >=0; i--) {
            sb.append(Arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();

    }
}
