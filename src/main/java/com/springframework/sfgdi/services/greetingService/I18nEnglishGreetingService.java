package com.springframework.sfgdi.services.greetingService;

import com.springframework.sfgdi.repositories.EnglishGreetingRepository;

//@Profile({"EN", "default"}) // set default for profile
//@Service("i18nService") // name service
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
