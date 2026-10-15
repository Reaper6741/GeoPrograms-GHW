public class A5_Square extends World {

    public int randomblue;

    public int randomred;

    public int randomgreen;

    public int randomloco;



    public void go() {
        plane.setTrailColor(randomred, randomgreen, randomblue);
        randomblue = plane.random(1, 255);
        randomgreen = plane.random(1,255);
        randomred = plane.random(1,255);


        plane.trailWidth = 10;
        plane.pausetime = 3;


        plane.setAngle(90);
        square(100);

        plane.teleport(randomloco, randomloco);
        bigsquare();
        square(300);

        plane.teleport(randomloco, randomloco);
        square(50);

        plane.teleport(randomloco, randomloco);
        square(150);
    }
//parameter type pf variable that live in the parentheses of methods
    //they can only be used in a method
//todo: make two more square using the square method that are different sizes


    public void square(int size) {

        plane.setTrailColor(randomred, randomgreen, randomblue);
        randomblue = plane.random(1, 255);
        randomgreen = plane.random(1,255);
        randomred = plane.random(1,255);


        plane.teleport(randomloco, randomloco);

        plane.setAngle(90);
        plane.hasTrail = true;
        //boolean
        plane.trailWidth = 10;
        //integer
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        // notice the direction your plane is facing at this point
    } //endof square

    //todo: make another method called bigsquare that makes square that is big


    public void bigsquare() {

        plane.setTrailColor(randomred, randomgreen, randomblue);
        randomblue = plane.random(1, 255);
        randomgreen = plane.random(1,255);
        randomred = plane.random(1,255);
        plane.teleport(randomloco, randomloco);
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(300);
        plane.turnLeft(90);
        plane.move(300);
        plane.turnLeft(90);
        plane.move(300);
        plane.turnLeft(90);
        plane.move(300);
        // notice the direction your plane is facing at this point

        plane.hasTrail=true;
        plane.trailWidth = 10;
        plane.setTrailColor(0,0, 0);
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


}//end of file


