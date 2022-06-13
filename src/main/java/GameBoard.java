import java.awt.*;

public class GameBoard {
    private Rectangle rect1;
    private Rectangle rect2;
    private Rectangle rect3;
    private Rectangle rect4;
    private Rectangle rect5;
    private Rectangle rect6;
    private Rectangle rect7;
    private Rectangle rect8;
    private Rectangle rect9;


    public GameBoard(){
        this.rect1 = new Rectangle(150,150,200,200, Color.PINK);
        this.rect2 = new Rectangle(600,150,200,200, Color.PINK);
        this.rect3 = new Rectangle(120,0,50,50, Color.PINK);
        this.rect4 = new Rectangle(0,60,50,50, Color.PINK);
        this.rect5 = new Rectangle(60,60,50,50, Color.PINK);
        this.rect6 = new Rectangle(120,60,50,50, Color.PINK);
        this.rect7 = new Rectangle(0,120,50,50, Color.PINK);
        this.rect8 = new Rectangle(60,120,50,50, Color.PINK);
        this.rect9 = new Rectangle(120,120,50,50, Color.PINK);

    }

    public void paint(Graphics g){
        this.rect1.paintComponent(g);
        this.rect2.paintComponent(g);
        this.rect3.paintComponent(g);
        this.rect4.paintComponent(g);
        this.rect5.paintComponent(g);
        this.rect6.paintComponent(g);
        this.rect7.paintComponent(g);
        this.rect8.paintComponent(g);
        this.rect9.paintComponent(g);
    }


}
