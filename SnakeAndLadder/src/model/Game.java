package model;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerList = new LinkedList<>();
    Player winner;

    public Game(){
        initializeGame();
    }

    public void initializeGame(){

        board = new Board(10,5,5);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("Tharishith",0);
        Player player2 = new Player("Bhanu",0);
        playerList.add(player1);
        playerList.add(player2);
    }

    public void startGame(){

        while(winner == null){
            Player currentPlayer = playerTurn();
            int diceNumber = dice.rollDice();

            System.out.println("Player turn is :"+ currentPlayer.id + " and position is : " + currentPlayer.currentPosition);

            int newPosition = currentPlayer.currentPosition+ diceNumber;
            int val = jumpCheck(newPosition);
            newPosition = (val == 0) ? currentPlayer.currentPosition : val;
            currentPlayer.currentPosition = newPosition;

            System.out.println("Player turn is :"+ currentPlayer.id + " and position is : " + currentPlayer.currentPosition);

            if(newPosition == board.cells.length*board.cells.length -1){
                winner = currentPlayer;
            }
        }

        System.out.println("The winner id is :"+winner.id);
    }

    private int jumpCheck(int newPosition) {

        if(newPosition > board.cells.length* board.cells.length-1){
            return 0;
        }

        Cells cell = board.getCell(newPosition);
        if(cell.jump != null && cell.jump.start == newPosition){
            String jump = (cell.jump.end > cell.jump.start) ? "Ladder" : "Snake";
            System.out.println("Player jumps the " + jump);
            return cell.jump.end;
        }

        return newPosition;

    }

    private Player playerTurn() {
        Player playerTurn = playerList.removeFirst();
        playerList.addLast(playerTurn);
        return playerTurn;
    }


}
