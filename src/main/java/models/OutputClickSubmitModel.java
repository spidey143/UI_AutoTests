package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class OutputClickSubmitModel {
    @SerializedName("CurrentAddress")
    public String currentAddress;
    @SerializedName("Email")
    public String email;
    @SerializedName("PermananetAddress")
    public String permanentAddress;
    @SerializedName("Name")
    public String name;
}
