import java.util.Timer;
import java.util.TimerTask;

class SimpleTimer
{
    public static void main(String args[]){
        Timer timer = new Timer();
        timer.schedule(new SayHello(), 0, 5000);
    }



    // And From your main() method or any other method

}

class SayHello extends TimerTask {
    public void run() {
        System.out.println("Hello World!");
    }
}