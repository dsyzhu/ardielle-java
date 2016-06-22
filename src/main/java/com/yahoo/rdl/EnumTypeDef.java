//
// This file generated by rdl 1.4.8-SNAPSHOT
//

package com.yahoo.rdl;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// EnumTypeDef - Define an enumerated type. Each value of the type is
// represented by a symbolic identifier.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class EnumTypeDef {
    public String type;
    public String name;
    @RdlOptional
    public String comment;
    @RdlOptional
    public Map<String, String> annotations;
    public List<EnumElementDef> elements;

    public EnumTypeDef type(String type) {
        this.type = type;
        return this;
    }
    public EnumTypeDef name(String name) {
        this.name = name;
        return this;
    }
    public EnumTypeDef comment(String comment) {
        this.comment = comment;
        return this;
    }
    public EnumTypeDef annotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public EnumTypeDef elements(List<EnumElementDef> elements) {
        this.elements = elements;
        return this;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != EnumTypeDef.class) {
                return false;
            }
            EnumTypeDef a = (EnumTypeDef) another;
            if (type == null ? a.type != null : !type.equals(a.type)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (comment == null ? a.comment != null : !comment.equals(a.comment)) {
                return false;
            }
            if (annotations == null ? a.annotations != null : !annotations.equals(a.annotations)) {
                return false;
            }
            if (elements == null ? a.elements != null : !elements.equals(a.elements)) {
                return false;
            }
        }
        return true;
    }
}
