package DAO;

import MODEL.Category;

/**
 * DAO específico para la entidad Category.
 *
 * Hereda de GenericDAO para tener CRUD completo sin repetir código.
 */
public class CategoryDAO extends GenericDAO<Category> {

    /**
     * Constructor que indica al DAO genérico qué entidad debe manejar.
     */
    public CategoryDAO() {
        super(Category.class);
    }
}
