public class Constructionplan {
/*
    t = t + 1  # keeping track of the turn number
    m = 0  # number of random moves
while (deposit) { # still our region
        if (deposit - 100)d
            then collect (deposit / 4)  # collect 1/4 of available deposit
  else if (budget - 25) then invest 25
  else {}
        if (budget - 100) then {} else done  # too poor to do anything else
        opponentLoc = opponent
        if (opponentLoc / 10 - 1)
            then  # opponent afar
        if (opponentLoc % 10 - 5) then move downleft
    else if (opponentLoc % 10 - 4) then move down
    else if (opponentLoc % 10 - 3) then move downright
    else if (opponentLoc % 10 - 2) then move right
    else if (opponentLoc % 10 - 1) then move upright
    else move up
  else if (opponentLoc)
            then  # opponent adjacent to city crew
        if (opponentLoc % 10 - 5) then {
            cost = 10 ^ (nearby upleft % 100 + 1)
            if (budget - cost) then shoot upleft cost else {}
        }
    else if (opponentLoc % 10 - 4) then {
            cost = 10 ^ (nearby downleft % 100 + 1)
            if (budget - cost) then shoot downleft cost else {}
        }
    else if (opponentLoc % 10 - 3) then {
            cost = 10 ^ (nearby down % 100 + 1)
            if (budget - cost) then shoot down cost else {}
        }
    else if (opponentLoc % 10 - 2) then {
            cost = 10 ^ (nearby downright % 100 + 1)
            if (budget - cost) then shoot downright cost else {}
        }
    else if (opponentLoc % 10 - 1) then {
            cost = 10 ^ (nearby upright % 100 + 1)
            if (budget - cost) then shoot upright cost else {}
        }
    else {
            cost = 10 ^ (nearby up % 100 + 1)
            if (budget - cost) then shoot up cost else {}
        }
  else {  # no visible opponent; move in a random direction
                dir = random % 6
            if (dir - 4) then move upleft
    else if (dir - 3) then move downleft
    else if (dir - 2) then move down
    else if (dir - 1) then move downright
    else if (dir) then move upright
    else move up
            m = m + 1
        }
    }  # end while
            # city crew on a region belonging to nobody, so claim it
if (budget - 1) then invest 1 else {}
*/
}
