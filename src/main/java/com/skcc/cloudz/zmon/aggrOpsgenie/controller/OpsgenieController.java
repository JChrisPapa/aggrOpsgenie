package com.skcc.cloudz.zmon.aggrOpsgenie.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.cloudz.zmon.aggrOpsgenie.model.OpsgenieAltMsg;

@RestController
public class OpsgenieController {

    @PostMapping(path = "/alerts")
    public String alertOpsgenieMsg(@RequestBody OpsgenieAltMsg altMsg) {

        /* You can write your DAO logic here.
         * For time being I am printing the customer data just to show the POST call is working.
         */

        return "Opsgenie Alert Message information saved successfully ::." + altMsg.getMessage() + " " + altMsg.getAlias() + " " + altMsg.getDescription();
    }
}