// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.VppToken;
import com.microsoft.graph.models.extensions.AndroidManagedAppProtection;
import com.microsoft.graph.models.extensions.DefaultManagedAppProtection;
import com.microsoft.graph.models.extensions.IosManagedAppProtection;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.models.extensions.ManagedAppStatus;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicy;
import com.microsoft.graph.models.extensions.TargetedManagedAppConfiguration;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionPolicy;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedEBookCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileAppCollectionPage;
import com.microsoft.graph.requests.extensions.VppTokenCollectionResponse;
import com.microsoft.graph.requests.extensions.VppTokenCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionCollectionResponse;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionCollectionPage;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionResponse;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionCollectionPage;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionResponse;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionPage;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management.
 */
public class DeviceAppManagement extends Entity implements IJsonBackedObject {


    /**
     * The Is Enabled For Microsoft Store For Business.
     * Whether the account is enabled for syncing applications from the Microsoft Store for Business.
     */
    @SerializedName("isEnabledForMicrosoftStoreForBusiness")
    @Expose
    public Boolean isEnabledForMicrosoftStoreForBusiness;

    /**
     * The Microsoft Store For Business Language.
     * The locale information used to sync applications from the Microsoft Store for Business. Cultures that are specific to a country/region. The names of these cultures follow RFC 4646 (Windows Vista and later). The format is -&amp;lt;country/regioncode2&amp;gt;, where  is a lowercase two-letter code derived from ISO 639-1 and &amp;lt;country/regioncode2&amp;gt; is an uppercase two-letter code derived from ISO 3166. For example, en-US for English (United States) is a specific culture.
     */
    @SerializedName("microsoftStoreForBusinessLanguage")
    @Expose
    public String microsoftStoreForBusinessLanguage;

    /**
     * The Microsoft Store For Business Last Completed Application Sync Time.
     * The last time an application sync from the Microsoft Store for Business was completed.
     */
    @SerializedName("microsoftStoreForBusinessLastCompletedApplicationSyncTime")
    @Expose
    public java.util.Calendar microsoftStoreForBusinessLastCompletedApplicationSyncTime;

    /**
     * The Microsoft Store For Business Last Successful Sync Date Time.
     * The last time the apps from the Microsoft Store for Business were synced successfully for the account.
     */
    @SerializedName("microsoftStoreForBusinessLastSuccessfulSyncDateTime")
    @Expose
    public java.util.Calendar microsoftStoreForBusinessLastSuccessfulSyncDateTime;

    /**
     * The Managed EBooks.
     * The Managed eBook.
     */
    public ManagedEBookCollectionPage managedEBooks;

    /**
     * The Mobile App Categories.
     * The mobile app categories.
     */
    public MobileAppCategoryCollectionPage mobileAppCategories;

    /**
     * The Mobile App Configurations.
     * The Managed Device Mobile Application Configurations.
     */
    public ManagedDeviceMobileAppConfigurationCollectionPage mobileAppConfigurations;

    /**
     * The Mobile Apps.
     * The mobile apps.
     */
    public MobileAppCollectionPage mobileApps;

    /**
     * The Vpp Tokens.
     * List of Vpp tokens for this organization.
     */
    public VppTokenCollectionPage vppTokens;

    /**
     * The Android Managed App Protections.
     * Android managed app policies.
     */
    public AndroidManagedAppProtectionCollectionPage androidManagedAppProtections;

    /**
     * The Default Managed App Protections.
     * Default managed app policies.
     */
    public DefaultManagedAppProtectionCollectionPage defaultManagedAppProtections;

    /**
     * The Ios Managed App Protections.
     * iOS managed app policies.
     */
    public IosManagedAppProtectionCollectionPage iosManagedAppProtections;

    /**
     * The Managed App Policies.
     * Managed app policies.
     */
    public ManagedAppPolicyCollectionPage managedAppPolicies;

    /**
     * The Managed App Registrations.
     * The managed app registrations.
     */
    public ManagedAppRegistrationCollectionPage managedAppRegistrations;

    /**
     * The Managed App Statuses.
     * The managed app statuses.
     */
    public ManagedAppStatusCollectionPage managedAppStatuses;

    /**
     * The Mdm Windows Information Protection Policies.
     * Windows information protection for apps running on devices which are MDM enrolled.
     */
    public MdmWindowsInformationProtectionPolicyCollectionPage mdmWindowsInformationProtectionPolicies;

    /**
     * The Targeted Managed App Configurations.
     * Targeted managed app configurations.
     */
    public TargetedManagedAppConfigurationCollectionPage targetedManagedAppConfigurations;

    /**
     * The Windows Information Protection Policies.
     * Windows information protection for apps running on devices which are not MDM enrolled.
     */
    public WindowsInformationProtectionPolicyCollectionPage windowsInformationProtectionPolicies;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("managedEBooks")) {
            final ManagedEBookCollectionResponse response = new ManagedEBookCollectionResponse();
            if (json.has("managedEBooks@odata.nextLink")) {
                response.nextLink = json.get("managedEBooks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedEBooks").toString(), JsonObject[].class);
            final ManagedEBook[] array = new ManagedEBook[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedEBook.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedEBooks = new ManagedEBookCollectionPage(response, null);
        }

        if (json.has("mobileAppCategories")) {
            final MobileAppCategoryCollectionResponse response = new MobileAppCategoryCollectionResponse();
            if (json.has("mobileAppCategories@odata.nextLink")) {
                response.nextLink = json.get("mobileAppCategories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mobileAppCategories").toString(), JsonObject[].class);
            final MobileAppCategory[] array = new MobileAppCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileAppCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mobileAppCategories = new MobileAppCategoryCollectionPage(response, null);
        }

        if (json.has("mobileAppConfigurations")) {
            final ManagedDeviceMobileAppConfigurationCollectionResponse response = new ManagedDeviceMobileAppConfigurationCollectionResponse();
            if (json.has("mobileAppConfigurations@odata.nextLink")) {
                response.nextLink = json.get("mobileAppConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mobileAppConfigurations").toString(), JsonObject[].class);
            final ManagedDeviceMobileAppConfiguration[] array = new ManagedDeviceMobileAppConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDeviceMobileAppConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mobileAppConfigurations = new ManagedDeviceMobileAppConfigurationCollectionPage(response, null);
        }

        if (json.has("mobileApps")) {
            final MobileAppCollectionResponse response = new MobileAppCollectionResponse();
            if (json.has("mobileApps@odata.nextLink")) {
                response.nextLink = json.get("mobileApps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mobileApps").toString(), JsonObject[].class);
            final MobileApp[] array = new MobileApp[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileApp.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mobileApps = new MobileAppCollectionPage(response, null);
        }

        if (json.has("vppTokens")) {
            final VppTokenCollectionResponse response = new VppTokenCollectionResponse();
            if (json.has("vppTokens@odata.nextLink")) {
                response.nextLink = json.get("vppTokens@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("vppTokens").toString(), JsonObject[].class);
            final VppToken[] array = new VppToken[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), VppToken.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            vppTokens = new VppTokenCollectionPage(response, null);
        }

        if (json.has("androidManagedAppProtections")) {
            final AndroidManagedAppProtectionCollectionResponse response = new AndroidManagedAppProtectionCollectionResponse();
            if (json.has("androidManagedAppProtections@odata.nextLink")) {
                response.nextLink = json.get("androidManagedAppProtections@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("androidManagedAppProtections").toString(), JsonObject[].class);
            final AndroidManagedAppProtection[] array = new AndroidManagedAppProtection[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AndroidManagedAppProtection.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            androidManagedAppProtections = new AndroidManagedAppProtectionCollectionPage(response, null);
        }

        if (json.has("defaultManagedAppProtections")) {
            final DefaultManagedAppProtectionCollectionResponse response = new DefaultManagedAppProtectionCollectionResponse();
            if (json.has("defaultManagedAppProtections@odata.nextLink")) {
                response.nextLink = json.get("defaultManagedAppProtections@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("defaultManagedAppProtections").toString(), JsonObject[].class);
            final DefaultManagedAppProtection[] array = new DefaultManagedAppProtection[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DefaultManagedAppProtection.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            defaultManagedAppProtections = new DefaultManagedAppProtectionCollectionPage(response, null);
        }

        if (json.has("iosManagedAppProtections")) {
            final IosManagedAppProtectionCollectionResponse response = new IosManagedAppProtectionCollectionResponse();
            if (json.has("iosManagedAppProtections@odata.nextLink")) {
                response.nextLink = json.get("iosManagedAppProtections@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("iosManagedAppProtections").toString(), JsonObject[].class);
            final IosManagedAppProtection[] array = new IosManagedAppProtection[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), IosManagedAppProtection.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            iosManagedAppProtections = new IosManagedAppProtectionCollectionPage(response, null);
        }

        if (json.has("managedAppPolicies")) {
            final ManagedAppPolicyCollectionResponse response = new ManagedAppPolicyCollectionResponse();
            if (json.has("managedAppPolicies@odata.nextLink")) {
                response.nextLink = json.get("managedAppPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedAppPolicies").toString(), JsonObject[].class);
            final ManagedAppPolicy[] array = new ManagedAppPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAppPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedAppPolicies = new ManagedAppPolicyCollectionPage(response, null);
        }

        if (json.has("managedAppRegistrations")) {
            final ManagedAppRegistrationCollectionResponse response = new ManagedAppRegistrationCollectionResponse();
            if (json.has("managedAppRegistrations@odata.nextLink")) {
                response.nextLink = json.get("managedAppRegistrations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedAppRegistrations").toString(), JsonObject[].class);
            final ManagedAppRegistration[] array = new ManagedAppRegistration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAppRegistration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedAppRegistrations = new ManagedAppRegistrationCollectionPage(response, null);
        }

        if (json.has("managedAppStatuses")) {
            final ManagedAppStatusCollectionResponse response = new ManagedAppStatusCollectionResponse();
            if (json.has("managedAppStatuses@odata.nextLink")) {
                response.nextLink = json.get("managedAppStatuses@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedAppStatuses").toString(), JsonObject[].class);
            final ManagedAppStatus[] array = new ManagedAppStatus[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAppStatus.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedAppStatuses = new ManagedAppStatusCollectionPage(response, null);
        }

        if (json.has("mdmWindowsInformationProtectionPolicies")) {
            final MdmWindowsInformationProtectionPolicyCollectionResponse response = new MdmWindowsInformationProtectionPolicyCollectionResponse();
            if (json.has("mdmWindowsInformationProtectionPolicies@odata.nextLink")) {
                response.nextLink = json.get("mdmWindowsInformationProtectionPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mdmWindowsInformationProtectionPolicies").toString(), JsonObject[].class);
            final MdmWindowsInformationProtectionPolicy[] array = new MdmWindowsInformationProtectionPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MdmWindowsInformationProtectionPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mdmWindowsInformationProtectionPolicies = new MdmWindowsInformationProtectionPolicyCollectionPage(response, null);
        }

        if (json.has("targetedManagedAppConfigurations")) {
            final TargetedManagedAppConfigurationCollectionResponse response = new TargetedManagedAppConfigurationCollectionResponse();
            if (json.has("targetedManagedAppConfigurations@odata.nextLink")) {
                response.nextLink = json.get("targetedManagedAppConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("targetedManagedAppConfigurations").toString(), JsonObject[].class);
            final TargetedManagedAppConfiguration[] array = new TargetedManagedAppConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TargetedManagedAppConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            targetedManagedAppConfigurations = new TargetedManagedAppConfigurationCollectionPage(response, null);
        }

        if (json.has("windowsInformationProtectionPolicies")) {
            final WindowsInformationProtectionPolicyCollectionResponse response = new WindowsInformationProtectionPolicyCollectionResponse();
            if (json.has("windowsInformationProtectionPolicies@odata.nextLink")) {
                response.nextLink = json.get("windowsInformationProtectionPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsInformationProtectionPolicies").toString(), JsonObject[].class);
            final WindowsInformationProtectionPolicy[] array = new WindowsInformationProtectionPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsInformationProtectionPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsInformationProtectionPolicies = new WindowsInformationProtectionPolicyCollectionPage(response, null);
        }
    }
}
