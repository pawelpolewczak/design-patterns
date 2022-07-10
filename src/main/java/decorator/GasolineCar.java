package decorator;

class GasolineCar extends AbstractCar {

    private final AbstractCar car;
    private boolean isGasEnabled = true;

    public GasolineCar(AbstractCar car) {
        this.car = car;
    }

    public void changeSource() {
        this.isGasEnabled = !this.isGasEnabled;
    }

    @Override
    public double getDrivingCost() {
        return isGasEnabled ? car.getDrivingCost() * 0.8 : car.getDrivingCost();
    }
}
