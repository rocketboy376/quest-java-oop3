public class Nature {

    public static void main(String[] args) {

        Penguin mumble = new Penguin("Mumble");
        mumble.dive();
        mumble.swimDown(3);
        mumble.swimUp(1);
        mumble.swimDown(4);
        mumble.swimUp(5);
        mumble.swimUp(1);
        mumble.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(9);
        hawkeye.land();
        
    }
}
