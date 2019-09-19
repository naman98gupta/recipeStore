/*
 * Copyright (c) 2019 Capgemini. All rights reserved.
 */
package org.naman.recipestore.main.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.envers.Audited;

/**
 * User Business Entity Class.
 *
 * @author namangup
 */
@Entity
@Audited
@Table(name = "USER_ENTITY")
@SequenceGenerator(name = "USER_ENTITY_ID_GEN", sequenceName = "USER_ENTITY_SEQ", allocationSize = 1)
public class UserBE implements Serializable
{

    private static final long serialVersionUID = -3813009697470348829L;

    @Column(nullable = false, precision = 10, updatable = false, name = "LOGIN_ID")
    private long              loginId;

    @Column(nullable = false, updatable = false, name = "LOGIN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date              loginTime;

    @Column(nullable = false, precision = 10, name = "MODIFICATION_ID")
    private long              modificationId;

    @Column(nullable = false, name = "MODIFICATION_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    @Version
    private Date              modificationTime;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ENTITY_ID_GEN")
    @Column(name = "ID", unique = true, nullable = false, precision = 20, updatable = false)
    @Access(AccessType.PROPERTY)
    private long              id;

    @Column(name = "NAME")
    private String            name;


    public long getLoginId()
    {

        return this.loginId;
    }


    public void setLoginId(final long loginId)
    {

        this.loginId = loginId;
    }


    public Date getLoginTime()
    {

        return this.loginTime;
    }


    public void setLoginTime(final Date loginTime)
    {

        this.loginTime = loginTime;
    }


    public long getModificationId()
    {

        return this.modificationId;
    }


    public void setModificationId(final long modificationId)
    {

        this.modificationId = modificationId;
    }


    public Date getModificationTime()
    {

        return this.modificationTime;
    }


    public void setModificationTime(final Date modificationTime)
    {

        this.modificationTime = modificationTime;
    }


    public long getId()
    {

        return this.id;
    }


    public void setId(final long id)
    {

        this.id = id;
    }

}
