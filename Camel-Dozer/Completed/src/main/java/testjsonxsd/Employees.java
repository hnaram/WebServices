
package testjsonxsd;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Employee"
})
public class Employees {

    @JsonProperty("Employee")
    private List<testjsonxsd.Employee> Employee = new ArrayList<testjsonxsd.Employee>();

    /**
     * 
     * @return
     *     The Employee
     */
    @JsonProperty("Employee")
    public List<testjsonxsd.Employee> getEmployee() {
        return Employee;
    }

    /**
     * 
     * @param Employee
     *     The Employee
     */
    @JsonProperty("Employee")
    public void setEmployee(List<testjsonxsd.Employee> Employee) {
        this.Employee = Employee;
    }

}
