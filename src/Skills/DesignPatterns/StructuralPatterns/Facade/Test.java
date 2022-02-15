package Skills.DesignPatterns.StructuralPatterns.Facade;

public class Test {

    /*
    As you can see, it can be quite complex and does require some effort to start the engine correctly:

airFlowController.takeAir()
fuelInjector.on()
fuelInjector.inject()
starter.start()
coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP)
coolingController.run()
catalyticConverter.on()
Similarly, stopping the engine also requires quite a few steps:

fuelInjector.off()
catalyticConverter.off()
coolingController.cool(MAX_ALLOWED_TEMP)
coolingController.stop()
airFlowController.off()
     */
// ...Now, to start and stop a car, we need only 2 lines of code, instead of 13:

 /*   CarEngineFacade carEngineFacade = new CarEngineFacade();
    carEngineFacade.startEngine();
    carEngineFacade.stopEngine();*/
}
