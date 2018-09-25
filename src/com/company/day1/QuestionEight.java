package com.company.day1;

public class QuestionEight {
    public static void main(String[] args) {
        reverseString("Sarthakwet");
        reverseString("tewkahtraS");
    }
    public static void reverseString(String string){
        char[] charArray = string.toCharArray();
        for(int i=0,j=string.length()-1; i < charArray.length/2; i++, j--) {
            char tmp = charArray[j];
            charArray[j] = charArray[i];
            charArray[i] = tmp;
        }
        StringBuffer stringBuffer = new StringBuffer(String.copyValueOf(charArray));
        char tmp = stringBuffer.charAt(9);
        stringBuffer.insert(9, stringBuffer.charAt(4));
        stringBuffer.deleteCharAt(10);
        stringBuffer.insert(4, tmp);
        stringBuffer.deleteCharAt(5);
        System.out.println(stringBuffer);
    }
}
