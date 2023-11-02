package org.acme.mongodb.panache.entity;

import org.bson.codecs.pojo.annotations.BsonIgnore;

public class Height {

    @BsonIgnore
    private IHeightProcessor heightProcessor;
}
