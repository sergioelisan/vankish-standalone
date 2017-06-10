package kod.license;

import java.io.Serializable;

public class Licenca
        implements Serializable {
    private boolean validate = false;
    private String[] seriais = {
            "CRDM-82AM-GM74-74H3",
            "H35K-7RCK-HQA3-HODS",
            "C48K-A2GM-HQE3-8454",
            "DOCK-A4HS-JKA2-GMDR",
            "HKCQ-8O83-DQ84-725K",
            "G473-A37M-5283-E38M",
            "G454-D45K-ARAK-8SCR",
            "72A2-HRGO-C4DR-AK7O",
            "CQA3-AKA2-C2A2-GQ8K",
            "DMCM-A4JR-EQ8M-DK74",
            "5QGM-8OHO-D47O-AK5K",
            "D48T-A2GT-8R54-HOA3",
            "5O7Q-C4C3-GOCK-CT5O",
            "HQA2-835Q-7K5M-JODT",
            "8ODT-EMER-84HM-DSHM",
            "C3J3-H37S-C2AS-ASAT",
            "DM7K-5SCM-7QJR-HKHS",
            "JKGM-AOER-HSAK-AKHS",
            "DKCK-EOAS-C3A3-DO5R",
            "E2J3-GK8S-728K-537O",
            "8272-7SEK-HSEO-AS7K",
            "8K5O-5ODM-DK7Q-CKCT",
            "8MHM-7KE3-DRAK-AK73",
            "8SJM-A4HO-EOA4-AR8T",
            "73CM-AREK-D473-EO8T",
            "C2A4-H4ES-JKES-C4ER",
            "A25O-JKCK-5K72-HMDS",
            "E252-GMH3-JTER-5Q8Q",
            "HM5R-CR8S-7O8M-EKH2",
            "J2E3-E48O-HMGR-8R7Q",
            "CQ8M-DQDS-JM7O-AKGR"};

    public Licenca(boolean status) {
        validate = status;
    }


    public Licenca() {
    }


    public String[] getSerial() {
        return seriais;
    }


    public boolean isValidate() {
        return validate;
    }


    public void setValidate(boolean validate) {
        this.validate = validate;
    }


    public boolean equals(String serial) {
        for (int i = 0; i <= seriais.length; i++)
            if (seriais[i].equals(serial))
                return true;
        return false;
    }
}
