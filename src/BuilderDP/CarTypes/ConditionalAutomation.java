package BuilderDP.CarTypes;

import BuilderDP.PilotTypes.LevelThree;

public abstract class ConditionalAutomation implements Car{
    @Override
    public LevelThree automationLevel() {
        return new LevelThree();
    }

    @Override
    public abstract String getModelName();

    @Override
    public abstract float getPrice();

}
