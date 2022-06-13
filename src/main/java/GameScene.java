import javax.swing.*;
import java.awt.*;

public class GameScene extends JPanel {

    private ImageIcon background;
    private ImageIcon circle;
    private ImageIcon x;
    private GameBoard gameBoard;

    public GameScene(int x, int y, int width, int height){
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.gameBoard = new GameBoard();
        this.background = new ImageIcon("background.jpg");
        this.circle = new ImageIcon("איקס.webp");
        this.x = new ImageIcon("עיגול.jfif");
        this.setVisible(true);
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.background.getImage(), 0, 0, Main.WINDOW_WIDTH,Main.WINDOW_HEIGHT,null);
        this.gameBoard.paint(g);
    }

}
