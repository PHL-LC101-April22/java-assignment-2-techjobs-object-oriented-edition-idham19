package org.launchcode.techjobs.oo;


public class CoreCompetency extends JobField {



    public CoreCompetency(String value) {
       super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
     CoreCompetency coreCompetency = (CoreCompetency) o;
        return getId() == coreCompetency.getId();
    }
    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.
}
