package BuilderDP.CarTypes;

import BuilderDP.PilotTypes.Pilot;

public interface Car {
    public String getModelName();
    public Pilot automationLevel();
    public float getPrice();
}
