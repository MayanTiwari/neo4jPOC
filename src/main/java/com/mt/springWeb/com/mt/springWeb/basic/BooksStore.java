package com.mt.springWeb.com.mt.springWeb.basic;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.*;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.relactions.*;

import com.mt.springWeb.com.mt.springWeb.basic.repo.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//        Company company = new Company();
//        company.setCompany_name("Info new");
//        company.setCorporate_identification_number("asdf");
//        State state = new State();
//        state.setName("J and K");
//        FromState fromState = new FromState();
//        fromState.setCompany(company);
//        fromState.setState(state);
//        company.setFromState(fromState);
//        companyService.save(company);

@RestController
public class BooksStore {
    String URL_Jammu = "https://api.data.gov.in/resource/f8dd5590-8843-49be-9ae2-79c5b3e23ed0?api-key=ABCD&format=json&offset=0&limit=1000";
    String URL_Raj = "https://api.data.gov.in/resource/11d4b398-3f85-4e5e-813c-fe105a17c02c?api-key=ABCD&format=json&offset=0&limit=1000";
    String URL_Chhattisgarh = "https://api.data.gov.in/resource/4081f64b-6702-46de-b380-d73edf1ca395?api-key=ABCD&format=json&offset=0&limit=1000";
    String URL_AP = "https://api.data.gov.in/resource/8173b4fa-001a-4891-9806-057d87a60fe8?api-key=ABCD&format=json&offset=0&limit=1000";

    private ObjectFactory objectFactory = new ObjectFactory();
    @Autowired
    CompanyService companyService;

    @RequestMapping(value = "/raj")
    public Object readingList() throws IOException {

        RestTemplate restTemplate = new RestTemplate();

        String test = restTemplate.getForObject(URL_Raj, String.class);
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS, false);
        PublicDataWrapper obj = objectMapper.readValue(test, PublicDataWrapper.class);
        saveItToDB(obj, "Rajasthan", "11d4b398-3f85-4e5e-813c-fe105a17c02c");
        return "{success: 'success'}";
    }

    @RequestMapping("/chh")
    public Object loadChhattisgarh() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String test = restTemplate.getForObject(URL_Chhattisgarh, String.class);
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS, false);
        PublicDataWrapper obj = objectMapper.readValue(test, PublicDataWrapper.class);
        this.saveItToDB(obj,"Chhattisgarh2","4081f64b-6702-46de-b380-d73edf1ca395");
        return "Success";
    }

    @RequestMapping("/ap")
    public Object loadAP() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String test = restTemplate.getForObject(URL_Chhattisgarh, String.class);
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).configure(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS, false);
        PublicDataWrapper obj = objectMapper.readValue(test, PublicDataWrapper.class);
        this.saveItToDB(obj,"ap","8173b4fa-001a-4891-9806-057d87a60fe8");
        return "Success";
    }


    @RequestMapping(value = "/state")
    public Object getState(@PathVariable String stateName){
        return companyService.getStateByName(stateName);
    }

    private void saveItToDB(PublicDataWrapper obj, String stateName, String stateresource) {
        if (obj != null && obj.getRecords() != null) {
            for (StateData stateData : obj.getRecords()) {
                Company company = new Company(stateData.getCompany_name());
                company.setCompany_name(stateData.getCompany_name());
                company.setCorporate_identification_number(stateData.getCorporate_identification_number());
                company.setDate_of_registration(stateData.getDate_of_registration());
                company.setAuthorized_cap(stateData.getAuthorized_cap());
                company.setAuthorized_capital(stateData.getAuthorized_capital());
                company.setEmail_addr(stateData.getEmail_addr());
                company.setLatest_year_annual_return(stateData.getLatest_year_financial_statement());
                company.setLatest_year_financial_statement(stateData.getLatest_year_financial_statement());
                company.setCompany_status(stateData.getCompany_status());
                company.setPaidup_capital(stateData.getPaidup_capital());
                company.setRegistered_office_address(stateData.getRegistered_office_address());
                company.setRegistrar_of_companies(stateData.getRegistrar_of_companies());
                company.setCompany_category(stateData.getCompany_category());
                company.setIndustrial_class(stateData.getIndustrial_class());
                //Add relactions

                State state = objectFactory.getState(stateName,stateresource);
                state.setName(stateName);
                state.setResourceID(stateresource);
                FromState fromState = new FromState();
                fromState.setState(state);
                fromState.setCompany(company);
                company.setFromState(fromState);

                CompanyCatagory companyCatagory = objectFactory.getCompanyCatagory(company.getCompany_category());
                companyCatagory.setCategory(company.getCompany_category());
                CompanyCatagoryRelation companyCatagoryRelation = new CompanyCatagoryRelation();
                companyCatagoryRelation.setCompany(company);
                companyCatagoryRelation.setCompanyCatagory(companyCatagory);
                company.setCompanyCatagoryRelation(companyCatagoryRelation);

                CompanyClass companyClass = objectFactory.getCompanyClass(stateData.getIndustrial_class());
                companyClass.setClassName(company.getIndustrial_class());
                CompanyClassRelation companyClassRelation = new CompanyClassRelation();
                companyClassRelation.setCompany(company);
                companyClassRelation.setCompanyClass(companyClass);
                company.setCompanyClassRelation(companyClassRelation);

                PrincipalBusinessCatagory principalBusinessCatagory = objectFactory.getPBC(stateData.getPrincipal_business_activity());
                principalBusinessCatagory.setPrincipalBusinessCatagory(stateData.getPrincipal_business_activity());
                PrincipalBusinessActivityRelaction principalBusinessActivityRelaction = new PrincipalBusinessActivityRelaction();
                principalBusinessActivityRelaction.setCompany(company);
                principalBusinessActivityRelaction.setPrincipalBusinessCatagory(principalBusinessCatagory);
                company.setPrincipalBusinessActivityRelaction(principalBusinessActivityRelaction);

                SubCatagory subCatagory = objectFactory.getSubCatagory(stateData.getCompany_category());
                subCatagory.setSubCatagory(stateData.getCompany_category());
                SubCatagoryRelaction subCatagoryRelaction = new SubCatagoryRelaction();
                subCatagoryRelaction.setCompany(company);
                subCatagoryRelaction.setSubCatagory(subCatagory);
                company.setSubCatagoryRelaction(subCatagoryRelaction);

                companyService.save(company);


            }
        }

    }
}