package edu.javacourse.register.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageRequest implements Serializable {
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

    public String getHusbandSurName() {
        return husbandSurName;
    }

    public void setHusbandSurName(String husbandSurName) {
        this.husbandSurName = husbandSurName;
    }

    public String getHusbandGivenName() {
        return husbandGivenName;
    }

    public void setHusbandGivenName(String husbandGivenName) {
        this.husbandGivenName = husbandGivenName;
    }

    public String getHusbandPatronymic() {
        return husbandPatronymic;
    }

    public void setHusbandPatronymic(String husbandPatronymic) {
        this.husbandPatronymic = husbandPatronymic;
    }

    public LocalDate getHusbandDateBirth() {
        return husbandDateBirth;
    }

    public void setHusbandDateBirth(LocalDate husbandDateBirth) {
        this.husbandDateBirth = husbandDateBirth;
    }

    public String getHusbandPassportSeria() {
        return husbandPassportSeria;
    }

    public void setHusbandPassportSeria(String husbandPassportSeria) {
        this.husbandPassportSeria = husbandPassportSeria;
    }

    public String getHusbandPassportNumber() {
        return husbandPassportNumber;
    }

    public void setHusbandPassportNumber(String husbandPassportNumber) {
        this.husbandPassportNumber = husbandPassportNumber;
    }

    public LocalDate getHusbandPassportIssueDater() {
        return husbandPassportIssueDater;
    }

    public void setHusbandPassportIssueDater(LocalDate husbandPassportIssueDater) {
        this.husbandPassportIssueDater = husbandPassportIssueDater;
    }

    public String getWifeSurName() {
        return wifeSurName;
    }

    public void setWifeSurName(String wifeSurName) {
        this.wifeSurName = wifeSurName;
    }

    public String getWifeGivenName() {
        return wifeGivenName;
    }

    public void setWifeGivenName(String wifeGivenName) {
        this.wifeGivenName = wifeGivenName;
    }

    public String getWifePatronymic() {
        return wifePatronymic;
    }

    public void setWifePatronymic(String wifePatronymic) {
        this.wifePatronymic = wifePatronymic;
    }

    public LocalDate getWifeDateBirth() {
        return wifeDateBirth;
    }

    public void setWifeDateBirth(LocalDate wifeDateBirth) {
        this.wifeDateBirth = wifeDateBirth;
    }

    public String getWifePassportSeria() {
        return wifePassportSeria;
    }

    public void setWifePassportSeria(String wifePassportSeria) {
        this.wifePassportSeria = wifePassportSeria;
    }

    public String getWifePassportNumber() {
        return wifePassportNumber;
    }

    public void setWifePassportNumber(String wifePassportNumber) {
        this.wifePassportNumber = wifePassportNumber;
    }

    public LocalDate getWifePassportIssueDater() {
        return wifePassportIssueDater;
    }

    public void setWifePassportIssueDater(LocalDate wifePassportIssueDater) {
        this.wifePassportIssueDater = wifePassportIssueDater;
    }

    public String getMarriageCertificateNumber() {
        return marriageCertificateNumber;
    }

    public void setMarriageCertificateNumber(String marriageCertificateNumber) {
        this.marriageCertificateNumber = marriageCertificateNumber;
    }

    public LocalDate getMarriageCertificateDater() {
        return marriageCertificateDater;
    }

    public void setMarriageCertificateDater(LocalDate marriageCertificateDater) {
        this.marriageCertificateDater = marriageCertificateDater;
    }
}
