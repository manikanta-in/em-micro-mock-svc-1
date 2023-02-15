
package eyemed.group.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

/**
 * Ekata risk analysis response
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "primaryEmailValid",
        "primaryEmailFirstSeenDays",
        "primaryEmailToName",
        "primaryEmailDomainCreationDate",
        "primaryEmailLastSeenDays",
        "ipRisk",
        "ipRiskScore",
        "ipPrimaryAddressDistance",
        "ipSecondaryAddressDistance",
        "ipLastSeenDays",
        "ipGeoLocationCountryCode",
        "ipConnectionType",
        "primaryPhoneValid",
        "primaryPhoneLineType",
        "primaryPhoneIpLastSeenDays",
        "primaryPhoneToName",
        "primaryAddressValidityLevel",
        "primaryAddressFirstSeenDays",
        "primaryAddressToName",
        "secondaryEmailValid",
        "secondaryEmailFirstSeenDays",
        "secondaryPhoneValid",
        "secondaryPhoneIpLastSeenDays",
        "secondaryAddressValidityLevel",
        "secondaryAddressFirstSeenDays",
        "secondaryAddressToName",
        "identityNetworkScore",
        "idintityRiskScore",
        "alerts",
        "warnings"
})
@Data
@Jacksonized
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EkataRiskAnalysisResponse {


    @JsonProperty("primary.email.valid")
    private Boolean primaryEmailValid;

    @JsonProperty("primary.email.first_seen_days")
    private Long primaryEmailFirstSeenDays;

    @JsonProperty("primary.email.to_name")
    private String primaryEmailToName;

    @JsonProperty("primary.email.domain_creation_date")
    private String primaryEmailDomainCreationDate;

    @JsonProperty("primary.email.last_seen_days")
    private Long primaryEmailLastSeenDays;

    @JsonProperty("ip.risk")
    private String ipRisk;

    @JsonProperty("ip.risk_score")
    private String ipRiskScore;
    /**
     * ip
     *
     */
    @JsonProperty("ipAddress")
    private String ipAddress;

    @JsonProperty("ip.primary_address_distance")
    private String ipPrimaryAddressDistance;

    @JsonProperty("ip.secondary_address_distance")
    private String ipSecondaryAddressDistance;

    @JsonProperty("ip.last_seen_days")
    private Long ipLastSeenDays;

    @JsonProperty("ip.geolocation_country_code")
    private String ipGeoLocationCountryCode;

    @JsonProperty("ip.connection_type")
    private String ipConnectionType;

    @JsonProperty("primary.phone.valid")
    private String primaryPhoneValid;

    @JsonProperty("primary.phone.line_type")
    private String primaryPhoneLineType;

    @JsonProperty("primary.phone.ip.last_seen_days")
    private String primaryPhoneIpLastSeenDays;

    @JsonProperty("primary.phone.to_name")
    private String primaryPhoneToName;
    

    @JsonProperty("primary.phone.carrier")
    private String primaryPhoneCarrier;
    
    @JsonProperty("primary.address.validity_level")
    private String primaryAddressValidityLevel;

    @JsonProperty("primary.address.first_seen_days")
    private String primaryAddressFirstSeenDays;

    @JsonProperty("primary.address.to_name")
    private String primaryAddressToName;

    @JsonProperty("secondary.email.valid")
    private String secondaryEmailValid;

    @JsonProperty("secondary.email.first_seen_days")
    private String secondaryEmailFirstSeenDays;

    @JsonProperty("secondary.phone.valid")
    private String secondaryPhoneValid;

    @JsonProperty("secondary.phone.ip.last_seen_days")
    private String secondaryPhoneIpLastSeenDays;

    @JsonProperty("secondary.address.validity_level")
    private String secondaryAddressValidityLevel;

    @JsonProperty("secondary.address.first_seen_days")
    private String secondaryAddressFirstSeenDays;

    @JsonProperty("secondary.address.to_name")
    private String secondaryAddressToName;

    @JsonProperty("identity_network_score")
    private String identityNetworkScore;

    @JsonProperty("identity_risk_score")
    private String idintityRiskScore;

    @JsonProperty("alerts")
    @Valid
    private List<Object> alerts = new ArrayList<Object>();

    @JsonProperty("warnings")
    @Valid
    private List<Object> warnings = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}

