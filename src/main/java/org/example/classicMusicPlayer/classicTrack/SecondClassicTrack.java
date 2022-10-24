package org.example.classicMusicPlayer.classicTrack;


public class SecondClassicTrack implements ClassicTrack{

    String nameTrack = "Симфония номер 5";
    String author = "Бетховен";

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
        return "SecondClassicTrack{" +
                "nameTrack='" + nameTrack + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
