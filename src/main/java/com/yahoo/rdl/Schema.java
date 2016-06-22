//
// This file generated by rdl 1.4.8-SNAPSHOT
//

package com.yahoo.rdl;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// Schema - A Schema is a container for types and resources. It is
// self-contained (no external references). and is the output of the RDL parser.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class Schema {
    @RdlOptional
    public String namespace;
    @RdlOptional
    public String name;
    @RdlOptional
    public Integer version;
    @RdlOptional
    public String comment;
    @RdlOptional
    public List<Type> types;
    @RdlOptional
    public List<Resource> resources;

    public Schema namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public Schema name(String name) {
        this.name = name;
        return this;
    }
    public Schema version(Integer version) {
        this.version = version;
        return this;
    }
    public Schema comment(String comment) {
        this.comment = comment;
        return this;
    }
    public Schema types(List<Type> types) {
        this.types = types;
        return this;
    }
    public Schema resources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Schema.class) {
                return false;
            }
            Schema a = (Schema) another;
            if (namespace == null ? a.namespace != null : !namespace.equals(a.namespace)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (version == null ? a.version != null : !version.equals(a.version)) {
                return false;
            }
            if (comment == null ? a.comment != null : !comment.equals(a.comment)) {
                return false;
            }
            if (types == null ? a.types != null : !types.equals(a.types)) {
                return false;
            }
            if (resources == null ? a.resources != null : !resources.equals(a.resources)) {
                return false;
            }
        }
        return true;
    }
}
