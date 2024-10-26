// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Calculates the total bird count.
 *
 * @param {number[]} birdsPerDay
 * @returns {number} total bird count
 */
export function totalBirdCount(birdsPerDay) {
	let total = 0;

	for (let i = 0; i < birdsPerDay.length; i++) {
		total += birdsPerDay[i];
	}

	return total;
}

/**
 * Calculates the total number of birds seen in a specific week.
 *
 * @param {number[]} birdsPerDay
 * @param {number} week
 * @returns {number} birds counted in the given week
 */
export function birdsInWeek(birdsPerDay, week) {
	let daysToSkip = (week - 1) * 7;
	console.log(daysToSkip);
	//if (daysToSkip > 0) daysToSkip--;

	let total = 0;
	for (let i = 0; i < 7; i++) {
		const birdsOfDay = birdsPerDay[daysToSkip + i];
		total += birdsOfDay;
	}

	return total;
}

/**
 * Fixes the counting mistake by increasing the bird count
 * by one for every second day.
 *
 * @param {number[]} birdsPerDay
 * @returns {number[]} corrected bird count data
 */
export function fixBirdCountLog(birdsPerDay) {
  throw new Error('Please implement the fixBirdCountLog function');
}