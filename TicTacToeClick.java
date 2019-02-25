import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeClick implements ActionListener {


    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private boolean playerTurnX;


    public TicTacToeClick(JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JButton b7, JButton b8, JButton b9) {

        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
        this.b6 = b6;
        this.b7 = b7;
        this.b8 = b8;
        this.b9 = b9;
        playerTurnX = true;

    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();


        if (source == b1) {
            if (b1.getText().equals("") && playerTurnX) {
                b1.setText("X");
                playerTurnX = false;
            } else if (b1.getText().equals("") && !playerTurnX) {
                b1.setText("O");
                playerTurnX = true;
            }
        } else if (source == b2) {
            if (b2.getText().equals("") && playerTurnX) {
                b2.setText("X");
                playerTurnX = false;
            } else if (b2.getText().equals("") && !playerTurnX) {
                b2.setText("O");
                playerTurnX = true;
            }
        } else if (source == b3) {
            if (b3.getText().equals("") && playerTurnX) {
                b3.setText("X");
                playerTurnX = false;
            } else if (b3.getText().equals("") && !playerTurnX) {
                b3.setText("O");
                playerTurnX = true;
            }
        } else if (source == b4) {
            if (b4.getText().equals("") && playerTurnX) {
                b4.setText("X");
                playerTurnX = false;
            } else if (b4.getText().equals("") && !playerTurnX) {
                b4.setText("O");
                playerTurnX = true;
            }
        } else if (source == b5) {
            if (b5.getText().equals("") && playerTurnX) {
                b5.setText("X");
                playerTurnX = false;
            } else if (b5.getText().equals("") && !playerTurnX) {
                b5.setText("O");
                playerTurnX = true;
            }
        } else if (source == b6) {
            if (b6.getText().equals("") && playerTurnX) {
                b6.setText("X");
                playerTurnX = false;
            } else if (b6.getText().equals("") && !playerTurnX) {
                b6.setText("O");
                playerTurnX = true;
            }
        } else if (source == b7) {
            if (b7.getText().equals("") && playerTurnX) {
                b7.setText("X");
                playerTurnX = false;
            } else if (b7.getText().equals("") && !playerTurnX) {
                b7.setText("O");
                playerTurnX = true;
            }
        } else if (source == b8) {
            if (b8.getText().equals("") && playerTurnX) {
                b8.setText("X");
                playerTurnX = false;
            } else if (b8.getText().equals("") && !playerTurnX) {
                b8.setText("O");
                playerTurnX = true;
            }
        } else if (source == b9) {
            if (b9.getText().equals("") && playerTurnX) {
                b9.setText("X");
                playerTurnX = false;
            } else if (b9.getText().equals("") && !playerTurnX) {
                b9.setText("O");
                playerTurnX = true;
            }
        }
        checkForWin();

    }

    private void checkForWin() {
        if (b1.getText().equals("X")) {
            if (b2.getText().equals("X")) {
                if (b3.getText().equals("X")) {
                    JOptionPane.showMessageDialog(null, "Winner: X");
                    boardClear();
                }
            }
        }
        if (b4.getText().equals("X")) {
            if (b5.getText().equals("X")) {
                if (b6.getText().equals("X")) {
                    JOptionPane.showMessageDialog(null, "Winner: X");
                    boardClear();
                }
            }
        }
        if (b7.getText().equals("X")) {
            if (b8.getText().equals("X")) {
                if (b9.getText().equals("X")) {
                    JOptionPane.showMessageDialog(null, "Winner: X");
                    boardClear();
                }
            }
        }
        if (b1.getText().equals("X")) {
            if (b4.getText().equals("X")) {
                if (b7.getText().equals("X")) {
                    JOptionPane.showMessageDialog(null, "Winner: X");
                    boardClear();
                }
            }
        }
        if (b2.getText().equals("X")) {
            if (b5.getText().equals("X")) {
                if (b8.getText().equals("X")) {
                    JOptionPane.showMessageDialog(null, "Winner: X");
                    boardClear();
                }
            }
        }
        if (b3.getText().equals("X")) {
            if (b6.getText().equals("X")) {
                if (b9.getText().equals("X")) {
                    JOptionPane.showMessageDialog(null, "Winner: X");
                    boardClear();
                }
            }
        }
        if (b1.getText().equals("X")) {
            if (b5.getText().equals("X")) {
                if (b9.getText().equals("X")) {
                    JOptionPane.showMessageDialog(null, "Winner: X");
                    boardClear();
                }
            }
        }
        if (b3.getText().equals("X")) {
            if (b5.getText().equals("X")) {
                if (b7.getText().equals("X")) {
                    JOptionPane.showMessageDialog(null, "Winner: X");
                    boardClear();
                }
            }
        }
        if (b1.getText().equals("O")) {
            if (b2.getText().equals("O")) {
                if (b3.getText().equals("O")) {
                    JOptionPane.showMessageDialog(null, "Winner: O");
                    boardClear();
                }
            }
        }
        if (b4.getText().equals("O")) {
            if (b5.getText().equals("O")) {
                if (b6.getText().equals("O")) {
                    JOptionPane.showMessageDialog(null, "Winner: O");
                    boardClear();
                }
            }
        }
        if (b7.getText().equals("O")) {
            if (b8.getText().equals("O")) {
                if (b9.getText().equals("O")) {
                    JOptionPane.showMessageDialog(null, "Winner: O");
                    boardClear();
                }
            }
        }
        if (b1.getText().equals("O")) {
            if (b4.getText().equals("O")) {
                if (b7.getText().equals("O")) {
                    JOptionPane.showMessageDialog(null, "Winner: O");
                    boardClear();
                }
            }
        }
        if (b2.getText().equals("O")) {
            if (b5.getText().equals("O")) {
                if (b8.getText().equals("O")) {
                    JOptionPane.showMessageDialog(null, "Winner: O");
                    boardClear();
                }
            }
        }
        if (b3.getText().equals("O")) {
            if (b6.getText().equals("O")) {
                if (b9.getText().equals("O")) {
                    JOptionPane.showMessageDialog(null, "Winner: O");
                    boardClear();
                }
            }
        }
        if (b1.getText().equals("O")) {
            if (b5.getText().equals("O")) {
                if (b9.getText().equals("O")) {
                    JOptionPane.showMessageDialog(null, "Winner: O");
                    boardClear();
                }
            }
        }
        if (b3.getText().equals("O")) {
            if (b5.getText().equals("O")) {
                if (b7.getText().equals("O")) {
                    JOptionPane.showMessageDialog(null, "Winner: O");
                    boardClear();
                }
            }
        }
    }

    private void boardClear() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

    }
}
