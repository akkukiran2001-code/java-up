interface Playables{
    void play();
    void stop();
}

class audio implements Playables{

    @Override
    public void play(){

        System.out.println("audio is playing");


    }

    @Override
    public void stop() {
        System.out.println("Audio stopped playing");
    }
}

class video implements Playables{

    @Override
    public void play(){

        System.out.println("video is playing");


    }

    @Override
    public void stop() {
        System.out.println("vidio stopped playing");
    }
}

public class Interfaceaudiovidio {

    public static void main(String[] args){
        Playables[] playables ={
                new audio(),
                new video(),
                new audio()
        };

        for(int i = 0;i < playables.length;i++){
            playables[i].play();
            playables[i].stop();
        }

    }
}
