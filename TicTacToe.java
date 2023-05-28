import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TicTacToe extends JFrame {
    private JButton[][] board;
    private JLabel statusBar;
    private boolean xTurn;
    private Color xColor;
    private Color oColor;
    private Font statusFont;
    private Font symbolFont;

    public TicTacToe() {
        setTitle("TIC-TAC-TOE ");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new JButton[3][3];
        statusBar = new JLabel("X's TURN");
        xTurn = true;
        xColor = Color.GREEN;
        oColor = Color.BLACK;
        statusFont = new Font("Arial", Font.BOLD, 70);
        symbolFont = new Font("Arial", Font.BOLD, 100);

        JPanel boardPanel = new JPanel(new GridLayout(3, 3));
        boardPanel.setBackground(Color.GRAY);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = new JButton();
                board[row][col].setFont(symbolFont);
                board[row][col].addActionListener(new ButtonListener());
                boardPanel.add(board[row][col]);
            }
        }

        add(boardPanel, BorderLayout.CENTER);
        add(statusBar, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            if (clickedButton.getText().equals("")) {
                if (xTurn) {
                    clickedButton.setText("X");
                    clickedButton.setForeground(xColor);
                    statusBar.setText("O's TURN");
                } else {
                    clickedButton.setText("O");
                    clickedButton.setForeground(oColor);
                    statusBar.setText("X's TURN");
                }
                xTurn = !xTurn;
                if (checkWin()) {
                    String winner = xTurn ? "O" : "X";
                    statusBar.setFont(statusFont);
                    statusBar.setText(winner + " WINS!");
                    disableButtons();
                } else if (isBoardFull()) {
                    statusBar.setText("It's a draw!");
                    disableButtons();
                }
            }
        }
    }

    private boolean checkWin() {
        String[][] currentBoard = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                currentBoard[row][col] = board[row][col].getText();
            }
        }

        // Check rows
        for (int row = 0; row < 3; row++) {
            if (currentBoard[row][0].equals(currentBoard[row][1]) &&
                    currentBoard[row][0].equals(currentBoard[row][2]) &&
                    !currentBoard[row][0].equals("")) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (currentBoard[0][col].equals(currentBoard[1][col]) &&
                    currentBoard[0][col].equals(currentBoard[2][col]) &&
                    !currentBoard[0][col].equals("")) {
                return true;
            }
        }

        // Check diagonals
        if (currentBoard[0][0].equals(currentBoard[1][1]) &&
                currentBoard[0][0].equals(currentBoard[2][2]) &&
                !currentBoard[0][0].equals("")) {
            return true;
        }

        if (currentBoard[0][2].equals(currentBoard[1][1]) &&
                currentBoard[0][2].equals(currentBoard[2][0]) &&
                !currentBoard[0][2].equals("")) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void disableButtons() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col].setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Custom color for X and O
                Color xColor = Color.GREEN;
                Color oColor = Color.BLACK;

                // Create the GUI window
                TicTacToe ticTacToe = new TicTacToe();
                ticTacToe.setXColor(xColor);
                ticTacToe.setOColor(oColor);
            }
        });
    }

    public void setXColor(Color xColor) {
        this.xColor = xColor;
    }

    public void setOColor(Color oColor) {
        this.oColor = oColor;
    }
}
