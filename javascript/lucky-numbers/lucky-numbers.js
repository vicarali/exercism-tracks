// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
	const array1AsString = array1.join("");
	const array2AsString = array2.join("");

	return Number(array1AsString) + Number(array2AsString);
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export function luckyNumber(value) {
	const valueAsString = String(value);
	const valueAsArray = valueAsString.split("");
	const reversedArray = valueAsArray.reverse();
	const reversedValue = Number(reversedArray.join(""));

	return value === reversedValue;
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  if (!Boolean(input)) return "Required field";

	const inputAsNumber = Number(input);
	if (Number.isNaN(inputAsNumber) || inputAsNumber === 0)
		return "Must be a number besides 0";

	return "";
}
