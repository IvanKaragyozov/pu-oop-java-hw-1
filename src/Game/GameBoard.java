package Game;

import Pieces.Guard;

import javax.swing.*;
import java.awt.*;

//Ролева дъска с размери 500х500 пиксела и 5х5 колони и редове

public class GameBoard extends JFrame{

    public GameBoard() {

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void paint(Graphics g){

        super.paint(g);

        for(int row = 0; row < 5; row++){
            for(int col = 0; col < 5; col++){

                BoardTile tile = new BoardTile(row, col);
                tile.render(g);

            }
        }
    }


}