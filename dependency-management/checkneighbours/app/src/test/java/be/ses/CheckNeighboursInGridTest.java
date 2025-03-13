package be.ses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckNeighboursInGridTest {

    @Test
    void testNeighboursInMiddle() {
        
        List<Integer> grid = List.of(
            1, 2, 3,
            4, 2, 6,
            7, 8, 9
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 4;

        
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);

        
        assertIterableEquals(List.of(1), result);
    }

    @Test
    void testLeftEdge() {
        
        List<Integer> grid = List.of(
            1, 2, 3,
            1, 5, 6,
            1, 8, 9
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 3;

        
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);

        
        assertIterableEquals(List.of(0, 6), result);
    }

    @Test
    void testRightEdge() {
        
        List<Integer> grid = List.of(
            1, 2, 3,
            4, 5, 3,
            7, 8, 3
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 8;

        
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);

        
        assertIterableEquals(List.of(5), result);
    }

    @Test
    void testCornerElement() {
        
        List<Integer> grid = List.of(
            1, 2, 3,
            4, 5, 6,
            1, 8, 9
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 6;

        
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);

        
        assertIterableEquals(List.of(), result);
    }

    @Test
    void testNoSameNeighbours() {
        
        List<Integer> grid = List.of(
            1, 2, 3,
            4, 5, 6,
            7, 8, 9
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 1;

        
        Iterable<Integer> result = CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);

        
        assertIterableEquals(List.of(), result);
    }

    @Test
    void testInvalidIndexThrowsException() {
        
        List<Integer> grid = List.of(
            1, 2, 3,
            4, 5, 6,
            7, 8, 9
        );
        int width = 3;
        int height = 3;
        int indexToCheck = 10;

        
        Executable action = () -> CheckNeighboursInGrid.getSameNeighboursIds(grid, width, height, indexToCheck);

        
        assertThrows(IllegalArgumentException.class, action);
    }
}
