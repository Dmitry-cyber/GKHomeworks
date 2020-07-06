package homeworkthree;
import java.util.Arrays;
import java.util.Scanner;

public class guessthefruit {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int j, k;
        int i = (int) (Math.random() * (words.length - 1));
        String wordToGuess = words[i];
        int wordToGuessLength = wordToGuess.length();
        int maskLength = 15;
        String mask = String.format("%1$"+maskLength+ "s", "").replace(" ","#");
        char[] maskChars = mask.toCharArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте какое слово загадано" + Arrays.toString(words));
        String answer;
        do {
            System.out.println("Загаданное слово: " + mask);
            System.out.println("Введите слово из перечня");
            answer = scanner.nextLine();
            if (answer.equals(wordToGuess)) {
                break;
            }
            for (j = 0; j < answer.length(); j++) {
                if (wordToGuessLength < j + 1)
                    break;

                if (answer.charAt(j) == wordToGuess.charAt(j)) {
                    maskChars[j] = answer.charAt(j);
                }

            }
            mask = new String(maskChars);

        } while (true);

        System.err.println("Поздравляю, загаданное слово: " + wordToGuess);
    }
}