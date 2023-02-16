package com.directi.training.isp.exercice_refactored;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, final ITimeDoor timerProvider)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timerProvider.timeOutCallback();
            }
        }, timeOut);
    }
}
