/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boston.employeemanagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Zuko
 */
@Entity
@Table(name = "employee_information", catalog = "fa1", schema = "")
@NamedQueries({
    @NamedQuery(name = "EmployeeInformation.findAll", query = "SELECT e FROM EmployeeInformation e")
    , @NamedQuery(name = "EmployeeInformation.findByIdEmployeeInformation", query = "SELECT e FROM EmployeeInformation e WHERE e.idEmployeeInformation = :idEmployeeInformation")
    , @NamedQuery(name = "EmployeeInformation.findByFirstName", query = "SELECT e FROM EmployeeInformation e WHERE e.firstName = :firstName")
    , @NamedQuery(name = "EmployeeInformation.findByLastName", query = "SELECT e FROM EmployeeInformation e WHERE e.lastName = :lastName")
    , @NamedQuery(name = "EmployeeInformation.findByJobTitle", query = "SELECT e FROM EmployeeInformation e WHERE e.jobTitle = :jobTitle")
    , @NamedQuery(name = "EmployeeInformation.findByDateOfBirth", query = "SELECT e FROM EmployeeInformation e WHERE e.dateOfBirth = :dateOfBirth")
    , @NamedQuery(name = "EmployeeInformation.findByPhoneNumber", query = "SELECT e FROM EmployeeInformation e WHERE e.phoneNumber = :phoneNumber")})
public class EmployeeInformation implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEmployee_Information")
    private Integer idEmployeeInformation;
    @Column(name = "First Name")
    private String firstName;
    @Column(name = "Last Name")
    private String lastName;
    @Column(name = "Job Title")
    private String jobTitle;
    @Basic(optional = false)
    @Column(name = "Date Of Birth")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    @Basic(optional = false)
    @Column(name = "Phone Number")
    private int phoneNumber;

    public EmployeeInformation() {
    }

    public EmployeeInformation(Integer idEmployeeInformation) {
        this.idEmployeeInformation = idEmployeeInformation;
    }

    public EmployeeInformation(Integer idEmployeeInformation, Date dateOfBirth, int phoneNumber) {
        this.idEmployeeInformation = idEmployeeInformation;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Integer getIdEmployeeInformation() {
        return idEmployeeInformation;
    }

    public void setIdEmployeeInformation(Integer idEmployeeInformation) {
        Integer oldIdEmployeeInformation = this.idEmployeeInformation;
        this.idEmployeeInformation = idEmployeeInformation;
        changeSupport.firePropertyChange("idEmployeeInformation", oldIdEmployeeInformation, idEmployeeInformation);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        String oldJobTitle = this.jobTitle;
        this.jobTitle = jobTitle;
        changeSupport.firePropertyChange("jobTitle", oldJobTitle, jobTitle);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        Date oldDateOfBirth = this.dateOfBirth;
        this.dateOfBirth = dateOfBirth;
        changeSupport.firePropertyChange("dateOfBirth", oldDateOfBirth, dateOfBirth);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        int oldPhoneNumber = this.phoneNumber;
        this.phoneNumber = phoneNumber;
        changeSupport.firePropertyChange("phoneNumber", oldPhoneNumber, phoneNumber);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmployeeInformation != null ? idEmployeeInformation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeInformation)) {
            return false;
        }
        EmployeeInformation other = (EmployeeInformation) object;
        if ((this.idEmployeeInformation == null && other.idEmployeeInformation != null) || (this.idEmployeeInformation != null && !this.idEmployeeInformation.equals(other.idEmployeeInformation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.boston.employeemanagement.EmployeeInformation[ idEmployeeInformation=" + idEmployeeInformation + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
