package rocks.zipcode.io.quiz3.arrays;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        StringBuilder sbr = new StringBuilder();
        String[] myRow = board[value];
        for (int i = 0; i < myRow.length; i++) {
            sbr.append(myRow[i]);
            sbr.append(",");
        }
        String[] str = sbr.toString().split(",");
        return str;
    }

    public String[] getColumn(Integer value) {
        StringBuilder sbr = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            sbr.append(board[i][value]);
            sbr.append(",");
        }
        String[] str = sbr.toString().split(",");
        return str;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        StringBuilder sbr = new StringBuilder();
        for (int i = 0; i < board[rowIndex].length; i++) {
            sbr.append(board[rowIndex][i]);
            sbr.append(",");
        }
        String[] str = sbr.toString().split(",");

        if((str[0].equalsIgnoreCase(str[1]) && ((str[1].equalsIgnoreCase(str[2])))))
            return true;
        else
            return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        StringBuilder sbr = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            sbr.append(board[i][columnIndex]);
            sbr.append(",");
        }
        String[] str = sbr.toString().split(",");

        if((str[0].equalsIgnoreCase(str[1]) && ((str[1].equalsIgnoreCase(str[2])))))
            return true;
        else
            return false;
    }

    public String getWinner() {
        int countX = 0;
        int countY = 0;
        //Check left diagonal
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                j = j + i;
                String string = board[i][j];
                if (string.equalsIgnoreCase("X")) {
                    countX++;
                }
                break;
            }

        }
        //Check right diagonal

        for (int i = 0; i < board.length; i++) {
            for (int k = board[0].length-1; k >= 0; k--) {
                k=k-i;
                String[] strings = board[k];
                String string = board[i][k];
                if (string.equalsIgnoreCase("X")) {
                    countY++;
                }
                break;
            }
        }
        String[] string1 = getColumn(0);
        Boolean mystr1 = compareStringArray(string1);
        String[] string2 = getColumn(1);
        Boolean mystr2 = compareStringArray(string2);

        if ((countX == 3)||(countY ==3)|| (mystr1 ==true)||(mystr2)==true)
            return "X";
        else
            return "O";


    }

    public String[][] getBoard() {
        return null;
    }

    public Boolean compareStringArray(String[] str){
        String [] expectedString = {"X","X","X"};

        ArrayList<String> ar = new ArrayList<String>();

        for(int i = 0; i < str.length; i++)
        {
            if(!Arrays.asList(expectedString).contains(str[i]))
                ar.add(str[i]);
        }
        if(ar.size()==0)
            return true;
        else
            return false;
    }
}
