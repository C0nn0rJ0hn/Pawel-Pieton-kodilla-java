package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer>
{
    @Query(nativeQuery = true)
    List<Company> retrieveCompanyWithThreeFirstChar(@Param("COMPANY_NAME_CHAR") String companyName);

    @Query(nativeQuery = true)
    List<Company> retrieveCompanyWithAnyCompanyNameFragment(@Param("KEYWORD") String keyword);
}
