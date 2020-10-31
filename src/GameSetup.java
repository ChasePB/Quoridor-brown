
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameSetup {


    private final Color BACKGROUND_COLOR = Color.lightGray;
    private final int SCREEN_WIDTH = 1000;
    private final int SCREEN_HEIGHT = 750;
    public static boolean pause = false;

    public static int player1X = 530;
    public int player1Y = 92;
    public int player2X = 530;
    public int player2Y = 692;
    public int player3X = 930;
    public int player3Y = 392;
    public int player4X = 130;
    public int player4Y = 392;
    public int playerWidth = 40;
    public int playerHeight = 40;
    public Color player1Color = Color.RED;
    public Color player2Color = Color.DARK_GRAY;
    public Color player3Color = Color.YELLOW;
    public Color player4Color = Color.BLUE;
    DrawingPanel panel = new DrawingPanel(SCREEN_WIDTH, SCREEN_HEIGHT);

    private Graphics2D g = panel.getGraphics();


    public void drawBoard() {

        panel.setWindowTitle("Quoridor");
        panel.setBackground(BACKGROUND_COLOR);
        g.setStroke(new BasicStroke(3));
        g.drawLine(100, 0, 100, 750);
        g.setStroke(new BasicStroke(1));
        g.drawLine(200, 0, 200, 750);
        g.drawLine(300, 0, 300, 750);
        g.drawLine(400, 0, 400, 750);
        g.drawLine(500, 0, 500, 750);
        g.drawLine(600, 0, 600, 750);
        g.drawLine(700, 0, 700, 750);
        g.drawLine(800, 0, 800, 750);
        g.drawLine(900, 0, 900, 750);
        g.setStroke(new BasicStroke(3));
        g.drawLine(0, 75, 1000, 75);
        g.setStroke(new BasicStroke(1));
        g.drawLine(0, 150, 1000, 150);
        g.drawLine(0, 225, 1000, 225);
        g.drawLine(0, 300, 1000, 300);
        g.drawLine(0, 375, 1000, 375);
        g.drawLine(0, 450, 1000, 450);
        g.drawLine(0, 525, 1000, 525);
        g.drawLine(0, 600, 1000, 600);
        g.drawLine(0, 675, 1000, 675);
        g.drawLine(0, 750, 1000, 750);
        g.drawString("Coordinates", 15, 37);
        g.drawString("A", 140, 37);
        g.drawString("B", 240, 37);
        g.drawString("C", 340, 37);
        g.drawString("D", 440, 37);
        g.drawString("E", 540, 37);
        g.drawString("F", 640, 37);
        g.drawString("G", 740, 37);
        g.drawString("H", 840, 37);
        g.drawString("I", 940, 37);
        g.drawString("1", 40, 112);
        g.drawString("2", 40, 187);
        g.drawString("3", 40, 262);
        g.drawString("4", 40, 337);
        g.drawString("5", 40, 412);
        g.drawString("6", 40, 487);
        g.drawString("7", 40, 562);
        g.drawString("8", 40, 637);
        g.drawString("9", 40, 712);

        panel.copyGraphicsToScreen();
    }

    public void drawPlayer(int players) {
        g.setColor(player1Color);
        g.fillOval(player1X, player1Y, playerWidth, playerHeight);
        //player2
        g.setColor(player2Color);
        g.fillOval(player2X, player2Y, playerWidth, playerHeight);
        if (players == 4) {
            g.setColor(player3Color);
            g.fillOval(player3X, player3Y, playerWidth, playerHeight);
            //player2
            g.setColor(player4Color);
            g.fillOval(player4X, player4Y, playerWidth, playerHeight);

        }
        panel.copyGraphicsToScreen();

    }



}
