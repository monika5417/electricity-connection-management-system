package in.mpcz.electricity_connection_management_system.consumer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mpcz.electricity_connection_management_system.consumer.entity.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

    Optional<Consumer> findByApplicationNumber(String applicationNumber);

    boolean existsByMobileNumber(String mobileNumber);
}