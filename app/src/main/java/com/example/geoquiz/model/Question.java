package com.example.geoquiz.model;

public class Question {

    private int mTextRestId;
    private boolean mAnswerTrue;

    public Question(int mTextRestId, boolean mAnswerTrue) {
        this.mTextRestId = mTextRestId;
        this.mAnswerTrue = mAnswerTrue;
    }

    public int getTextRestId() {
        return mTextRestId;
    }

    public void setTextRestId(int textRestId) {
        mTextRestId = textRestId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
