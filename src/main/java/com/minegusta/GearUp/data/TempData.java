package com.minegusta.gearup.data;

import com.google.common.collect.Maps;

import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public class TempData {

    public static ConcurrentMap<UUID, Boolean> shadowMap = Maps.newConcurrentMap();

    public static ConcurrentMap<UUID, Boolean> iceMap = Maps.newConcurrentMap();

    public static ConcurrentMap<UUID, Boolean> natureMap = Maps.newConcurrentMap();

    public static ConcurrentMap<UUID, Boolean> moltenMap = Maps.newConcurrentMap();

    public static ConcurrentMap<UUID, Boolean> rainbowMap = Maps.newConcurrentMap();


}
