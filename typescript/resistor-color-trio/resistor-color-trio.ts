export function decodedResistorValue(colors: string[]): string {
  const colorValues = [
    "black",
    "brown",
    "red",
    "orange",
    "yellow",
    "green",
    "blue",
    "violet",
    "grey",
    "white",
  ];

  let resistorValues = [];

  resistorValues.push(colorValues.indexOf(colors[0]));
  resistorValues.push(colorValues.indexOf(colors[1]));

  const zerosToAdd = colorValues.indexOf(colors[2]);
  let resistorValueInOhms = 
  let ohmsPrefix = "ohms";

  if(zerosToAdd > 0) {
    if(zerosToAdd >= 3) {
      ohmsPrefix = "kiloohms";

    }
  }

  return Number(resistorValues.join(""));
}
