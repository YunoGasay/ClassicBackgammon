import game.Board;
import game.Chips;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Interface {
    private HashMap<Integer, Image> picturesWhite;
    private HashMap<Integer, Image> picturesBlack;
    private HashMap<Integer, Image> dices;
    private final Board gameBoard;
    private Integer chipsNumFirst;
    private Integer chipsNumLast;
    private ArrayList<Integer> move;
    private int count = 0;
    private int temp = 0;
    private boolean isWhite = true;
    private boolean turn = false;
    private boolean isEquals;
    private String turns = "White turn";

    @FXML
    private FlowPane upperPart;

    @FXML
    private FlowPane upperLeft;

    @FXML
    private ImageView ch12;

    @FXML
    private ImageView ch11;

    @FXML
    private ImageView ch10;

    @FXML
    private ImageView ch9;

    @FXML
    private ImageView ch8;

    @FXML
    private ImageView ch7;

    @FXML
    private ImageView ch6;

    @FXML
    private ImageView ch5;

    @FXML
    private ImageView ch4;

    @FXML
    private ImageView ch3;

    @FXML
    private ImageView ch2;

    @FXML
    private ImageView ch1;

    @FXML
    private FlowPane lowerPart;

    @FXML
    private FlowPane lowerRight;

    @FXML
    private ImageView ch13;

    @FXML
    private ImageView ch14;

    @FXML
    private ImageView ch15;

    @FXML
    private ImageView ch16;

    @FXML
    private ImageView ch17;

    @FXML
    private ImageView ch18;

    @FXML
    private ImageView ch19;

    @FXML
    private ImageView ch20;

    @FXML
    private ImageView ch21;

    @FXML
    private ImageView ch22;

    @FXML
    private ImageView ch23;

    @FXML
    private ImageView ch24;

    @FXML
    private Button diceRoll;

    @FXML
    private ImageView dice1;

    @FXML
    private ImageView dice2;

    @FXML
    private Label diceValue;

    @FXML
    public void Dice() {
        move = gameBoard.Dice();
        diceValue.setText("Your dices are: \n" + move.get(0) + ", " + move.get(1) + "\n" + turn);
        dice1.setImage(dices.get(move.get(0)));
        dice2.setImage(dices.get(move.get(1)));
        diceRoll.setDisable(true);
        temp = move.size();
        isEquals = move.get(0).equals(move.get(1)) && (move.get(0).equals(3) || move.get(0).equals(4) || move.get(0).equals(6));
    }

    public Image setTheImage(Chips ch) {
        if (ch.Black())
            return picturesBlack.get(ch.getNum());
        else
            return picturesWhite.get(ch.getNum());
    }

    public void go() {
        ch1.setImage(setTheImage(gameBoard.getChips(0)));
        ch2.setImage(setTheImage(gameBoard.getChips(1)));
        ch3.setImage(setTheImage(gameBoard.getChips(2)));
        ch4.setImage(setTheImage(gameBoard.getChips(3)));
        ch5.setImage(setTheImage(gameBoard.getChips(4)));
        ch6.setImage(setTheImage(gameBoard.getChips(5)));
        ch7.setImage(setTheImage(gameBoard.getChips(6)));
        ch8.setImage(setTheImage(gameBoard.getChips(7)));
        ch9.setImage(setTheImage(gameBoard.getChips(8)));
        ch10.setImage(setTheImage(gameBoard.getChips(9)));
        ch11.setImage(setTheImage(gameBoard.getChips(10)));
        ch12.setImage(setTheImage(gameBoard.getChips(11)));
        ch13.setImage(setTheImage(gameBoard.getChips(12)));
        ch14.setImage(setTheImage(gameBoard.getChips(13)));
        ch15.setImage(setTheImage(gameBoard.getChips(14)));
        ch16.setImage(setTheImage(gameBoard.getChips(15)));
        ch17.setImage(setTheImage(gameBoard.getChips(16)));
        ch18.setImage(setTheImage(gameBoard.getChips(17)));
        ch19.setImage(setTheImage(gameBoard.getChips(18)));
        ch20.setImage(setTheImage(gameBoard.getChips(19)));
        ch21.setImage(setTheImage(gameBoard.getChips(20)));
        ch22.setImage(setTheImage(gameBoard.getChips(21)));
        ch23.setImage(setTheImage(gameBoard.getChips(22)));
        ch24.setImage(setTheImage(gameBoard.getChips(23)));

        ch13.setRotate(180);
        ch14.setRotate(180);
        ch15.setRotate(180);
        ch16.setRotate(180);
        ch17.setRotate(180);
        ch18.setRotate(180);
        ch19.setRotate(180);
        ch10.setRotate(180);
        ch21.setRotate(180);
        ch22.setRotate(180);
        ch23.setRotate(180);
        ch24.setRotate(180);
    }

    public void setMapDice() throws FileNotFoundException {
        dices = new HashMap<>();
        dices.put(1, new Image(new FileInputStream("src/view/images/dice1.jpg")));
        dices.put(2, new Image(new FileInputStream("src/view/images/dice2.jpg")));
        dices.put(3, new Image(new FileInputStream("src/view/images/dice3.jpg")));
        dices.put(4, new Image(new FileInputStream("src/view/images/dice4.jpg")));
        dices.put(5, new Image(new FileInputStream("src/view/images/dice5.jpg")));
        dices.put(6, new Image(new FileInputStream("src/view/images/dice6.jpg")));
    }

    public void setMapImages() throws FileNotFoundException {
        picturesWhite = new HashMap<>();
        picturesBlack = new HashMap<>();
        picturesWhite.put(0, new Image(new FileInputStream("src/view/images/White0.png")));
        picturesWhite.put(1, new Image(new FileInputStream("src/view/images/White1.png")));
        picturesWhite.put(2, new Image(new FileInputStream("src/view/images/White2.png")));
        picturesWhite.put(3, new Image(new FileInputStream("src/view/images/White3.png")));
        picturesWhite.put(4, new Image(new FileInputStream("src/view/images/White4.png")));
        picturesWhite.put(5, new Image(new FileInputStream("src/view/images/White5.png")));
        picturesWhite.put(6, new Image(new FileInputStream("src/view/images/White6.png")));
        picturesWhite.put(7, new Image(new FileInputStream("src/view/images/White7.png")));
        picturesWhite.put(8, new Image(new FileInputStream("src/view/images/White8.png")));
        picturesWhite.put(9, new Image(new FileInputStream("src/view/images/White9.png")));
        picturesWhite.put(10, new Image(new FileInputStream("src/view/images/White10.png")));
        picturesWhite.put(11, new Image(new FileInputStream("src/view/images/White11.png")));
        picturesWhite.put(12, new Image(new FileInputStream("src/view/images/White12.png")));
        picturesWhite.put(13, new Image(new FileInputStream("src/view/images/White13.png")));
        picturesWhite.put(14, new Image(new FileInputStream("src/view/images/White14.png")));
        picturesWhite.put(15, new Image(new FileInputStream("src/view/images/White15.png")));

        picturesBlack.put(0, new Image(new FileInputStream("src/view/images/Black0.png")));
        picturesBlack.put(1, new Image(new FileInputStream("src/view/images/Black1.png")));
        picturesBlack.put(2, new Image(new FileInputStream("src/view/images/Black2.png")));
        picturesBlack.put(3, new Image(new FileInputStream("src/view/images/Black3.png")));
        picturesBlack.put(4, new Image(new FileInputStream("src/view/images/Black4.png")));
        picturesBlack.put(5, new Image(new FileInputStream("src/view/images/Black5.png")));
        picturesBlack.put(6, new Image(new FileInputStream("src/view/images/Black6.png")));
        picturesBlack.put(7, new Image(new FileInputStream("src/view/images/Black7.png")));
        picturesBlack.put(8, new Image(new FileInputStream("src/view/images/Black8.png")));
        picturesBlack.put(9, new Image(new FileInputStream("src/view/images/Black9.png")));
        picturesBlack.put(10, new Image(new FileInputStream("src/view/images/Black10.png")));
        picturesBlack.put(11, new Image(new FileInputStream("src/view/images/Black11.png")));
        picturesBlack.put(12, new Image(new FileInputStream("src/view/images/Black12.png")));
        picturesBlack.put(13, new Image(new FileInputStream("src/view/images/Black13.png")));
        picturesBlack.put(14, new Image(new FileInputStream("src/view/images/Black14.png")));
        picturesBlack.put(15, new Image(new FileInputStream("src/view/images/Black15.png")));
    }

    public Interface() throws FileNotFoundException {
        gameBoard = new Board();
        setMapDice();
        setMapImages();
    }

    private boolean canMove() {
        for (int element : move) {
            for (int i =0; i < 24; i++) {
                if (isWhite) {
                    if (!gameBoard.getChips(i + element).Black()) {
                        return true;
                    }
                } else {
                    if (gameBoard.getChips(i + element).White()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void setValue(int num) {
        if (count < temp && canMove()) {
            boolean ok = false;
            if (chipsNumFirst == null)
                chipsNumFirst = num;
            else {
                chipsNumLast = num;
                for (int i = 0; i < move.size(); i++) {
                    if (chipsNumLast == 1000 && gameBoard.canThrow(isWhite)) {
                        if (24 - chipsNumFirst <= move.get(i) && isWhite
                                || !isWhite && chipsNumFirst > 5 && chipsNumFirst < 12) {
                            ok = true;
                            move.remove(i);
                            break;
                        }
                    }
                    if (chipsNumLast - chipsNumFirst == move.get(i)
                            || !isWhite && (24 - chipsNumFirst + chipsNumLast == move.get(i))) {
                        ok = true;
                        if (turn && (chipsNumFirst == 0 && isWhite || chipsNumFirst == 12 && !isWhite && isEquals)) {
                            ok = false;
                            break;
                        }
                        move.remove(i);
                        break;
                    }
                }
                if (ok && gameBoard.Move(isWhite, chipsNumFirst, chipsNumLast)) {
                    count++;
                    if (chipsNumFirst == 0 && isWhite || chipsNumFirst == 12 && !isWhite)
                        turn = true;
                }
                chipsNumFirst = null;
                chipsNumLast = null;
                if (count == temp) {
                    turn = false;
                    count = 0;
                    isWhite = !isWhite;
                    if (isWhite) {
                        turns = "White turn";
                    } else turns = "Black turn";
                    switch (gameBoard.Win()) {
                        case 0:
                            diceRoll.setDisable(false);
                            move.clear();
                            break;
                        case 1:
                            diceRoll.setText("Black turn");
                            break;
                        case 2:
                            diceRoll.setText("White turn");
                            break;
                    }
                }
            }
        }
        go();
    }

    @FXML
    void setValue1(MouseEvent event) {setValue(0);}

    @FXML
    void setValue2(MouseEvent event) {setValue(1);}

    @FXML
    void setValue3(MouseEvent event) {setValue(2);}

    @FXML
    void setValue4(MouseEvent event) {setValue(3);}

    @FXML
    void setValue5(MouseEvent event) {setValue(4);}

    @FXML
    void setValue6(MouseEvent event) {setValue(5);}

    @FXML
    void setValue7(MouseEvent event) {setValue(6);}

    @FXML
    void setValue8(MouseEvent event) {setValue(7);}

    @FXML
    void setValue9(MouseEvent event) {setValue(8);}

    @FXML
    void setValue10(MouseEvent event) {setValue(9);}

    @FXML
    void setValue11(MouseEvent event) {setValue(10);}

    @FXML
    void setValue12(MouseEvent event) {setValue(11);}

    @FXML
    void setValue13(MouseEvent event) {setValue(12);}

    @FXML
    void setValue14(MouseEvent event) {setValue(13);}

    @FXML
    void setValue15(MouseEvent event) {setValue(14);}

    @FXML
    void setValue16(MouseEvent event) {setValue(15);}

    @FXML
    void setValue17(MouseEvent event) {setValue(16);}

    @FXML
    void setValue18(MouseEvent event) {setValue(17);}

    @FXML
    void setValue19(MouseEvent event) {setValue(18);}

    @FXML
    void setValue20(MouseEvent event) {setValue(19);}

    @FXML
    void setValue21(MouseEvent event) {setValue(20);}

    @FXML
    void setValue22(MouseEvent event) {setValue(21);}

    @FXML
    void setValue23(MouseEvent event) {setValue(22);}

    @FXML
    void setValue24(MouseEvent event) {setValue(23);}

    @FXML
    private void outThrow(MouseEvent event) {setValue(1000);}
}
