/// <reference path="./global.d.ts" />
// @ts-check

export function cookingStatus(remainingTime) {
	switch (remainingTime) {
		case 0:
			return "Lasagna is done.";
		case undefined:
			return "You forgot to set the timer.";
		default:
			return "Not done, please wait.";
	}
}

export function preparationTime(layers, timePerLayer = 2) {
	return layers.length * timePerLayer;
}

export function quantities(layers) {
	let noodles = 0;
	let sauce = 0;

	layers.forEach((layer) => {
		if (layer === "noodles") noodles += 50;
		else if (layer === "sauce") sauce += 0.2;
	});

	return {
		noodles: noodles,
		sauce: sauce
	};
}

export function addSecretIngredient(friendsList, myList) {
	myList.push(friendsList[friendsList.length - 1]);
}

export function scaleRecipe(recipe, portions) {
	const recipeForOne = calculateRecipeForOne(recipe);

	for (const key in recipeForOne) {
		recipeForOne[key] *= portions;
	}

	return recipeForOne;
}

function calculateRecipeForOne(recipe) {
	let recipeForOne = {};

	for (const key in recipe) {
		recipeForOne[key] = recipe[key] / 2;
	}

	return recipeForOne;
}

