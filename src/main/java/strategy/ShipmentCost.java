package strategy;

import java.math.BigDecimal;

class ShipmentCost {

    enum Strategy implements ShipmentCostStrategy {
        FreeShipment(() -> BigDecimal.ZERO),
        CountryShipment(() -> BigDecimal.TEN),
        AbroadShipment(() -> BigDecimal.valueOf(15L))
        ;

        private final ShipmentCostStrategy shipmentCostStrategy;
        Strategy(ShipmentCostStrategy shipmentCostStrategy) {
            this.shipmentCostStrategy = shipmentCostStrategy;
        }

        @Override
        public BigDecimal calculate() {
            return this.shipmentCostStrategy.calculate();
        }
    }

}
