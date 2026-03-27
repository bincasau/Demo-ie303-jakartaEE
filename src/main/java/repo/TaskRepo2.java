package repo;

import entity.Task;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@ApplicationScoped
public class TaskRepo2 {
    @PersistenceContext
    EntityManager em;

    public void save(Task task) {
        em.persist(task);
    }

    public Task findById(Long id) {
        return em.find(Task.class, id);
    }

    public List<Task> findAll() {
        return em.createQuery(
                "SELECT t FROM Task t", Task.class
        ).getResultList();
    }
}
