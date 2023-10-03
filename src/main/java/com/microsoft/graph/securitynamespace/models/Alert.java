// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.security.models.Dictionary;
import com.microsoft.graph.security.models.AlertClassification;
import com.microsoft.graph.security.models.AlertComment;
import com.microsoft.graph.security.models.DetectionSource;
import com.microsoft.graph.security.models.AlertDetermination;
import com.microsoft.graph.security.models.AlertEvidence;
import com.microsoft.graph.security.models.ServiceSource;
import com.microsoft.graph.security.models.AlertSeverity;
import com.microsoft.graph.security.models.AlertStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert.
 */
public class Alert extends Entity implements IJsonBackedObject {


    /**
     * The Actor Display Name.
     * The adversary or activity group that is associated with this alert.
     */
    @SerializedName(value = "actorDisplayName", alternate = {"ActorDisplayName"})
    @Expose
	@Nullable
    public String actorDisplayName;

    /**
     * The Additional Data.
     * 
     */
    @SerializedName(value = "additionalData", alternate = {"AdditionalData"})
    @Expose
	@Nullable
    public Dictionary additionalData;

    /**
     * The Alert Policy Id.
     * 
     */
    @SerializedName(value = "alertPolicyId", alternate = {"AlertPolicyId"})
    @Expose
	@Nullable
    public String alertPolicyId;

    /**
     * The Alert Web Url.
     * URL for the alert page in the Microsoft 365 Defender portal.
     */
    @SerializedName(value = "alertWebUrl", alternate = {"AlertWebUrl"})
    @Expose
	@Nullable
    public String alertWebUrl;

    /**
     * The Assigned To.
     * Owner of the alert, or null if no owner is assigned.
     */
    @SerializedName(value = "assignedTo", alternate = {"AssignedTo"})
    @Expose
	@Nullable
    public String assignedTo;

    /**
     * The Category.
     * The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&amp;CK framework.
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public String category;

    /**
     * The Classification.
     * Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive, informationalExpectedActivity, unknownFutureValue.
     */
    @SerializedName(value = "classification", alternate = {"Classification"})
    @Expose
	@Nullable
    public AlertClassification classification;

    /**
     * The Comments.
     * Array of comments created by the Security Operations (SecOps) team during the alert management process.
     */
    @SerializedName(value = "comments", alternate = {"Comments"})
    @Expose
	@Nullable
    public java.util.List<AlertComment> comments;

    /**
     * The Created Date Time.
     * Time when Microsoft 365 Defender created the alert.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * String value describing each alert.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Detection Source.
     * Detection technology or sensor that identified the notable component or activity. Possible values are: unknown, microsoftDefenderForEndpoint, antivirus, smartScreen, customTi, microsoftDefenderForOffice365, automatedInvestigation, microsoftThreatExperts, customDetection, microsoftDefenderForIdentity, cloudAppSecurity, microsoft365Defender, azureAdIdentityProtection, manual, microsoftDataLossPrevention, appGovernancePolicy, appGovernanceDetection, unknownFutureValue, microsoftDefenderForCloud. You must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: microsoftDefenderForCloud.
     */
    @SerializedName(value = "detectionSource", alternate = {"DetectionSource"})
    @Expose
	@Nullable
    public DetectionSource detectionSource;

    /**
     * The Detector Id.
     * The ID of the detector that triggered the alert.
     */
    @SerializedName(value = "detectorId", alternate = {"DetectorId"})
    @Expose
	@Nullable
    public String detectorId;

    /**
     * The Determination.
     * Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
     */
    @SerializedName(value = "determination", alternate = {"Determination"})
    @Expose
	@Nullable
    public AlertDetermination determination;

    /**
     * The Evidence.
     * Collection of evidence related to the alert.
     */
    @SerializedName(value = "evidence", alternate = {"Evidence"})
    @Expose
	@Nullable
    public java.util.List<AlertEvidence> evidence;

    /**
     * The First Activity Date Time.
     * The earliest activity associated with the alert.
     */
    @SerializedName(value = "firstActivityDateTime", alternate = {"FirstActivityDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime firstActivityDateTime;

    /**
     * The Incident Id.
     * Unique identifier to represent the incident this alert resource is associated with.
     */
    @SerializedName(value = "incidentId", alternate = {"IncidentId"})
    @Expose
	@Nullable
    public String incidentId;

    /**
     * The Incident Web Url.
     * URL for the incident page in the Microsoft 365 Defender portal.
     */
    @SerializedName(value = "incidentWebUrl", alternate = {"IncidentWebUrl"})
    @Expose
	@Nullable
    public String incidentWebUrl;

    /**
     * The Last Activity Date Time.
     * The oldest activity associated with the alert.
     */
    @SerializedName(value = "lastActivityDateTime", alternate = {"LastActivityDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastActivityDateTime;

    /**
     * The Last Update Date Time.
     * Time when the alert was last updated at Microsoft 365 Defender.
     */
    @SerializedName(value = "lastUpdateDateTime", alternate = {"LastUpdateDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdateDateTime;

    /**
     * The Mitre Techniques.
     * The attack techniques, as aligned with the MITRE ATT&amp;CK framework.
     */
    @SerializedName(value = "mitreTechniques", alternate = {"MitreTechniques"})
    @Expose
	@Nullable
    public java.util.List<String> mitreTechniques;

    /**
     * The Provider Alert Id.
     * The ID of the alert as it appears in the security provider product that generated the alert.
     */
    @SerializedName(value = "providerAlertId", alternate = {"ProviderAlertId"})
    @Expose
	@Nullable
    public String providerAlertId;

    /**
     * The Recommended Actions.
     * Recommended response and remediation actions to take in the event this alert was generated.
     */
    @SerializedName(value = "recommendedActions", alternate = {"RecommendedActions"})
    @Expose
	@Nullable
    public String recommendedActions;

    /**
     * The Resolved Date Time.
     * Time when the alert was resolved.
     */
    @SerializedName(value = "resolvedDateTime", alternate = {"ResolvedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime resolvedDateTime;

    /**
     * The Service Source.
     * The service or product that created this alert. Possible values are: unknown, microsoftDefenderForEndpoint, microsoftDefenderForIdentity, microsoftDefenderForCloudApps, microsoftDefenderForOffice365, microsoft365Defender, azureAdIdentityProtection, microsoftAppGovernance, dataLossPrevention, unknownFutureValue, microsoftDefenderForCloud. You must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: microsoftDefenderForCloud.
     */
    @SerializedName(value = "serviceSource", alternate = {"ServiceSource"})
    @Expose
	@Nullable
    public ServiceSource serviceSource;

    /**
     * The Severity.
     * Indicates the possible impact on assets. The higher the severity the bigger the impact. Typically higher severity items require the most immediate attention. Possible values are: unknown, informational, low, medium, high, unknownFutureValue.
     */
    @SerializedName(value = "severity", alternate = {"Severity"})
    @Expose
	@Nullable
    public AlertSeverity severity;

    /**
     * The Status.
     * The status of the alert. Possible values are: new, inProgress, resolved, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public AlertStatus status;

    /**
     * The Tenant Id.
     * The Azure Active Directory tenant the alert was created in.
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;

    /**
     * The Threat Display Name.
     * The threat associated with this alert.
     */
    @SerializedName(value = "threatDisplayName", alternate = {"ThreatDisplayName"})
    @Expose
	@Nullable
    public String threatDisplayName;

    /**
     * The Threat Family Name.
     * Threat family associated with this alert.
     */
    @SerializedName(value = "threatFamilyName", alternate = {"ThreatFamilyName"})
    @Expose
	@Nullable
    public String threatFamilyName;

    /**
     * The Title.
     * Brief identifying string value describing the alert.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
