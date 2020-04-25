class Player extends Deck{
var name = " ";
var suit = ["spades", "diamonds", "clubs", "hearts"];
var rank = ["A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"];
var number = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"];
var hand = [];
	constructor() 
	{
		for (var i = 0; i < hand.length; i++)
		{
			hand.push(super.deal());
		}
    }
	function remove()
	{
		hand.pop();
	}
}
