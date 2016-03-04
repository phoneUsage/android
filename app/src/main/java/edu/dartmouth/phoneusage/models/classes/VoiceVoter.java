package edu.dartmouth.phoneusage.models.classes;

/**
 * Created by benribovich on 3/4/16.
 */
public class VoiceVoter {

    private long[] vote;
    public VoiceVoter(){
        vote = new long[2]; //noise =0, speech=1
    }

    public void incrementNoise(){
        vote[0]++;
    }

    public void incrementSpeech(){
        vote[1]++;
    }

    public int pollVoter(){
        //speaking
        if(vote[1] > 100*vote[0]){
            return 1;
        }
        //noise
        else{
            return 0;
        }

    }

    public void reset(){
        vote[0]=0;
        vote[1]=0;
    }



}
