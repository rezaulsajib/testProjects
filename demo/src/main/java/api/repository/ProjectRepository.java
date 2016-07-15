package api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    List<Project> findByProjectName(String projectName);
}