package in.mpcz.electricity_connection_management_system.consumer.service;

import java.util.List;

import in.mpcz.electricity_connection_management_system.consumer.dto.ConsumerRequestDTO;
import in.mpcz.electricity_connection_management_system.consumer.dto.ConsumerResponseDTO;

public interface ConsumerService {

	ConsumerResponseDTO createConsumer(ConsumerRequestDTO request);

	ConsumerResponseDTO getConsumerById(Long id);

	List<ConsumerResponseDTO> getAllConsumers();

	ConsumerResponseDTO updateConsumer(Long id, ConsumerRequestDTO request);

	void deleteConsumer(Long id);
	
	
}
