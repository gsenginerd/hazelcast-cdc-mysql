/**
 *
 */
package enginerds;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author SGopala
 *
 */
public class People implements Serializable {

	@JsonProperty("id")
    public int id;

	@JsonProperty("name")
    public int name;

	 public People() {
	    }
}
