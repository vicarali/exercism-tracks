const COLOR_VALUES = [
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

export function decodedResistorValue(colors: string[]): string {
  let resistorValue = getResistorValue(colors);
  const zerosToAdd = COLOR_VALUES.indexOf(colors[2]);

  let ohms = calculateOhms(resistorValue, zerosToAdd);

  return ohms;
}

function getResistorValue(colors: string[]): number {
  let resistorValues = [];

  resistorValues.push(COLOR_VALUES.indexOf(colors[0]));
  resistorValues.push(COLOR_VALUES.indexOf(colors[1]));
  let resistorValueInOhms = Number(resistorValues.join(""));

  return resistorValueInOhms;
}

function calculateOhms(resistorValue: number, zerosToAdd: number): string {
  let resistorValueInOhms = resistorValue * 10 ** zerosToAdd;
  let resistorValueWithPrefix =
    calculateResistorValueWithPrefix(resistorValueInOhms);

  return resistorValueWithPrefix;
}

function calculateResistorValueWithPrefix(resistorValueInOhms: number): string {
  let ohmsPrefix = "ohms";

  if (resistorValueInOhms >= 10 ** 3 && resistorValueInOhms < 10 ** 6) {
    resistorValueInOhms = resistorValueInOhms / 10 ** 3;
    ohmsPrefix = "kiloohms";
  } else if (resistorValueInOhms >= 10 ** 6 && resistorValueInOhms < 10 ** 9) {
    resistorValueInOhms = resistorValueInOhms / 10 ** 6;
    ohmsPrefix = "megaohms";
  } else if (resistorValueInOhms >= 10 ** 9) {
    resistorValueInOhms = resistorValueInOhms / 10 ** 9;
    ohmsPrefix = "gigaohms";
  }

  return resistorValueInOhms + " " + ohmsPrefix;
}
