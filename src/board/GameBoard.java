package board;

import gameobjects.EmptyTile;
import gameobjects.GameObject;
import gameobjects.SnakeObject;
import res.Constants;

public class GameBoard {

    private final GameObject[][] board = new GameObject[Constants.BoardSize.ROW][Constants.BoardSize.COL];
    public GameBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length;j++){
                board[i][j] = new EmptyTile();
            }
        }
    }

    public void placeGameObject(GameObject object){
        board[object.getX()][object.getY()] = object;
    }
    public void updateGameObject(GameObject object){
        board[object.getPreviousX()][object.getPreviousY()] = new EmptyTile();
    }
    public String getObjectCoordinates(GameObject object){
        System.out.println("object coordinates:" + "(" + object.getX() + ","+ object.getY()+ ")");
        return  "object coordinates:" + "(" + object.getX() + ","+ object.getY()+ ")";
    }

    public void refresh(GameObject object){
        getObjectCoordinates(object);
        updateGameObject(object);
        placeGameObject(object);
        printBoard();
    }


    public void printBoard() {
        for (int i = 0; i < board.length; i++) { // Loop through rows
            for (int j = 0; j < board[i].length; j++) { // Loop through columns
                System.out.print((board[i][j] != null ? board[i][j] : " ") + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        System.out.println();
    }




}
