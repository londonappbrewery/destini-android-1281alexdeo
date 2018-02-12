package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.BoringLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStory;
    int  mStoryIndex =1;

   // int  mStoryIndex =1;//to keep track of which story the user is in

    private StoryAnswer[] mStoryAnswerArray = new StoryAnswer[]{
            new StoryAnswer(R.string.T1_Story,true),
            new StoryAnswer(R.string.T2_Story,true),
            new StoryAnswer(R.string.T3_Story,true),
            new StoryAnswer(R.string.T4_End),
            new StoryAnswer(R.string.T5_End),
            new StoryAnswer(R.string.T6_End),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryTextView = (TextView)findViewById(R.id.storyTextView);
            mButtonTop = (Button)findViewById(R.id.buttonTop);
            mButtonBottom = (Button)findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
       // mStoryIndex=3;
            mButtonTop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean Ans1 = mStoryAnswerArray[mStoryIndex].isAnswer1();
                    if( Ans1 ==true ){
                        mStoryIndex = 2;
                        mStory = mStoryAnswerArray[mStoryIndex].getStoryID();
                        mStoryIndex = 5;
                        Log.d("mes","checkansermethod run and show T3_story" + mStoryIndex);
                        mStoryTextView.setText(mStory);
                    }else if( mStoryIndex == 5) {
                        mStoryIndex =5;
                        mStory = mStoryAnswerArray[mStoryIndex].getStoryID();
                        Log.d("mes"," else if statement run show T6_end"+ mStoryIndex);
                        mStoryTextView.setText(mStory);
                        mButtonBottom.setVisibility(View.GONE);
                        mButtonTop.setVisibility(View.GONE);
                    }
                }});

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        //mStoryIndex=1;
            mButtonBottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean Ans1 = mStoryAnswerArray[mStoryIndex].isAnswer1();
                    if( mStoryIndex ==1){
                        //mStoryIndex = 2;
                        mStory = mStoryAnswerArray[mStoryIndex].getStoryID();
                        Log.d("mes","check answer method run and show T2_story" + mStoryIndex);
                        mStoryTextView.setText(mStory);
                        mButtonTop.setText(R.string.T2_Ans1);
                        mButtonBottom.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;

                    }else if(mStory==R.string.T2_Story && mStoryIndex ==2){
                        Log.d("mes"," method T4_story!!");
                        mStoryTextView.setText(R.string.T4_End);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                    }
                    else if ( mStoryIndex == 5) {
                        mStoryIndex=4;
                        mStory = mStoryAnswerArray[mStoryIndex].getStoryID();
                        Log.d("mes", " else if statement run show T5_end" + mStoryIndex);
                        mStoryTextView.setText(mStory);
                        mButtonBottom.setVisibility(View.GONE);
                        mButtonTop.setVisibility(View.GONE);
                    }
                }
            });

    }

    }

