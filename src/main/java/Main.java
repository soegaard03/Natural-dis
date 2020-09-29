import processing.core.PApplet;

public class Main extends PApplet{

    dataBroker data;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void setup() {
        super.setup();

    data = new dataBroker(this);
        data.loadData();
    }

    @Override
    public void draw() {
        super.draw();
    }



}


