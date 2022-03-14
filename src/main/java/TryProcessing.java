import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int ballA=0;
    int ballB=0;
    int ballC=0;
    int ballD=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup(){
        //ellipse(WIDTH/2,HEIGHT/2,100,100);
    }



    @Override
    public void draw(){
        //paintWhite();
        drawCircle();
        //super.draw();
    }
    private void drawCircle(){
        ellipse(ballA,HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(ballB,2*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(ballC,3*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(ballD,4*HEIGHT/5, DIAMETER, DIAMETER);
        ballA+=1;
        ballB+=2;
        ballC+=3;
        ballD+=4;
    }
    private void paintWhite(){
        background(255);
    }


}