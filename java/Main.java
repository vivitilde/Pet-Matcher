public class Main {
    public static void main(String[] args) {
        String prompt = "Test Question";
        String[] questions = {"Question 1: Enter 1, 2, or 3", "Question 2: Enter 1, 2, or 3", "Question 3: Enter 1, 2, or 3"};
        int [] score = {0,0,0};
        Questionnaire q1 = new Questionnaire();
        q1.question(prompt, questions,score);
        for (int i: score) {
            System.out.printf("%d\n",i);
        }

    }
}