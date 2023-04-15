
    import java.awt.*;

    public class NinjaCat extends Critter{
        public Critter.Action getMove(CritterInfo info) {

            //getMove
            // determine the movement of the Critter

            if (info.getFront() == Neighbor.OTHER || info.getRight() == Neighbor.OTHER || info.getBack() == Neighbor.OTHER || info.getLeft() == Neighbor.OTHER)
            {
                return Action.INFECT;
            }
            else if (info.frontThreat() == true || info.backThreat() == true || info.leftThreat() == true || info.rightThreat() == true) {
                return Action.INFECT;
            }
            else if (info.getFront() == Neighbor.WALL) {
                return Action.LEFT;
            }

            else if (info.getRight() == Neighbor.WALL) {
                return Action.LEFT;
            }
            else if (info.getFront() == Neighbor.SAME) {
                return Action.RIGHT;
            }

            else if (info.getFront() == Neighbor.EMPTY) {
                return Action.HOP;
            }

            else {
                return Action.HOP;
            }
        }

        public Color getColor() {
            return Color.YELLOW;
        }

        //getColor
        //Determine which color the Critter will be displayed as
        //color.(enter color here)

        public String toString() {
            return "*";
        }
        // toString
        // Determine movement behavior of Critter
    }


