import javax.swing.*;

public class Main extends JFrame {

    public static final int WINDOW_HEIGHT = 1000;
    public static final int WINDOW_WIDTH = 1400;


    public Main() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        GameScene gameScene = new GameScene(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(gameScene);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

}
