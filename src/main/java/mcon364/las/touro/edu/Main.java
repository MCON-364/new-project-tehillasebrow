package mcon364.las.touro.edu;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

    }

    public static Optional<String> getUserName(String envVarName){
        return Optional.ofNullable(System.getenv(envVarName));
    }

    public static String getGreeting(String envVarName){

        var returned = getUserName(envVarName);
        String name;
        if(returned.isEmpty()){
            name = "World";
        } else{
            name = returned.get();
        }
        StringBuilder greeting = new StringBuilder("Hello, ");
        greeting.append(name);
        return greeting.toString();
    }

    public static void processValues(List<List<Integer>> data) {
        outerLoop:
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).size(); j++) {
                if(data.get(i).get(j) == 0){
                    continue outerLoop;
                }
                if (data.get(i).get(j) == 99) {
                    break outerLoop;
                }
            }
        }
    }

}