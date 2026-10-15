public class A7_BasicLoop extends World {


    public int randomx;
    public int randomy;
    public int randomblue;

    public int randomred;

    public int randomgreen;

    public void go() {
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.pausetime = 1/2;

        for(int y = 0; y < 12; y = y + 1) {


            for (int x = 0; x < 11; x = x + 1) {
//            // 1st part = variable declaration
//            //2nd part = if statement (conditional) (question)
//            //3rd part = increment
//
//            randomblue = plane.random(100, 255);
//            randomgreen = plane.random(100,255);
//            randomred = plane.random(100,255);
//            plane.setTrailColor(randomblue, randomgreen, randomred);
//
//            randomx = plane.random(10,1000);
//            randomy = plane.random(100,800);
//            // make a row of squares using teleport
//            plane.teleport(randomx, randomy);
//            System.out.println("x: " + x);
//            plane.square(100);
                plane.teleport(x * 100, 100 * y);
                plane.setTrailColor(x * 25, y*20, y*20);
                square();

            }//end small for

        }// end large for




    }// end go
    public void square (){
        // todo: make a square that loops
        for(int x=0; x<4; x=x+1) {

            //todo: draw a square only using two lines of code
            plane.move(100);
            plane.turnLeft(90);

        }// end of for bracket


    } //end of square
}
