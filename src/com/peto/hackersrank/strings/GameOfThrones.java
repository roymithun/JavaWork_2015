package com.peto.hackersrank.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class GameOfThrones {
	public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans="NO";
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        if(hasPalindromes(inputString)) {
            ans="YES";
        }
        System.out.println(ans);
        myScan.close();
    }
    
    static boolean hasPalindromes(String str) {
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        char[] cArr=str.toCharArray();
        for(char c : cArr) {
            map.put(c, map.containsKey(c)?map.get(c)+1:1);
        }
        int l=cArr.length;
        if(l%2==0) {
            for(Entry<Character, Integer> entry :map.entrySet()) {
                if(entry.getValue()%2!=0)
                    return false;
            }
            return true;
        } else {
            int oddCount=0;
            for(Entry<Character, Integer> entry :map.entrySet()) {
                if(entry.getValue()%2!=0) {
                    oddCount++;
                }
            }
            if(oddCount==1)
                return true;
            else
                return false;
        }
    }
}
