public class Main {
    public static void main(String[] args) {
        String prompt = "Test Question";
        String[] questions = {"Do you live alone or with others?\n1. With Family\n2. With Roommates\n3. Alone\n", "Do you prefer dogs, cats, or both?\n1.Cats\n2.Dogs\n3.No Preference\n", "Do you have the energy for an energetic animal?\n1.Somewhat\n2.Yes\n3.No"};
        int[] score = {0, 0, 0};
        Questionnaire q1 = new Questionnaire();
        q1.question(prompt, questions, score);
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d\n",score[i]);
        }
        q1.answer(score);
    }
}