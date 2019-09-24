package com.horan.glenn

//todo make deck object?


enum class Value(val value: Int){
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14)
}

enum class Suit(val suit: String){
    DIAMONDS("Diamonds"), HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs")
}

data class Card(val suit: Suit = Suit.SPADES, val value: Value = Value.ACE)


fun getDeck(): ArrayList<Card>{
    val suits = Suit.values()
    val values = Value.values()
    val deck = ArrayList<Card>()

    suits.map{suit ->
        values.map { value ->
            deck.add(Card(suit, value))
            }
        }
    return deck
    }

fun shuffle(deck: ArrayList<Card>): ArrayList<Card> {
    println("shuffle shuffle shuffle...")
    deck.shuffle()
    println("shuffle shuffle shuffle...")
    deck.shuffle()
    println("shuffle shuffle shuffle...")
    deck.shuffle()
    return deck
}

fun drawCard(deck: ArrayList<Card>) : Card {
    val card = deck[0]
    deck.removeAt(0)
    return card
}

fun drawFlop(deck: ArrayList<Card>) : Triple<Card, Card, Card> {
    //burn one
    deck.removeAt(0)
    val flop = Triple(deck[0], deck[1], deck[2])
    deck.removeAt(0)
    deck.removeAt(0)
    deck.removeAt(0)
    return flop
}





