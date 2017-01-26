package fi.sandmania.wildfly.demo.rest.katharsis.model;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

/**
 * Created by jounilatvatalo on 09/01/2017.
 */
@JsonApiResource(type = "users")
public class User {

    @JsonApiId
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
