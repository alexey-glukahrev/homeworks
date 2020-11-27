package Planes;

import models.ConfidentialLevel;
import models.ExperimentalType;

public class ExperimentalPlane extends Plane {

    private final ExperimentalType experimentalType;
    private ConfidentialLevel confidentialLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalType experimentalType, ConfidentialLevel confidentialLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.confidentialLevel = confidentialLevel;
    }

    public ConfidentialLevel getConfidentialLevel(){
        return confidentialLevel;
    }

    public void setClassificationLevel(ConfidentialLevel confidentialLevel){
        this.confidentialLevel = confidentialLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
