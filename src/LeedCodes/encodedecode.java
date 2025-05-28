package LeedCodes;

public class encodedecode {

    public String  encode(String[] str){
        String encoded="";
        for(int i=0;i<str.length;i++){
            encoded=encoded+str[i]+str[i].length();
        }
        return  encoded;

    }

    public  String decode(String str){
        String decoded="";
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)!='1' && str.charAt(i)!='2'){
               decoded=decoded+str.charAt(i);
           }

        }
        return decoded;
    }
}
