import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scrabble {

//    A, E, I, O, U, L, N, R, S, T       1
//    D, G                               2
//    B, C, M, P                         3
//    F, H, V, W, Y                      4
//    K                                  5
//    J, X                               8
//    Q, Z                               10


    public Integer calculateScore(String a) {
        String word=a.toUpperCase();
        char[] wordArray=word.toCharArray();

        HashMap<Character,Integer> letterValues=new HashMap<Character, Integer>();
        letterValues.put('A', 1);
        letterValues.put('B', 3);
        letterValues.put('C', 3);
        letterValues.put('D', 2);
        letterValues.put('E', 1);
        letterValues.put('F', 4);
        letterValues.put('G', 2);
        letterValues.put('H', 4);
        letterValues.put('I', 1);
        letterValues.put('J', 8);
        letterValues.put('K', 5);
        letterValues.put('L', 1);
        letterValues.put('M', 3);
        letterValues.put('N', 1);
        letterValues.put('O', 1);
        letterValues.put('P', 3);
        letterValues.put('Q', 10);
        letterValues.put('R', 1);
        letterValues.put('S', 1);
        letterValues.put('T', 1);
        letterValues.put('U', 1);
        letterValues.put('V', 4);
        letterValues.put('W', 4);
        letterValues.put('X', 8);
        letterValues.put('Y', 4);
        letterValues.put('Z', 10);

        int answer=0;

        for ( char letter:wordArray){
            for (char i:letterValues.keySet()){
                if (i==letter){
                    answer+=letterValues.get(i);
                }
            }
        }



        
//        if(a.equals("a")){
//            answer = 1;
//        }
//        else if(a.equals("b")){
//            answer=2;
//        }
//
//        else if(a.equals("c")){
//            answer=3;
//        }
      
        return answer;
        

    }
}
