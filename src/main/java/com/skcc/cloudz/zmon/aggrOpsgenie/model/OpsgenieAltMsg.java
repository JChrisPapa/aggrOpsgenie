package com.skcc.cloudz.zmon.aggrOpsgenie.model;

public class OpsgenieAltMsg {

    private String message;
    private String alias;
    private String description;

    public OpsgenieAltMsg () {
        
    }

    public OpsgenieAltMsg ( String message, String alias, String description ) {
        this.message = message;
        this.alias = alias;
        this.description = description;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias( String alias ) {
        this.alias = alias;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }
}