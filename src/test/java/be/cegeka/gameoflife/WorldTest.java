package be.cegeka.gameoflife;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static java.util.Arrays.*;

public class WorldTest {

//    private Cell cell = new Cell(true);
//    private List<Cell> firstRow, secondRow, thirdRow;
//    private List<List<Cell>> grid;
//    private World world;
//
//    @Before
//    public void setUp() throws Exception {
//        firstRow = new ArrayList<Cell>();
//        secondRow = new ArrayList<Cell>();
//        thirdRow = new ArrayList<Cell>();
//
//        grid = new ArrayList<List<Cell>>();
//
//        firstRow.add(new Cell(false));
//        firstRow.add(new Cell(false));
//        firstRow.add(new Cell(false));
//        secondRow.add(new Cell(true));
//        secondRow.add(new Cell(true));
//        secondRow.add(new Cell(true));
//        thirdRow.add(new Cell(false));
//        thirdRow.add(new Cell(false));
//        thirdRow.add(new Cell(false));
//
//
//        grid.add(firstRow);
//        grid.add(secondRow);
//        grid.add(thirdRow);
//
//        world = new World(grid);
//    }
//
//    @Test
//    public void findAllNeighbours() throws Exception {
//
//    }
//
//    @Test
//    public void countAliveNeighbours_returnsAndCountsOnlyAliveNeighbours() throws Exception {
//        List<Cell> neighbours = new ArrayList<>();
//        neighbours.addAll(firstRow);
//        neighbours.add(secondRow.get(0));
//        neighbours.add(secondRow.get(2));
//        neighbours.addAll(thirdRow);
//        Assertions.assertThat(world.countAliveNeighbours(secondRow.get(1))).isEqualTo(2);
//    }
//
////    public int countAliveNeighbours() {
////        List<Cell> neighbours = findAllNeighbours(cell);
////        int count = 0;
////        for (Cell neighbour : neighbours) {
////            if(neighbour.isAlive()){
////                count++;
////            }
////        }
////        return count;
////    }
}
