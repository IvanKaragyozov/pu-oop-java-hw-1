package Game;

import javax.swing.*;
import java.awt.*;

//Слагане на цвят на плочките на дъската

public class BoardTile extends JFrame {
    private int row;
    private int col;
    private int tileSize;
     String RED = "RED";
     String GRAY = "GRAY";
     String BLACK = "BLACK";
     String WHITE = "WHITE";

    public BoardTile(int row, int col){

        this.row        = row;
        this.col        = col;
        this.tileSize   = 100;

    }
    public void render(Graphics g) {

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;


         if(this.row == 0 && this.col == 0) setTileColor(tileX, tileY , g, RED);
         else if(this.row == 0 && this.col == 1) setTileColor(tileX, tileY , g, BLACK);
         else if(this.row == 0 && this.col == 2) setTileColor(tileX, tileY , g, WHITE);
         else if(this.row == 0 && this.col == 3) setTileColor(tileX, tileY , g, BLACK);
         else if(this.row == 0 && this.col == 4) setTileColor(tileX, tileY , g, RED);

         else if(this.row == 1 && this.col == 0) setTileColor(tileX, tileY , g, GRAY);
         else if(this.row == 1 && this.col == 1) setTileColor(tileX, tileY , g, GRAY);
         else if(this.row == 1 && this.col == 2) setTileColor(tileX, tileY , g, WHITE);
         else if(this.row == 1 && this.col == 3) setTileColor(tileX, tileY , g, GRAY);
         else if(this.row == 1 && this.col == 4) setTileColor(tileX, tileY , g, GRAY);

         else if(this.row == 2 && this.col == 0) setTileColor(tileX, tileY , g, WHITE);
         else if(this.row == 2 && this.col == 1) setTileColor(tileX, tileY , g, WHITE);
         else if(this.row == 2 && this.col == 2) setTileColor(tileX, tileY , g, WHITE);
         else if(this.row == 2 && this.col == 3) setTileColor(tileX, tileY , g, WHITE);
         else if(this.row == 2 && this.col == 4) setTileColor(tileX, tileY , g, WHITE);

         else if(this.row == 3 && this.col == 0) setTileColor(tileX, tileY , g, GRAY);
         else if(this.row == 3 && this.col == 1) setTileColor(tileX, tileY , g, GRAY);
         else if(this.row == 3 && this.col == 2) setTileColor(tileX, tileY , g, WHITE);
         else if(this.row == 3 && this.col == 3) setTileColor(tileX, tileY , g, GRAY);
         else if(this.row == 3 && this.col == 4) setTileColor(tileX, tileY , g, GRAY);

         else if(this.row == 4 && this.col == 0) setTileColor(tileX, tileY , g, BLACK);
         else if(this.row == 4 && this.col == 1) setTileColor(tileX, tileY , g, RED);
         else if(this.row == 4 && this.col == 2) setTileColor(tileX, tileY , g, WHITE);
         else if(this.row == 4 && this.col == 3) setTileColor(tileX, tileY , g, RED);
         else setTileColor(tileX, tileY , g, BLACK);

        //Кръга в центъра
        g.setColor(Color.darkGray);
        g.fillOval(225  ,225,50, 50);


        for(int i = 0; i <= 300; i+=100){
            g.setColor(Color.GREEN);
            g.fillOval(i + 30,30,40, 40);
            g.setColor(Color.YELLOW);
            g.fillOval(i + 35, 35, 30, 30);

            g.setColor(Color.YELLOW);
            g.fillOval(i  + 130,425,40, 40);
            g.setColor(Color.GREEN);
            g.fillOval(i + 135, 430, 30, 30);

            g.setColor(Color.GREEN);
            g.fillRect(25,425,50, 50);

            g.setColor(Color.yellow);
            g.fillRect(425,25,50, 50);
        }

}

        //Задава цвят на всеки ред
        void setTileColor (int x, int y , Graphics g, String color){
            switch (color){
            case "RED" : g.setColor(Color.RED);
                g.fillRect(x,y,this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;
            case "BLACK" : g.setColor(Color.BLACK);
                g.fillRect(x,y,this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;
            case "GRAY" : g.setColor(Color.GRAY);
                g.fillRect(x,y,this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;
            case "WHITE" : g.setColor(Color.WHITE);
                g.fillRect(x,y,this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;
        }
     }

}


