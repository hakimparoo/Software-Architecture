package edu.parinya.softarchdesign.structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members =new LinkedHashSet<>();

    void addMember(HealthcareWorkerTeam team) {
        this.members.add(team);
    }
    void addMember(HealthcareWorker name) {
        this.members.add(name);
    }
    void removeMember(HealthcareWorker name)
    {
        this.members.remove(name);
    }
    @Override
    public void service()
    {
        members.forEach( e -> {
            e.service();
        });
    }
    @Override
    public double getPrice()
    {
        double allPrice = 0.0;
        for (HealthcareServiceable healthcareWorker : members){
            allPrice += healthcareWorker.getPrice();
        }

        return allPrice;

    }

}
