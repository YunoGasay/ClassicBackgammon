package game;

import java.util.ArrayList;
import java.util.Random;

public class Board {
    private int White = 0;
    private int Black = 0;
    private final Chips[] board = new Chips[24];

    public void setOutCounterBlack (int num) {
        this.Black = num;
    }

    public void setOutCounterWhite (int num) {
        this.White = num;
    }

    public Chips getChips(int num) {return board[num];}

    public Board() {
        for (int i = 0; i < 24; i++) {
            board[i] = new Chips(i);
        }
    }

    public boolean Move(boolean isWhite, int start, int end) {
        Color current;

        if (isWhite) current = Color.WHITE;
        else current = Color.BLACK;

        if (end == 1000) {
            board[start].removeChecker();
            if (current == Color.BLACK) Black++;
            else White++;
            return true;
        }
        if (!current.equals(board[start].getColor())) return false;
        if (!current.equals(board[end].getColor()) && board[end].getColor() != Color.EMPTY) return  false;
        board[start].removeChecker();
        if (isWhite)
            board[end].addChecker(Color.WHITE);
        else board[end].addChecker(Color.BLACK);
        return true;
    }

    public boolean canThrow (boolean isWhite) {
        int count = 0;
        if (isWhite) {
            for (int i =18; i < 24; i++) {
                if (board[i].getColor().equals(Color.WHITE)) {
                    count += board[i].getNum();
                }
            }
            return count + White == 15;
        } else {
            for (int i = 6; i < 12; i++) {
                if (board[i].getColor().equals(Color.BLACK)) {
                    count += board[i].getNum();
                }
            }
            return count + Black == 15;
        }
    }
    public int Win() {
        if (White == 15) {
            System.out.println("White wins!");
            return 2;
        } else if (Black == 15) {
            System.out.println("Black wins!");
            return 1;
        }
        return 0;
    }

    public ArrayList<Integer> Dice() {
        ArrayList<Integer> move = new ArrayList<>();
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        if (dice1 == dice2)
            for (int i = 0; i < 4; i++)
                move.add(dice1);
            else {
                move.add(dice1);
                move.add(dice2);
            }
            return move;
    }

}

