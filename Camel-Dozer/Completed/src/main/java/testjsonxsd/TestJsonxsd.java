
package testjsonxsd;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Employees"
})
public class TestJsonxsd {

    /**
     * 
     */
    @JsonProperty("Employees")
    private testjsonxsd.Employees Employees;

    /**
     * 
     * @return
     *     The Employees
     */
    @JsonProperty("Employees")
    public testjsonxsd.Employees getEmployees() {
        return Employees;
    }

    /**
     * 
     * @param Employees
     *     The Employees
     */
    @JsonProperty("Employees")
    public void setEmployees(testjsonxsd.Employees Employees) {
        this.Employees = Employees;
    }

}
