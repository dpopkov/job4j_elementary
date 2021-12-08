package ru.job4j.condition;

public class ChessBoard {

    private static final int MIN_COORD = 0;
    private static final int MAX_COORD = 7;

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 >= MIN_COORD && y1 >= MIN_COORD && x2 >= MIN_COORD && y2 >= MIN_COORD
                && x1 <= MAX_COORD && y1 <= MAX_COORD && x2 <= MAX_COORD && y2 <= MAX_COORD) {
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            if (dx == dy) {
                rsl = dx;
            }
        }
        return rsl;
    }
}
