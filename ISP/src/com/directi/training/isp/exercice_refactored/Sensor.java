package com.directi.training.isp.exercice_refactored;

import java.util.Random;

public class Sensor {
        public void register(SensorProvider sensorProvider)
        {
            while (true) {
                if (isPersonClose()) {
                    sensorProvider.proximityCallback();
                    break;
                }
            }
        }

        private boolean isPersonClose()
        {
            return new Random().nextBoolean();
        }

}
