export const saddlePoints = (treeMatrix) => {
  let saddlePointsCoordinates = [];
  
  treeMatrix.forEach(treesRow => {
    let biggestTreeOnRow = Math.max(...treesRow);
    let biggestTreeOnRowIndex = treesRow.indexOf(biggestTreeOnRow);
    let smallestTreeOnColumn = true;

    for(let i = 0; i < treeMatrix.length; i++) {
      if(treeMatrix[i][biggestTreeOnRowIndex] < biggestTreeOnRow) {
        smallestTreeOnColumn = false;
        break;
      }
    }

    if(smallestTreeOnColumn) {
      saddlePointsCoordinates.push({
        "row": treeMatrix.indexOf(treesRow) + 1, 
        "column": treesRow.indexOf(biggestTreeOnRow) + 1
      });
    }
  });

  return saddlePointsCoordinates;
};

saddlePoints([
  [9, 8, 7],
  [5, 3, 2],
  [6, 6, 7],
]);
