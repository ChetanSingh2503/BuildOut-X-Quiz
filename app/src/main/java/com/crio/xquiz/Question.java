package com.crio.xquiz;
import java.util.*;

public class Question{
    String questionText;
    String answer;
    List<String> choices;
    //TODO: Define the variable to store the question text
    //TODO: Define the variable to store the answer text
    //TODO: Define the variable to store the list of text choices
    public Question(String questionText, List<String> choices, String answer) {
        if (questionText == null || questionText.isEmpty()) {
            System.out.println("Question text cannot be null or empty!");
        } else if (choices == null || choices.isEmpty()) {
            System.out.println("Choices cannot be null or empty!");
        } else if (answer == null || answer.isEmpty()) {
            System.out.println("Answer cannot be null or empty!");
        } else if (!choices.contains(answer)) {
            System.out.println("Answer is not present among the choices!");
        } else {
            this.questionText = questionText;
            this.choices = choices;
            this.answer = answer;
        }
    }

    // Add getters and setters here


    public String getQuestionText() {
        return questionText;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public List<String> getChoices() {
        return choices;
    }

        public boolean checkAnswer(String answer){
            if(answer.equals(this.answer)){
                return true;
            }else{
                return false;
            }
        }
    // TODO: Create the Question class constructor 
    // use the  signature :  public Question(String questionText, List<String> choices, String answer)
    // Include the following validations
        // If QuestionText is null or empty, then print “Question text cannot be null or empty!”
        // If List of Choices is null or EmptyList,then print "Choices cannot be null or empty!"
        // If answer is null or Empty, then print “Answer cannot be null or empty!” 
        // If answer is not one of the choices in the List of choices, then print “Answer is not present among the choices!”
    // Note: The print statements should match exactly with the one specified above, since we have test cases designed on this
    // If the print statements do not match then the tests might fail, so be cautious

    //TODO: Create the getter method : public String getAnswer(), which returns the answer

    //TODO: Create the getter method : public String getQuestionText(), which returns the questionText

    //TODO: Create the getter method : public List<String> getChoices(), which returns the choices

    //TODO: Create the method checkAnswer() with signature: public boolean checkAnswer(String answer)
        // Under this check If answer is correct. then return True
        // If answer is incorrect, then return False.
        

public void display(){
    System.out.println(getQuestionText());
    for(int i = 0; i < choices.size(); i++){
        int choiceNumber = i+1;
        System.out.println(choiceNumber + ":" + choices.get(i));
    }

}


}

