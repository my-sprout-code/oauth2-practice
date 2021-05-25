package ssafy.com.kkyuwoo.happyhouse.domain.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ssafy.com.kkyuwoo.happyhouse.domain.address.HouseDeal;
import ssafy.com.kkyuwoo.happyhouse.dto.SidoCodeResponseDto;

import java.util.List;

@Repository
public interface HouseDealRepository extends JpaRepository<HouseDeal, Integer> {
}
