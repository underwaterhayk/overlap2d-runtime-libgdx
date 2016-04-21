package com.uwsoft.editor.renderer.data;

import box2dLight.RayHandler;

import com.badlogic.gdx.physics.box2d.World;
import com.esotericsoftware.spine.SkeletonMeshRenderer;
import com.esotericsoftware.spine.SkeletonRenderer;
import com.uwsoft.editor.renderer.resources.IResourceRetriever;

public class Essentials {

    public RayHandler rayHandler;
    public SkeletonMeshRenderer skeletonRenderer;
    public IResourceRetriever rm;
    public World world;
    public boolean physicsStopped = false;

}
