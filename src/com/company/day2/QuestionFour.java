package com.company.day2;

public class QuestionFour {
    private static QuestionFour questionFour;
    private QuestionFour(){

    }

    public static QuestionFour getInstance(){
        if(questionFour == null){
            questionFour = new QuestionFour();
        }
        return questionFour;
    }
}
class SingletonExample{
    public static void main(String[] args) {
        System.out.println(QuestionFour.getInstance().hashCode());
        System.out.println(QuestionFour.getInstance().hashCode());
    }
}
