public class A3_Color extends World {

    //variable
    public int randomblue;

    public int randomred;

    public int randomgreen;

    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.trailWidth = 10;

        //add value to the variable
        randomblue = plane.random(0, 255);
        randomgreen = plane.random(0,255);
        randomred = plane.random(0,255);

        //r = red, g = green, b = blue
        //values have to be between 0-255

        plane.setTrailColor(randomred, randomgreen, randomblue);
        plane.move(100);
        square();

    }//end of go


   public void square(){
        plane.hasTrail = true;

       randomblue = plane.random(300, 1000);
       randomgreen = plane.random(300,1000);
       randomred = plane.random(300,1000);

        plane.move(200);
        plane.turnLeft(90);
       plane.move(200);
       plane.turnLeft(90);
       plane.move(200);
       plane.turnLeft(90);
       plane.move(200);
       plane.turnLeft(90);



       plane.setTrailColor(randomred, randomgreen, randomblue);


   } //end of square


}
