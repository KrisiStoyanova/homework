package helpers;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadConfig {

    static String baseUrl;
    static String qaEnv;
    static String name;
    private static String email;
    private static String password;
    public String getUsername;
    public String getPass;
    public String getName;
    public String getEmail;

    public static void readJson(){
        String result = "";

        try {
            //absolute path / local
            //File myObj = new File("C:\\Users\\user\\java-api-demo\\src\\main\\java\\config\\config.json");
            //relative path
            String sysPath = System.getProperty("user.dir");
            System.out.println(sysPath);
            File myObj = new File(sysPath + "\\src\\main\\java\\config\\config.json");
            Scanner myReader = new Scanner(myObj);
            //StringBuilder jsonContent = new StringBuilder();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                result = result + data;
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        JsonParser parse = new JsonParser();
        baseUrl = parse.getConfigBaseURL(result);
        qaEnv = parse.getConfigApiURL(result);
        name = parse.getConfigName(result);
        email = parse.getConfigEmail(result);
        password = parse.getConfigPass(result);

    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static String getApiURL() {
        return qaEnv;
    }

    public static String getName() {
        return name;
    }

    public static String getEmail() {
        return email;
    }

    public void readConfigFile() {
    }

    public String getPassword() {
        return password;
    }
}










