package helpers;

public class JsonParser {

    public static void main(String[] args) {    }


    public static String getAccessToken(String in) {
        String[] json = in.split(",");
        String data = json[5];
        data = data.replace("}", "");
        String[] key = data.split(":");
        String value = key[1];
        String accessToken = value.replace("\"", "");
        return accessToken;
    }

    public static String getUserID(String in2) {
        String[] json = in2.split(",");
        String data = json[2];
        data = data.replace("}", "");
        String[] key = data.split(":");
        String value = key[2];
        String userID = value.replace("\"", "");
        return userID;
    }


    public static String getResponseCode(String in) {
        String[] json = in.split(",");
        String data = json[0];
        data = data.replace("{", "");
        String[] key = data.split(":");
        String value = key[1];
        String code = value.replace("\"", "");
        return code;
    }

    public static String getRegistrationMessage(String in) {
        String[] json = in.split(",");
        String data = json[1];
        data = data.replace("{", "");
        String[] key = data.split(":");
        String value = key[1];
        String message1 = value.replace("\"", "");
        return message1;
    }

    public static String getAuthMessage(String in) {
        String[] json = in.split(",");
        String data = json[1];
        data = data.replace("{", "");
        String[] key = data.split(":");
        String value = key[1];
        String message = value.replace("\"", "");
        return message;
    }



}



