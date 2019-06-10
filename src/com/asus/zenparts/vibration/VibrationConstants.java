package com.asus.zenparts.vibration;

public class VibrationConstants {
    // Vibration strength control path
    public static final String VIB_PATH_USER = "/sys/devices/soc/800f000.qcom,spmi/spmi-0/spmi0-01/800f000.qcom,spmi:qcom.pm660@1:qcom,haptics@c000/leds/vibrator/vmax_mv_user";
    public static final String VIB_PATH_CALL = "/sys/devices/soc/800f000.qcom,spmi/spmi-0/spmi0-01/800f000.qcom,spmi:qcom.pm660@1:qcom,haptics@c000/leds/vibrator/vmax_mv_call";
    public static final String VIB_PATH_NOTIFICATION = "/sys/devices/soc/800f000.qcom,spmi/spmi-0/spmi0-01/800f000.qcom,spmi:qcom.pm660@1:qcom,haptics@c000/leds/vibrator/vmax_mv_strong";

    // Vibration strength control preference keys
    public static final String VIB_KEY_USER = "vibration_key_user";
    public static final String VIB_KEY_CALL = "vibration_key_call";
    public static final String VIB_KEY_NOTIFICATION = "vibration_key_notification";

    public static final String[] vibrationPaths = new String[]{
            VIB_PATH_USER,
            VIB_PATH_CALL,
            VIB_PATH_NOTIFICATION
    };

    public static final String[] vibrationKeys = new String[]{
            VIB_KEY_USER,
            VIB_KEY_CALL,
            VIB_KEY_NOTIFICATION
    };
}
