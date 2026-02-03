package mcon364.las.touro.edu.demo;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        }

    public static Optional<String> getUserName(String envVarName) {
        return Optional.of(System.getenv(envVarName));
    }
    public static String getGreeting(String envVarName){
        Optional <String> s=getUserName(envVarName);
       // switch (s){
            //case :

      //  }

    }
}