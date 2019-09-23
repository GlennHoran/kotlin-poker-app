package com.horan.glenn

//todo make deck object?

data class Card(val suit: Suit = Suit.SPADES, val value: Value = Value.ACE)

enum class Value(val value: Int){
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14)
}

enum class Suit(val suit: String){
    DIAMONDS("Diamonds"), HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs")
}


enum class PokerHand(val title: String, val rank: Int){
    STRAIGHT_FLUSH("straight flush", 1), FOUR_OF_A_KIND("four of a kind", 2), FULL_HOUSE("full house", 3),
    FLUSH("flush", 4), STRAIGHT("straight", 5), THREE_OF_A_KIND("three of a kind", 6), TWO_PAIR("two pair", 7),
    PAIR("pair", 8), HIGH_CARD("high card", 9)
}

data class Hand(val card1: Card, val card2: Card, val card3: Card, val card4: Card, val card5: Card)

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

fun pokerHandAnalyser(deck: ArrayList<Card>) :  PokerHand {
return PokerHand.HIGH_CARD
}

fun handRanker(hands: List<Hand>) :  Hand {
return Hand(Card(), Card(), Card(), Card(), Card())
}

fun ArrayList<Hand>.rankHands() {
//todo hand ranking tool - order hands
}



