package org.azure.fn.premium.model.blob;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "file_path",
        "file_name",
        "file_ext",
        "blob_endpoint",
        "blob_container",
        "blob_sas_token"
})
public class BlobRequest implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("file_path")
    private String filePath;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("file_ext")
    private String fileExt;
    @JsonProperty("blob_endpoint")
    private String blobEndpoint;
    @JsonProperty("blob_container")
    private String blobContainer;
    @JsonProperty("blob_sas_token")
    private String blobSasToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6518095304328671722L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public BlobRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("file_path")
    public String getFilePath() {
        return filePath;
    }

    @JsonProperty("file_path")
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public BlobRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    @JsonProperty("file_name")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("file_name")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BlobRequest withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    @JsonProperty("file_ext")
    public String getFileExt() {
        return fileExt;
    }

    @JsonProperty("file_ext")
    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public BlobRequest withFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }

    @JsonProperty("blob_endpoint")
    public String getBlobEndpoint() {
        return blobEndpoint;
    }

    @JsonProperty("blob_endpoint")
    public void setBlobEndpoint(String blobEndpoint) {
        this.blobEndpoint = blobEndpoint;
    }

    public BlobRequest withBlobEndpoint(String blobEndpoint) {
        this.blobEndpoint = blobEndpoint;
        return this;
    }

    @JsonProperty("blob_container")
    public String getBlobContainer() {
        return blobContainer;
    }

    @JsonProperty("blob_container")
    public void setBlobContainer(String blobContainer) {
        this.blobContainer = blobContainer;
    }

    public BlobRequest withBlobContainer(String blobContainer) {
        this.blobContainer = blobContainer;
        return this;
    }

    @JsonProperty("blob_sas_token")
    public String getBlobSasToken() {
        return blobSasToken;
    }

    @JsonProperty("blob_sas_token")
    public void setBlobSasToken(String blobSasToken) {
        this.blobSasToken = blobSasToken;
    }

    public BlobRequest withBlobSasToken(String blobSasToken) {
        this.blobSasToken = blobSasToken;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BlobRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BlobRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("filePath");
        sb.append('=');
        sb.append(((this.filePath == null)?"<null>":this.filePath));
        sb.append(',');
        sb.append("fileName");
        sb.append('=');
        sb.append(((this.fileName == null)?"<null>":this.fileName));
        sb.append(',');
        sb.append("fileExt");
        sb.append('=');
        sb.append(((this.fileExt == null)?"<null>":this.fileExt));
        sb.append(',');
        sb.append("blobEndpoint");
        sb.append('=');
        sb.append(((this.blobEndpoint == null)?"<null>":this.blobEndpoint));
        sb.append(',');
        sb.append("blobContainer");
        sb.append('=');
        sb.append(((this.blobContainer == null)?"<null>":this.blobContainer));
        sb.append(',');
        sb.append("blobSasToken");
        sb.append('=');
        sb.append(((this.blobSasToken == null)?"<null>":this.blobSasToken));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.blobContainer == null)? 0 :this.blobContainer.hashCode()));
        result = ((result* 31)+((this.fileName == null)? 0 :this.fileName.hashCode()));
        result = ((result* 31)+((this.filePath == null)? 0 :this.filePath.hashCode()));
        result = ((result* 31)+((this.blobSasToken == null)? 0 :this.blobSasToken.hashCode()));
        result = ((result* 31)+((this.blobEndpoint == null)? 0 :this.blobEndpoint.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fileExt == null)? 0 :this.fileExt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlobRequest) == false) {
            return false;
        }
        BlobRequest rhs = ((BlobRequest) other);
        return (((((((((this.blobContainer == rhs.blobContainer)||((this.blobContainer!= null)&&this.blobContainer.equals(rhs.blobContainer)))&&((this.fileName == rhs.fileName)||((this.fileName!= null)&&this.fileName.equals(rhs.fileName))))&&((this.filePath == rhs.filePath)||((this.filePath!= null)&&this.filePath.equals(rhs.filePath))))&&((this.blobSasToken == rhs.blobSasToken)||((this.blobSasToken!= null)&&this.blobSasToken.equals(rhs.blobSasToken))))&&((this.blobEndpoint == rhs.blobEndpoint)||((this.blobEndpoint!= null)&&this.blobEndpoint.equals(rhs.blobEndpoint))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fileExt == rhs.fileExt)||((this.fileExt!= null)&&this.fileExt.equals(rhs.fileExt))));
    }

}