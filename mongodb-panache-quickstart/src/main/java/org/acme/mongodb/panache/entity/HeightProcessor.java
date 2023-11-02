package org.acme.mongodb.panache.entity;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.context.ManagedExecutor;

@ApplicationScoped
public class HeightProcessor implements IHeightProcessor {

    //Removing the ManagedExecutor fixes the problem
    @Inject
    ManagedExecutor managedExecutor;
    public void convertInchesToCm(){

    }
}
