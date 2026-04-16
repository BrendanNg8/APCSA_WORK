//Brendan Ng 
public class WordMatch{
    private String secret;
    public WordMatch(String word){
        secret = word;
    }

    public int scoreGuess(String guess){
        int count = 0;
        for(int i = 0; i<secret.length(); i++){
            if(secret.substring(i, i + guess.length()).equals(guess)){
                count++;
            }
        }
        return count*guess.length()*guess.length();
    }

    public String findBeterGuess(String guess1, String guess2){
        int val1 = scoreGuess(guess1);
        int val2 = scoreGuess(guess2);
        if(val1>val2){
            return guess1;
        } else if(val2 > val1){
            return guess2;
          } else{
                if(guess1.compareTo(guess2) == -1 ){
                    return guess1;
                }
          else{
            return guess2;
        }
        }
    }
}