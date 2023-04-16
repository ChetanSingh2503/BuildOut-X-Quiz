package com.crio.xquiz;
 
import java.util.*;

public class Quiz{
    private String quizName;
    private List<Question> questions;
    private int finalScore;

    // TODO: Implement Quiz class constructor : public Quiz(String quizName);
        // Validate: If quizName is null or empty, print “Quiz Name cannot be null or empty!”
        // else initialise the quizName, questions and finalScore
        // Note: The statement to be printed should be exactly same.
    public Quiz(String quizName) {
        if (quizName == null || quizName.isEmpty()) {
            System.out.println("Quiz Name cannot be null or empty!");
        } else {
            this.quizName = quizName;
            this.questions = new ArrayList<>();
            this.finalScore = 0;
        }
    }
    

    //TODO: Create the getter method : public String getQuizName(), which returns the quizname

    //TODO: Create the getter method :public List<Question> getQuestions(), which returns the questions list

    //TODO: Create the getter method : public int getFinalScore(), which returns the final score public String getQuizName() {
    public String getQuizName(){
        return quizName;
    }
    
    public List<Question> getQuestions() {
        return questions;
    }

    public int getFinalScore() {
        return finalScore;
    }

    

    //TODO: Create addQuestion() method:  public void addQuestion(Question question)
        // Validate: If question is Null, print “Question cannot be null!”.
         // If question is not null then add the question to list of questions
    public void addQuestion(Question question) {
        if (question == null) {
            System.out.println("Question cannot be null!");
        } else {
            questions.add(question);
        }
    }
    



   

    public void attemptQuiz(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<questions.size();++i){
            questions.get(i).display();
            int opt = sc.nextInt();
            if(opt<1 || opt>questions.get(i).getChoices().size()){
                System.out.println("Please choose a number between 1 and " + questions.get(i).getChoices().size());
                i--;
            } else if (questions.get(i).checkAnswer(questions.get(i).getChoices().get(opt-1))){
                finalScore++;
            }
        }
        sc.close();
    }
    
   

    public void revealAnswerKey(){
        // TODO: add loop for printing all the questions along with answers in the questions list.
        for(int i = 0; i < questions.size(); i++)
        {
            System.out.println("Question no. " + (i+1) + " : " + questions.get(i).getQuestionText() +
                    "\nAnswer no. " + (i+1) + " : " + questions.get(i).getAnswer());
        }
    }
 

}

