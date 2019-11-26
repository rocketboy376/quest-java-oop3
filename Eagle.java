public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    // constructor
    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    // getter
    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    /**
     * flies, must be on ground
     */
    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off into the air.%n", this.getName());
        }
    }

    /**
     * fly upward
     * @param meters altitude increase
     * @return altitude
     */
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    /**
     * fly down
     * @param meters altitude decrease
     * @return altitude
     */
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 325);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    /**
     * get back to earth
     */
    @Override
    public void land() {
        if (this.flying && this.altitude == 1) {
            System.out.printf("%s lands safely on ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't get down.%n", this.getName());
        }
    }
}
