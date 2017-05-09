package be.cegeka.gameoflife;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CellTest {

    private Cell cell, cell2;
    private List<Cell> neighboursWellPopulated, neighboursUnderPopulated, neighboursOverPopulated;

    @Before
    public void setUp() throws Exception {
        cell = new Cell(true);
        cell2 = new Cell(false);
        neighboursWellPopulated = asList(new Cell(true), new Cell(true), new Cell(true));
        neighboursUnderPopulated = asList(new Cell(true));
        neighboursOverPopulated = asList(new Cell(true), new Cell(true), new Cell(true), new Cell(true));
    }

    @Test
    public void isAlive_returnsTrue_whenCellIsAlive () throws Exception {
        assertThat(cell.isAlive()).isEqualTo(true);
    }

    @Test
    public void countAliveNeighbours_returnsCorrectAmountOfAliveNeighbours() {
        cell.setNeighbours(neighboursWellPopulated);
        assertThat(cell.countAliveNeighbours()).isEqualTo(3);
    }

    @Test
    public void nextCellState_whenCellIsAliveAndHas3Neighbours_CellLives() {
        cell.setNeighbours(neighboursWellPopulated);
        cell.nextCellState(cell);
        assertThat(cell.isAlive()).isEqualTo(true);
    }

    @Test
    public void nextCellState_whenCellIsDeadAndHas3Neighbours_CellRevives() {
        cell2.setNeighbours(neighboursWellPopulated);
        cell2.nextCellState(cell2);
        assertThat(cell2.isAlive()).isEqualTo(true);
    }

    @Test
    public void nextCellState_whenCellIsAliveAndUnderPopulated_CellDies() {
        cell.setNeighbours(neighboursUnderPopulated);
        cell.nextCellState(cell);
        assertThat(cell.isAlive()).isEqualTo(false);
    }

    @Test
    public void nextCellState_whenCellIsAliveAndOverPopulated_CellDies() {
        cell.setNeighbours(neighboursOverPopulated);
        cell.nextCellState(cell);
        assertThat(cell.isAlive()).isEqualTo(false);
    }

    @Test
    public void nextCellState_whenCellIsDeadAndUnderPopulated_CellStaysDead() {
        cell2.setNeighbours(neighboursUnderPopulated);
        cell2.nextCellState(cell2);
        assertThat(cell2.isAlive()).isEqualTo(false);
    }

    @Test
    public void nextCellState_whenCellIsDeadAndOverPopulated_CellStaysDead() {
        cell2.setNeighbours(neighboursOverPopulated);
        cell2.nextCellState(cell2);
        assertThat(cell2.isAlive()).isEqualTo(false);
    }







}
