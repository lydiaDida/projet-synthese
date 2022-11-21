package ca.bdeb.projetsynthese.services;

import ca.bdeb.projetsynthese.dao.IConfigRepository;
import ca.bdeb.projetsynthese.models.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConfigService {
    @Autowired
    private IConfigRepository repository;

    // get config by user email
    public Config getByEmail(String email) {
        // the first is the default config
        Config defaultConfig = repository.findById(1).get();
        // user's config
        Config userConfig = repository.findByUserEmail(email);
        // if user doesn't have a config, then add the default config for him
        if (userConfig == null) {
            userConfig = defaultConfig;
            userConfig.setUserEmail(email);
        }
        return userConfig;
    }

    // modify config
    public Config update(Config newConfig) {
        Config config = repository.findByUserEmail(newConfig.getUserEmail());
        if (config == null) {
            // add config if it is not exist
            return repository.save(newConfig);
        } else {
            // update config if it exists
           config = newConfig;
           return repository.save(config);
        }
    }

    // delete config
    public Config reset(String email){
        Config defaultConfig = repository.findById(1).get();
        Config config = repository.findByUserEmail(email);
        if (config != null) {
            // reset config
            config = defaultConfig;
            repository.save(config);
        }
        return defaultConfig;
    }
}
