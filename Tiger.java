
    import java.awt.*;

import java.util.Random;

    public class Tiger extends Critter{

        //getColor
            //Determine which color the Critter will be displayed as
            //color.(enter color here)
        Color r;
        Color g;
        Color b;

        public Color randcolor;

        private static int count = 0;
        private static int count2 = 0;

        public Action getMove(CritterInfo info) {
        //getMove
            // determine the movement of the Critter

            if (info.frontThreat() == true) {
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
            else {
                return Action.HOP;
            }
        }

        public Color getColor() {

            return randomColor();// using randomColor method
        }
        public Color randomColor()//To randomize and pass it to getColor method
        {
            int r = (int) (Math.random()*3);

            if (r==0){
                randcolor = new Color(255,   0,   0);//Red
            }

            if (r==1){
                randcolor = new Color(0,   255,   0);//Green
            }

            else if (r==2)
            {
                randcolor = new Color(0,   0,   255);//Blue
            }
            //System.out.println("Random number is " + r );
            //System.out.println("Color chosen  " + randcolor );
            return randcolor;//This randomized color value will be passed to the getColor method
        }
        public String toString() {
            return "TGR";
        }
        // toString
            // Determine movement behavior of Critter
    }


