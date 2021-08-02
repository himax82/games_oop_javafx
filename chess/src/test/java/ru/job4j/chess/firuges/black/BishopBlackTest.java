package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void isPosition() {
       BishopBlack bishopBlack = new BishopBlack(Cell.findBy(0, 3));
        assertThat(bishopBlack.position(), is(Cell.A5));
    }

    @Test
    public void isCopyBishop() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A5);
        Figure figure = bishopBlack.copy(Cell.A1);
        assertThat(figure.position(), is(Cell.A1));
    }

    @Test
    public void isWayTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell[] cells = bishopBlack.way(Cell.G7);
        Cell[] inspection = {Cell.E5, Cell.F6, Cell.G7};
        assertThat(cells, is(inspection));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void isWayFalse() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell[] cells = bishopBlack.way(Cell.G8);
    }

}