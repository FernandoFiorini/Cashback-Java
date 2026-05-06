package com.cashback.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cashback.dto.CashbackDistributionDTO;
import com.cashback.model.CashbackDistribution;

public interface CashbackDistributionRepository extends JpaRepository<CashbackDistribution, Long> {

	@Query("""
			    SELECT new com.cashback.dto.CashbackDistributionDTO(
			        c.id,
			        c.userCode,
			        c.value
			    )
			    FROM CashbackDistribution c
			    WHERE c.userCode = :userCodeParam
			""")
	CashbackDistributionDTO getByUserCode(Long userCodeParam);

	@Query("""
			    SELECT new com.cashback.dto.CashbackDistributionDTO(
			     	c.id,
			        c.userCode,
			        c.value
			    )
			    FROM CashbackDistribution c
			""")
	List<CashbackDistributionDTO> getCashbackDistribution();

	@Query("""
				 SELECT SUM(c.value)
				 FROM CashbackDistribution c
			""")
	BigDecimal getTotalCashbackDistribution();
}
