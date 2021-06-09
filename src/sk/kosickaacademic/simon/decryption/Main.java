package sk.kosickaacademic.simon.decryption;

public class Main {
    public static void main(String[] args) {
        System.out.println(decrypt("CyCe`ubTufu|_`ub"));
    }

    public static String decrypt(String cypher){
        String result="";
        char a;
        char[] bin;
        for(int i=0; i<cypher.length(); i++)
        {
            a = cypher.charAt(i);
            bin=Integer.toBinaryString((int) a).toCharArray();
            if(bin[bin.length-5]=='1') bin[bin.length-5] = '0';
            else bin[bin.length-5] = '1';
            result+=(char)(Integer.parseInt(String.valueOf(bin), 2));
        }
        return result;
    }
}
