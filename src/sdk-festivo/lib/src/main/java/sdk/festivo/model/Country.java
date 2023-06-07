package sdk.festivo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    private String name;
    private String codeAlpha2;
    @JsonProperty("isSupported")
    private boolean supported;
    private List<String> languages;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCodeAlpha2() {
        return codeAlpha2;
    }
    public void setCodeAlpha2(String codeAlpha2) {
        this.codeAlpha2 = codeAlpha2;
    }

    public List<String> getLanguages() {
        return languages;
    }
    public void setLanguages(List<String> languages) {
    this.languages = languages;
    }

    public boolean isSupported() {
        return supported;
    }
    public void setSupported(boolean supported) {
        this.supported = supported;
    }
    @Override
    public String toString() {
        return "Country [name=" + name + ", codeAlpha2=" + codeAlpha2 + ", supported=" + supported + ", languages="
                + languages + "]";
    }

        
}
