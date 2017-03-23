package Anonymous.TicTacToe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class TicTacToeFrame extends JFrame {

    // Indicate whose turn it is
    private char whoseTurn = 'X';
    private boolean gameOver = false;

    // Create cell grid
    private final Cell[][] cells = new Cell[3][3];

    // Create a status label
    JLabel jlblStatus = new JLabel("X's turn to play");

    public TicTacToeFrame() {
        this.setTitle("TicTacToe!!");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        JPanel panel = new JPanel(new GridLayout(3, 3, 0, 0));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                panel.add(cells[i][j] = new Cell());
            }
        }

        panel.setBorder(new LineBorder(Color.CYAN, 5));
        jlblStatus.setBorder(new LineBorder(Color.DARK_GRAY, 4));

        add(panel, BorderLayout.CENTER);
        add(jlblStatus, BorderLayout.SOUTH);
    }

    //Determine if game board is full.
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j].getToken() == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWon(char token) {
        // check rows
        for (int i = 0; i < 3; i++) {
            if ((cells[i][0].getToken() == token)
                    && (cells[i][1].getToken() == token)
                    && (cells[i][2].getToken() == token)) {
                return true;
            }
        }

        // check columns
        for (int j = 0; j < 3; j++) {
            if ((cells[0][j].getToken() == token)
                    && (cells[1][j].getToken() == token)
                    && (cells[2][j].getToken() == token)) {
                return true;
            }
        }
        // check diagonal
        if ((cells[0][0].getToken() == token)
                && (cells[1][1].getToken() == token)
                && (cells[2][2].getToken() == token)) {
            return true;
        }

        if ((cells[0][2].getToken() == token)
                && (cells[1][1].getToken() == token)
                && (cells[2][0].getToken() == token)) {
            return true;
        }

        return false;
    }
    //Defines a cell in a TicTacToe game board.

    public class Cell extends JPanel {
        // token of this cell

        private char token = ' ';

        //Constructor
        public Cell() {
            setBorder(new LineBorder(Color.DARK_GRAY, 3));
            addMouseListener(new MyMouseListener());
        }

        public char getToken() {
            return token;
        }

        public void setToken(char c) {
            token = c;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (token == 'X') {
                g.drawLine(10, 10, getWidth() - 10, getHeight() - 10);
                g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
            } else if (token == 'O') {
                g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
            }
        }

        private class MyMouseListener extends MouseAdapter {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (gameOver) {
                    return;
                }
                if (token != ' ') {
                    return;
                }

                if (token == ' ' && whoseTurn != ' ') {
                    setToken(whoseTurn);
                }

                if (isWon(whoseTurn)) {
                    JOptionPane.showMessageDialog(rootPane, whoseTurn + " won! Game over!");
                    jlblStatus.setText(whoseTurn + " won! Game over!");
                    TicTacToe nw = new TicTacToe();
                    dispose();
                    whoseTurn = ' ';
                    gameOver = true;
                } else if (isFull()) {
                    JOptionPane.showMessageDialog(rootPane, "Draw!! Game over!");
                    jlblStatus.setText("Draw!! Game over!");
                    TicTacToe nw = new TicTacToe();
                    dispose();
                    whoseTurn = ' ';
                    gameOver = true;
                } else {
                    if (whoseTurn == 'X') {
                        whoseTurn = 'O';
                    } else {
                        whoseTurn = 'X';
                    }
                    jlblStatus.setText(whoseTurn + "'s turn.");
                }
            }
        }
    } // end class Cell
} // end class TicTacToeFrame
