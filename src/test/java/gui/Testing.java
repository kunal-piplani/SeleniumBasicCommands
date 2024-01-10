package gui;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Testing {
    public boolean Anagram(String s1 ,String s2) {
       char[] s1char = s1.toLowerCase().toCharArray();
        char[] s2char = s2.toLowerCase().toCharArray();
        Arrays.sort(s1char);
        Arrays.sort(s2char);
        s1 = String.valueOf(s1char);
        s2 = String.valueOf(s2char);
        System.out.println(s1);
        System.out.println(s2);
if(s1.length()!=s2.length())
        {
            return false;
        }
for(int i=0;i<s1.length();i++){

    if(s1.charAt(i)==s2.charAt(i)){
        continue;
    }
    else{
        return false;
    }

}

       return  true;
    }
    public static void main(String[] args) {
Testing test = new Testing();
        System.out.println(test.Anagram("Listen","Silent"));
    }
}
