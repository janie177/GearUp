package com.minegusta.gearup.data;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public class TempData {

    public static ConcurrentMap<UUID, String> armourMap = Maps.newConcurrentMap();
    public static ConcurrentMap<UUID, Long> sonicRainBoomMap = Maps.newConcurrentMap();
    public static HashSet<UUID> fallMap = Sets.newHashSet();

}
