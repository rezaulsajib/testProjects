package api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String projectName;
    private String subProjectName;

    protected Project() {}

    public Project(String projectName, String subProjectName) {
        this.projectName = projectName;
        this.subProjectName = subProjectName;
    }

    @Override
    public String toString() {
        return String.format(
                "Project[id=%d, projectName='%s', subProjectName='%s']",
                id, projectName, subProjectName);
    }
}