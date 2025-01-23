package model;


import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cells[][] cells;


    Board(int boardSize, int numberOfSnakes,int numberOfLadders){
        initializeBoard(boardSize);
        addSnakeAndLadders(cells,numberOfSnakes,numberOfLadders);
    }

    private void addSnakeAndLadders(Cells[][] cells,int numberOfSnakes, int numberOfLadders) {

        while(numberOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(snakeHead <= snakeTail){
                continue;
            }
            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cells cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numberOfSnakes--;
        }

        while(numberOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length* cells.length-1);
            if(ladderStart >= ladderEnd){
                continue;
            }
            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cells cell = getCell(ladderStart);
            cell.jump = ladderObj;

            numberOfLadders--;
        }


    }

    public Cells getCell(int playerPosition) {
        int boardRow = playerPosition/ cells.length;
        int boardCol = playerPosition/ cells.length;
        return cells[boardRow][boardCol];
    }

    private void initializeBoard(int boardSize){
        cells = new Cells[boardSize][boardSize];

        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                Cells cellObj = new Cells();
                cells[i][j] = cellObj;
            }
        }
    }
}
