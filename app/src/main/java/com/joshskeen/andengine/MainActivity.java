package com.joshskeen.andengine;

import android.hardware.SensorManager;

import com.badlogic.gdx.math.Vector2;

import org.andengine.engine.options.EngineOptions;
import org.andengine.extension.physics.box2d.PhysicsWorld;
import org.andengine.ui.activity.BaseGameActivity;


public class MainActivity extends BaseGameActivity {

    private PhysicsWorld mPhysicsWorld;

    @Override
    public EngineOptions onCreateEngineOptions() {
        return null;
    }

    @Override
    public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws Exception {
        this.mPhysicsWorld = new PhysicsWorld(new Vector2(0, SensorManager.GRAVITY_EARTH), false);
    }

    @Override
    public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws Exception {

    }

    @Override
    public void onPopulateScene(org.andengine.entity.scene.Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws Exception {

    }
}
