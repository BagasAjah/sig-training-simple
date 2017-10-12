package eu.sig.training.ch02;

public class BoardFactory {
    public Board createBoard(Square[][] grid) {
        assert grid != null;

        Board board = new Board(grid);

        int width = board.getWidth();
        int height = board.getHeight();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Square square = grid[x][y];
                BoardProperties prop = new BoardProperties();
                prop.setHeight(height);
                prop.setWeight(width);
                prop.setKoordinateX(x);
                prop.setKoordinateY(y);
                setLink(grid, square, prop);
            }
        }

        return board;
    }

    private void setLink(Square[][] grid, Square square, BoardProperties prop) {
        for (Direction dir : Direction.values()) {
            int dirX = (prop.getWeight() + prop.getKoordinateX() + dir.getDeltaX()) % prop.getWeight();
            int dirY = (prop.getHeight() + prop.getKoordinateY() + dir.getDeltaY()) % prop.getHeight();
            Square neighbour = grid[dirX][dirY];
            square.link(neighbour, dir);
        }
    }
}

class Board {
    @SuppressWarnings("unused")
    public Board(Square[][] grid) {}

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }
}

class Square {
    @SuppressWarnings("unused")
    public void link(Square neighbour, Direction dir) {}
}

class Direction {

    public static Direction[] values() {
        return null;
    }

    public int getDeltaY() {
        return 0;
    }

    public int getDeltaX() {
        return 0;
    }
}

class BoardProperties{
    private int height;
    private int weight;
    private int koordinateX;
    private int koordinateY;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getKoordinateX() {
        return koordinateX;
    }

    public void setKoordinateX(int koordinateX) {
        this.koordinateX = koordinateX;
    }

    public int getKoordinateY() {
        return koordinateY;
    }

    public void setKoordinateY(int koordinateY) {
        this.koordinateY = koordinateY;
    }
}