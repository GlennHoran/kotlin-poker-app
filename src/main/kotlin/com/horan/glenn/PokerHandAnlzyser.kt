package com.horan.glenn

enum class PokerHand(val title: String, val rank: Int){
    STRAIGHT_FLUSH("straight flush", 1), FOUR_OF_A_KIND("four of a kind", 2), FULL_HOUSE("full house", 3),
    FLUSH("flush", 4), STRAIGHT("straight", 5), THREE_OF_A_KIND("three of a kind", 6), TWO_PAIR("two pair", 7),
    PAIR("pair", 8), HIGH_CARD("high card", 9)
}

//pokerHand value = highest value card that makes Hand - if it's a flush, highest card in the flush, highest card in the straight etc.
// If it's a pair, it's the value of the pair (i.e pair of 2s)
//highest nonHandCard = kicker card where applicable.

data class PokerHandDetailed(val Hand: PokerHand, val pokerHandValue: Card, val highestNonHandCard: Card)



fun isStraightFlush(Hand: ArrayList<Card>): Boolean {
    return true
}

fun isFourOfAKind(Hand: ArrayList<Card>) :Boolean {
    return true
}

fun isFullHouse(Hand: ArrayList<Card>) :Boolean {
    return true
}

fun isFlush(Hand: ArrayList<Card>) :Boolean {
    return true
}

fun isStraight(Hand: ArrayList<Card>): Boolean {
    return true
}

fun isThreeOfAKind(Hand: ArrayList<Card>) :Boolean {
    return true
}

fun isTwoPair(Hand: ArrayList<Card>) :Boolean {
    return true
}

fun isPair(Hand: ArrayList<Card>) :Boolean {
    return true
}



