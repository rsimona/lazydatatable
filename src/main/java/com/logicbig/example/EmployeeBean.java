package com.logicbig.example;

import org.primefaces.model.LazyDataModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class EmployeeBean {
    EmployeeLazyDataModel dataModel = new EmployeeLazyDataModel();

    public LazyDataModel<Employee> getModel() {
        return dataModel;
    }
}