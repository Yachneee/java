package day3_830.pract;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Administrator
 */
public class WordBreak {
    public static boolean wordBreak(String s, String[] wordDict) {
//        给定一个非空字符串和一个包含非空单词列表的字典，编写一个函数来确定字符串是否可以被空格拆分为一个或多个 字典中的单词。
        for (String now : wordDict) {
            while (s.contains(now)) {
                int index1 = s.indexOf(now);
                int index2 = index1 + now.length();
                s = s.substring(0, index1) + s.substring(index2);
            }
        }
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }
        return str.length() == 0;
    }
    public static boolean wordBreak2(String s,String[] wordDict){
        boolean[] booleans=new boolean[s.length()];
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            String str=s.substring(index,i+1);
            for (String value : wordDict) {
                if (str.equals(value)) {
                    booleans[i] = true;
                    index = i + 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(booleans));
        return booleans[s.length()-1];
    }
    public static boolean wordBreak3(String s,String[] wordDict){
        boolean[] booleans=new boolean[s.length()];
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            String str=s.substring(index,i+1);
            if(inDict(str,wordDict)){
                booleans[i] = true;
                index = i + 1;
            }
            String newS1=str;
            if(!booleans[i]){
                for (int j = index-1; j >= 0; j--) {
                    newS1=s.charAt(j)+newS1;
                    String newS2=s.substring(0,j);
                    if(inDict(newS1,wordDict)&&(inDict(newS2,wordDict)|| "".equals(newS2))){
                        booleans[i] = true;
                        index = i + 1;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(booleans));
        return booleans[s.length()-1];
    }
    public static boolean inDict(String s,String[] dict){
        for (String value : dict) {
            if (s.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String string="cars";
        String[] wordDict= {"car","ca","rs"};
        System.out.printf("%s %s 被拆分为字典中的单词\n",string,(wordBreak(string, wordDict)?"能":"不能"));
        //不能
        //TODO 有bug
        System.out.printf("%s %s 被拆分为字典中的单词\n",string,(wordBreak2(string, wordDict)?"能":"不能"));
        //能
        String string1="hellocode";
        String[] wordDict1= {"he","hello","code"};
        System.out.printf("%s %s 被拆分为字典中的单词\n",string1,(wordBreak(string1, wordDict1)?"能":"不能"));
        //不能
        System.out.printf("%s %s 被拆分为字典中的单词\n",string1,(wordBreak2(string1, wordDict1)?"能":"不能"));
        //不能
        //TODO 有bug
        System.out.printf("%s %s 被拆分为 %s 中的单词\n",string1,(wordBreak3(string1, wordDict1)?"能":"不能"),Arrays.toString(wordDict1));
        //能
    }
}

