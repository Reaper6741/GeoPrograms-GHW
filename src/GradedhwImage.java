public class GradedhwImage extends World {


    public int randNum;

    public int randomblue;

    public int randomred;

    public int randomgreen;

    public int randomx;
    public int randomy;

    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 2;
        plane.teleport(randomx, randomy);

        randNum = plane.random(1, 3);
        if (randNum == 1) {
            sad(); // sad faces
        }

        if (randNum == 2) {
            platisunset(); // platipus in a sunset
        }
        if (randNum == 3) {
            bluetooth();
        }
    }// end go

    public void sad() {

            plane.hasTrail = true;
            plane.trailWidth = 3;
            plane.pausetime = 0;

            for(int y = 0; y < 12; y = y + 1) {


                for (int x = 0; x < 11; x = x + 1) {
            // 1st part = variable declaration
            //2nd part = if statement (conditional) (question)
            //3rd part = increment


                    plane.teleport(x * 100, 100 * y);
                    plane.setTrailColor(x * 25, y*20, y*20);
                    plane.turnLeft(90);
                    plane.move(20);
                    plane.turnLeft(90);
                    plane.move(50);
                    plane.turnLeft(90);
                    plane.move(20);
                    plane.hasTrail = false;

                            plane.move(60);
                    plane.turnLeft(90);
                    plane.move(10);
                    plane.hasTrail = true;
                            plane.move(5);
                    plane.hasTrail = false;
                            plane.move(5);
                    plane.hasTrail = true;
                    plane.move(5);

                }//end small for

            }// end large for







    }// end smilez

    public void platisunset() {
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.pausetime = 1 / 2;

        for (int y = 0; y < 12; y = y + 1) {


            for (int x = 0; x < 11; x = x + 1) {
                plane.teleport(x * 100, 100 * y);
                plane.setTrailColor(x * 25, y * 20, y * 20);
                squarecolor();

            }//end small for

        }// end large for
        plane.teleport(300,300);
        //color
        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = false;
        plane.trailWidth = 10;

        //add value to the variable
        randomblue = plane.random(100, 255);
        randomgreen = plane.random(0, 255);
        randomred = plane.random(0, 255);

        //r = red, g = green, b = blue
        //values have to be between 0-255

        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);

        //movement

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2;
        plane.setAngle(0);
        plane.hasTrail = true;
        plane.trailWidth = 5;
        plane.move(100);
        plane.hasTrail = false;
        plane.move(100);

        plane.hasTrail = true;
        plane.move(200);

        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(20);
        plane.setAngle(180);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(120);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(60);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(20);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        plane.turnLeft(270);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(30);
        System.out.println("Turn the plane.");
        plane.setAngle(270);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(60);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(60);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(50);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(20);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        plane.turnLeft(270);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(40);
        System.out.println("Turn the plane.");
        plane.setAngle(270);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(70);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(220);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(50);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(20);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        plane.turnLeft(270);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(35);
        System.out.println("Turn the plane.");
        plane.setAngle(270);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(50);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(50);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(50);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(20);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        plane.turnLeft(270);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(35);
        System.out.println("Turn the plane.");
        plane.setAngle(270);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        plane.turnLeft(100);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(120);
        System.out.println("Turn the plane.");
        plane.setAngle(270);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(80);
        plane.turnLeft(260);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(120);
        System.out.println("Turn the plane.");
        plane.setAngle(270);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(55);
        plane.turnLeft(270);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(360);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(30);
        plane.turnLeft(270);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        System.out.println("Turn the plane.");
        plane.setAngle(270);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        plane.turnLeft(270);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(50);
        System.out.println("Turn the plane.");
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        plane.turnLeft(270);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        System.out.println("Turn the plane.");
        plane.setAngle(270);
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);
        plane.turnLeft(90);
        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(10);



    } //end sunset

    public void squarecolor (){
    // todo: make a square that loops
    for(int x=0; x<4; x=x+1) {

        //todo: draw a square only using two lines of code

        plane.move(100);
        plane.turnLeft(90);

    }// end of for bracket


    } //end of squarecolor

        public void bluetooth() {

            plane.hasTrail=true;
            plane.trailWidth = 10;


            plane.setTrailColor(3,20,50);

            //mid line
            plane.teleport(500, 200);
            plane.setAngle(90);
            plane.move(320);

            //1st triangle
            plane.teleport(500, 200);
            plane.setAngle(45);
            plane.move(115);
            plane.setAngle(135);
            plane.move(230);
            //2nd triangle
            plane.teleport(420, 280);
            plane.setAngle(45);
            plane.move(230);
            plane.setAngle(135);
            plane.move(113);
            plane.teleport(500,375);
            //circle and get rid of plane
            plane.circle(300);
            plane.teleport(0,0);
        }// end go

}






