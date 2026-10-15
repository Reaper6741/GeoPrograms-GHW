public class A1_Move extends World {

    public int randomblue;

    public int randomred;

    public int randomgreen;




    public void go() {

       //color
        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = false;
        plane.trailWidth = 10;

        //add value to the variable
        randomblue = plane.random(100, 255);
        randomgreen = plane.random(0,255);
        randomred = plane.random(0,255);

        //r = red, g = green, b = blue
        //values have to be between 0-255

        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);

        //movement

        System.out.println("This message will be printed to the window below.");
        plane.pausetime =2;
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
    }

}

