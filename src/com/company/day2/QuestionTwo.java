//2. WAP to sorting string without using string Methods?.
package com.company.day2;

public class QuestionTwo {
    public static void main(String[] args) {
        System.out.println(sortString("sarthak"));
    }

    public static String sortString(String string) {
        char[] arr = string.toLowerCase().toCharArray();
        int index = -1;
        int prevDiff = 0;
        for (int i = 0; i< arr.length; i++){
            index = -1;
            prevDiff = 0;
            for (int j = i+1; j < arr.length; j++) {
                if ((int) arr[i] > (int) arr[j]) {
                    int newDiff = (int) arr[i] - (int) arr[j];
                    if(prevDiff < newDiff) {
                        prevDiff = newDiff;
                        index = j;
                    }
                }
            }
            if(index != -1){
                char tmp = arr[index];
                arr[index] = arr[i];
                arr[i] = tmp;
            }
        }
        return String.valueOf(arr);
    }
}
