package ro.digitalstack.betfair.session12.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtils {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("libraryPU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
