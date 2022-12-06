package at.fhtw.Colors.controller;

import at.fhtw.Colors.dto.Colors;
import at.fhtw.Colors.service.ColorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorsController {
    @Autowired
    private ColorsService colorsService;

    @GetMapping("/api/complementary")
    public ResponseEntity<String> colourCompliment(@RequestParam(value = "color",required = true) String color) {
        Colors colors = new Colors() {{
            setColor(color);
        }};
       return ResponseEntity.ok(colorsService.changeColor(colors));
    }

}
