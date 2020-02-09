package cegepst.Entities;

import java.util.Arrays;
import java.util.List;

public class Validator {

    public static boolean isFlush(List<Card> cards) {
        //cards = sortBySuit(cards);
        for (Card card : cards) {
            int counter = 0;
            for (Card card2 : cards) {
                if (card.getSuit() == card2.getSuit() && card.getRank() != card2.getRank()) {
                    ++counter;
                }

                if (counter == 4){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isStraightFlush(List<Card> cards) {
        return isStraight(cards) && isFlush(cards);
    }

    public static boolean isTwoPairs(List<Card> cards) {
        cards = sortByRank(cards);
        int counter = 0;
        for (int i = 0; i < cards.size(); ++i) {
            if (i + 1 == cards.size()) return false;
            if (cards.get(i).getRank() == cards.get(i+1).getRank()) ++counter;
            if (counter == 2) return true;
        }

        return false;
    }

    public static boolean isOnePair(List<Card> cards) {
        cards = sortByRank(cards);
        for (int i = 0; i < cards.size(); ++i) {
            if (i + 1 == cards.size()) return false;
            if (cards.get(i).getRank() == cards.get(i+1).getRank()) return true;
        }

        return false;
    }

    public static boolean isThreeOfAKind(List<Card> cards) {
        cards = sortByRank(cards);
        return test(cards);

    }

    private static boolean test(List<Card> cards) {
        for (Card card : cards) {
            int counter = 0;
            for (Card card2 : cards) {
                if (card.getRank() == card2.getRank() && card.getSuit() != card2.getSuit()) {
                    ++counter;
                }

                if (counter == 2) return true;
            }
        }
        return false;
    }

    public static boolean isFullHouse(List<Card> cards) {
        boolean threeSameCards = false;
        int twoSameCardValue = 0;
        boolean twoSameCards = false;
        cards = sortByRank(cards);
        for (Card card : cards) {
            int counter = 0;
            for (Card card2 : cards) {
                if (card.getRank() == card2.getRank() && card.getSuit() != card2.getSuit()) {
                    counter++;
                    if (counter == 2) {
                        threeSameCards = true; twoSameCards = false; twoSameCardValue = 0;
                    } else if (counter == 1) {
                        twoSameCards = true;
                        if (card.getCardRank() > twoSameCardValue && ! threeSameCards) {
                            twoSameCardValue = card.getCardRank();
                        }
                    }
                }
            }
        }

        return twoSameCards && threeSameCards;
    }

    public static boolean isRoyalFlush(List<Card> cards) {
        return isFlush(cards) && isStraight(cards)  && cards.get(cards.size() - 1).getRank() == Rank.ACE;
    }

    public static boolean isFourOfAKind(List<Card> cards) {
        for (Card card : cards) {
            int counter = 0;
            for (Card card2 : cards) {
                if (card.getRank() == card2.getRank() && card.getSuit() != card2.getSuit()) {
                    ++counter;
                }

                if (counter == 3) return true;
            }
        }
        return false;
    }

    public static boolean isStraight(List<Card> cards) {
        cards = sortByRank(cards);
        int counter = 0;
        for (int i = 0; i < cards.size(); ++i) {
            if (i + 1 == cards.size()) {
                return false;
            }

            if (cards.get(i + 1).getRank().getValue() - cards.get(i).getRank().getValue() == 1) {
                ++counter;
            } else {
                counter = 0;
            }

            if (counter == 4) {
                return true;
            }
        }

        return false;
    }

    private static List<Card> sortByRank(List<Card> cards) {
        Card[] cardsArray = cards.toArray(new Card[cards.size()]);
        int min_j;
        for (int i = 0 ; i < cardsArray.length ; i ++ )
        {
            min_j = i;

            for (int j = i+1 ; j < cardsArray.length ; j++ )
            {
                if (cardsArray[j].getRank().getValue() < cardsArray[min_j].getRank().getValue() )
                {
                    min_j = j;
                }
            }
            Card help = cardsArray[i];
            cardsArray[i] = cardsArray[min_j];
            cardsArray[min_j] = help;
        }
        return Arrays.asList(cardsArray);
    }

    private static List<Card> sortBySuit(List<Card> cards) {
        Card[] cardsArray = cards.toArray(new Card[cards.size()]);
        int min_j;
        for (int i = 0 ; i < cardsArray.length ; i ++ ) {
            min_j = i;

            for (int j = i+1 ; j < cardsArray.length ; j++ ) {
                if ( cardsArray[j].getSuit().getValue() < cardsArray[min_j].getSuit().getValue() ) {
                    min_j = j;
                }
            }
            Card help = cardsArray[i];
            cardsArray[i] = cardsArray[min_j];
            cardsArray[min_j] = help;
        }
        return Arrays.asList(cardsArray);
    }

}
