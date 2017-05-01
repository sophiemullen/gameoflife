package be.cegeka.gameoflife;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class World {

    private Cell cell = new Cell();
    private List<List<Cell>> world = new ArrayList<>();

    public void nextCellState() {
        int aliveNeighbours = countAliveNeighbours();

        if(aliveNeighbours < 2 || aliveNeighbours > 3) {
            cell.dies();
        } else if (!cell.isAlive() && aliveNeighbours == 3){
            cell.lives();
        }
        cell.lives();
    }

    public int countAliveNeighbours() {
        List<Cell> neighbours = findAllNeighbours(cell);
        int count = 0;
        for (Cell neighbour : neighbours) {
            if(neighbour.isAlive()){
                count++;
            }
        }
        return count;
    }

    public List<Cell> findAllNeighbours(Cell cell) {
        int row = cell.getPosition().getX();
        int column = cell.getPosition().getY();
        List<Cell> neighbours = new ArrayList<>();

        int previousRow = row > 0 ? row - 1 : 0;
        int nextRow = row < world.size() ? row + 1 : world.size();
        int previouscolumn = column > 0 ? column - 1 : 0;
        int nextColumn = column < world.size() ? column + 1 : world.size();

        for (int x = previousRow; x < nextRow; x++) {
            for (int y = previouscolumn; y < nextColumn; y++) {
                neighbours.add(cell);
            }
        }
        return neighbours;
    }
}
