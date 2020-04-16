import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Scrabble Scorer Application");
        System.out.println("Enter word");

        try{

            String myWord=bufferedReader.readLine();

            Scrabble word=new Scrabble();
            int score=word.calculateScore(myWord);
            System.out.println("Score is : "+score);


        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
