package edu.javacourse.register.business;

import edu.javacourse.register.dao.MarriageDao;
import edu.javacourse.register.dao.PersonDao;
import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.rest.MarriageController;
import edu.javacourse.register.view.MarriageRequest;
import edu.javacourse.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarriageManager {

    private MarriageDao marriageDao;
    private PersonDao personDao;
    @Autowired
    public MarriageManager(PersonDao personDao) {
        this.personDao = personDao;
    }
    @Autowired
    public void setMarriageDao(MarriageDao marriageDao) {
        this.marriageDao = marriageDao;
    }
    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);
    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called ");
        MarriageCertificate cert = marriageDao.findMarriageCertificate(request);
        return new MarriageResponse();
    }
}
