import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class tictactoe{

    static void printRules(){
        System.out.println("\t\t\tTIC-TAC-TOE GAME\t\t\t");
        System.out.print("RULES-FOR-THE-GAME:\n## The game is played on a 3x3 grid.\n## Players take turns marking an empty cell with their respective symbols usually X and O by specifying the position of the cell.\n");
        System.out.print("## The first player to get three of their symbols in a row, either horizontally, vertically, or diagonally, wins the game.\n## The game is over when all 9 squares are full.\n## The game of Tic Tac Toe ends in a tie when all nine squares are filled and neither player has three marked in a row\n");
    }
    private static String[][] board = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
    static void printBoard(String[][] board){
        System.out.println("Board ->");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("| "+ board[i][j] + " |");
            }
            System.out.println();
            if(i==0 || i==1){
                System.out.print("--------------\n");
            }
        }
    }
    static  int[] OccupiedPosition = new int[9];

    static boolean occupiedOrNot(int pos){
        for(int i=0; i<OccupiedPosition.length; i++){
            if(pos == OccupiedPosition[i]){
                return true;
            }
        }
        return false;
    }
    static void makeMove(int pos,String piece){
        int occ = 0;
        OccupiedPosition[occ++] = pos;
        for(int i = 0; i<=2; i++){
            for(int j = 0; j <=2; j++){
                if(i+1 == 1){
                    if(j+1 == pos){

                        board[i][j] = piece;
                        printBoard(board);
                        return;
                    }
                }
                else if(i+1==2 && (j+1)+2*i+1 == pos){
                    board[i][j] = piece;
                    printBoard(board);
                    return;
                }
                else if(i+1==3 && (j+1)+2*(i+1) == pos){
                    board[i][j] = piece;
                    printBoard(board);
                    return;
                }
              }
        }   
    }
    static int win(String[][] board, String piece){
        ArrayList<int[]> possibilites = new ArrayList<>();
        
    }
    // static int winOrnot(String[][] board,int token,String piece){
    //     int setposition[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
    //     int OddSum = 0;
    //     int EvenSum = 0;
    //     int count1 =1;
    //     int count2 = 1;
    //     if(token%2!=0){
    //     for(int i=0; i<3;i++){
    //         for(int j =0; j<3; j++){
    //            if(board[i][j].equals(piece)){
    //             if(count1 <= 3){
    //             if(count1 == 1){
    //             OddSum += setposition[i][j];
    //             count1++;
    //             }  
    //             }
    //            }
    //         }
    //     }
    //         if(OddSum%3 == 0){
    //           return token;
    //         }
    //     }
    //     else{
    //         for(int i=0; i<3;i++){
    //             for(int j =0; j<3; j++){
    //                 if(board[i][j].equals(piece)){
    //                     if(count2 <= 3){
    //                     if(count2 == 1){
    //                     EvenSum += setposition[i][j];
    //                     count2++;
    //                     }  
    //                     }
    //                 }
    //             }
    //         }
    //             if(EvenSum%3 == 0){
    //               return token;
    //             }
    //     }
    //     return -1;

    // }
    // static int win(String[][] board, int token, String piece){
    //     int setposition[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
    //     if(token%2!=0){
    //         for(int i=0; i<3; i++){
    //             for(int j=0; j<3; j++){
    //                 if(board[i][j].equals(piece)){
    //                     sum += setposition[i][j];
    //                 }
    //             }
    //         }
    //     }
    // }
    public static void main(String[] args) throws IOException{
        printRules();
        System.out.println("_________________________________________________________________\n");
        System.out.println("\t\t\tGAME STARTED\t\t\t\n");
        System.out.print("Player 1 -> Select your Symbol  X or O : ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String pl1key = bf.readLine();
        String pl2key = null;
        if(pl1key.equalsIgnoreCase("x")){
            pl2key = "O";
        }
        else if(pl1key.equalsIgnoreCase("o")){
            pl2key = "X";
        }
        else{
            System.out.print("Invalid key........");
            System.exit(1);
        }
        System.out.println("Player 1 -> Your symbol is " + pl1key.toUpperCase());
        System.out.println("Player 2 -> Your symbol is " + pl2key);
        printBoard(board);
        int counter = 1;
        while(counter != 10){
            if(counter%2 != 0){
                System.out.print("Player 1 -> Enter position to place the " + pl1key.toUpperCase()+ " : ");
                int pos = Integer.parseInt(bf.readLine());
                if(pos <= 9){
                    if(!occupiedOrNot(pos)){
                        makeMove(pos, pl1key);
                        if(counter >= 2){
                            if(winOrnot(board, counter,pl1key)%2!= 0){
                                System.out.print("Player 1 -> "+pl1key.toUpperCase()+ " WINS!!!!! \nPlayer 2 -> "+pl2key+" LOSES!!!!!");
                            }
                        }
                    }
                    else{
                        System.out.println("No Cheating...... Position already filled");
                    }
                }
                else{
                    System.out.println("Wrong Position");
                    System.exit(1);
                }
            }
            else{
                System.out.print("Player 2 -> Enter position to place the " + pl2key+ " : ");
                int pos = Integer.parseInt(bf.readLine());
                if(pos <= 9){
                    if(!occupiedOrNot(pos)){
                        makeMove(pos, pl2key);
                        if(counter >= 2){
                            if(winOrnot(board, counter, pl2key) == 0){
                                System.out.print("Player 2 -> "+pl2key+ " WINS!!!!! \nPlayer 1 -> "+pl1key.toUpperCase()+" LOSES!!!!!");
                            }
                        }
                    }
                    else{
                        System.out.println("No Cheating...... Position already filled");
                    }
                }
                else{
                    System.out.println("Wrong Position");
                    System.exit(1);
                }
            }
            counter++;
        }
    }
}