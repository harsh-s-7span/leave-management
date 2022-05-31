package com.work.leavemanagement.dao.custom;

import com.work.leavemanagement.dto.SearchDto;
import com.work.leavemanagement.entities.Employee;
import com.work.leavemanagement.entities.Leave;
import com.work.leavemanagement.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomLeaveDaoImpl implements CustomLeaveDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Leave> searchLeave(SearchDto searchDto, Employee employee){

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Leave> criteriaQuery = criteriaBuilder.createQuery(Leave.class);

        Root<Leave> leaveRoot = criteriaQuery.from(Leave.class);
        List<Predicate> predicates = new ArrayList<>();

        if(searchDto.getLeaveType() != null){
            predicates.add(criteriaBuilder.equal(leaveRoot.get("type"), searchDto.getLeaveType()));
        }
        if(searchDto.getStartDate() != null){
            predicates.add(criteriaBuilder.equal(leaveRoot.get("fromDate"), searchDto.getStartDate()));
        }
        if(searchDto.getEndDate() != null){
            predicates.add(criteriaBuilder.equal(leaveRoot.get("toDate"), searchDto.getEndDate()));
        }
        if(searchDto.getLeaveStatus() != null){
            predicates.add(criteriaBuilder.equal(leaveRoot.get("status"), searchDto.getLeaveStatus()));
        }
        if(searchDto.getEmpId() != null){
            predicates.add(criteriaBuilder.equal(leaveRoot.get("employee"), employee));
        }

        criteriaQuery.where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
