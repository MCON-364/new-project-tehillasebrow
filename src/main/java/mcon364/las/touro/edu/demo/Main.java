package mcon364.las.touro.edu.demo;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
      getGreeting("USERNAME");
 getGreeting("NO_SUCH_VAR");
        List<List<Integer>> list = List.of(
                List.of(5, 10, 15),
                List.of(20, 0, 25),
                List.of(30, 35, 40),
                List.of(45, 99, 50),
                List.of(55, 60, 65)
        );
     int num=processValues(list);

        }
//testing merge
    public static Optional<String> getUserName(String envVarName) {


        return Optional.ofNullable(System.getenv(envVarName));
    }
    public static String getGreeting(String envVarName){
       var s=getUserName(envVarName);
if(s.isEmpty()){
    return "Hello Stranger!";
}

       StringBuilder sb= new StringBuilder(("Hello "));
      sb.append(s.get());
        return sb.toString();
    }

    public static int processValues(List<List<Integer>> data) {
      int ctr=0;
        outerloop:
        for(List<Integer> list:data){
          for(Integer num :list ){
              if(num ==0)
                  continue outerloop;
              if (num ==99)
                  break outerloop;
          }
          ctr++;
      }

        return ctr;
    }
}