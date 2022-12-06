package at.fhtw.Colors.service;

import at.fhtw.Colors.dto.Colors;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class ColorsService {
   private static HashMap <String,String>map=new HashMap<>();
    @PostConstruct
    public void init(){

        map.put("Red","Green");
        map.put("Orange","Blue");
        map.put("Yellow","Purple");

    }
    public String changeColor(Colors colors) {
            String color = colors.getColor();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String k = entry.getKey();
                String v = entry.getValue();
                if (k.equalsIgnoreCase(color)) {
                    return v;
                } else if (v.equalsIgnoreCase(color)) {
                    return k;
                }
            }
            return "No color for the given input: "+colors.getColor();
    }

}
