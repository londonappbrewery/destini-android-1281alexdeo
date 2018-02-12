package com.londonappbrewery.destini;

/**
 * Created by alex on 2/7/2018.
 */
public class StoryAnswer {
    int storyID;
    boolean answer1;


    public StoryAnswer(int storyResId, boolean answer1ResId) {
        storyID = storyResId;
        answer1 = answer1ResId;
    }
    public StoryAnswer(int storyResId){
        storyID =storyResId;
    }

    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public boolean isAnswer1() {
        return answer1;
    }

    public void setAnswer1(boolean answer1) {
        this.answer1 = answer1;
    }
}




