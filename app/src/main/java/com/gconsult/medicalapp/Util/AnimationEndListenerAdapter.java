package com.gconsult.medicalapp.Util;

import android.animation.Animator;
import android.support.annotation.NonNull;

/**
 * Created by Gconsult on 4/10/2018.
 */

public class AnimationEndListenerAdapter implements Animator.AnimatorListener {
    private AnimationEndListener mAdapted;

    public AnimationEndListenerAdapter(@NonNull AnimationEndListener adapted) {
        this.mAdapted = adapted;
    }

    @Override
    public void onAnimationStart(Animator animation) {

    }

    @Override
    public void onAnimationEnd(Animator animation) {
        mAdapted.onAnimationEnd(animation);
    }

    @Override
    public void onAnimationCancel(Animator animation) {

    }

    @Override
    public void onAnimationRepeat(Animator animation) {

    }
}
