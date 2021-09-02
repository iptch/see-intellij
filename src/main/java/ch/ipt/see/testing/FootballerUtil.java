package ch.ipt.see.testing;

public class FootballerUtil {

    public static boolean canPlay(Footballer footballer) {
        return isHealthy(footballer)  && !footballer.isBlockedByLaw();
    }

    public static boolean isHealthy(Footballer footballer){
        return footballer.getHealthyStatus().equals("HEALTHY");
    }
}
