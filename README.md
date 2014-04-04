matching_pennies_test
=====================

This is the test repository for the Matching Pennies Game server

Matching Pennies Contest Concept

Matching pennies is a simplified version of ‘Rock Paper Scissors’ in which two players attempt to either match or mismatch their opponents’ choice of either ‘heads’ or ‘tails’, in which there are no tie outcomes. The rules are as follows:

1. Before the game begins, it is decided which player is the ‘matcher’ and which player is the ‘mismatcher’ as well as the maximum number of rounds to be played (number of rounds should be odd to avoid ties in winning the entire game). A matcher wins when their choice of heads or tails matches their opponent’s, and a mismatcher wins when their choice of heads or tails mismatches their opponent’s.
2. At the beginning of each round of play, each player secretly selects either ‘heads’ or ‘tails’.
3. After each player has selected either ‘heads’ or ‘tails’, their selection is revealed and the matcher wins the round if the pennies match, or the mismatcher wins the round if the pennies mismatch. Each time a player wins a round, they earn 1 point.
4. The game ends when the maximum number of rounds selected in step 1 is reached. The winner of the game is declared to be the player with the most points.

Matching Pennies With Wagers

Depending on how confident a player is about their opponent’s next choice of heads or tails, they can wager a certain amount of credits on the next round. For instance, if the betting range per round is between 1 credit and 100 credits, a player can bet between 1 credit and 100 credits on each round of the game, indicating that they are anywhere from being not so confident in their opponent’s next choice, to being very confident of their opponent’s next choice. If a player wins, they collect the amount they wagered from their opponent, and if they lose, their opponent collects their wager. To eliminate irregularities in the game, each player must have enough credits equal to the maximum wager for a round, in case their opponent bets the maximum and wins. This adds a second condition to the game ending, in addition to the maximum number of rounds being reached.

Significance of the Matching Pennies Game

The Matching Pennies game may initially seem to be a game with little significance due to its simplicity. However, it is actually a game in which optimal solutions will tend towards a solution to universal inductive inference. Each player in the game is attempting to create a model of their opponent’s choices, and if you substitute ‘heads’ and ‘tails’ for 1 and 0, it becomes evident that each player is attempting to model an arbitrary sequence of binary bits. Of course, Matching Pennies has a Nash Equilibrium strategy of just selecting random ‘head’ and ‘tails’ values. If ‘heads’ or ‘tails’ are selected randomly, it does not matter what your opponent plays, you will end up with a 50/50 chance of winning any given round. A pure random strategy can be discouraged by having a large minimum number of rounds that must be played where the maximum number of credits that can be wagered is a small percentage of the minimum number of credits a player needs to start the game. In other words, if a player wanted to just play a random strategy, they would have to potentially wait for a significant amount of time for all the rounds to be played, only to be left with a small potential gain at the end. Also, other mechanisms can be employed to discourage pure random play. For instance, if a game is not won by over a certain percentage of won rounds, all wagering is deemed void and all credits are returned as if they were not wagered at all.

Matching Pennies Game Contests

In order to encourage researchers and programmers to develop the best universal inductive inference algorithms and programs, regular worldwide Matching Pennies contests can be held online, either with wagering real money or not. Matching Pennies bots would be matched up for a game via a game hosting service that would manage the games. Wagering could be done using Bitcoin, with the smallest possible credit unit being a single Satoshi or .00000001 BTC (currently worth approximately $0.00000444). Since the game hosting service would be up 24/7 365 days a year, the contests could run all the time with very little human intervention. Also, not having to go through a 3rd party payment system for wagering is a huge boon to the smoothness of the operation. Through the game hosting service, an ELO rating system could be implemented to identify the best Matching Pennies bots. Additional details on how the game hosting service would be set up is to be determined…
