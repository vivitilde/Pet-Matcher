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

    public static void answer(int[] score) {
        int max = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < score[max]) {
                max = i;
            }
        }
        switch(max) {
            case 1:
                System.out.printf("You should consider getting a cat");
                break;
            case 2:
                System.out.printf("You should consider getting a dog");
                break;
            case 3:
                System.out.printf("You should consider getting a fish");
                break;
        }
    }
}