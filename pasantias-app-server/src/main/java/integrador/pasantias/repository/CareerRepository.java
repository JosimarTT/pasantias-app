package integrador.pasantias.repository;

import integrador.pasantias.model.Career;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CareerRepository extends JpaRepository<Career, Long> {
	List<Career> findByIdIn(List<Long> careerIds);

	Optional<Career> findByCareer(String career);
}
