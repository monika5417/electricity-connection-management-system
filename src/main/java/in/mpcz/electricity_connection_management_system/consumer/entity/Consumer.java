package in.mpcz.electricity_connection_management_system.consumer.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import in.mpcz.electricity_connection_management_system.common.enums.ConnectionStatus;
import in.mpcz.electricity_connection_management_system.common.enums.ConnectionType;
import in.mpcz.electricity_connection_management_system.common.enums.LoadUnit;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ECMS_CONSUMER")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consumer_seq_generator")
    @SequenceGenerator(
            name = "consumer_seq_generator",
            sequenceName = "ECMS_CONSUMER_SEQ",
            allocationSize = 1)
    private Long id;

    @Column(name = "APPLICATION_NUMBER", nullable = false, unique = true, length = 30)
    private String applicationNumber;

    @Column(name = "CONSUMER_NAME", nullable = false, length = 100)
    private String consumerName;

    @Column(name = "FATHER_NAME", nullable = false, length = 100)
    private String fatherName;

    @Column(name = "MOBILE_NUMBER", nullable = false, length = 10)
    private String mobileNumber;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "ADDRESS", nullable = false, length = 300)
    private String address;

    @Column(name = "CITY", nullable = false, length = 50)
    private String city;

    @Column(name = "DISTRICT", nullable = false, length = 50)
    private String district;

    @Column(name = "STATE", nullable = false, length = 50)
    private String state;

    @Column(name = "PINCODE", nullable = false, length = 6)
    private String pincode;

    @Column(name = "LOAD_REQUIRED", nullable = false, precision = 10, scale = 2)
    private BigDecimal loadRequired;

    @Enumerated(EnumType.STRING)
    @Column(name = "LOAD_UNIT", nullable = false)
    private LoadUnit loadUnit;

    @Enumerated(EnumType.STRING)
    @Column(name = "CONNECTION_TYPE", nullable = false)
    private ConnectionType connectionType;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    private ConnectionStatus status;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }
}