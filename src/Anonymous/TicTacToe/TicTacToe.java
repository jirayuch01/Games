package Anonymous.TicTacToe;

import javax.swing.JFrame;

public class TicTacToe extends TicTacToeFrame {

    public static void main(String[] args) {
        JFrame ticTacToe = new TicTacToeFrame();
        ticTacToe.setTitle("TicTacToe!!");
        ticTacToe.setSize(500, 500);
        ticTacToe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);
    }
}