package com.cashback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cashback.dto.CashbackCampaignDTO;
import com.cashback.model.Cashback;

public interface CashbackRepository extends JpaRepository<Cashback, Long> {

	@Query("""
			    SELECT new com.cashback.dto.CashbackCampaignDTO(
			        c.id,
			        c.campaignName,
			        c.startDate,
			        c.endDate,
			        r.minimumValue,
			        r.cashbackPercentage
			    )
			    FROM Cashback c
			    JOIN c.rules r
			    WHERE current_timestamp BETWEEN c.startDate AND c.endDate
			""")
	List<CashbackCampaignDTO> getAllActiveCashbacks();
}
