package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

 @ManyToMany(mappedBy= "skills")
  private List<Job> job = new ArrayList<>();

  @NotBlank(message = "skill description")
  @Size(min = 4, max = 50)
    private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Skill() {
  }

  public List<Job> getJob() {
    return job;
  }

  public void setJob(List<Job> job) {
    this.job = job;
  }
}

