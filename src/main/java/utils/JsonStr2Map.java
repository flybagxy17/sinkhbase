package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JsonStr2Map {

    /**
     * 将Json字符串转为Map对象
     * @param jsonStr
     * @return
     */
    public static Map<String, String> jsonStr2Map(String jsonStr) {
        Map<String, String> resultMap = new HashMap<>();
        Pattern pattern = Pattern.compile("(\\w+\"):([^,]+)");
        Matcher m = pattern.matcher(jsonStr);
        String[] strs = null;
        while (m.find()) {
            strs = m.group().split(":");
            if(strs != null && strs.length == 2) {
                resultMap.put(strs[0].replaceAll("\"", "").trim(), strs[1].trim().replaceAll("\"", "").replaceAll("\\}", ""));
            }
        }
        return resultMap;
    }
}