package com.mt.springWeb.com.mt.springWeb.basic.graphmodels;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.relactions.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Company {
    @Id
    @GeneratedValue
    private Long id;

    private String registrar_of_companies;
    private String registered_office_address;

    public String getCorporate_identification_number() {
        return corporate_identification_number;
    }

    public void setCorporate_identification_number(String corporate_identification_number) {
        this.corporate_identification_number = corporate_identification_number;
    }

    public String getDate_of_registration() {
        return date_of_registration;
    }

    public void setDate_of_registration(String date_of_registration) {
        this.date_of_registration = date_of_registration;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    private String corporate_identification_number;
    private String date_of_registration;

    public Company(String company_name) {
        this.company_name = company_name;
    }
    public void Company(){}

    private String company_name;

    public FromState getFromState() {
        return fromState;
    }

    public void setFromState(FromState fromState) {
        this.fromState = fromState;
    }

    private String company_status;


    private String _date_of_registration;
    private String authorized_cap;
    private String industrial_class;
    private String principal_business_activity_as_per_cin;
    private String email_addr;
    private String latest_year_annual_return;
    private String latest_year_financial_statement;
    private String  authorized_capital;
    private String paidup_capital;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    @Relationship(type = "FROM_STATE",direction = Relationship.OUTGOING)
    private FromState fromState;

    @JsonIgnore
    @Relationship(type = "CCLASS",direction = Relationship.OUTGOING)
    private CompanyClassRelation companyClassRelation;

    @JsonIgnore
    @Relationship(type = "PBC",direction = Relationship.OUTGOING)
    private PrincipalBusinessActivityRelaction principalBusinessActivityRelaction;

    @JsonIgnore
    @Relationship(type = "SUB_CATAGORY",direction = Relationship.OUTGOING)
    private SubCatagoryRelaction subCatagoryRelaction;


    @JsonIgnore
    @Relationship(type = "CRELATION",direction = Relationship.OUTGOING)
    private CompanyCatagoryRelation companyCatagoryRelation;

    //RELACTIONSHIPS

    public String getRegistrar_of_companies() {
        return registrar_of_companies;
    }

    public void setRegistrar_of_companies(String registrar_of_companies) {
        this.registrar_of_companies = registrar_of_companies;
    }

    public String getRegistered_office_address() {
        return registered_office_address;
    }

    public void setRegistered_office_address(String registered_office_address) {
        this.registered_office_address = registered_office_address;
    }

    public String getCompany_status() {
        return company_status;
    }

    public void setCompany_status(String company_status) {
        this.company_status = company_status;
    }

    public String get_date_of_registration() {
        return _date_of_registration;
    }

    public void set_date_of_registration(String _date_of_registration) {
        this._date_of_registration = _date_of_registration;
    }

    public String getAuthorized_cap() {
        return authorized_cap;
    }

    public void setAuthorized_cap(String authorized_cap) {
        this.authorized_cap = authorized_cap;
    }

    public String getIndustrial_class() {
        return industrial_class;
    }

    public void setIndustrial_class(String industrial_class) {
        this.industrial_class = industrial_class;
    }

    public String getPrincipal_business_activity_as_per_cin() {
        return principal_business_activity_as_per_cin;
    }

    public void setPrincipal_business_activity_as_per_cin(String principal_business_activity_as_per_cin) {
        this.principal_business_activity_as_per_cin = principal_business_activity_as_per_cin;
    }

    public String getEmail_addr() {
        return email_addr;
    }

    public void setEmail_addr(String email_addr) {
        this.email_addr = email_addr;
    }

    public String getLatest_year_annual_return() {
        return latest_year_annual_return;
    }

    public void setLatest_year_annual_return(String latest_year_annual_return) {
        this.latest_year_annual_return = latest_year_annual_return;
    }

    public String getLatest_year_financial_statement() {
        return latest_year_financial_statement;
    }

    public void setLatest_year_financial_statement(String latest_year_financial_statement) {
        this.latest_year_financial_statement = latest_year_financial_statement;
    }

    public String getAuthorized_capital() {
        return authorized_capital;
    }

    public void setAuthorized_capital(String authorized_capital) {
        this.authorized_capital = authorized_capital;
    }

    public String getPaidup_capital() {
        return paidup_capital;
    }

    public void setPaidup_capital(String paidup_capital) {
        this.paidup_capital = paidup_capital;
    }

    public CompanyClassRelation getCompanyClassRelation() {
        return companyClassRelation;
    }

    public void setCompanyClassRelation(CompanyClassRelation companyClassRelation) {
        this.companyClassRelation = companyClassRelation;
    }

    public PrincipalBusinessActivityRelaction getPrincipalBusinessActivityRelaction() {
        return principalBusinessActivityRelaction;
    }

    public void setPrincipalBusinessActivityRelaction(PrincipalBusinessActivityRelaction principalBusinessActivityRelaction) {
        this.principalBusinessActivityRelaction = principalBusinessActivityRelaction;
    }

    public SubCatagoryRelaction getSubCatagoryRelaction() {
        return subCatagoryRelaction;
    }

    public void setSubCatagoryRelaction(SubCatagoryRelaction subCatagoryRelaction) {
        this.subCatagoryRelaction = subCatagoryRelaction;
    }

    public CompanyCatagoryRelation getCompanyCatagoryRelation() {
        return companyCatagoryRelation;
    }

    public void setCompanyCatagoryRelation(CompanyCatagoryRelation companyCatagoryRelation) {
        this.companyCatagoryRelation = companyCatagoryRelation;
    }

    public String getCompany_category() {
        return company_category;
    }

    public void setCompany_category(String company_category) {
        this.company_category = company_category;
    }

    //    private String principal_business_activity;
//    private String sub_category;
//    private String company_sub_category;
    //    private String company_class;
    private String company_category;
}

