package com.atb.interview;

import java.util.Date;

public class ImmutableError {

    private final String id;
    private final String description;
    private final Date date;

    public ImmutableError(final String id, final String description, final Date date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }
}

