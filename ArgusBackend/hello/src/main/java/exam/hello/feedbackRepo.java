package exam.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface feedbackRepo extends JpaRepository<feedback, Integer> {

	@Query(value="DELETE FROM feedback WHERE uid=:uid", nativeQuery=true)
	void deleteByIdd(int uid);


}
