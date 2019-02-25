import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {

    private final int WIDTH = 300;
    private final int HEIGHT = 300;

    public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitItem;


    private void buildGame() {
        panel = new JPanel(new GridLayout(3, 3));

        /**
         This Creates the menu bar that allows us to exit the program with file -> exit
         **/
        menuBar = new JMenuBar();
        buildFileMenu();
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);



        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        TicTacToeClick listener = new TicTacToeClick(b1,b2,b3,b4,b5,b6,b7,b8,b9);
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        b6.addActionListener(listener);
        b7.addActionListener(listener);
        b8.addActionListener(listener);
        b9.addActionListener(listener);

    }

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        buildGame();
        add(panel);
        setVisible(true);

    }

    public void buildFileMenu() {
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new TicTacToeCloseWindow());

        fileMenu = new JMenu("File");
        fileMenu.add(exitItem);
    }

    public static void main(String[] args) {
        TicTacToe test = new TicTacToe();


    }
}
