package org.example.rockMusicPlayer;

import org.example.rockMusicPlayer.classicTrack.ClassicTrack;
import org.example.rockMusicPlayer.classicTrack.FirstClassicTrack;
import org.example.rockMusicPlayer.classicTrack.SecondClassicTrack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class ClassicPlayer {

    ArrayList<ClassicTrack> classicTrackList = new ArrayList<>();

    public void addTrackToList(AnnotationConfigApplicationContext context) {
        ClassicTrack firstClassicTrack = context.getBean(FirstClassicTrack.class);
        ClassicTrack secondClassicTrack = context.getBean(SecondClassicTrack.class);
        classicTrackList.add(firstClassicTrack);
        classicTrackList.add(secondClassicTrack);
    }

    public void playTrack (int numberTrack)
    {
        System.out.println("Now track number" + numberTrack + "is playing" + "Track information:  " + classicTrackList.get(numberTrack));
    }

    public ArrayList<ClassicTrack> getClassicTrackList() {
        return classicTrackList;
    }

    public void setClassicTrackList(ArrayList<ClassicTrack> classicTrackList) {
        this.classicTrackList = classicTrackList;
    }

    @Override
    public String toString() {
        return "ClassicPlayer{" +
                "classicTrackList=" + classicTrackList +
                '}';
    }
}
