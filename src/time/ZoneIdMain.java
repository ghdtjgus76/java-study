package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of("Asia/Seoul");
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println(seoulZoneId);
    }
}
