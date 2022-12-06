package at.fhtw.Colors.service;

import at.fhtw.Colors.dto.Colors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;

import static org.mockito.Mockito.*;

public class ColorsServiceTest {
    @Mock
    HashMap<String, String> map;
    @InjectMocks
    ColorsService colorsService;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testInit() throws Exception {
        colorsService.init();
    }

    @Test
    public void testChangeColor() throws Exception {
        Colors colors = new Colors();
        colors.setColor("Green");
        String result = colorsService.changeColor(colors);
        Assert.assertNotNull(result);
    }
}

