package org.vtec.investigador.core.config;

public enum InvestigadorProfiles {

    DEV("dev");

    private final String profileName;

    InvestigadorProfiles(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
