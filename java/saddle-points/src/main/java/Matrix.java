import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Matrix {
    private List<List<Integer>> points;

    Matrix(List<List<Integer>> points) {
        this.points = points;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> saddlePoints = new HashSet<MatrixCoordinate>();

        for (int i = 0; i < this.points.size(); i++) {
            int currentRowIndex = i;
            List<Integer> currentRow = this.points.get(currentRowIndex);
            List<Integer> positionsOfTallestTreesInRow = checkTallestTreesInRow(currentRow);

            for (int j = 0; j < positionsOfTallestTreesInRow.size(); j++) {
                if (isShortestTreeInColumn(currentRowIndex, positionsOfTallestTreesInRow.get(j))) {
                    currentRowIndex++;
                    MatrixCoordinate saddlePoint = new MatrixCoordinate(currentRowIndex, positionsOfTallestTreesInRow.get(j) + 1);
                    saddlePoints.add(saddlePoint);
                }
            }
        }

        return saddlePoints;
    }

    private static List<Integer> checkTallestTreesInRow(List<Integer> currentRow) {
        int currentTallestTreeInRowLength = 0;
        List<Integer> tallestTreesInRowPositions = new ArrayList<Integer>();

        for (int i = 0; i < currentRow.size(); i++) {
            if (currentRow.get(i) > currentTallestTreeInRowLength) {
                currentTallestTreeInRowLength = currentRow.get(i);
            }
        }

        for (int i = 0; i < currentRow.size(); i++) {
            if (currentRow.get(i) == currentTallestTreeInRowLength) {
                tallestTreesInRowPositions.add(i);
            }
        }


        return tallestTreesInRowPositions;
    }

    private boolean isShortestTreeInColumn(int currentRowIndex, int positionOfCurrentTallestTreeInRow) {
        int treeLength = this.points.get(currentRowIndex).get(positionOfCurrentTallestTreeInRow);
        boolean shortestTreeInColumn = false;

        for (int i = 0; i < this.points.size(); i++) {
            if (i == currentRowIndex) continue;

            if (this.points.get(i).get(positionOfCurrentTallestTreeInRow) <= treeLength)
                shortestTreeInColumn = true;
        }

        return shortestTreeInColumn;
    }
}
