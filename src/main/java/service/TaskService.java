package service;

import entity.Task;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import repo.TaskRepo2;

import java.util.List;

@ApplicationScoped
public class TaskService {

    @Inject
    TaskRepo2 repo;

    @Transactional
    public void add(String title) {
        Task t = new Task();
        t.title = title;
        repo.save(t);
    }

    public List<Task> getAll() {
        return repo.findAll();
    }

//    public Iterable<Task> getAll() {
//        return (Iterable<Task>) repo.findAll();
//    }

    @Transactional
    public void updateStatus(Long id, boolean completed) {
        Task t = repo.findById(id);
        if (t != null) {
            t.completed = completed;
        }
    }
//    @Transactional
//    public void updateStatus(Long id, boolean completed) {
//        repo.findById(id).ifPresent(t -> {
//            t.completed = completed;
//            repo.save(t);
//        });
//    }
}