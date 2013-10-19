package org.flexlabs.widgets.dualbattery.storage;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table BATTERY_LEVELS.
 */
public class BatteryLevels {

    private Long id;
    /** Not-null value. */
    private java.util.Date time;
    private int typeId;
    private int status;
    private int level;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public BatteryLevels() {
    }

    public BatteryLevels(Long id) {
        this.id = id;
    }

    public BatteryLevels(Long id, java.util.Date time, int typeId, int status, int level) {
        this.id = id;
        this.time = time;
        this.typeId = typeId;
        this.status = status;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public java.util.Date getTime() {
        return time;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTime(java.util.Date time) {
        this.time = time;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
