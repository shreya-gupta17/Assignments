package com.capgemini.corejavalab6;

import java.util.HashMap;
import java.util.Set;
public class EX4
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> stu = new HashMap<>();
              EX4 p = new EX4();
             
              stu.put("R14",75);
              stu.put("R13",66);
              stu.put("R10",94);
              stu.put("R11",90);
              stu.put("R12",87);
              System.out.println(p.getStudent(stu));
       }
}