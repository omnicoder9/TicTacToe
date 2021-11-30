public class Tictactoe {
    static String tictactoe(String p1move, String p2move){
        if (p1move.equals(p2move)){
            return "TIE";
        }
        else if (p1move.equals("rock") && p2move.equals("scissors")){
            return "player 1 wins";
        }
        else if (p1move.equals("paper") && p2move.equals("rock")){
            return "player 1 wins";
        }
        else if (p1move.equals("scissors") && p2move.equals("paper")){
            return "player 1 wins";
        }
        else{
            return "player 2 wins";
        }
    }

    public static void main(String[] args){

        String p1move="paper";
        String p2move="scissors";

        System.out.println(tictactoe(p1move,p2move));

    }
}
