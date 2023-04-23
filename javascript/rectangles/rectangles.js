export function count(diagram) {
  let borderPositions = [];
  let hello;
  
  diagram.forEach((line) => {
    let lastPositionChecked = -1;
    let positionsInLine = [];

    while(line.includes("+", lastPositionChecked + 1)) {
      const nextBorderPosition = line.indexOf("+", lastPositionChecked + 1);

      if(nextBorderPosition != -1) {
        positionsInLine.push(nextBorderPosition);
        lastPositionChecked = nextBorderPosition;
      }
    }

    hello = positionsInLine;

    borderPositions.push(positionsInLine);
  });

  return borderPositions;

  let numRectangles = 0;

  for(let i = 0; i < borderPositions.length; i++) {
    for(let n = i + 1; n < borderPositions.length; n++) {
      numRectangles += checkMatchedPositions(borderPositions[i], borderPositions[n]);
    }
  }

  //return numRectangles;
}

function checkMatchedPositions(firstLinePositions, secondLinePositions) {
  let matches = 0;

  for(let i = 0; i < borderPositions.length; i++) {
    for(let n = i; n < borderPositions.length; n++) {
      if(firstLinePositions[i][n] == secondLinePositions[i][n])
        matches++;
    }
  }

  return matches;
}
