// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @timeInMinutes = s {number} time in minutes
 */
export function timeToMixJuice(name) {
  let timeInMinutes = 2.5;

	switch (name) {
		case "Pure Strawberry Joy":
			timeInMinutes = 0.5;
			break;
		case "Energizer":
			timeInMinutes = 1.5;
			break;
		case "Green Garden":
			timeInMinutes = 1.5;
			break;
		case "Tropical Island":
			timeInMinutes = 3;
			break;
		case "All or Nothing":
			timeInMinutes = 5;
			break;
	}

	return timeInMinutes;
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @timeInMinutes = s {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {
  throw new Error('Please implement the limesToCut function');
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @timeInMinutes = s {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {
  throw new Error('Please implement the remainingOrders function');
}
