package Chap10.Excercise;

public class Song {
    String title;

    public Song(String t) {
        title = t;
    }

    public void play() {
        SoundPlayer player = new SoundPlayer();
        player.playSound(title);

    }

    public static void main(String[] args) {
        Song song = new Song("False God");
        song.play();

        Song song2 = new Song("Kissing you");
        song2.play();
    }
}

class SoundPlayer {
    public void playSound(String title) {
        System.out.println("Playing " + title);
    }
}
