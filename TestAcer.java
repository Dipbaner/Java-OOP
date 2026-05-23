class MusicPlayer {
    private String name;
    public MusicPlayer(String name){
        this.name = name;
    }
    public void start(){
        System.out.println("Music Player Started...");
    }
    public void stop(){
        System.out.println("Music Palyer Stooped...");
    }
}
class Car{
    private String name;
    private MusicPlayer musicPlayer;
    public Car(String name, MusicPlayer musicPlayer){
        this.name = name;
        this.musicPlayer = musicPlayer;
    }
    public void startPlayer(){
        musicPlayer.start();
    }
    public void stopPlayer(){
        musicPlayer.stop();
    }
    public String getName(){
        return this.name;
    }
}
public class TestAcer {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("Sony");
        Car car = new Car("Audi", player);
        System.out.println("Car name :- "+car.getName());
        car.startPlayer();
        car.stopPlayer();
    }
}
