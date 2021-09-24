package repository;

import org.springframework.data.repository.CrudRepository;

import model.Lecture;

public interface LectureRepository extends CrudRepository<Lecture, Long>{

}
