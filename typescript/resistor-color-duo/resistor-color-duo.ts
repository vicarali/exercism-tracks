export function decodedValue(colors: string[]): number {
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

  return Number(resistorValues.join(""));
}
