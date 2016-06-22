//
// This file generated by rdl 1.4.8-SNAPSHOT
//

package com.yahoo.rdl;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// StringTypeDef - Strings allow the restriction by regular expression pattern
// or by an explicit set of values. An optional maximum size may be asserted
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class StringTypeDef {
    public String type;
    public String name;
    @RdlOptional
    public String comment;
    @RdlOptional
    public Map<String, String> annotations;
    @RdlOptional
    public String pattern;
    @RdlOptional
    public List<String> values;
    @RdlOptional
    public Integer minSize;
    @RdlOptional
    public Integer maxSize;

    public StringTypeDef type(String type) {
        this.type = type;
        return this;
    }
    public StringTypeDef name(String name) {
        this.name = name;
        return this;
    }
    public StringTypeDef comment(String comment) {
        this.comment = comment;
        return this;
    }
    public StringTypeDef annotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public StringTypeDef pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public StringTypeDef values(List<String> values) {
        this.values = values;
        return this;
    }
    public StringTypeDef minSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public StringTypeDef maxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != StringTypeDef.class) {
                return false;
            }
            StringTypeDef a = (StringTypeDef) another;
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
            if (pattern == null ? a.pattern != null : !pattern.equals(a.pattern)) {
                return false;
            }
            if (values == null ? a.values != null : !values.equals(a.values)) {
                return false;
            }
            if (minSize == null ? a.minSize != null : !minSize.equals(a.minSize)) {
                return false;
            }
            if (maxSize == null ? a.maxSize != null : !maxSize.equals(a.maxSize)) {
                return false;
            }
        }
        return true;
    }
}
