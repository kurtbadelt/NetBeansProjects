/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author kurtbadelt
 */
public class Paciente {

    private int MetaElementGroupLength;
    private String MediaStorageSOPClassUID;
    private String MediaStorageSOPInstanceUID;
    private String TransferSyntaxUID;
    private String ImplementationClassUID;
    private String ImplementationVersionName;
    private String SourceApplicationEntityTitle;
    private String PrivateInformationCreatorUID;
    private String SpecificCharacterSet;
    private String ImageType;
    private String SOPClassUID;
    private String SOPInstanceUID;
    private int StudyDate;
    private int SeriesDate;
    private int AcquisitionDate;
    private int ContentDate;
    private int StudyTime;
    private int SeriesTime;
    private int AcquisitionTime;
    private int ContentTime;
    private String AccessionNumber;
    private String Modality;
    private String ModalitiesInStudy;
    private String PresentationIntentType;
    private String Manufacturer;
    private String InstitutionName;
    private String InstitutionAddress;
    private String ReferringPhysiciansName;
    private String StationName;
    private String StudyDescription;
    private String SeriesDescription;
    private String PhysiciansOfRecord;
    private String NameOfPhysiciansReadingStudy;
    private String OperatorsName;
    private String AdmittingDiagnosesDescription;
    private String ManufacturersModelName;
    private String ReferencedStudySequence;
    private String DerivationDescription;
    private String SourceImageSequence;
    private String ReferencedSOPClassUID;
    private String ReferencedSOPInstanceUID;
    private String SpatialLocationsPreserved;
    private String AnatomicRegionSequence;
    private String CodeValue;
    private String CodingSchemeDesignator;
    private String CodeMeaning;
    private String PatientsName;
    private int PatientID;
    private String IssuerOfPatientID;
    private int PatientsBirthDate;
    private int PatientsBirthTime;
    private String PatientsSex;
    private String OtherPatientIDs;
    private String OtherPatientNames;
    private String PatientsAge;
    private String MedicalRecordLocator;
    private String EthnicGroup;
    private String AdditionalPatientHistory;
    private String PatientComments;
    private String BodyPartExamined;
    private int KVP;
    private String DeviceSerialNumber;
    private String SoftwareVersions;
    private String ProtocolName;
    private int DistanceSourceToDetector;
    private int DistanceSourceToPatient;
    private int EstimatedRadiographicMagnificationFactor;
    private String FieldOfViewShape;
    private int ExposureTime;
    private int XRayTubeCurrent;
    private int Exposure;
    private int ExposureInMicroAs;
    private String ImagerPixelSpacing;
    private String Grid;
    private double FocalSpots;
    private String AnodeTargetMaterial;
    private int BodyPartThickness;
    private double CompressionForce;
    private int DateOfLastCalibration;
    private int TimeOfLastCalibration;
    private String AcquisitionDeviceProcessingDescription;
    private String AcquisitionDeviceProcessingCode;
    private int RelativeXRayExposure;
    private String PositionerType;
    private int PositionerPrimaryAngle;
    private String PositionerSecondaryAngle;
    private String ViewPosition;
    private String Sensitivity;
    private String DetectorConditionsNominalFlag;
    private double DetectorTemperature;
    private String DetectorType;
    private String DetectorConfiguration;
    private String DetectorDescription;
    private String DetectorID;
    private int DateOfLastDetectorCalibration;
    private int TimeOfLastDetectorCalibration;
    private String DetectorActiveShape;
    private String DetectorActiveDimensions;
    private String FieldOfViewOrigin;
    private String FieldOfViewRotation;
    private String FieldOfViewHorizontalFlip;
    private String GridPeriod;
    private String FilterMaterial;
    private double FilterThicknessMinimum;
    private double FilterThicknessMaximum;
    private String ExposureControlMode;
    private String ExposureControlModeDescription;
    private String ExposureStatus;
    private String PrivateCreator;
    private String StudyInstanceUID;
    private String SeriesInstanceUID;
    private int StudyID;
    private int SeriesNumber;
    private int AcquisitionNumber;
    private int InstanceNumber;
    private String PatientOrientation;
    private String Laterality;
    private String ImageLaterality;
    private int ImagesInAcquisition;
    private String OtherStudyNumbers;
    private int NumberOfStudyRelatedInstances;
    private String ImageComments;
    private int SamplesPerPixel;
    private String PhotometricInterpretation;
    private int Rows;
    private int Columns;
    private String PixelSpacing;
    private String PixelAspectRatio;
    private int BitsAllocated;
    private int BitsStored;
    private int HighBit;
    private int PixelRepresentation;
    private int PixelPaddingValue;
    private String BurnedInAnnotation;
    private String PixelIntensityRelationship;
    private int PixelIntensityRelationshipSign;
    private int WindowCenter;
    private int WindowWidth;
    private int RescaleIntercept;
    private int RescaleSlope;
    private String RescaleType;
    private String ImplantPresent;
    private String PartialView;
    private String PartialViewDescription;
    private int LossyImageCompression;
    private String StudyPriorityID;
    private String ScheduledStudyStartDate;
    private String ScheduledStudyStartTime;
    private String ReasonForStudy;
    private String RequestingPhysician;
    private String RequestedProcedureDescription;
    private String StudyComments;
    private int AdmissionID;
    private String RouteOfAdmissions;
    private String AdmittingDate;
    private String AdmittingTime;
    private String CurrentPatientLocation;
    private String PerformedProcedureStepID;
    private String PerformedProcedureStepDescription;
    private int EntranceDose;
    private int HalfValueLayer;
    private int OrganDose;
    private String OrganExposed;
    private String AcquisitionContextSequence;
    private String RequestedProcedurePriority;
    private String PatientTransportArrangements;
    private String NamesOfIntendedRecipientsOfResults;
    private double EntranceDoseInmGy;
    private String CalibrationImage;
    private String ViewCodeSequence;
    private String ViewModifierCodeSequence;
    private String PresentationLUTShape;

    public String getText() {
        String output = "";
        output += this.getMetaElementGroupLength() + ";" + this.getMediaStorageSOPClassUID() + ";" + this.getMediaStorageSOPInstanceUID() + ";"
                + this.getTransferSyntaxUID() + ";" + this.getImplementationClassUID() + ";" + this.getImplementationVersionName() + ";" + this.getSourceApplicationEntityTitle() + ";"
                + this.getPrivateInformationCreatorUID() + ";" + this.getSpecificCharacterSet() + ";" + this.getImageType() + ";" + this.getSOPClassUID() + ";" + this.getSOPInstanceUID() + ";"
                + this.getStudyDate() + ";" + this.getSeriesDate() + ";" + this.getAcquisitionDate() + ";" + this.getContentDate() + ";" + this.getStudyTime() + ";" + this.getSeriesTime() + ";"
                + this.getAcquisitionTime() + ";" + this.getContentTime() + ";" + this.getAccessionNumber() + ";" + this.getModality() + ";" + this.getModalitiesInStudy() + ";" + this.getPresentationIntentType()
                + ";" + this.getManufacturer() + ";" + this.getInstitutionName() + ";" + this.getInstitutionAddress() + ";" + this.getReferringPhysiciansName() + ";" + this.getStationName() + ";" + this.getStudyDescription()
                + ";" + this.getSeriesDescription() + ";" + this.getPhysiciansOfRecord() + ";" + this.getNameOfPhysiciansReadingStudy() + ";" + this.getOperatorsName() + ";" + this.getAdmittingDiagnosesDescription() + ";"
                + this.getManufacturersModelName() + ";" + this.getReferencedStudySequence() + ";" + this.getDerivationDescription() + ";" + this.getSourceImageSequence() + ";" + this.getReferencedSOPClassUID() + ";"
                + this.getReferencedSOPInstanceUID() + ";" + this.getSpatialLocationsPreserved() + ";" + this.getAnatomicRegionSequence() + ";" + this.getCodeValue() + ";" + this.getCodingSchemeDesignator() + ";"
                + this.getCodeMeaning() + ";" + this.getPatientsName() + ";" + this.getPatientID() + ";" + this.getIssuerOfPatientID() + ";" + this.getPatientsBirthDate() + ";" + this.getPatientsBirthTime() + ";"
                + this.getPatientsSex() + ";" + this.getOtherPatientIDs() + ";" + this.getOtherPatientNames() + ";" + this.getPatientsAge() + ";" + this.getMedicalRecordLocator() + ";" + this.getEthnicGroup() + ";" + this.getAdditionalPatientHistory() + ";"
                + this.getPatientComments() + ";" + this.getBodyPartExamined() + ";" + this.getKVP() + ";" + this.getDeviceSerialNumber() + ";" + this.getSoftwareVersions() + ";" + this.getProtocolName() + ";" + this.getDistanceSourceToDetector()
                + ";" + this.getDistanceSourceToPatient() + ";" + this.getEstimatedRadiographicMagnificationFactor() + ";" + this.getFieldOfViewShape() + ";" + this.getExposureTime() + ";" + this.getXRayTubeCurrent() + ";" + this.getExposure() + ";"
                + this.getExposureInMicroAs() + ";" + this.getImagerPixelSpacing() + ";" + this.getGrid() + ";" + this.getFocalSpots() + ";" + this.getAnodeTargetMaterial() + ";" + this.getBodyPartThickness() + ";" + this.getCompressionForce() + ";"
                + this.getDateOfLastCalibration() + ";" + this.getTimeOfLastCalibration() + ";" + this.getAcquisitionDeviceProcessingDescription() + ";" + this.getAcquisitionDeviceProcessingCode() + ";" + this.getRelativeXRayExposure() + ";"
                + this.getPositionerType() + ";" + this.getPositionerPrimaryAngle() + ";" + this.getPositionerSecondaryAngle() + ";" + this.getViewPosition() + ";" + this.getSensitivity() + ";" + this.getDetectorConditionsNominalFlag() + ";"
                + this.getDetectorTemperature() + ";" + this.getDetectorType() + ";" + this.getDetectorConfiguration() + ";" + this.getDetectorDescription() + ";" + this.getDetectorID() + ";" + this.getDateOfLastDetectorCalibration() + ";"
                + this.getTimeOfLastDetectorCalibration() + ";" + this.getDetectorActiveShape() + ";" + this.getDetectorActiveDimensions() + ";" + this.getFieldOfViewOrigin() + ";" + this.getFieldOfViewRotation() + ";" + this.getFieldOfViewHorizontalFlip()
                + ";" + this.getGridPeriod() + ";" + this.getFilterMaterial() + ";" + this.getFilterThicknessMinimum() + ";" + this.getFilterThicknessMaximum() + ";" + this.getExposureControlMode() + ";" + this.getExposureControlModeDescription() + ";"
                + this.getExposureStatus() + ";" + this.getPrivateCreator() + ";" + this.getStudyInstanceUID() + ";" + this.getSeriesInstanceUID() + ";" + this.getStudyID() + ";" + this.getSeriesNumber() + ";" + this.getAcquisitionNumber() + ";"
                + this.getInstanceNumber() + ";" + this.getPatientOrientation() + ";" + this.getLaterality() + ";" + this.getImageLaterality() + ";" + this.getImagesInAcquisition() + ";" + this.getOtherStudyNumbers() + ";" + this.getNumberOfStudyRelatedInstances() + ";"
                + this.getImageComments() + ";" + this.getSamplesPerPixel() + ";" + this.getPhotometricInterpretation() + ";" + this.getRows() + ";" + this.getColumns() + ";" + this.getPixelSpacing() + ";" + this.getPixelAspectRatio() + ";" + this.getBitsAllocated() + ";"
                + this.getBitsStored() + ";" + this.getHighBit() + ";" + this.getPixelRepresentation() + ";" + this.getPixelPaddingValue() + ";" + this.getBurnedInAnnotation() + ";" + this.getPixelIntensityRelationship() + ";" + this.getPixelIntensityRelationshipSign() + ";"
                + this.getWindowCenter() + ";" + this.getWindowWidth() + ";" + this.getRescaleIntercept() + ";" + this.getRescaleSlope() + ";" + this.getRescaleType() + ";" + this.getImplantPresent() + ";" + this.getPartialView() + ";" + this.getPartialViewDescription() + ";"
                + this.getLossyImageCompression() + ";" + this.getStudyPriorityID() + ";" + this.getScheduledStudyStartDate() + ";" + this.getScheduledStudyStartTime() + ";" + this.getReasonForStudy() + ";" + this.getRequestingPhysician() + ";" + this.getRequestedProcedureDescription() + ";"
                + this.getStudyComments() + ";" + this.getAdmissionID() + ";" + this.getRouteOfAdmissions() + ";" + this.getAdmittingDate() + ";" + this.getAdmittingTime() + ";" + this.getCurrentPatientLocation() + ";" + this.getPerformedProcedureStepID() + ";"
                + this.getPerformedProcedureStepDescription() + ";" + this.getEntranceDose() + ";" + this.getHalfValueLayer() + ";" + this.getOrganDose() + ";" + this.getOrganExposed() + ";" + this.getAcquisitionContextSequence() + ";" + this.getRequestedProcedurePriority() + ";"
                + this.getPatientTransportArrangements() + ";"
                + this.getNamesOfIntendedRecipientsOfResults() + ";" + this.getEntranceDoseInmGy() + ";" + this.getCalibrationImage() + ";" + this.getViewCodeSequence() + ";" + this.getViewModifierCodeSequence() + ";" + this.getPresentationLUTShape();

        return output;
    }
    
    
    
        public String toDB() {
        String output = "";
        output += this.getMetaElementGroupLength() + ",'" + this.getMediaStorageSOPClassUID() + "','" + this.getMediaStorageSOPInstanceUID() + "','"
                + this.getTransferSyntaxUID() + "','" + this.getImplementationClassUID() + "','" + this.getImplementationVersionName() + "','" + this.getSourceApplicationEntityTitle() + "','"
                + this.getPrivateInformationCreatorUID() + "','" + this.getSpecificCharacterSet() + "','" + this.getImageType() + "','" + this.getSOPClassUID() + "','" + this.getSOPInstanceUID() + "',"
                + this.getStudyDate() + "," + this.getSeriesDate() + "," + this.getAcquisitionDate() + "," + this.getContentDate() + "," + this.getStudyTime() + "," + this.getSeriesTime() + ","
                + this.getAcquisitionTime() + "," + this.getContentTime() + "','" + this.getAccessionNumber() + "','" + this.getModality() + "','" + this.getModalitiesInStudy() + "','" + this.getPresentationIntentType()
                + "','" + this.getManufacturer() + "','" + this.getInstitutionName() + "','" + this.getInstitutionAddress() + "','" + this.getReferringPhysiciansName() + "','" + this.getStationName() + "','" + this.getStudyDescription()
                + "','" + this.getSeriesDescription() + "','" + this.getPhysiciansOfRecord() + "','" + this.getNameOfPhysiciansReadingStudy() + "','" + this.getOperatorsName() + "','" + this.getAdmittingDiagnosesDescription() + "','"
                + this.getManufacturersModelName() + "','" + this.getReferencedStudySequence() + "','" + this.getDerivationDescription() + "','" + this.getSourceImageSequence() + "','" + this.getReferencedSOPClassUID() + "','"
                + this.getReferencedSOPInstanceUID() + "','" + this.getSpatialLocationsPreserved() + "','" + this.getAnatomicRegionSequence() + "','" + this.getCodeValue() + "','" + this.getCodingSchemeDesignator() + "','"
                + this.getCodeMeaning() + "','" + this.getPatientsName() + "'," + this.getPatientID() + ",'" + this.getIssuerOfPatientID() + "'," + this.getPatientsBirthDate() + "," + this.getPatientsBirthTime() + ",'"
                + this.getPatientsSex() + "','" + this.getOtherPatientIDs() + "','" + this.getOtherPatientNames() + "','" + this.getPatientsAge() + "','" + this.getMedicalRecordLocator() + "','" + this.getEthnicGroup() + "','" + this.getAdditionalPatientHistory() + "','"
                + this.getPatientComments() + "','" + this.getBodyPartExamined() + "'," + this.getKVP() + ",'" + this.getDeviceSerialNumber() + "','" + this.getSoftwareVersions() + "','" + this.getProtocolName() + "'," + this.getDistanceSourceToDetector()
                + "," + this.getDistanceSourceToPatient() + "," + this.getEstimatedRadiographicMagnificationFactor() + ",'" + this.getFieldOfViewShape() + "'," + this.getExposureTime() + "," + this.getXRayTubeCurrent() + "," + this.getExposure() + ","
                + this.getExposureInMicroAs() + "','" + this.getImagerPixelSpacing() + "','" + this.getGrid() + "'," + this.getFocalSpots() + ",'" + this.getAnodeTargetMaterial() + "'," + this.getBodyPartThickness() + "," + this.getCompressionForce() + ","
                + this.getDateOfLastCalibration() + "," + this.getTimeOfLastCalibration() + ",'" + this.getAcquisitionDeviceProcessingDescription() + "','" + this.getAcquisitionDeviceProcessingCode() + "'," + this.getRelativeXRayExposure() + ",'"
                + this.getPositionerType() + "','" + this.getPositionerPrimaryAngle() + "','" + this.getPositionerSecondaryAngle() + "','" + this.getViewPosition() + "','" + this.getSensitivity() + "','" + this.getDetectorConditionsNominalFlag() + "',"
                + this.getDetectorTemperature() + ",'" + this.getDetectorType() + "','" + this.getDetectorConfiguration() + "','" + this.getDetectorDescription() + "','" + this.getDetectorID() + "'," + this.getDateOfLastDetectorCalibration() + ","
                + this.getTimeOfLastDetectorCalibration() + "','" + this.getDetectorActiveShape() + "','" + this.getDetectorActiveDimensions() + "','" + this.getFieldOfViewOrigin() + "','" + this.getFieldOfViewRotation() + "','" + this.getFieldOfViewHorizontalFlip()
                + "','" + this.getGridPeriod() + "','" + this.getFilterMaterial() + "'," + this.getFilterThicknessMinimum() + "," + this.getFilterThicknessMaximum() + ",'" + this.getExposureControlMode() + "','" + this.getExposureControlModeDescription() + "','"
                + this.getExposureStatus() + "','" + this.getPrivateCreator() + "','" + this.getStudyInstanceUID() + "','" + this.getSeriesInstanceUID() + "'," + this.getStudyID() + "," + this.getSeriesNumber() + "," + this.getAcquisitionNumber() + ","
                + this.getInstanceNumber() + ",'" + this.getPatientOrientation() + "','" + this.getLaterality() + "','" + this.getImageLaterality() + "'," + this.getImagesInAcquisition() + ",'" + this.getOtherStudyNumbers() + "'," + this.getNumberOfStudyRelatedInstances() + ",'"
                + this.getImageComments() + "'," + this.getSamplesPerPixel() + ",'" + this.getPhotometricInterpretation() + "'," + this.getRows() + "," + this.getColumns() + ",'" + this.getPixelSpacing() + "','" + this.getPixelAspectRatio() + "'," + this.getBitsAllocated() + ","
                + this.getBitsStored() + "," + this.getHighBit() + "," + this.getPixelRepresentation() + "," + this.getPixelPaddingValue() + ",'" + this.getBurnedInAnnotation() + "','" + this.getPixelIntensityRelationship() + "'," + this.getPixelIntensityRelationshipSign() + ","
                + this.getWindowCenter() + "," + this.getWindowWidth() + "," + this.getRescaleIntercept() + "," + this.getRescaleSlope() + "','" + this.getRescaleType() + "','" + this.getImplantPresent() + "','" + this.getPartialView() + "','" + this.getPartialViewDescription() + "',"
                + this.getLossyImageCompression() + ",'" + this.getStudyPriorityID() + "','" + this.getScheduledStudyStartDate() + "','" + this.getScheduledStudyStartTime() + "','" + this.getReasonForStudy() + "','" + this.getRequestingPhysician() + "','" + this.getRequestedProcedureDescription() + "','"
                + this.getStudyComments() + "'," + this.getAdmissionID() + ",'" + this.getRouteOfAdmissions() + "','" + this.getAdmittingDate() + "','" + this.getAdmittingTime() + "','" + this.getCurrentPatientLocation() + "','" + this.getPerformedProcedureStepID() + "','"
                + this.getPerformedProcedureStepDescription() + ",'" + this.getEntranceDose() + "," + this.getHalfValueLayer() + "," + this.getOrganDose() + ",'" + this.getOrganExposed() + "','" + this.getAcquisitionContextSequence() + "','" + this.getRequestedProcedurePriority() + "','"
                + this.getPatientTransportArrangements() + "','"
                + this.getNamesOfIntendedRecipientsOfResults() + "'," + this.getEntranceDoseInmGy() + ",'" + this.getCalibrationImage() + "','" + this.getViewCodeSequence() + "','" + this.getViewModifierCodeSequence() + "','" + this.getPresentationLUTShape();

        return output;
    }

    public int getMetaElementGroupLength() {
        return MetaElementGroupLength;
    }

    public void setMetaElementGroupLength(int MetaElementGroupLength) {
        this.MetaElementGroupLength = MetaElementGroupLength;
    }

    public String getMediaStorageSOPClassUID() {
        return MediaStorageSOPClassUID;
    }

    public void setMediaStorageSOPClassUID(String MediaStorageSOPClassUID) {
        this.MediaStorageSOPClassUID = MediaStorageSOPClassUID;
    }

    public String getMediaStorageSOPInstanceUID() {
        return MediaStorageSOPInstanceUID;
    }

    public void setMediaStorageSOPInstanceUID(String MediaStorageSOPInstanceUID) {
        this.MediaStorageSOPInstanceUID = MediaStorageSOPInstanceUID;
    }

    public String getTransferSyntaxUID() {
        return TransferSyntaxUID;
    }

    public void setTransferSyntaxUID(String TransferSyntaxUID) {
        this.TransferSyntaxUID = TransferSyntaxUID;
    }

    public String getImplementationClassUID() {
        return ImplementationClassUID;
    }

    public void setImplementationClassUID(String ImplementationClassUID) {
        this.ImplementationClassUID = ImplementationClassUID;
    }

    public String getImplementationVersionName() {
        return ImplementationVersionName;
    }

    public void setImplementationVersionName(String ImplementationVersionName) {
        this.ImplementationVersionName = ImplementationVersionName;
    }

    public String getSourceApplicationEntityTitle() {
        return SourceApplicationEntityTitle;
    }

    public void setSourceApplicationEntityTitle(String SourceApplicationEntityTitle) {
        this.SourceApplicationEntityTitle = SourceApplicationEntityTitle;
    }

    public String getPrivateInformationCreatorUID() {
        return PrivateInformationCreatorUID;
    }

    public void setPrivateInformationCreatorUID(String PrivateInformationCreatorUID) {
        this.PrivateInformationCreatorUID = PrivateInformationCreatorUID;
    }

    public String getSpecificCharacterSet() {
        return SpecificCharacterSet;
    }

    public void setSpecificCharacterSet(String SpecificCharacterSet) {
        this.SpecificCharacterSet = SpecificCharacterSet;
    }

    public String getImageType() {
        return ImageType;
    }

    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public String getSOPClassUID() {
        return SOPClassUID;
    }

    public void setSOPClassUID(String SOPClassUID) {
        this.SOPClassUID = SOPClassUID;
    }

    public String getSOPInstanceUID() {
        return SOPInstanceUID;
    }

    public void setSOPInstanceUID(String SOPInstanceUID) {
        this.SOPInstanceUID = SOPInstanceUID;
    }

    public int getStudyDate() {
        return StudyDate;
    }

    public void setStudyDate(int StudyDate) {
        this.StudyDate = StudyDate;
    }

    public int getSeriesDate() {
        return SeriesDate;
    }

    public void setSeriesDate(int SeriesDate) {
        this.SeriesDate = SeriesDate;
    }

    public int getAcquisitionDate() {
        return AcquisitionDate;
    }

    public void setAcquisitionDate(int AcquisitionDate) {
        this.AcquisitionDate = AcquisitionDate;
    }

    public int getContentDate() {
        return ContentDate;
    }

    public void setContentDate(int ContentDate) {
        this.ContentDate = ContentDate;
    }

    public int getStudyTime() {
        return StudyTime;
    }

    public void setStudyTime(int StudyTime) {
        this.StudyTime = StudyTime;
    }

    public int getSeriesTime() {
        return SeriesTime;
    }

    public void setSeriesTime(int SeriesTime) {
        this.SeriesTime = SeriesTime;
    }

    public int getAcquisitionTime() {
        return AcquisitionTime;
    }

    public void setAcquisitionTime(int AcquisitionTime) {
        this.AcquisitionTime = AcquisitionTime;
    }

    public int getContentTime() {
        return ContentTime;
    }

    public void setContentTime(int ContentTime) {
        this.ContentTime = ContentTime;
    }

    public String getAccessionNumber() {
        return AccessionNumber;
    }

    public void setAccessionNumber(String AccessionNumber) {
        this.AccessionNumber = AccessionNumber;
    }

    public String getModality() {
        return Modality;
    }

    public void setModality(String Modality) {
        this.Modality = Modality;
    }

    public String getModalitiesInStudy() {
        return ModalitiesInStudy;
    }

    public void setModalitiesInStudy(String ModalitiesInStudy) {
        this.ModalitiesInStudy = ModalitiesInStudy;
    }

    public String getPresentationIntentType() {
        return PresentationIntentType;
    }

    public void setPresentationIntentType(String PresentationIntentType) {
        this.PresentationIntentType = PresentationIntentType;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getInstitutionName() {
        return InstitutionName;
    }

    public void setInstitutionName(String InstitutionName) {
        this.InstitutionName = InstitutionName;
    }

    public String getInstitutionAddress() {
        return InstitutionAddress;
    }

    public void setInstitutionAddress(String InstitutionAddress) {
        this.InstitutionAddress = InstitutionAddress;
    }

    public String getReferringPhysiciansName() {
        return ReferringPhysiciansName;
    }

    public void setReferringPhysiciansName(String ReferringPhysiciansName) {
        this.ReferringPhysiciansName = ReferringPhysiciansName;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String StationName) {
        this.StationName = StationName;
    }

    public String getStudyDescription() {
        return StudyDescription;
    }

    public void setStudyDescription(String StudyDescription) {
        this.StudyDescription = StudyDescription;
    }

    public String getSeriesDescription() {
        return SeriesDescription;
    }

    public void setSeriesDescription(String SeriesDescription) {
        this.SeriesDescription = SeriesDescription;
    }

    public String getPhysiciansOfRecord() {
        return PhysiciansOfRecord;
    }

    public void setPhysiciansOfRecord(String PhysiciansOfRecord) {
        this.PhysiciansOfRecord = PhysiciansOfRecord;
    }

    public String getNameOfPhysiciansReadingStudy() {
        return NameOfPhysiciansReadingStudy;
    }

    public void setNameOfPhysiciansReadingStudy(String NameOfPhysiciansReadingStudy) {
        this.NameOfPhysiciansReadingStudy = NameOfPhysiciansReadingStudy;
    }

    public String getOperatorsName() {
        return OperatorsName;
    }

    public void setOperatorsName(String OperatorsName) {
        this.OperatorsName = OperatorsName;
    }

    public String getAdmittingDiagnosesDescription() {
        return AdmittingDiagnosesDescription;
    }

    public void setAdmittingDiagnosesDescription(String AdmittingDiagnosesDescription) {
        this.AdmittingDiagnosesDescription = AdmittingDiagnosesDescription;
    }

    public String getManufacturersModelName() {
        return ManufacturersModelName;
    }

    public void setManufacturersModelName(String ManufacturersModelName) {
        this.ManufacturersModelName = ManufacturersModelName;
    }

    public String getReferencedStudySequence() {
        return ReferencedStudySequence;
    }

    public void setReferencedStudySequence(String ReferencedStudySequence) {
        this.ReferencedStudySequence = ReferencedStudySequence;
    }

    public String getDerivationDescription() {
        return DerivationDescription;
    }

    public void setDerivationDescription(String DerivationDescription) {
        this.DerivationDescription = DerivationDescription;
    }

    public String getSourceImageSequence() {
        return SourceImageSequence;
    }

    public void setSourceImageSequence(String SourceImageSequence) {
        this.SourceImageSequence = SourceImageSequence;
    }

    public String getReferencedSOPClassUID() {
        return ReferencedSOPClassUID;
    }

    public void setReferencedSOPClassUID(String ReferencedSOPClassUID) {
        this.ReferencedSOPClassUID = ReferencedSOPClassUID;
    }

    public String getReferencedSOPInstanceUID() {
        return ReferencedSOPInstanceUID;
    }

    public void setReferencedSOPInstanceUID(String ReferencedSOPInstanceUID) {
        this.ReferencedSOPInstanceUID = ReferencedSOPInstanceUID;
    }

    public String getSpatialLocationsPreserved() {
        return SpatialLocationsPreserved;
    }

    public void setSpatialLocationsPreserved(String SpatialLocationsPreserved) {
        this.SpatialLocationsPreserved = SpatialLocationsPreserved;
    }

    public String getAnatomicRegionSequence() {
        return AnatomicRegionSequence;
    }

    public void setAnatomicRegionSequence(String AnatomicRegionSequence) {
        this.AnatomicRegionSequence = AnatomicRegionSequence;
    }

    public String getCodeValue() {
        return CodeValue;
    }

    public void setCodeValue(String CodeValue) {
        this.CodeValue = CodeValue;
    }

    public String getCodingSchemeDesignator() {
        return CodingSchemeDesignator;
    }

    public void setCodingSchemeDesignator(String CodingSchemeDesignator) {
        this.CodingSchemeDesignator = CodingSchemeDesignator;
    }

    public String getCodeMeaning() {
        return CodeMeaning;
    }

    public void setCodeMeaning(String CodeMeaning) {
        this.CodeMeaning = CodeMeaning;
    }

    public String getPatientsName() {
        return PatientsName;
    }

    public void setPatientsName(String PatientsName) {
        this.PatientsName = PatientsName;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getIssuerOfPatientID() {
        return IssuerOfPatientID;
    }

    public void setIssuerOfPatientID(String IssuerOfPatientID) {
        this.IssuerOfPatientID = IssuerOfPatientID;
    }

    public int getPatientsBirthDate() {
        return PatientsBirthDate;
    }

    public void setPatientsBirthDate(int PatientsBirthDate) {
        this.PatientsBirthDate = PatientsBirthDate;
    }

    public int getPatientsBirthTime() {
        return PatientsBirthTime;
    }

    public void setPatientsBirthTime(int PatientsBirthTime) {
        this.PatientsBirthTime = PatientsBirthTime;
    }

    public String getPatientsSex() {
        return PatientsSex;
    }

    public void setPatientsSex(String PatientsSex) {
        this.PatientsSex = PatientsSex;
    }

    public String getOtherPatientIDs() {
        return OtherPatientIDs;
    }

    public void setOtherPatientIDs(String OtherPatientIDs) {
        this.OtherPatientIDs = OtherPatientIDs;
    }

    public String getOtherPatientNames() {
        return OtherPatientNames;
    }

    public void setOtherPatientNames(String OtherPatientNames) {
        this.OtherPatientNames = OtherPatientNames;
    }

    public String getPatientsAge() {
        return PatientsAge;
    }

    public void setPatientsAge(String PatientsAge) {
        this.PatientsAge = PatientsAge;
    }

    public String getMedicalRecordLocator() {
        return MedicalRecordLocator;
    }

    public void setMedicalRecordLocator(String MedicalRecordLocator) {
        this.MedicalRecordLocator = MedicalRecordLocator;
    }

    public String getEthnicGroup() {
        return EthnicGroup;
    }

    public void setEthnicGroup(String EthnicGroup) {
        this.EthnicGroup = EthnicGroup;
    }

    public String getAdditionalPatientHistory() {
        return AdditionalPatientHistory;
    }

    public void setAdditionalPatientHistory(String AdditionalPatientHistory) {
        this.AdditionalPatientHistory = AdditionalPatientHistory;
    }

    public String getPatientComments() {
        return PatientComments;
    }

    public void setPatientComments(String PatientComments) {
        this.PatientComments = PatientComments;
    }

    public String getBodyPartExamined() {
        return BodyPartExamined;
    }

    public void setBodyPartExamined(String BodyPartExamined) {
        this.BodyPartExamined = BodyPartExamined;
    }

    public int getKVP() {
        return KVP;
    }

    public void setKVP(int KVP) {
        this.KVP = KVP;
    }

    public String getDeviceSerialNumber() {
        return DeviceSerialNumber;
    }

    public void setDeviceSerialNumber(String DeviceSerialNumber) {
        this.DeviceSerialNumber = DeviceSerialNumber;
    }

    public String getSoftwareVersions() {
        return SoftwareVersions;
    }

    public void setSoftwareVersions(String SoftwareVersions) {
        this.SoftwareVersions = SoftwareVersions;
    }

    public String getProtocolName() {
        return ProtocolName;
    }

    public void setProtocolName(String ProtocolName) {
        this.ProtocolName = ProtocolName;
    }

    public int getDistanceSourceToDetector() {
        return DistanceSourceToDetector;
    }

    public void setDistanceSourceToDetector(int DistanceSourceToDetector) {
        this.DistanceSourceToDetector = DistanceSourceToDetector;
    }

    public int getDistanceSourceToPatient() {
        return DistanceSourceToPatient;
    }

    public void setDistanceSourceToPatient(int DistanceSourceToPatient) {
        this.DistanceSourceToPatient = DistanceSourceToPatient;
    }

    public int getEstimatedRadiographicMagnificationFactor() {
        return EstimatedRadiographicMagnificationFactor;
    }

    public void setEstimatedRadiographicMagnificationFactor(int EstimatedRadiographicMagnificationFactor) {
        this.EstimatedRadiographicMagnificationFactor = EstimatedRadiographicMagnificationFactor;
    }

    public String getFieldOfViewShape() {
        return FieldOfViewShape;
    }

    public void setFieldOfViewShape(String FieldOfViewShape) {
        this.FieldOfViewShape = FieldOfViewShape;
    }

    public int getExposureTime() {
        return ExposureTime;
    }

    public void setExposureTime(int ExposureTime) {
        this.ExposureTime = ExposureTime;
    }

    public int getXRayTubeCurrent() {
        return XRayTubeCurrent;
    }

    public void setXRayTubeCurrent(int XRayTubeCurrent) {
        this.XRayTubeCurrent = XRayTubeCurrent;
    }

    public int getExposure() {
        return Exposure;
    }

    public void setExposure(int Exposure) {
        this.Exposure = Exposure;
    }

    public int getExposureInMicroAs() {
        return ExposureInMicroAs;
    }

    public void setExposureInMicroAs(int ExposureInMicroAs) {
        this.ExposureInMicroAs = ExposureInMicroAs;
    }

    public String getImagerPixelSpacing() {
        return ImagerPixelSpacing;
    }

    public void setImagerPixelSpacing(String ImagerPixelSpacing) {
        this.ImagerPixelSpacing = ImagerPixelSpacing;
    }

    public String getGrid() {
        return Grid;
    }

    public void setGrid(String Grid) {
        this.Grid = Grid;
    }

    public double getFocalSpots() {
        return FocalSpots;
    }

    public void setFocalSpots(double FocalSpots) {
        this.FocalSpots = FocalSpots;
    }

    public String getAnodeTargetMaterial() {
        return AnodeTargetMaterial;
    }

    public void setAnodeTargetMaterial(String AnodeTargetMaterial) {
        this.AnodeTargetMaterial = AnodeTargetMaterial;
    }

    public int getBodyPartThickness() {
        return BodyPartThickness;
    }

    public void setBodyPartThickness(int BodyPartThickness) {
        this.BodyPartThickness = BodyPartThickness;
    }

    public double getCompressionForce() {
        return CompressionForce;
    }

    public void setCompressionForce(double CompressionForce) {
        this.CompressionForce = CompressionForce;
    }

    public int getDateOfLastCalibration() {
        return DateOfLastCalibration;
    }

    public void setDateOfLastCalibration(int DateOfLastCalibration) {
        this.DateOfLastCalibration = DateOfLastCalibration;
    }

    public int getTimeOfLastCalibration() {
        return TimeOfLastCalibration;
    }

    public void setTimeOfLastCalibration(int TimeOfLastCalibration) {
        this.TimeOfLastCalibration = TimeOfLastCalibration;
    }

    public String getAcquisitionDeviceProcessingDescription() {
        return AcquisitionDeviceProcessingDescription;
    }

    public void setAcquisitionDeviceProcessingDescription(String AcquisitionDeviceProcessingDescription) {
        this.AcquisitionDeviceProcessingDescription = AcquisitionDeviceProcessingDescription;
    }

    public String getAcquisitionDeviceProcessingCode() {
        return AcquisitionDeviceProcessingCode;
    }

    public void setAcquisitionDeviceProcessingCode(String AcquisitionDeviceProcessingCode) {
        this.AcquisitionDeviceProcessingCode = AcquisitionDeviceProcessingCode;
    }

    public int getRelativeXRayExposure() {
        return RelativeXRayExposure;
    }

    public void setRelativeXRayExposure(int RelativeXRayExposure) {
        this.RelativeXRayExposure = RelativeXRayExposure;
    }

    public String getPositionerType() {
        return PositionerType;
    }

    public void setPositionerType(String PositionerType) {
        this.PositionerType = PositionerType;
    }

    public int getPositionerPrimaryAngle() {
        return PositionerPrimaryAngle;
    }

    public void setPositionerPrimaryAngle(int PositionerPrimaryAngle) {
        this.PositionerPrimaryAngle = PositionerPrimaryAngle;
    }

    public String getPositionerSecondaryAngle() {
        return PositionerSecondaryAngle;
    }

    public void setPositionerSecondaryAngle(String PositionerSecondaryAngle) {
        this.PositionerSecondaryAngle = PositionerSecondaryAngle;
    }

    public String getViewPosition() {
        return ViewPosition;
    }

    public void setViewPosition(String ViewPosition) {
        this.ViewPosition = ViewPosition;
    }

    public String getSensitivity() {
        return Sensitivity;
    }

    public void setSensitivity(String Sensitivity) {
        this.Sensitivity = Sensitivity;
    }

    public String getDetectorConditionsNominalFlag() {
        return DetectorConditionsNominalFlag;
    }

    public void setDetectorConditionsNominalFlag(String DetectorConditionsNominalFlag) {
        this.DetectorConditionsNominalFlag = DetectorConditionsNominalFlag;
    }

    public double getDetectorTemperature() {
        return DetectorTemperature;
    }

    public void setDetectorTemperature(double DetectorTemperature) {
        this.DetectorTemperature = DetectorTemperature;
    }

    public String getDetectorType() {
        return DetectorType;
    }

    public void setDetectorType(String DetectorType) {
        this.DetectorType = DetectorType;
    }

    public String getDetectorConfiguration() {
        return DetectorConfiguration;
    }

    public void setDetectorConfiguration(String DetectorConfiguration) {
        this.DetectorConfiguration = DetectorConfiguration;
    }

    public String getDetectorDescription() {
        return DetectorDescription;
    }

    public void setDetectorDescription(String DetectorDescription) {
        this.DetectorDescription = DetectorDescription;
    }

    public String getDetectorID() {
        return DetectorID;
    }

    public void setDetectorID(String DetectorID) {
        this.DetectorID = DetectorID;
    }

    public int getDateOfLastDetectorCalibration() {
        return DateOfLastDetectorCalibration;
    }

    public void setDateOfLastDetectorCalibration(int DateOfLastDetectorCalibration) {
        this.DateOfLastDetectorCalibration = DateOfLastDetectorCalibration;
    }

    public int getTimeOfLastDetectorCalibration() {
        return TimeOfLastDetectorCalibration;
    }

    public void setTimeOfLastDetectorCalibration(int TimeOfLastDetectorCalibration) {
        this.TimeOfLastDetectorCalibration = TimeOfLastDetectorCalibration;
    }

    public String getDetectorActiveShape() {
        return DetectorActiveShape;
    }

    public void setDetectorActiveShape(String DetectorActiveShape) {
        this.DetectorActiveShape = DetectorActiveShape;
    }

    public String getDetectorActiveDimensions() {
        return DetectorActiveDimensions;
    }

    public void setDetectorActiveDimensions(String DetectorActiveDimensions) {
        this.DetectorActiveDimensions = DetectorActiveDimensions;
    }

    public String getFieldOfViewOrigin() {
        return FieldOfViewOrigin;
    }

    public void setFieldOfViewOrigin(String FieldOfViewOrigin) {
        this.FieldOfViewOrigin = FieldOfViewOrigin;
    }

    public String getFieldOfViewRotation() {
        return FieldOfViewRotation;
    }

    public void setFieldOfViewRotation(String FieldOfViewRotation) {
        this.FieldOfViewRotation = FieldOfViewRotation;
    }

    public String getFieldOfViewHorizontalFlip() {
        return FieldOfViewHorizontalFlip;
    }

    public void setFieldOfViewHorizontalFlip(String FieldOfViewHorizontalFlip) {
        this.FieldOfViewHorizontalFlip = FieldOfViewHorizontalFlip;
    }

    public String getGridPeriod() {
        return GridPeriod;
    }

    public void setGridPeriod(String GridPeriod) {
        this.GridPeriod = GridPeriod;
    }

    public String getFilterMaterial() {
        return FilterMaterial;
    }

    public void setFilterMaterial(String FilterMaterial) {
        this.FilterMaterial = FilterMaterial;
    }

    public double getFilterThicknessMinimum() {
        return FilterThicknessMinimum;
    }

    public void setFilterThicknessMinimum(double FilterThicknessMinimum) {
        this.FilterThicknessMinimum = FilterThicknessMinimum;
    }

    public double getFilterThicknessMaximum() {
        return FilterThicknessMaximum;
    }

    public void setFilterThicknessMaximum(double FilterThicknessMaximum) {
        this.FilterThicknessMaximum = FilterThicknessMaximum;
    }

    public String getExposureControlMode() {
        return ExposureControlMode;
    }

    public void setExposureControlMode(String ExposureControlMode) {
        this.ExposureControlMode = ExposureControlMode;
    }

    public String getExposureControlModeDescription() {
        return ExposureControlModeDescription;
    }

    public void setExposureControlModeDescription(String ExposureControlModeDescription) {
        this.ExposureControlModeDescription = ExposureControlModeDescription;
    }

    public String getExposureStatus() {
        return ExposureStatus;
    }

    public void setExposureStatus(String ExposureStatus) {
        this.ExposureStatus = ExposureStatus;
    }

    public String getPrivateCreator() {
        return PrivateCreator;
    }

    public void setPrivateCreator(String PrivateCreator) {
        this.PrivateCreator = PrivateCreator;
    }

    public String getStudyInstanceUID() {
        return StudyInstanceUID;
    }

    public void setStudyInstanceUID(String StudyInstanceUID) {
        this.StudyInstanceUID = StudyInstanceUID;
    }

    public String getSeriesInstanceUID() {
        return SeriesInstanceUID;
    }

    public void setSeriesInstanceUID(String SeriesInstanceUID) {
        this.SeriesInstanceUID = SeriesInstanceUID;
    }

    public int getStudyID() {
        return StudyID;
    }

    public void setStudyID(int StudyID) {
        this.StudyID = StudyID;
    }

    public int getSeriesNumber() {
        return SeriesNumber;
    }

    public void setSeriesNumber(int SeriesNumber) {
        this.SeriesNumber = SeriesNumber;
    }

    public int getAcquisitionNumber() {
        return AcquisitionNumber;
    }

    public void setAcquisitionNumber(int AcquisitionNumber) {
        this.AcquisitionNumber = AcquisitionNumber;
    }

    public int getInstanceNumber() {
        return InstanceNumber;
    }

    public void setInstanceNumber(int InstanceNumber) {
        this.InstanceNumber = InstanceNumber;
    }

    public String getPatientOrientation() {
        return PatientOrientation;
    }

    public void setPatientOrientation(String PatientOrientation) {
        this.PatientOrientation = PatientOrientation;
    }

    public String getLaterality() {
        return Laterality;
    }

    public void setLaterality(String Laterality) {
        this.Laterality = Laterality;
    }

    public String getImageLaterality() {
        return ImageLaterality;
    }

    public void setImageLaterality(String ImageLaterality) {
        this.ImageLaterality = ImageLaterality;
    }

    public int getImagesInAcquisition() {
        return ImagesInAcquisition;
    }

    public void setImagesInAcquisition(int ImagesInAcquisition) {
        this.ImagesInAcquisition = ImagesInAcquisition;
    }

    public String getOtherStudyNumbers() {
        return OtherStudyNumbers;
    }

    public void setOtherStudyNumbers(String OtherStudyNumbers) {
        this.OtherStudyNumbers = OtherStudyNumbers;
    }

    public int getNumberOfStudyRelatedInstances() {
        return NumberOfStudyRelatedInstances;
    }

    public void setNumberOfStudyRelatedInstances(int NumberOfStudyRelatedInstances) {
        this.NumberOfStudyRelatedInstances = NumberOfStudyRelatedInstances;
    }

    public String getImageComments() {
        return ImageComments;
    }

    public void setImageComments(String ImageComments) {
        this.ImageComments = ImageComments;
    }

    public int getSamplesPerPixel() {
        return SamplesPerPixel;
    }

    public void setSamplesPerPixel(int SamplesPerPixel) {
        this.SamplesPerPixel = SamplesPerPixel;
    }

    public String getPhotometricInterpretation() {
        return PhotometricInterpretation;
    }

    public void setPhotometricInterpretation(String PhotometricInterpretation) {
        this.PhotometricInterpretation = PhotometricInterpretation;
    }

    public int getRows() {
        return Rows;
    }

    public void setRows(int Rows) {
        this.Rows = Rows;
    }

    public int getColumns() {
        return Columns;
    }

    public void setColumns(int Columns) {
        this.Columns = Columns;
    }

    public String getPixelSpacing() {
        return PixelSpacing;
    }

    public void setPixelSpacing(String PixelSpacing) {
        this.PixelSpacing = PixelSpacing;
    }

    public String getPixelAspectRatio() {
        return PixelAspectRatio;
    }

    public void setPixelAspectRatio(String PixelAspectRatio) {
        this.PixelAspectRatio = PixelAspectRatio;
    }

    public int getBitsAllocated() {
        return BitsAllocated;
    }

    public void setBitsAllocated(int BitsAllocated) {
        this.BitsAllocated = BitsAllocated;
    }

    public int getBitsStored() {
        return BitsStored;
    }

    public void setBitsStored(int BitsStored) {
        this.BitsStored = BitsStored;
    }

    public int getHighBit() {
        return HighBit;
    }

    public void setHighBit(int HighBit) {
        this.HighBit = HighBit;
    }

    public int getPixelRepresentation() {
        return PixelRepresentation;
    }

    public void setPixelRepresentation(int PixelRepresentation) {
        this.PixelRepresentation = PixelRepresentation;
    }

    public int getPixelPaddingValue() {
        return PixelPaddingValue;
    }

    public void setPixelPaddingValue(int PixelPaddingValue) {
        this.PixelPaddingValue = PixelPaddingValue;
    }

    public String getBurnedInAnnotation() {
        return BurnedInAnnotation;
    }

    public void setBurnedInAnnotation(String BurnedInAnnotation) {
        this.BurnedInAnnotation = BurnedInAnnotation;
    }

    public String getPixelIntensityRelationship() {
        return PixelIntensityRelationship;
    }

    public void setPixelIntensityRelationship(String PixelIntensityRelationship) {
        this.PixelIntensityRelationship = PixelIntensityRelationship;
    }

    public int getPixelIntensityRelationshipSign() {
        return PixelIntensityRelationshipSign;
    }

    public void setPixelIntensityRelationshipSign(int PixelIntensityRelationshipSign) {
        this.PixelIntensityRelationshipSign = PixelIntensityRelationshipSign;
    }

    public int getWindowCenter() {
        return WindowCenter;
    }

    public void setWindowCenter(int WindowCenter) {
        this.WindowCenter = WindowCenter;
    }

    public int getWindowWidth() {
        return WindowWidth;
    }

    public void setWindowWidth(int WindowWidth) {
        this.WindowWidth = WindowWidth;
    }

    public int getRescaleIntercept() {
        return RescaleIntercept;
    }

    public void setRescaleIntercept(int RescaleIntercept) {
        this.RescaleIntercept = RescaleIntercept;
    }

    public int getRescaleSlope() {
        return RescaleSlope;
    }

    public void setRescaleSlope(int RescaleSlope) {
        this.RescaleSlope = RescaleSlope;
    }

    public String getRescaleType() {
        return RescaleType;
    }

    public void setRescaleType(String RescaleType) {
        this.RescaleType = RescaleType;
    }

    public String getImplantPresent() {
        return ImplantPresent;
    }

    public void setImplantPresent(String ImplantPresent) {
        this.ImplantPresent = ImplantPresent;
    }

    public String getPartialView() {
        return PartialView;
    }

    public void setPartialView(String PartialView) {
        this.PartialView = PartialView;
    }

    public String getPartialViewDescription() {
        return PartialViewDescription;
    }

    public void setPartialViewDescription(String PartialViewDescription) {
        this.PartialViewDescription = PartialViewDescription;
    }

    public int getLossyImageCompression() {
        return LossyImageCompression;
    }

    public void setLossyImageCompression(int LossyImageCompression) {
        this.LossyImageCompression = LossyImageCompression;
    }

    public String getStudyPriorityID() {
        return StudyPriorityID;
    }

    public void setStudyPriorityID(String StudyPriorityID) {
        this.StudyPriorityID = StudyPriorityID;
    }

    public String getScheduledStudyStartDate() {
        return ScheduledStudyStartDate;
    }

    public void setScheduledStudyStartDate(String ScheduledStudyStartDate) {
        this.ScheduledStudyStartDate = ScheduledStudyStartDate;
    }

    public String getScheduledStudyStartTime() {
        return ScheduledStudyStartTime;
    }

    public void setScheduledStudyStartTime(String ScheduledStudyStartTime) {
        this.ScheduledStudyStartTime = ScheduledStudyStartTime;
    }

    public String getReasonForStudy() {
        return ReasonForStudy;
    }

    public void setReasonForStudy(String ReasonForStudy) {
        this.ReasonForStudy = ReasonForStudy;
    }

    public String getRequestingPhysician() {
        return RequestingPhysician;
    }

    public void setRequestingPhysician(String RequestingPhysician) {
        this.RequestingPhysician = RequestingPhysician;
    }

    public String getRequestedProcedureDescription() {
        return RequestedProcedureDescription;
    }

    public void setRequestedProcedureDescription(String RequestedProcedureDescription) {
        this.RequestedProcedureDescription = RequestedProcedureDescription;
    }

    public String getStudyComments() {
        return StudyComments;
    }

    public void setStudyComments(String StudyComments) {
        this.StudyComments = StudyComments;
    }

    public int getAdmissionID() {
        return AdmissionID;
    }

    public void setAdmissionID(int AdmissionID) {
        this.AdmissionID = AdmissionID;
    }

    public String getRouteOfAdmissions() {
        return RouteOfAdmissions;
    }

    public void setRouteOfAdmissions(String RouteOfAdmissions) {
        this.RouteOfAdmissions = RouteOfAdmissions;
    }

    public String getAdmittingDate() {
        return AdmittingDate;
    }

    public void setAdmittingDate(String AdmittingDate) {
        this.AdmittingDate = AdmittingDate;
    }

    public String getAdmittingTime() {
        return AdmittingTime;
    }

    public void setAdmittingTime(String AdmittingTime) {
        this.AdmittingTime = AdmittingTime;
    }

    public String getCurrentPatientLocation() {
        return CurrentPatientLocation;
    }

    public void setCurrentPatientLocation(String CurrentPatientLocation) {
        this.CurrentPatientLocation = CurrentPatientLocation;
    }

    public String getPerformedProcedureStepID() {
        return PerformedProcedureStepID;
    }

    public void setPerformedProcedureStepID(String PerformedProcedureStepID) {
        this.PerformedProcedureStepID = PerformedProcedureStepID;
    }

    public String getPerformedProcedureStepDescription() {
        return PerformedProcedureStepDescription;
    }

    public void setPerformedProcedureStepDescription(String PerformedProcedureStepDescription) {
        this.PerformedProcedureStepDescription = PerformedProcedureStepDescription;
    }

    public int getEntranceDose() {
        return EntranceDose;
    }

    public void setEntranceDose(int EntranceDose) {
        this.EntranceDose = EntranceDose;
    }

    public int getHalfValueLayer() {
        return HalfValueLayer;
    }

    public void setHalfValueLayer(int HalfValueLayer) {
        this.HalfValueLayer = HalfValueLayer;
    }

    public int getOrganDose() {
        return OrganDose;
    }

    public void setOrganDose(int OrganDose) {
        this.OrganDose = OrganDose;
    }

    public String getOrganExposed() {
        return OrganExposed;
    }

    public void setOrganExposed(String OrganExposed) {
        this.OrganExposed = OrganExposed;
    }

    public String getAcquisitionContextSequence() {
        return AcquisitionContextSequence;
    }

    public void setAcquisitionContextSequence(String AcquisitionContextSequence) {
        this.AcquisitionContextSequence = AcquisitionContextSequence;
    }

    public String getRequestedProcedurePriority() {
        return RequestedProcedurePriority;
    }

    public void setRequestedProcedurePriority(String RequestedProcedurePriority) {
        this.RequestedProcedurePriority = RequestedProcedurePriority;
    }

    public String getPatientTransportArrangements() {
        return PatientTransportArrangements;
    }

    public void setPatientTransportArrangements(String PatientTransportArrangements) {
        this.PatientTransportArrangements = PatientTransportArrangements;
    }

    public String getNamesOfIntendedRecipientsOfResults() {
        return NamesOfIntendedRecipientsOfResults;
    }

    public void setNamesOfIntendedRecipientsOfResults(String NamesOfIntendedRecipientsOfResults) {
        this.NamesOfIntendedRecipientsOfResults = NamesOfIntendedRecipientsOfResults;
    }

    public double getEntranceDoseInmGy() {
        return EntranceDoseInmGy;
    }

    public void setEntranceDoseInmGy(double EntranceDoseInmGy) {
        this.EntranceDoseInmGy = EntranceDoseInmGy;
    }

    public String getCalibrationImage() {
        return CalibrationImage;
    }

    public void setCalibrationImage(String CalibrationImage) {
        this.CalibrationImage = CalibrationImage;
    }

    public String getViewCodeSequence() {
        return ViewCodeSequence;
    }

    public void setViewCodeSequence(String ViewCodeSequence) {
        this.ViewCodeSequence = ViewCodeSequence;
    }

    public String getViewModifierCodeSequence() {
        return ViewModifierCodeSequence;
    }

    public void setViewModifierCodeSequence(String ViewModifierCodeSequence) {
        this.ViewModifierCodeSequence = ViewModifierCodeSequence;
    }

    public String getPresentationLUTShape() {
        return PresentationLUTShape;
    }

    public void setPresentationLUTShape(String PresentationLUTShape) {
        this.PresentationLUTShape = PresentationLUTShape;
    }
}
