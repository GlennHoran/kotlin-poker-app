package com.horan.glenn

interface Handler{
    fun analyseHand(hand: ArrayList<Card>): PokerHandDetailed
}

class StraightFlushHandler(var next: Handler? = null) : Handler {
    override fun analyseHand(hand: ArrayList<Card>) : PokerHandDetailed{
        return if (isStraightFlush(hand)){
            //todo analysis straightflush to return detailed hand
            PokerHandDetailed(PokerHand.STRAIGHT_FLUSH, Card(), Card())
        } else
            next?.analyseHand(hand)?: PokerHandDetailed(PokerHand.HIGH_CARD, hand.highestCard(), hand.highestCard())
    }
}

class FourOfAKindHandler(var next: Handler? = null) : Handler {
    override fun analyseHand(hand: ArrayList<Card>) : PokerHandDetailed{
        return if (isFourOfAKind(hand)){
            //todo analysis straightflush to return detailed hand
            PokerHandDetailed(PokerHand.STRAIGHT_FLUSH, Card(), Card())
        } else
            next?.analyseHand(hand)?: PokerHandDetailed(PokerHand.HIGH_CARD, hand.highestCard(), hand.highestCard())
    }
}

class FullHouseHandler(var next: Handler? = null) : Handler {
    override fun analyseHand(hand: ArrayList<Card>) : PokerHandDetailed{
        return if (isFullHouse(hand)){
            //todo analysis straightflush to return detailed hand
            PokerHandDetailed(PokerHand.STRAIGHT_FLUSH, Card(), Card())
        } else
            next?.analyseHand(hand)?: PokerHandDetailed(PokerHand.HIGH_CARD, hand.highestCard(), hand.highestCard())
    }
}

class FlushHandler (var next: Handler? = null): Handler {
    override fun analyseHand(hand: ArrayList<Card>) : PokerHandDetailed{
        return if (isFlush(hand)){
            //todo analysis straightflush to return detailed hand
            PokerHandDetailed(PokerHand.STRAIGHT_FLUSH, Card(), Card())
        } else
            next?.analyseHand(hand)?: PokerHandDetailed(PokerHand.HIGH_CARD, hand.highestCard(), hand.highestCard())
    }
}

class StraightFHandler(var next: Handler? = null) : Handler {
    override fun analyseHand(hand: ArrayList<Card>) : PokerHandDetailed{
        return if (isStraight(hand)){
            //todo analysis straightflush to return detailed hand
            PokerHandDetailed(PokerHand.STRAIGHT_FLUSH, Card(), Card())
        } else
            next?.analyseHand(hand)?: PokerHandDetailed(PokerHand.HIGH_CARD, hand.highestCard(), hand.highestCard())
    }
}

class ThreeOfAKindHandler(var next: Handler? = null) : Handler {
    override fun analyseHand(hand: ArrayList<Card>) : PokerHandDetailed{
        return if (isThreeOfAKind(hand)){
            //todo analysis straightflush to return detailed hand
            PokerHandDetailed(PokerHand.STRAIGHT_FLUSH, Card(), Card())
        } else
            next?.analyseHand(hand)?: PokerHandDetailed(PokerHand.HIGH_CARD, hand.highestCard(), hand.highestCard())
    }
}

class TwoPairHandler(var next: Handler? = null) : Handler {
    override fun analyseHand(hand: ArrayList<Card>) : PokerHandDetailed{
       return if (isTwoPair(hand)){
            //todo analysis straightflush to return detailed hand
             PokerHandDetailed(PokerHand.STRAIGHT_FLUSH, Card(), Card())
        }
        else
             next?.analyseHand(hand)?: PokerHandDetailed(PokerHand.HIGH_CARD, hand.highestCard(), hand.highestCard())
    }
}

class PairHandler (var next: Handler? = null): Handler {
    override fun analyseHand(hand: ArrayList<Card>) : PokerHandDetailed{
        return if (isPair(hand)){
            //todo analysis straightflush to return detailed hand
            PokerHandDetailed(PokerHand.STRAIGHT_FLUSH, Card(), Card())
        } else
            next?.analyseHand(hand)?: PokerHandDetailed(PokerHand.HIGH_CARD, hand.highestCard(), hand.highestCard())
    }
}

fun ArrayList<Card>.highestCard():Card {
    //todo get this working
    return Card(Suit.SPADES, Value.ACE)
}
