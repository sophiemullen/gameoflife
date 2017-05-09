package be.cegeka.gameoflife;

import java.util.List;

public class Cell {

    private boolean alive;
    private List<Cell> neighbours;

    public Cell() {
    }

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public List<Cell> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Cell> neighbours) {
        this.neighbours = neighbours;
    }

    public void addNeighbours(Cell cell){
        neighbours.add(cell);
    }

    public void nextCellState(Cell cell) {
        if (cellIsAliveAndHas2Or3Neighbours()) {
            cell.setAlive(true);
        } else if(cellIsUnderOrOverPopulated()) {
            cell.setAlive(false);
        } else if (cellIsDeadButHas3Neighbours()) {
            cell.setAlive(true);
        }
    }

    private boolean cellIsDeadButHas3Neighbours() {
        int aliveNeighbours = countAliveNeighbours();
        return !isAlive() && aliveNeighbours == 3;
    }

    private boolean cellIsUnderOrOverPopulated() {
        int aliveNeighbours = countAliveNeighbours();
        return aliveNeighbours < 2 || aliveNeighbours > 3;
    }

    private boolean cellIsAliveAndHas2Or3Neighbours() {
        int aliveNeighbours = countAliveNeighbours();
        return (isAlive() && aliveNeighbours == 2) || (isAlive() && aliveNeighbours == 3);
    }

    public int countAliveNeighbours() {
        int count = 0;
        for (Cell neighbour : neighbours) {
            if(neighbour.isAlive()){
                count++;
            }
        }
        return count;
    }

}
