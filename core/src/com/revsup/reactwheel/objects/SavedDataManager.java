package com.revsup.reactwheel.objects;


import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.Preferences;




public class SavedDataManager {

    private static final  String KEY_PREFERENCES = "prefs";
    private static final String KEY_HIGH_SCORE = "high score";

    private static SavedDataManager instance = null;
    private static int highScore;

    protected SavedDataManager(){}

    public static SavedDataManager getInstance(){
        if(instance == null){
            instance = new SavedDataManager();
        }
        return instance;
    }

    public void load(){
        Preferences prefs = Gdx.app.getPreferences(KEY_PREFERENCES);
        highScore = prefs.getInteger(KEY_HIGH_SCORE);
    }

    public void save(){
        Preferences prefs = Gdx.app.getPreferences(KEY_PREFERENCES);
        prefs.putInteger(KEY_HIGH_SCORE, highScore);
        prefs.flush();


    }


    public void setHighScore(int score){
        if(score > highScore)
            highScore = score;



    }
    public int getHighScore(){
        return highScore;
    }


}
