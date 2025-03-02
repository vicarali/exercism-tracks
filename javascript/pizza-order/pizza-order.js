/// <reference path="./global.d.ts" />
//
// @ts-check

/**
 * Determine the price of the pizza given the pizza and optional extras
 *
 * @param {Pizza} pizza name of the pizza to be made
 * @param {Extra[]} extras list of extras
 *
 * @returns {number} the price of the pizza
 */
export function pizzaPrice(pizza, ...extras) {
	let price;

	if (pizza === "Margherita") price = 7;
	else if (pizza === "Caprese") price = 9;
	else price = 10;

	if (extras.length === 0) return price;
	else return addExtraOptions(price, extras);
}

function addExtraOptions(currentTotal, extras) {
	if (extras.length === 0) return currentTotal;
	else {
		const currentExtra = extras[0];
		extras.shift();

		if (currentExtra === "ExtraSauce") currentTotal += 1;
		else currentTotal += 2;

		return addExtraOptions(currentTotal, extras);
	}
}

/**
 * Calculate the price of the total order, given individual orders
 *
 * (HINT: For this exercise, you can take a look at the supplied "global.d.ts" file
 * for a more info about the type definitions used)
 *
 * @param {PizzaOrder[]} pizzaOrders a list of pizza orders
 * @returns {number} the price of the total order
 */
export function orderPrice(pizzaOrders) {
  let totalPrice = 0;

	pizzaOrders.forEach((order) => {
		totalPrice += pizzaPrice(order.pizza, ...order.extras);
	});

	return totalPrice;
}
