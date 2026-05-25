package DAO;

import MODEL.Language;

/**
 * DAO específico para la entidad Language.
 *
 * Hereda de GenericDAO para tener CRUD completo sin repetir código.
 */
public class LanguageDAO extends GenericDAO<Language> {

    /**
     * Constructor que indica al DAO genérico qué entidad debe manejar.
     */
    public LanguageDAO() {
        super(Language.class);
    }
}
