import javax.swing.*;

public class Main {


    public static void main(String[] args) throws Exception {

        DrawingPanel panel = null;

        Integer[] options = {2, 4};
        int players;

        int answer = JOptionPane.showOptionDialog(null, "Would you like 2 or 4 players?",
                "Welcome to Quoridor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);


        if (answer == 0) {

            App.GUISetUp2();
            players = 2;
        } else {

            App4.GUISetUp4();
            players = 4;
        }

        GameSetup gameSetup = new GameSetup();

        gameSetup.drawBoard();

        gameSetup.drawPlayer(players);

        int iterator = 1;

//        while (true) {
//            assert panel != null;
//            if (panel.mouseClickHasOccurred(DrawingPanel.RIGHT_BUTTON)) break;
//
//
//            if (iterator == players) {
//                iterator = 0;
//            }
//
//            iterator = iterator + 1;
//
//
//        }


    }
}





