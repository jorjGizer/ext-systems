package edu.javacourse.register.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageResponse implements Serializable {
    private String husbandSurName;
    private String husbandGivenName;
    private String husbandPatronymic;
    private LocalDate husbandDateBirth;
    private String husbandPassportSeria;
    private String husbandPassportNumber;
    private LocalDate husbandPassportIssueDater;
    private String wifeSurName;
    private String wifeGivenName;
    private String wifePatronymic;
    private LocalDate wifeDateBirth;
    private String wifePassportSeria;
    private String wifePassportNumber;
    private LocalDate wifePassportIssueDater;
    private String marriageCertificateNumber;
    private LocalDate marriageCertificateDater;
}
