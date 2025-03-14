import unittest
from checkneighbours import get_same_neighbours_ids

class TestFunctions(unittest.TestCase):
    def test_gegevenVoorbeeldgridWith4Height4IndexToCheck5_wanneerGetSameNeighboursIds_dan2en4en10(self):
        # Arrange
        voorbeeld_grid = [ 0, 0, 1, 0,
                          1, 1, 0, 2,
                          2, 0, 1, 3,
                          0, 1, 1, 1 ]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 4, 4, 5)
        # Assert
        self.assertEqual(result, [2, 4, 10])
    
    def test_kleinsteMogelijkeGrid1x1_wanneerGetSameNeighboursIds_danLeeg(self):
        # Arrange
        grid = [1]
        # Act
        result = get_same_neighbours_ids(grid, 1, 1, 0)
        # Assert
        self.assertEqual(result, [])
    
    def test_alleBurenZijnGelijk_wanneerGetSameNeighboursIds_danAlleBuren(self):
        # Arrange
        grid = [1, 1, 1,
                1, 1, 1,
                1, 1, 1]
        # Act
        result = get_same_neighbours_ids(grid, 3, 3, 4)
        # Assert
        self.assertEqual(result, [0, 1, 2, 3, 5, 6, 7, 8])
    
    def test_geenGelijkeBuren_wanneerGetSameNeighboursIds_danLeeg(self):
        # Arrange
        grid = [1, 2, 3,
                4, 5, 6,
                7, 8, 9]
        # Act
        result = get_same_neighbours_ids(grid, 3, 3, 4)
        # Assert
        self.assertEqual(result, [])
    
    def test_randenVanGrid_wanneerGetSameNeighboursIds_danCorrecteBuren(self):
        # Arrange
        grid = [1, 2, 1,
                2, 1, 2,
                1, 2, 1]
        # Act
        result_hoektop = get_same_neighbours_ids(grid, 3, 3, 0)  # Linksboven
        result_rand = get_same_neighbours_ids(grid, 3, 3, 1)  # Bovenrand
        result_hoekonder = get_same_neighbours_ids(grid, 3, 3, 8)  # Rechtsonder
        # Assert
        self.assertEqual(result_hoektop, [4])
        self.assertEqual(result_rand, [3, 5])
        self.assertEqual(result_hoekonder, [4])
    
    def test_veelvoudigeGelijkeBuren_wanneerGetSameNeighboursIds_danAlleVerbindingen(self):
        # Arrange
        grid = [1, 1, 0,
                1, 1, 0,
                0, 0, 1]
        # Act
        result = get_same_neighbours_ids(grid, 3, 3, 1)
        # Assert
        self.assertEqual(result, [0, 3, 4])

if __name__ == '__main__':
    unittest.main()