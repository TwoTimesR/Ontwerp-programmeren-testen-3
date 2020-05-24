package com.company;

public class Sergeant extends Troop {
    private FiringSquad firingSquad;

    public Sergeant(String name, FiringSquad firingSquad) {
        super(name);
        this.firingSquad = firingSquad;
    }

    public FiringSquad getFiringSquad() {
        return firingSquad;
    }

    public void setFiringSquad(FiringSquad firingSquad) {
        this.firingSquad = firingSquad;
    }

    public void orderToAim() {
        firingSquad.setAimingAtTarget(true);
    }

    public void orderToStandDown() {
        firingSquad.setAimingAtTarget(false);
    }

    public void orderToShoot() {
        if (firingSquad.getAimingAtTarget()) {
            for (int i = 0; i < firingSquad.getSoldiers().size(); i++) {
                firingSquad.getSoldiers().get(i).shootBurst(firingSquad.getTarget());
            }
        }
        else {
            System.out.println("The firing squad isn't aiming at the target");
        }
    }

    public void orderToReload() {
        for (int i = 0; i < firingSquad.getSoldiers().size(); i++) {
            firingSquad.getSoldiers().get(i).reload();
        }
    }
}
