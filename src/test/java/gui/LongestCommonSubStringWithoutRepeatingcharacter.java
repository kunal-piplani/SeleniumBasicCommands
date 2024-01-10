package gui;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestCommonSubStringWithoutRepeatingcharacter {
    public static void main(String[] args) {
        String INPUT ="aaaaaaaaa";
        int length =0;
        String ans =null;
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<Character, Integer>();
        char[]ch = INPUT.toCharArray();
int count =0;
        for(int i=0;i<ch.length;i++){
count++;
            if(!hashMap.containsKey(ch[i])){

                hashMap.put(ch[i],i);


            }else{
                i=hashMap.get(ch[i]);
                hashMap.clear();


            }

            if(hashMap.size()>length){
                length= hashMap.size();
                ans = hashMap.keySet().toString();
            }
            ;


        }
        System.out.println(length);
        System.out.println(ans);
        System.out.println(count);
    }

}
