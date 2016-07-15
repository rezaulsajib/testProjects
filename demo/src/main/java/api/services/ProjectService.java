package api.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.entity.Project;
import api.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository repo;
 
    public Project save(Project project) {
        return this.repo.save(project);
    }
}