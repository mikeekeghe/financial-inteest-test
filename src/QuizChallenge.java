import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class QuizChallenge {
    public static void main(String[] args) throws FileNotFoundException {
      /*  String output = do_FB_question("FB Java operators that work on two operands are known as _______ operators.",
                "binary");
        System.out.println(output);*/
        //prompt user to enter file name
        //read entered file name
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please Enter your quiz question file path ");
        String filepath = input1.nextLine();
//        1. reads quiz questions from a text file
        try {
            File myFile = new File(filepath);
            Scanner myReader = new Scanner(myFile);
            myReader.nextLine();
            int counter = 0;
            String result, answerLine;

                while (myReader.hasNextLine() ) {
                    String questionLine = myReader.nextLine();
                    String firstTwoChars = questionLine.substring(0, 2);
                    if (firstTwoChars.equalsIgnoreCase("fb")) {
                        answerLine = myReader.nextLine();
                   // System.out.println("firstTwoChars >>"+ firstTwoChars);

//                    System.out.println("correct_answer >> "+ correct_answer);
                        result = do_FB_question(questionLine, answerLine);
                        System.out.println(result);
                        questionLine = myReader.nextLine();
                        firstTwoChars = questionLine.substring(0, 2);

                            answerLine = myReader.nextLine();
                        }else{
                            myReader.nextLine();
                        }
            }


            myReader.close();


            //        endFor
//        3. If first word is FB
//        THEN call fill_in_the_blank method
//        If first word is MC
//        Call Multi_choice method
//        4. gets the user's response,
//        5. checks if the user answered correctly
//        6.  tallies the score
//        7. After all questions have been processed,
//        8. the user's quiz score is displayed
//        the program ends
//        9. Different methods for different types of questions
//
        } catch (
                FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        //end of main

    }

    private static String do_MC_question(String questionLine, String answerLine) {
        return null;
    }

    public static String do_FB_question(String question, String answer) {

        String output = "";
//        1. Read first question, store read data in variable called question
        question = question.substring(3);


        System.out.println(question);
        Scanner input2 = new Scanner(System.in);
        String user_answer = input2.nextLine();
        if (user_answer.equalsIgnoreCase(answer)) {
            output = "That's Correct!";
        } else {
            output = "Sorry, That's Incorrect!";
        }

        return output;
    }
}
