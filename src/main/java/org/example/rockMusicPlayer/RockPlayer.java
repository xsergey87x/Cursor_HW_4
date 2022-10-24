package org.example.rockMusicPlayer;

import org.example.rockMusicPlayer.rockTrack.FirstRockTrack;
import org.example.rockMusicPlayer.rockTrack.RockTrack;
import org.example.rockMusicPlayer.rockTrack.SecondRockTrack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class RockPlayer {

    ArrayList<RockTrack> rockTrackList = new ArrayList<>();

    public void addTrackToList(AnnotationConfigApplicationContext context) {
        RockTrack firstRockTrack = context.getBean(FirstRockTrack.class);
        RockTrack secondRockTrack = context.getBean(SecondRockTrack.class);
        rockTrackList.add(firstRockTrack);
        rockTrackList.add(secondRockTrack);
    }

    public void playTrack (int numberTrack)
    {
        System.out.println("Now track number" + numberTrack + "is playing" + "Track information:  " + rockTrackList.get(numberTrack));
    }

    public ArrayList<RockTrack> getRockTrackList() {
        return rockTrackList;
    }

    public void setRockTrackList(ArrayList<RockTrack> rockTrackList) {
        this.rockTrackList = rockTrackList;
    }

    @Override
    public String toString() {
        return "RockPlayer{" +
                "rockTrackList=" + rockTrackList +
                '}';
    }
}
