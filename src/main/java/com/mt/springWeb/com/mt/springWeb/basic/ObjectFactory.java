package com.mt.springWeb.com.mt.springWeb.basic;

import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.*;
import com.mt.springWeb.com.mt.springWeb.basic.graphmodels.relactions.PrincipalBusinessActivityRelaction;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
    Map<String, Company> companyMap = new HashMap<>();
    Map<String, State> stateMap = new HashMap<>();
    Map<String, SubCatagory> subCatagoryMap = new HashMap<>();
    Map<String, CompanyCatagory> companyCatagoryMap = new HashMap<>();
    Map<String, CompanyClass> companyClassMap = new HashMap<>();
    Map<String,PrincipalBusinessCatagory> principalBusinessCatagoryMap = new HashMap<>();

    /**
     *
     * @param stateName
     * @param resourceID
     * @return
     */
    public State getState(String stateName,String resourceID){
        State state = null;
        if(this.stateMap !=null){
            state = stateMap.get(stateName);
            if(state != null){
                return state;
            }else{
                state = new State(stateName,resourceID);
                this.stateMap.putIfAbsent(stateName,state);
            }
        }
        return state;
    }
    public Company getCompany(String companyName){
        Company company = null;
        if(this.companyMap !=null){
            company = this.companyMap.get(companyName);
            if(company !=null){
                return company;
            }else{
                company = new Company(companyName);
                this.companyMap.putIfAbsent(companyName,company);

            }
        }
        return company;
    }
    public CompanyCatagory getCompanyCatagory(String catName){
        CompanyCatagory companyCatagory= null;
        if(this.companyCatagoryMap !=null){
            companyCatagory = this.companyCatagoryMap.get(catName);
            if(companyCatagory !=null){
                return companyCatagory;
            }else{
                companyCatagory = new CompanyCatagory(catName);
                this.companyCatagoryMap.putIfAbsent(catName,companyCatagory);
            }
        }
        return companyCatagory;
    }
    public SubCatagory getSubCatagory(String subCat){
        SubCatagory subCatagory = this.subCatagoryMap.get(subCat);
        if(subCatagory ==null){
            subCatagory = new SubCatagory(subCat);
            this.subCatagoryMap.putIfAbsent(subCat,subCatagory);
        }
        return subCatagory;
    }
    public PrincipalBusinessCatagory getPBC(String pbcName){
        PrincipalBusinessCatagory pbc = this.principalBusinessCatagoryMap.get(pbcName);
        if(pbc == null){
            pbc = new PrincipalBusinessCatagory(pbcName);
            this.principalBusinessCatagoryMap.putIfAbsent(pbcName,pbc);
        }
        return pbc;
    }
    public CompanyClass getCompanyClass(String className){
        CompanyClass companyClass = this.companyClassMap.get(className);
        if(companyClass == null){
            companyClass = new CompanyClass(className);
            this.companyClassMap.putIfAbsent(className,companyClass);
        }
        return companyClass;
    }

}
