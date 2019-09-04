package com.dz.main.api;

import org.bson.types.ObjectId;

import java.io.Serializable;


public class BaseModel implements Serializable {
    //@JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId id;


}
