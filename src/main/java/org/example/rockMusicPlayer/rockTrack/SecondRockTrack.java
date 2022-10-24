package org.example.rockMusicPlayer.rockTrack;


public class SecondRockTrack implements RockTrack{

    String nameTrack = "Wind of change";
    String author = "Scorpions";

    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SecondRockTrack{" +
                "nameTrack='" + nameTrack + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
