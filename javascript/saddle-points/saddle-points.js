export const saddlePoints = (treeMatrix) => {
  let saddlePointsCoordinates = [];
  
  if(treeMatrix.length > 1) {
    treeMatrix.forEach((treesRow, i) => {
      let biggestTreeOnRow = Math.max(...treesRow);
      let biggestTreeOnRowIndexes = [];

      treesRow.forEach((tree, n) => {
        if(tree == biggestTreeOnRow)
          biggestTreeOnRowIndexes.push(n);
      });

      biggestTreeOnRowIndexes.forEach(
        checkBiggestTreeOnColumn(
          treeMatrix, 
          biggestTreeOnRow, 
          saddlePointsCoordinates, 
          i
        )
      );
    });
  }
  else {
    let treesRow = treeMatrix[0];
    let biggestTreeOnRow = Math.max(...treesRow);
    let biggestTreeOnRowIndexes = [];

    treesRow.forEach((tree, n) => {
      if(tree == biggestTreeOnRow)
        biggestTreeOnRowIndexes.push(n);
    });

    biggestTreeOnRowIndexes.forEach(treeIndex => {
      saddlePointsCoordinates.push({
        "row": 1, 
        "column": treeIndex + 1
      });
    });
  }
  
  return saddlePointsCoordinates;
};

function checkBiggestTreeOnColumn(treeMatrix, biggestTreeOnRow, saddlePointsCoordinates, i) {
  return treeIndex => {
    let smallestTreeOnColumn = true;

    for (let n = 0; n < treeMatrix.length; n++) {
      if (treeMatrix[n][treeIndex] < biggestTreeOnRow) {
        smallestTreeOnColumn = false;
        break;
      }
    }

    if (smallestTreeOnColumn) {
      saddlePointsCoordinates.push({
        "row": i + 1,
        "column": treeIndex + 1
      });
    }
  };
}

