package com.vibe.app.model;

import com.vibe.app.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import com.vibe.app.dao.VibeRecordDao;
import com.vibe.app.dao.VibeTypeDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "VIBE_RECORD".
 */
public class VibeRecord {

    private Long _id;
    private Integer duration;
    private java.util.Date createDate;
    private java.util.Date endDate;
    private Long vibeTypeId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient VibeRecordDao myDao;

    private VibeType vibeType;
    private Long vibeType__resolvedKey;


    public VibeRecord() {
    }

    public VibeRecord(Long _id) {
        this._id = _id;
    }

    public VibeRecord(Long _id, Integer duration, java.util.Date createDate, java.util.Date endDate, Long vibeTypeId) {
        this._id = _id;
        this.duration = duration;
        this.createDate = createDate;
        this.endDate = endDate;
        this.vibeTypeId = vibeTypeId;
    }

    public VibeRecord(Integer duration, java.util.Date createDate, java.util.Date endDate, Long vibeTypeId) {
        this.duration = duration;
        this.createDate = createDate;
        this.endDate = endDate;
        this.vibeTypeId = vibeTypeId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getVibeRecordDao() : null;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public java.util.Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    public Long getVibeTypeId() {
        return vibeTypeId;
    }

    public void setVibeTypeId(Long vibeTypeId) {
        this.vibeTypeId = vibeTypeId;
    }

    /** To-one relationship, resolved on first access. */
    public VibeType getVibeType() {
        Long __key = this.vibeTypeId;
        if (vibeType__resolvedKey == null || !vibeType__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            VibeTypeDao targetDao = daoSession.getVibeTypeDao();
            VibeType vibeTypeNew = targetDao.load(__key);
            synchronized (this) {
                vibeType = vibeTypeNew;
            	vibeType__resolvedKey = __key;
            }
        }
        return vibeType;
    }

    public void setVibeType(VibeType vibeType) {
        synchronized (this) {
            this.vibeType = vibeType;
            vibeTypeId = vibeType == null ? null : vibeType.get_id();
            vibeType__resolvedKey = vibeTypeId;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
