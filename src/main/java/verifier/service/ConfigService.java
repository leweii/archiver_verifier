package verifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import verifier.repo.ConfigRepository;

@Service
public class ConfigService {
    @Autowired
    private ConfigRepository configRepository;

    public long count() {
        return configRepository.count();
    }

}
