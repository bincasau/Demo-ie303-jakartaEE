package repo;

import entity.Task;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

@Repository
public interface Taskrepo1 extends CrudRepository<Task, Long> {
}
