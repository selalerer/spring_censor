package com.selalerer.spring_censor;

import com.selalerer.censor.Censor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = CensorConfig.class)
public class CensorConfigTest {
    @Autowired
    private Censor censor;

    @Test
    public void censorCreated() {
        assertNotNull(censor);
    }

    @Test
    public void censorFunctioningWell() {
        censor.censor("x645kvfd@Gfgr");
        var input = "Logging in as user: jery, password: x645kvfd@Gfgr";
        var output = censor.edit(input);
        var expected = "Logging in as user: jery, password: ****";
        assertEquals(expected, output);
    }
}