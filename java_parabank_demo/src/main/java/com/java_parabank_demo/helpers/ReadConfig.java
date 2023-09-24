package com.java_parabank_demo.helpers;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


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
            Gson gson1 = new Gson();
            baseUrl = gson1.toJson(result);
            qaEnv = gson1.toJson(result);
            name = gson1.toJson(result);
            email = gson1.toJson(result);
            password = gson1.toJson(result);

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
