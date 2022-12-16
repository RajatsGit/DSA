package Recursion;

import java.util.ArrayList;

public class phonenumbercombination {
    public static void main(String[] args) {
        System.out.println(phonenumbercombination("23", ""));
    }
    public static ArrayList<String> phonenumbercombination(String input, String ans){
        if(input.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(ans);
            return list;
        }
        int digit = input.charAt(0) - '0' - 1;
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3; i< (digit) *3;i++){
            char ch =   (char) ('a'+i);
            list.addAll(phonenumbercombination(input.substring(1), ans+ch));
        }
        return list;
    }
}
