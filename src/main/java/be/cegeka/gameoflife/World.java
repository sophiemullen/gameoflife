package be.cegeka.gameoflife;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<List<Cell>> world = new ArrayList<List<Cell>>();

    public List<List<Cell>> generateNextWorld() {
        throw new NotImplementedException();
    }

    public void findAllNeighbours() {
//        for (int x = previousRow; x < nextRow; x++) {
//            for (int y = previouscolumn; y < nextColumn; y++) {
//                cell.addNeighbours(cell);
//            }
//        }
    }

    public void setBoundaries() {
        throw new NotImplementedException();
        //int previousRow = row > 0 ? row - 1 : 0;
//        int nextRow = row < world.size() ? row + 1 : world.size();
//        int previouscolumn = column > 0 ? column - 1 : 0;
//        int nextColumn = column < world.size() ? column + 1 : world.size();
    }
}
