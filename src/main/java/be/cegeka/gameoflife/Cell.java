package be.cegeka.gameoflife;

public class Cell {

    private boolean alive;
    private Position position;

    public Cell() {
    }

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public Cell(boolean alive, Position position) {
        this.alive = alive;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isAlive() {
        return alive;
    }

    public void dies(){
        alive = false;
    }

    public void lives(){
        alive = true;
    }

}
