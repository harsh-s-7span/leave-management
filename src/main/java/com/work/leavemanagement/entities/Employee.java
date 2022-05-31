package com.work.leavemanagement.entities;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "employee", schema = "leave_management")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "x_id", updatable = false, columnDefinition = "Binary(16)")
    private UUID uuid = UUID.randomUUID();

    @Column(name = "name")
    private String name;

    @Column(name = "designation")
    private String designation;

    @Column(name = "salary")
    private Float salary;

    @Column(name = "experience")
    private Float experience;

    @OneToOne(fetch = FetchType.EAGER)
    private Department department;

    @OneToMany(
            mappedBy = "employee",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
   // @JsonIgnore
   // @JoinColumn(name = "emp_id", referencedColumnName = "id")
    private List<Leave> leave;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "emp_id", referencedColumnName = "id")
    private List<Address> address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getExperience() {
        return experience;
    }

    public void setExperience(Float experience) {
        this.experience = experience;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Leave> getLeave() {
        return leave;
    }

    public void setLeave(List<Leave> leave) {
        this.leave = leave;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                ", department=" + department +
                ", leave=" + leave +
                ", address=" + address +
                '}';
    }
}
