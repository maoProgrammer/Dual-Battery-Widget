package org.flexlabs.widgets.dualbattery.storage;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import org.flexlabs.widgets.dualbattery.storage.BatteryLevels;
import org.flexlabs.widgets.dualbattery.storage.ScreenStates;

import org.flexlabs.widgets.dualbattery.storage.BatteryLevelsDao;
import org.flexlabs.widgets.dualbattery.storage.ScreenStatesDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig batteryLevelsDaoConfig;
    private final DaoConfig screenStatesDaoConfig;

    private final BatteryLevelsDao batteryLevelsDao;
    private final ScreenStatesDao screenStatesDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        batteryLevelsDaoConfig = daoConfigMap.get(BatteryLevelsDao.class).clone();
        batteryLevelsDaoConfig.initIdentityScope(type);

        screenStatesDaoConfig = daoConfigMap.get(ScreenStatesDao.class).clone();
        screenStatesDaoConfig.initIdentityScope(type);

        batteryLevelsDao = new BatteryLevelsDao(batteryLevelsDaoConfig, this);
        screenStatesDao = new ScreenStatesDao(screenStatesDaoConfig, this);

        registerDao(BatteryLevels.class, batteryLevelsDao);
        registerDao(ScreenStates.class, screenStatesDao);
    }
    
    public void clear() {
        batteryLevelsDaoConfig.getIdentityScope().clear();
        screenStatesDaoConfig.getIdentityScope().clear();
    }

    public BatteryLevelsDao getBatteryLevelsDao() {
        return batteryLevelsDao;
    }

    public ScreenStatesDao getScreenStatesDao() {
        return screenStatesDao;
    }

}
