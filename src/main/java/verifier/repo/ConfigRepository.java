package verifier.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import verifier.entity.RCConfig;

@Repository
public interface ConfigRepository extends JpaRepository<RCConfig, Long> {

    RCConfig findByKey(String key);
}
