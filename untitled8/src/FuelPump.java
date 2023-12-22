public class FuelPump {
    private double fuelPrice;
    private double fuelAmount;

    public FuelPump(double fuelPrice, double fuelAmount) {
        this.fuelPrice = fuelPrice;
        this.fuelAmount = fuelAmount;
    }

    public void refuel(double liters) {
        if (liters <= fuelAmount) {
            double totalPrice = liters * fuelPrice;
            System.out.println("Заправлено " + liters + " літрів палива. Сума до сплати: " + totalPrice + " грн.");
            fuelAmount -= liters;
        } else {
            System.out.println("На АЗС недостатньо палива для заправки " + liters + " літрів.");
        }
    }

    public double calculateTotalRevenue() {
        return fuelAmount * fuelPrice;
    }

    public void refuel(int liters) {
        refuel((double) liters);  // Виклик із новим типом даних
    }

    public static void staticMethod() {
        // Динамічна логіка для класу FuelPump
    }
    public void recursiveMethod(int count) {
        // Базовий випадок для виходу з рекурсії
        if (count <= 0) {
            return;
        }

        // Рекурсивний виклик
        recursiveMethod(count - 1);

        // Логіка методу
        System.out.println("Recursive call #" + count);
    }
}
