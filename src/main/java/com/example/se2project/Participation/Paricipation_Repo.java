package com.example.se2project.Participation;
import com.example.se2project.Entities.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Paricipation_Repo extends JpaRepository<Participation,Integer> {

}
