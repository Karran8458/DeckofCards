class Deck extends Card {
var suit = ["spades", "diamonds", "clubs", "hearts"];
var rank = ["A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"];
var number = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"];
var deck = [];
	constructor() 
	{
		for( var i = 0; i < suit.length; i++ ) {
			for( var j = 0; j < rank.length; j++ ) {
            deck.push(new Card(suit[i], rank[j], j));
        }
    }
	}
	function shuffle()
	{
		for( var i = 0; i < suit.length; i++ ) {
			for( var j = 0; j < rank.length; j++ ) {
            deck.pop(new Card(suit[i], rank[j], j));
			deck.push(new Card(suit[i], rank[j], j));
        }
	}
	function reset()
	{
		for( var i = 0; i < suit.length; i++ ) {
			for( var j = 0; j < rank.length; j++ ) {
			deck.push(new Card(" ", " ", " "));
        }
		return deck;
	}
	function deal()
	{
		var num = deck[Math.random()*deck.length];
		return num;
	}
}
