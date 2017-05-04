package com.zillion.esra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jessethouin on 5/4/17.
 *
 */
@RestController
public class ESRAMockController {

    @RequestMapping("/esra/fulfillment")
    public String getFulfillmentParameters() {
        return "{ \"some key\" : \"some value\"}";
    }

}
