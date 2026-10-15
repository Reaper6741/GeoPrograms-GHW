public class A6_IfThen extends World {

    public int randNum;

    public int randomblue;

    public int randomred;

    public int randomgreen;

    public int randomx;
    public int randomy;

    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 2 ;
        plane.teleport(randomx, randomy);

        randNum = plane.random(3, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(200, 100);
        }
        if (randNum == 2) {
            rectangle(60, 100);
        }
        if (randNum == 3) {
            bluetooth();
        }
    }

    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }//end rectangle

    public void bluetooth() {
        plane.hasTrail=true;
        plane.trailWidth = 10;

        randomx = plane.random(100, 300);
        randomy = plane.random(100, 300);

        randomblue = plane.random(100, 255);
        randomgreen = plane.random(0,255);
        randomred = plane.random(0,255);
        plane.setTrailColor(randomblue, randomgreen, randomred);

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
    }

    //todo: add a method to the file. you can copy and paste or make a new one
}//end file



