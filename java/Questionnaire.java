import java.util.Scanner;
class Questionnaire {
    public static int[] question(String prompt, String[] questions, int[] score) {
        //takes a single question prompt, the associated questions, and keeps track of how many times the index is selected, so if option one is selected 3 times that's the output.
        // a little imprecise but good enough for now 
        Scanner scan = new Scanner(System.in);
        System.out.printf("%s\n", prompt);
        for (int i = 0; i < questions.length; i++) {
            System.out.printf("%s\n", questions[i]);
            int response = scan.nextInt();
            score[response-1] = score[response-1]+1;
        }
        return score;
    }

    public static void Questionnaire(String[] args) {
        String prompt = "Test Question";
        String[] questions = {"Question 1", "Question 2", "Question 3"};
        int [] score = {0,0,0};
        question(prompt, questions,score);

    }
}