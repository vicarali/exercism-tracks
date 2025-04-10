// @ts-check

/**
 * Double every card in the deck.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with every card doubled
 */
export function seeingDouble(deck) {
	return deck.map((card) => card * 2);
}

/**
 *  Creates triplicates of every 3 found in the deck.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with triplicate 3s
 */
export function threeOfEachThree(deck) {
	let numberThreeIndexes = findIndexesOfThrees(deck);

	numberThreeIndexes.forEach((index, i) => {
		deck.splice(index, 0, 3, 3);

		if (i < numberThreeIndexes.length) {
			numberThreeIndexes[i + 1] += 2;
		}
	});

	return deck;
}

function findIndexesOfThrees(deck) {
	let numberThreeIndexes = [];

	for (let i = 0; i < deck.length; i++) {
		const card = deck[i];

		if (card === 3) numberThreeIndexes.push(i);
	}
	return numberThreeIndexes;
}

/**
 * Extracts the middle two cards from a deck.
 * Assumes a deck is always 10 cards.
 *
 * @param {number[]} deck of 10 cards
 *
 * @returns {number[]} deck with only two middle cards
 */
export function middleTwo(deck) {
	return deck.slice(4, 6);
}

/**
 * Moves the outside two cards to the middle.
 *
 * @param {number[]} deck with even number of cards
 *
 * @returns {number[]} transformed deck
 */

export function sandwichTrick(deck) {
	const firstCard = Number(deck.splice(0, 1));
	const lastCard = Number(deck.splice(deck.length - 1, 1));
	const deckMiddle = deck.length / 2;

	deck.splice(deckMiddle, 0, lastCard, firstCard);
	return deck;
}

/**
 * Removes every card from the deck except 2s.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with only 2s
 */
export function twoIsSpecial(deck) {
	return deck.filter((card) => card === 2);
}

/**
 * Returns a perfectly order deck from lowest to highest.
 *
 * @param {number[]} deck shuffled deck
 *
 * @returns {number[]} ordered deck
 */
export function perfectlyOrdered(deck) {
	return deck.sort((card1, card2) => {
		if (card1 < card2) return -1;
		if (card1 > card2) return 1;

		return 0;
	});
}

/**
 * Reorders the deck so that the top card ends up at the bottom.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} reordered deck
 */
export function reorder(deck) {
	return deck.reverse();
}
