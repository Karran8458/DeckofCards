class Card {

var suit = ["spades", "diamonds", "clubs", "hearts"];
var rank = ["A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"];
var number = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"];
	constructor(suit, rank, number)
	{
		this.suit = suit;
		this rank = rank;
		this.number = number;
	}
	function show(suit, rank, number)
	{
		console.log("Suit: " + suit + " Rank: " + rank + " Number: " + number);
	}
}
