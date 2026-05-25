package DAO;

import CONFIG.HibernateUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

/**
 * DAO genérico para reutilizar las operaciones CRUD básicas.
 *
 * T representa la entidad con la que se trabaja:
 * User, Snippet, Language, Category o Tag.
 */
public class GenericDAO<T> {

    // Clase de la entidad que manejará este DAO.
    private final Class<T> entityClass;

    /**
     * Constructor del DAO genérico.
     *
     * @param entityClass clase de la entidad
     */
    public GenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    /**
     * Guarda una entidad en la base de datos.
     *
     * @param entity entidad que se quiere guardar
     */
    public void save(T entity) {
        EntityManager em = HibernateUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(entity);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }
}
